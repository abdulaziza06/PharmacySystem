package Admin;

import java.awt.Component;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.GroupLayout.Alignment;
import javax.swing.table.DefaultTableModel;

public class OrderDetails extends JFrame {
    private JButton jButton1;
    private JLabel jLabel1;
    private JScrollPane jScrollPane1;
    private JTable jTable1;
    private JButton jbtnback;
    private Panel panel1;
    private List<Order> orders;

    public OrderDetails() {
        this.initComponents();
        this.orders = new ArrayList<>();
        this.showList();
    }

    public void showList() {
        String filePath = "C:\\Users\\HP\\Desktop\\project.zip\\project\\OrderDetails.txt";
        File f1 = new File(filePath);

        try {
            FileReader fr = new FileReader(f1);
            BufferedReader br = new BufferedReader(fr);
            DefaultTableModel table = (DefaultTableModel)this.jTable1.getModel();
            Object[] lines = br.lines().toArray();
            for(int i = 0; i < lines.length; ++i) {
                String[] row = lines[i].toString().split(" ");
                Order order = new Order(row[0], row[1], row[2], row[3], row[4], row[5], row[6]);
                orders.add(order);
                table.addRow(new String[]{row[0], row[1], row[2], row[3], row[4], row[5], row[6]});
            }
        } catch (IOException var9) {
            System.out.println("IOException has occurred");
        }
    }


    private void initComponents() {
        this.jLabel1 = new JLabel();
        this.panel1 = new Panel();
        this.jScrollPane1 = new JScrollPane();
        this.jTable1 = new JTable();
        this.jButton1 = new JButton();
        this.jbtnback = new JButton();
        this.setDefaultCloseOperation(3);
        this.setResizable(false);
        this.jLabel1.setFont(new Font("Tahoma", 1, 24));
        this.jLabel1.setText("Order List");
        this.jTable1.setModel(new DefaultTableModel(new Object[0][], new String[]{"Id", "Name", "Type", "Expiry Date", "Quantity", "Price", "Total Price"}) {
            Class[] types = new Class[]{String.class, String.class, String.class, String.class, String.class, String.class, String.class};
            boolean[] canEdit = new boolean[]{false, false, false, false, false, false, false};

            public Class getColumnClass(int columnIndex) {
                return this.types[columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return this.canEdit[columnIndex];
            }
        });
        this.jScrollPane1.setViewportView(this.jTable1);
        if (this.jTable1.getColumnModel().getColumnCount() > 0) {
            this.jTable1.getColumnModel().getColumn(0).setResizable(false);
            this.jTable1.getColumnModel().getColumn(1).setResizable(false);
            this.jTable1.getColumnModel().getColumn(2).setResizable(false);
            this.jTable1.getColumnModel().getColumn(3).setResizable(false);
            this.jTable1.getColumnModel().getColumn(4).setResizable(false);
            this.jTable1.getColumnModel().getColumn(5).setResizable(false);
            this.jTable1.getColumnModel().getColumn(6).setResizable(false);
        }

        this.jButton1.setText("Order Placed");
        this.jButton1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                OrderDetails.this.jButton1ActionPerformed(evt);
            }
        });
        this.jbtnback.setText("Back");
        this.jbtnback.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                OrderDetails.this.jbtnbackActionPerformed(evt);
            }
        });
        GroupLayout panel1Layout = new GroupLayout(this.panel1);
        this.panel1.setLayout(panel1Layout);
        panel1Layout.setHorizontalGroup(panel1Layout.createParallelGroup(Alignment.LEADING).addGroup(panel1Layout.createSequentialGroup().addContainerGap(-1, 32767).addGroup(panel1Layout.createParallelGroup(Alignment.LEADING).addGroup(Alignment.TRAILING, panel1Layout.createSequentialGroup().addComponent(this.jScrollPane1, -2, 604, -2).addContainerGap()).addGroup(Alignment.TRAILING, panel1Layout.createSequentialGroup().addComponent(this.jbtnback).addGap(134, 134, 134).addComponent(this.jButton1, -2, 94, -2).addGap(111, 111, 111)))));
        panel1Layout.setVerticalGroup(panel1Layout.createParallelGroup(Alignment.LEADING).addGroup(panel1Layout.createSequentialGroup().addGap(21, 21, 21).addComponent(this.jScrollPane1, -2, 131, -2).addGap(42, 42, 42).addGroup(panel1Layout.createParallelGroup(Alignment.BASELINE).addComponent(this.jButton1, -2, 38, -2).addComponent(this.jbtnback, -2, 38, -2)).addContainerGap(89, 32767)));
        GroupLayout layout = new GroupLayout(this.getContentPane());
        this.getContentPane().setLayout(layout);
        layout.setHorizontalGroup(layout.createParallelGroup(Alignment.LEADING).addGroup(layout.createSequentialGroup().addComponent(this.panel1, -1, -1, 32767).addGap(462, 462, 462)).addGroup(layout.createSequentialGroup().addGap(257, 257, 257).addComponent(this.jLabel1, -2, 130, -2).addContainerGap(-1, 32767)));
        layout.setVerticalGroup(layout.createParallelGroup(Alignment.LEADING).addGroup(layout.createSequentialGroup().addGap(20, 20, 20).addComponent(this.jLabel1, -2, 51, -2).addGap(1, 1, 1).addComponent(this.panel1, -1, -1, 32767)));
        this.setSize(new Dimension(636, 432));
        this.setLocationRelativeTo((Component)null);
    }

    private void jButton1ActionPerformed(ActionEvent evt) {
    }

    private void jbtnbackActionPerformed(ActionEvent evt) {
        MainMenu m = new MainMenu();
        m.setVisible(true);
        this.dispose();
    }

    private class Order {
        private String id;
        private String name;
        private String type;
        private String expiryDate;
        private String quantity;
        private String price;
        private String totalPrice;

        public Order(String id, String name, String type, String expiryDate, String quantity, String price, String totalPrice) {
            this.id = id;
            this.name = name;
            this.type = type;
            this.expiryDate = expiryDate;
            this.quantity = quantity;
            this.price = price;
            this.totalPrice = totalPrice;
        }

    }

    public static void main(String[] args) {
        try {
            UIManager.LookAndFeelInfo[] var1 = UIManager.getInstalledLookAndFeels();
            int var2 = var1.length;

            for(int var3 = 0; var3 < var2; ++var3) {
                UIManager.LookAndFeelInfo info = var1[var3];
                if ("Nimbus".equals(info.getName())) {
                    UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException var5) {
            Logger.getLogger(OrderDetails.class.getName()).log(Level.SEVERE, (String)null, var5);
        } catch (InstantiationException var6) {
            Logger.getLogger(OrderDetails.class.getName()).log(Level.SEVERE, (String)null, var6);
        } catch (IllegalAccessException var7) {
            Logger.getLogger(OrderDetails.class.getName()).log(Level.SEVERE, (String)null, var7);
        } catch (UnsupportedLookAndFeelException var8) {
            Logger.getLogger(OrderDetails.class.getName()).log(Level.SEVERE, (String)null, var8);
        }

        EventQueue.invokeLater(new Runnable() {
            public void run() {
                (new OrderDetails()).setVisible(true);
            }
        });
    }
}
