package Admin;

import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.table.DefaultTableModel;

public class UpdateDelateMed extends JFrame {
    private JButton jButton2;
    private JButton jButton4;
    private JButton jButton5;
    private JLabel jLabel1;
    private JScrollPane jScrollPane1;
    private Panel panel1;
    private JTable ptable2;

    public UpdateDelateMed() {
        this.initComponents();
        this.showList();
    }

    public void showList() {
        DefaultTableModel table = (DefaultTableModel)this.ptable2.getModel();
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
        this.panel1 = new Panel();
        this.jScrollPane1 = new JScrollPane();
        this.ptable2 = new JTable();
        this.jLabel1 = new JLabel();
        this.jButton2 = new JButton();
        this.jButton4 = new JButton();
        this.jButton5 = new JButton();
        this.setDefaultCloseOperation(3);
        this.ptable2.setModel(new DefaultTableModel(new Object[0][], new String[]{"Id", "name", "type", "Expiry Date", "Quantity", "Price"}) {
            Class[] types = new Class[]{String.class, String.class, String.class, String.class, String.class, String.class};
            boolean[] canEdit = new boolean[]{false, false, false, false, false, false};

            public Class getColumnClass(int columnIndex) {
                return this.types[columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return this.canEdit[columnIndex];
            }
        });
        this.ptable2.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent evt) {
                UpdateDelateMed.this.ptable2MouseClicked(evt);
            }
        });
        this.jScrollPane1.setViewportView(this.ptable2);
        this.jLabel1.setFont(new Font("Tahoma", 0, 18));
        this.jLabel1.setForeground(new Color(51, 51, 255));
        this.jLabel1.setText("Products List");
        GroupLayout panel1Layout = new GroupLayout(this.panel1);
        this.panel1.setLayout(panel1Layout);
        panel1Layout.setHorizontalGroup(panel1Layout.createParallelGroup(Alignment.LEADING).addGroup(panel1Layout.createSequentialGroup().addGroup(panel1Layout.createParallelGroup(Alignment.LEADING).addGroup(panel1Layout.createSequentialGroup().addContainerGap().addComponent(this.jScrollPane1, -2, 512, -2)).addGroup(panel1Layout.createSequentialGroup().addGap(203, 203, 203).addComponent(this.jLabel1))).addContainerGap(-1, 32767)));
        panel1Layout.setVerticalGroup(panel1Layout.createParallelGroup(Alignment.LEADING).addGroup(Alignment.TRAILING, panel1Layout.createSequentialGroup().addContainerGap().addComponent(this.jLabel1, -1, 34, 32767).addPreferredGap(ComponentPlacement.UNRELATED).addComponent(this.jScrollPane1, -2, 177, -2)));
        this.jButton2.setFont(new Font("Tahoma", 0, 14));
        this.jButton2.setText("Delete Products");
        this.jButton2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                UpdateDelateMed.this.jButton2ActionPerformed(evt);
            }
        });
        this.jButton4.setFont(new Font("Tahoma", 0, 14));
        this.jButton4.setForeground(new Color(255, 51, 51));
        this.jButton4.setText("Back");
        this.jButton4.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                UpdateDelateMed.this.jButton4ActionPerformed(evt);
            }
        });
        this.jButton5.setFont(new Font("Tahoma", 0, 14));
        this.jButton5.setForeground(new Color(51, 51, 0));
        this.jButton5.setText("Exit");
        this.jButton5.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                UpdateDelateMed.this.jButton5ActionPerformed(evt);
            }
        });
        GroupLayout layout = new GroupLayout(this.getContentPane());
        this.getContentPane().setLayout(layout);
        layout.setHorizontalGroup(layout.createParallelGroup(Alignment.LEADING).addGroup(layout.createSequentialGroup().addGroup(layout.createParallelGroup(Alignment.LEADING).addComponent(this.panel1, -1, -1, 32767).addGroup(layout.createSequentialGroup().addGroup(layout.createParallelGroup(Alignment.LEADING).addGroup(layout.createSequentialGroup().addGap(144, 144, 144).addComponent(this.jButton4).addGap(119, 119, 119).addComponent(this.jButton5)).addGroup(layout.createSequentialGroup().addGap(160, 160, 160).addComponent(this.jButton2))).addGap(0, 0, 32767))).addContainerGap()));
        layout.setVerticalGroup(layout.createParallelGroup(Alignment.LEADING).addGroup(layout.createSequentialGroup().addComponent(this.panel1, -2, -1, -2).addGap(51, 51, 51).addComponent(this.jButton2).addGap(88, 88, 88).addGroup(layout.createParallelGroup(Alignment.BASELINE).addComponent(this.jButton4, -2, 25, -2).addComponent(this.jButton5)).addContainerGap(117, 32767)));
        this.setSize(new Dimension(655, 753));
        this.setLocationRelativeTo((Component)null);
    }

    private void ptable2MouseClicked(MouseEvent evt) {
    }

    private void jButton2ActionPerformed(ActionEvent evt) {
        DefaultTableModel table = (DefaultTableModel)this.ptable2.getModel();

        try {
            int selt = this.ptable2.getSelectedRow();
            table.removeRow(selt);
        } catch (Exception var4) {
            JOptionPane.showMessageDialog(this.rootPane, "Pease Select a Product to Delect");
        }

    }

    private void jButton4ActionPerformed(ActionEvent evt) {
        MainMenu w = new MainMenu();
        w.setVisible(true);
        this.dispose();
    }

    private void jButton5ActionPerformed(ActionEvent evt) {
        System.exit(0);
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
            Logger.getLogger(UpdateDelateMed.class.getName()).log(Level.SEVERE, (String)null, var5);
        } catch (InstantiationException var6) {
            Logger.getLogger(UpdateDelateMed.class.getName()).log(Level.SEVERE, (String)null, var6);
        } catch (IllegalAccessException var7) {
            Logger.getLogger(UpdateDelateMed.class.getName()).log(Level.SEVERE, (String)null, var7);
        } catch (UnsupportedLookAndFeelException var8) {
            Logger.getLogger(UpdateDelateMed.class.getName()).log(Level.SEVERE, (String)null, var8);
        }

        EventQueue.invokeLater(new Runnable() {
            public void run() {
                (new UpdateDelateMed()).setVisible(true);
            }
        });
    }
}
