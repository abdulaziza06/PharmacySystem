package User;

import Admin.MainPage;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JCheckBoxMenuItem;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JSpinner;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.RowFilter;
import javax.swing.SpinnerNumberModel;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.GroupLayout.Alignment;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;

public class ShowMedicinelist extends JFrame {
    private Object Rowfilter;
    private JButton JButtonAdd;
    private JButton btnCheckOut;
    private JButton btnModifyQuantity;
    private JButton jButton1;
    private JButton jButton2;
    private JCheckBoxMenuItem jCheckBoxMenuItem1;
    private JCheckBoxMenuItem jCheckBoxMenuItem2;
    private JCheckBoxMenuItem jCheckBoxMenuItem3;
    private JLabel jLabel1;
    private JLabel jLabel2;
    private JLabel jLabel5;
    private JScrollPane jScrollPane1;
    private JScrollPane jScrollPane2;
    private JTextField jTextField1;
    private JTable orderTable;
    private Panel panel1;
    private Panel panel2;
    private JTable ptable;
    private JSpinner quantitySpinner;
    private JButton viewListtxt;

    public ShowMedicinelist() {
        this.initComponents();
        this.showList();
        this.setLocationRelativeTo((Component)null);
    }

    public void showList() {
        DefaultTableModel table = (DefaultTableModel)this.ptable.getModel();
        File f1 = new File("MedicineData.txt");

        try {
            Scanner read = new Scanner(f1);
            String[] info = new String[7];

            while(read.hasNext()) {
                info[0] = read.next();
                info[1] = read.next();
                info[2] = read.next();
                info[3] = read.next();
                info[4] = read.next();
                info[5] = read.next();
                info[6] = read.next();
                table.addRow(info);
            }
        } catch (IOException var5) {
            System.out.println("IOException has occured");
        }

    }

    private void initComponents() {
        this.jCheckBoxMenuItem1 = new JCheckBoxMenuItem();
        this.jCheckBoxMenuItem2 = new JCheckBoxMenuItem();
        this.jCheckBoxMenuItem3 = new JCheckBoxMenuItem();
        this.panel1 = new Panel();
        this.viewListtxt = new JButton();
        this.jScrollPane1 = new JScrollPane();
        this.ptable = new JTable();
        this.jTextField1 = new JTextField();
        this.JButtonAdd = new JButton();
        this.jLabel5 = new JLabel();
        this.quantitySpinner = new JSpinner();
        this.jScrollPane2 = new JScrollPane();
        this.orderTable = new JTable();
        this.btnModifyQuantity = new JButton();
        this.btnCheckOut = new JButton();
        this.jLabel2 = new JLabel();
        this.panel2 = new Panel();
        this.jLabel1 = new JLabel();
        this.jButton1 = new JButton();
        this.jButton2 = new JButton();
        this.jCheckBoxMenuItem1.setSelected(true);
        this.jCheckBoxMenuItem1.setText("jCheckBoxMenuItem1");
        this.jCheckBoxMenuItem2.setSelected(true);
        this.jCheckBoxMenuItem2.setText("jCheckBoxMenuItem2");
        this.jCheckBoxMenuItem3.setSelected(true);
        this.jCheckBoxMenuItem3.setText("jCheckBoxMenuItem3");
        this.setDefaultCloseOperation(3);
        this.viewListtxt.setText("View All");
        this.viewListtxt.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                ShowMedicinelist.this.viewListtxtActionPerformed(evt);
            }
        });
        this.ptable.setModel(new DefaultTableModel(new Object[0][], new String[]{"Id", "name", "type", "Expiry Date", "Quantity", "Price", "Company"}) {
            Class[] types = new Class[]{String.class, String.class, String.class, String.class, String.class, String.class, Object.class};
            boolean[] canEdit = new boolean[]{false, false, false, false, false, false, false};

            public Class getColumnClass(int columnIndex) {
                return this.types[columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return this.canEdit[columnIndex];
            }
        });
        this.ptable.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent evt) {
                ShowMedicinelist.this.ptableMouseClicked(evt);
            }
        });
        this.jScrollPane1.setViewportView(this.ptable);
        if (this.ptable.getColumnModel().getColumnCount() > 0) {
            this.ptable.getColumnModel().getColumn(0).setResizable(false);
            this.ptable.getColumnModel().getColumn(1).setResizable(false);
            this.ptable.getColumnModel().getColumn(2).setResizable(false);
            this.ptable.getColumnModel().getColumn(3).setResizable(false);
            this.ptable.getColumnModel().getColumn(4).setResizable(false);
            this.ptable.getColumnModel().getColumn(5).setResizable(false);
            this.ptable.getColumnModel().getColumn(6).setResizable(false);
        }

        this.jTextField1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                ShowMedicinelist.this.jTextField1ActionPerformed(evt);
            }
        });
        this.jTextField1.addKeyListener(new KeyAdapter() {
            public void keyReleased(KeyEvent evt) {
                ShowMedicinelist.this.jTextField1KeyReleased(evt);
            }
        });
        this.JButtonAdd.setText("ADD TO CART");
        this.JButtonAdd.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                ShowMedicinelist.this.JButtonAddActionPerformed(evt);
            }
        });
        this.jLabel5.setFont(new Font("Tahoma", 0, 14));
        this.jLabel5.setText("Quantity:");
        this.quantitySpinner.setModel(new SpinnerNumberModel(0, 0, (Comparable)null, 1));
        this.quantitySpinner.addChangeListener(new ChangeListener() {
            public void stateChanged(ChangeEvent evt) {
                ShowMedicinelist.this.quantitySpinnerStateChanged(evt);
            }
        });
        this.orderTable.setModel(new DefaultTableModel(new Object[0][], new String[]{"Id", "Name", "Type", "Expiry Date", "Quantity", "Price", "Total Price"}) {
            Class[] types = new Class[]{String.class, String.class, String.class, String.class, String.class, String.class, Object.class};
            boolean[] canEdit = new boolean[]{false, false, false, false, false, false, false};

            public Class getColumnClass(int columnIndex) {
                return this.types[columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return this.canEdit[columnIndex];
            }
        });
        this.jScrollPane2.setViewportView(this.orderTable);
        if (this.orderTable.getColumnModel().getColumnCount() > 0) {
            this.orderTable.getColumnModel().getColumn(0).setResizable(false);
            this.orderTable.getColumnModel().getColumn(1).setResizable(false);
            this.orderTable.getColumnModel().getColumn(2).setResizable(false);
            this.orderTable.getColumnModel().getColumn(3).setResizable(false);
            this.orderTable.getColumnModel().getColumn(4).setResizable(false);
            this.orderTable.getColumnModel().getColumn(5).setResizable(false);
            this.orderTable.getColumnModel().getColumn(6).setResizable(false);
        }

        this.btnModifyQuantity.setText("Delete Products From Order Table");
        this.btnModifyQuantity.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                ShowMedicinelist.this.btnModifyQuantityActionPerformed(evt);
            }
        });
        this.btnCheckOut.setText("Check out");
        this.btnCheckOut.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                ShowMedicinelist.this.btnCheckOutActionPerformed(evt);
            }
        });
        this.jLabel2.setFont(new Font("Tahoma", 0, 14));
        this.jLabel2.setText("Search");
        this.jLabel1.setFont(new Font("Tahoma", 0, 24));
        this.jLabel1.setForeground(new Color(51, 51, 255));
        this.jLabel1.setText("Medicine List");
        GroupLayout panel2Layout = new GroupLayout(this.panel2);
        this.panel2.setLayout(panel2Layout);
        panel2Layout.setHorizontalGroup(panel2Layout.createParallelGroup(Alignment.LEADING).addGroup(panel2Layout.createSequentialGroup().addGap(209, 209, 209).addComponent(this.jLabel1, -2, 154, -2).addContainerGap(247, 32767)));
        panel2Layout.setVerticalGroup(panel2Layout.createParallelGroup(Alignment.LEADING).addGroup(panel2Layout.createSequentialGroup().addContainerGap().addComponent(this.jLabel1, -1, 46, 32767).addGap(20, 20, 20)));
        this.jButton1.setText("Logout");
        this.jButton1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                ShowMedicinelist.this.jButton1ActionPerformed(evt);
            }
        });
        this.jButton2.setText("Back");
        this.jButton2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                ShowMedicinelist.this.jButton2ActionPerformed(evt);
            }
        });
        GroupLayout panel1Layout = new GroupLayout(this.panel1);
        this.panel1.setLayout(panel1Layout);
        panel1Layout.setHorizontalGroup(panel1Layout.createParallelGroup(Alignment.LEADING).addGroup(panel1Layout.createSequentialGroup().addGap(58, 58, 58).addComponent(this.btnModifyQuantity).addGap(51, 51, 51).addComponent(this.btnCheckOut).addGap(54, 54, 54).addComponent(this.jButton2).addGap(51, 51, 51).addComponent(this.jButton1).addContainerGap(-1, 32767)).addGroup(panel1Layout.createSequentialGroup().addGroup(panel1Layout.createParallelGroup(Alignment.LEADING).addGroup(panel1Layout.createSequentialGroup().addGap(162, 162, 162).addComponent(this.jLabel5).addGap(32, 32, 32).addComponent(this.quantitySpinner, -2, 50, -2).addGap(106, 106, 106).addComponent(this.JButtonAdd)).addGroup(panel1Layout.createSequentialGroup().addGap(171, 171, 171).addComponent(this.jLabel2).addGap(38, 38, 38).addComponent(this.jTextField1, -2, 165, -2).addGap(101, 101, 101).addComponent(this.viewListtxt)).addGroup(panel1Layout.createSequentialGroup().addContainerGap().addComponent(this.panel2, -2, -1, -2)).addGroup(panel1Layout.createSequentialGroup().addContainerGap().addGroup(panel1Layout.createParallelGroup(Alignment.LEADING, false).addComponent(this.jScrollPane1, -1, 591, 32767).addComponent(this.jScrollPane2)))).addGap(0, 28, 32767)));
        panel1Layout.setVerticalGroup(panel1Layout.createParallelGroup(Alignment.LEADING).addGroup(panel1Layout.createSequentialGroup().addGap(22, 22, 22).addComponent(this.panel2, -2, -1, -2).addGap(17, 17, 17).addGroup(panel1Layout.createParallelGroup(Alignment.LEADING).addComponent(this.viewListtxt).addGroup(panel1Layout.createParallelGroup(Alignment.BASELINE).addComponent(this.jTextField1, -2, -1, -2).addComponent(this.jLabel2, -2, 23, -2))).addGap(50, 50, 50).addComponent(this.jScrollPane1, -2, 177, -2).addGap(39, 39, 39).addGroup(panel1Layout.createParallelGroup(Alignment.BASELINE).addComponent(this.quantitySpinner, -2, -1, -2).addComponent(this.jLabel5).addComponent(this.JButtonAdd, -2, 23, -2)).addGap(34, 34, 34).addComponent(this.jScrollPane2, -2, 95, -2).addGap(18, 18, 18).addGroup(panel1Layout.createParallelGroup(Alignment.BASELINE).addComponent(this.btnModifyQuantity).addComponent(this.btnCheckOut).addComponent(this.jButton1).addComponent(this.jButton2)).addGap(0, 25, 32767)));
        GroupLayout layout = new GroupLayout(this.getContentPane());
        this.getContentPane().setLayout(layout);
        layout.setHorizontalGroup(layout.createParallelGroup(Alignment.LEADING).addGroup(Alignment.TRAILING, layout.createSequentialGroup().addContainerGap(-1, 32767).addComponent(this.panel1, -2, -1, -2).addContainerGap()));
        layout.setVerticalGroup(layout.createParallelGroup(Alignment.LEADING).addGroup(layout.createSequentialGroup().addContainerGap().addComponent(this.panel1, -2, -1, -2).addContainerGap(-1, 32767)));
        this.setSize(new Dimension(655, 753));
        this.setLocationRelativeTo((Component)null);
    }

    private void viewListtxtActionPerformed(ActionEvent evt) {
        DefaultTableModel table = (DefaultTableModel)this.ptable.getModel();
        File f1 = new File("MedicineData.txt");

        try {
            Scanner read = new Scanner(f1);
            String[] info = new String[7];

            while(read.hasNext()) {
                info[0] = read.next();
                info[1] = read.next();
                info[2] = read.next();
                info[3] = read.next();
                info[4] = read.next();
                info[5] = read.next();
                info[6] = read.next();
                table.addRow(info);
            }
        } catch (IOException var6) {
            System.out.println("IOException has occured");
        }

    }

    private void jTextField1ActionPerformed(ActionEvent evt) {
    }

    private void JButtonAddActionPerformed(ActionEvent evt) {
        int quantity = (Integer)this.quantitySpinner.getValue();
        if (quantity == 0) {
            JOptionPane.showMessageDialog(this.rootPane, "Quantity can't be 0");
        } else if (quantity != 0) {
            TableModel model1 = this.ptable.getModel();
            int[] indexs = this.ptable.getSelectedRows();
            Object[] row = new Object[7];
            DefaultTableModel model2 = (DefaultTableModel)this.orderTable.getModel();

            for(int i = 0; i < indexs.length; ++i) {
                row[0] = model1.getValueAt(indexs[i], 0);
                row[1] = model1.getValueAt(indexs[i], 1);
                row[2] = model1.getValueAt(indexs[i], 2);
                row[3] = model1.getValueAt(indexs[i], 3);
                String str = model1.getValueAt(indexs[i], 4).toString();
                int q = Integer.parseInt(str);
                if (quantity <= q) {
                    row[4] = quantity;
                    this.Rowfilter = q - quantity;
                    this.ptable.setValueAt(this.Rowfilter, indexs[i], 4);
                }

                row[5] = model1.getValueAt(indexs[i], 5);
                model2.addRow(row);
            }
        }

    }

    private void btnModifyQuantityActionPerformed(ActionEvent evt) {
        DefaultTableModel t = (DefaultTableModel)this.orderTable.getModel();

        try {
            int SelectedRowIndex = this.orderTable.getSelectedRow();
            t.removeRow(SelectedRowIndex);
        } catch (Exception var4) {
            JOptionPane.showMessageDialog(this.rootPane, "Please Selet a product to delete");
        }

    }

    private void btnCheckOutActionPerformed(ActionEvent evt) {
        String filePath = "C:\\Users\\HP\\Desktop\\project.zip\\project\\OrderDetails.txt";
        File file = new File(filePath);

        try {
            FileWriter fw = new FileWriter(file.getAbsoluteFile());
            BufferedWriter bw = new BufferedWriter(fw);

            for(int i = 0; i < this.orderTable.getRowCount(); ++i) {
                for(int j = 0; j < this.orderTable.getColumnCount(); ++j) {
                    Object var10001 = this.orderTable.getModel().getValueAt(i, j);
                    bw.write(String.valueOf(var10001) + " ");
                }

                bw.newLine();
            }

            bw.close();
            fw.close();
        } catch (IOException var8) {
            JOptionPane.showMessageDialog(this.rootPane, "IOexception Occured");
        }

        JOptionPane.showMessageDialog(this.rootPane, "Order Placed Successfully");
    }

    private void jTextField1KeyReleased(KeyEvent evt) {
        DefaultTableModel table = (DefaultTableModel)this.ptable.getModel();
        String search = this.jTextField1.getText().toLowerCase();
        TableRowSorter<DefaultTableModel> tr = new TableRowSorter(table);
        this.ptable.setRowSorter(tr);
        tr.setRowFilter(RowFilter.regexFilter(search, new int[0]));
    }

    private void ptableMouseClicked(MouseEvent evt) {
    }

    private void quantitySpinnerStateChanged(ChangeEvent evt) {
    }

    private void jButton1ActionPerformed(ActionEvent evt) {
        MainPage a = new MainPage();
        a.setVisible(true);
        this.dispose();
    }

    private void jButton2ActionPerformed(ActionEvent evt) {
        UserFirstForm u = new UserFirstForm();
        u.setVisible(true);
        this.dispose();
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
            Logger.getLogger(ShowMedicinelist.class.getName()).log(Level.SEVERE, (String)null, var5);
        } catch (InstantiationException var6) {
            Logger.getLogger(ShowMedicinelist.class.getName()).log(Level.SEVERE, (String)null, var6);
        } catch (IllegalAccessException var7) {
            Logger.getLogger(ShowMedicinelist.class.getName()).log(Level.SEVERE, (String)null, var7);
        } catch (UnsupportedLookAndFeelException var8) {
            Logger.getLogger(ShowMedicinelist.class.getName()).log(Level.SEVERE, (String)null, var8);
        }

        EventQueue.invokeLater(new Runnable() {
            public void run() {
                (new ShowMedicinelist()).setVisible(true);
            }
        });
    }
}

