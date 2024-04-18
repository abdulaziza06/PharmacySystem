package Admin;

import java.awt.Component;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;

public class AddMedicine extends JFrame {

    private static AddMedicine instance = null;

    private JButton createDrugJButton;
    private JTextField didtxt;
    private JTextField dmdtxt;
    private JTextField dnametxt;
    private JTextField dtypetxt;
    private JButton jButton1;
    private JTextField jCompany;
    private JLabel jLabel1;
    private JLabel jLabel2;
    private JLabel jLabel3;
    private JLabel jLabel4;
    private JLabel jLabel5;
    private JLabel jLabel6;
    private JLabel jLabel7;
    private JLabel jLabel8;
    private Panel panel1;
    private JTextField prctxt;
    private JTextField qtytxt;

    private AddMedicine() {
        this.initComponents();
    }

    public static AddMedicine getInstance() {
        if (instance == null) {
            instance = new AddMedicine();
        }
        return instance;
    }

    private void initComponents() {
        this.jLabel2 = new JLabel();
        this.didtxt = new JTextField();
        this.jLabel3 = new JLabel();
        this.dnametxt = new JTextField();
        this.jLabel4 = new JLabel();
        this.dtypetxt = new JTextField();
        this.jLabel6 = new JLabel();
        this.dmdtxt = new JTextField();
        this.jLabel7 = new JLabel();
        this.qtytxt = new JTextField();
        this.jButton1 = new JButton();
        this.createDrugJButton = new JButton();
        this.jLabel1 = new JLabel();
        this.prctxt = new JTextField();
        this.jLabel5 = new JLabel();
        this.jCompany = new JTextField();
        this.panel1 = new Panel();
        this.jLabel8 = new JLabel();
        this.setDefaultCloseOperation(3);
        this.setResizable(false);
        this.jLabel2.setText("Drug ID");
        this.jLabel3.setText("Drug Name");
        this.dnametxt.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                AddMedicine.this.dnametxtActionPerformed(evt);
            }
        });
        this.jLabel4.setText("Drug Type");
        this.jLabel6.setText(" Expiry Date");
        this.dmdtxt.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                AddMedicine.this.dmdtxtActionPerformed(evt);
            }
        });
        this.jLabel7.setText("Quantity");
        this.qtytxt.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                AddMedicine.this.qtytxtActionPerformed(evt);
            }
        });
        this.jButton1.setText("<<Back");
        this.jButton1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                AddMedicine.this.jButton1ActionPerformed(evt);
            }
        });
        this.createDrugJButton.setText("Create Drug");
        this.createDrugJButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                AddMedicine.this.createDrugJButtonActionPerformed(evt);
            }
        });
        this.jLabel1.setText("Price");
        this.prctxt.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                AddMedicine.this.prctxtActionPerformed(evt);
            }
        });
        this.prctxt.addKeyListener(new KeyAdapter() {
            public void keyPressed(KeyEvent evt) {
                AddMedicine.this.prctxtKeyPressed(evt);
            }
        });
        this.jLabel5.setText("Company Name");
        this.jCompany.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                AddMedicine.this.jCompanyActionPerformed(evt);
            }
        });
        this.jLabel8.setFont(new Font("Tahoma", 1, 24));
        this.jLabel8.setText("Add New Medicine ");
        GroupLayout panel1Layout = new GroupLayout(this.panel1);
        this.panel1.setLayout(panel1Layout);
        panel1Layout.setHorizontalGroup(panel1Layout.createParallelGroup(Alignment.LEADING).addGroup(Alignment.TRAILING, panel1Layout.createSequentialGroup().addContainerGap(162, 32767).addComponent(this.jLabel8, -2, 242, -2).addGap(157, 157, 157)));
        panel1Layout.setVerticalGroup(panel1Layout.createParallelGroup(Alignment.LEADING).addGroup(panel1Layout.createSequentialGroup().addContainerGap().addComponent(this.jLabel8, -1, -1, 32767).addContainerGap()));
        GroupLayout layout = new GroupLayout(this.getContentPane());
        this.getContentPane().setLayout(layout);
        layout.setHorizontalGroup(layout.createParallelGroup(Alignment.LEADING).addGroup(layout.createSequentialGroup().addContainerGap(-1, 32767).addGroup(layout.createParallelGroup(Alignment.LEADING).addComponent(this.jLabel6, Alignment.TRAILING, -2, 67, -2).addGroup(Alignment.TRAILING, layout.createParallelGroup(Alignment.LEADING).addComponent(this.jLabel3, -2, 62, -2).addComponent(this.jLabel4)).addGroup(Alignment.TRAILING, layout.createSequentialGroup().addComponent(this.jLabel2).addGap(9, 9, 9)).addComponent(this.jLabel7, Alignment.TRAILING, -2, 42, -2).addComponent(this.jLabel1, Alignment.TRAILING, -2, 36, -2).addComponent(this.jLabel5, Alignment.TRAILING)).addGap(65, 65, 65).addGroup(layout.createParallelGroup(Alignment.LEADING).addComponent(this.prctxt, -2, 87, -2).addComponent(this.jCompany, -2, 151, -2).addComponent(this.qtytxt, -2, 151, -2).addComponent(this.dmdtxt, -2, 151, -2).addComponent(this.dtypetxt, -2, 195, -2).addComponent(this.dnametxt, -2, 195, -2).addComponent(this.didtxt, -2, 84, -2)).addContainerGap(-1, 32767)).addComponent(this.panel1, -1, -1, 32767).addGroup(Alignment.TRAILING, layout.createSequentialGroup().addGap(117, 117, 117).addComponent(this.jButton1).addPreferredGap(ComponentPlacement.RELATED, -1, 32767).addComponent(this.createDrugJButton).addGap(110, 110, 110)));
        layout.setVerticalGroup(layout.createParallelGroup(Alignment.LEADING).addGroup(layout.createSequentialGroup().addComponent(this.panel1, -2, -1, -2).addGap(19, 19, 19).addGroup(layout.createParallelGroup(Alignment.BASELINE).addComponent(this.didtxt, -2, -1, -2).addComponent(this.jLabel2)).addGap(20, 20, 20).addGroup(layout.createParallelGroup(Alignment.BASELINE).addComponent(this.dnametxt, -2, -1, -2).addComponent(this.jLabel3, -2, 23, -2)).addPreferredGap(ComponentPlacement.RELATED).addGroup(layout.createParallelGroup(Alignment.BASELINE).addComponent(this.dtypetxt, -2, -1, -2).addComponent(this.jLabel4)).addGap(18, 18, 18).addGroup(layout.createParallelGroup(Alignment.LEADING, false).addComponent(this.dmdtxt).addComponent(this.jLabel6, -1, -1, 32767)).addPreferredGap(ComponentPlacement.UNRELATED).addGroup(layout.createParallelGroup(Alignment.TRAILING).addComponent(this.qtytxt, -2, -1, -2).addComponent(this.jLabel7, Alignment.LEADING, -2, 17, -2)).addGap(18, 18, 18).addGroup(layout.createParallelGroup(Alignment.BASELINE).addComponent(this.prctxt, -2, -1, -2).addComponent(this.jLabel1, -1, -1, 32767)).addPreferredGap(ComponentPlacement.UNRELATED).addGroup(layout.createParallelGroup(Alignment.BASELINE).addComponent(this.jCompany, -2, -1, -2).addComponent(this.jLabel5, -2, 26, -2)).addPreferredGap(ComponentPlacement.RELATED, 55, 32767).addGroup(layout.createParallelGroup(Alignment.BASELINE).addComponent(this.createDrugJButton, -2, 36, -2).addComponent(this.jButton1, -2, 36, -2)).addGap(134, 134, 134)));
        this.setSize(new Dimension(577, 567));
        this.setLocationRelativeTo((Component)null);
    }

    private void qtytxtActionPerformed(ActionEvent evt) {
    }

    private void jButton1ActionPerformed(ActionEvent evt) {
        MainMenu a = new MainMenu();
        a.setVisible(true);
        this.dispose();
    }

    private void createDrugJButtonActionPerformed(ActionEvent evt) {
        String Id = this.didtxt.getText();
        String Name = this.dnametxt.getText();
        String Type = this.dtypetxt.getText();
        String Exp = this.dmdtxt.getText();
        String Qty = this.qtytxt.getText();
        String Prc = this.prctxt.getText();
        String Cpy = this.jCompany.getText();
        if (!Id.isEmpty() && !Name.isEmpty() && !Type.isEmpty() && !Exp.isEmpty() && !Qty.isEmpty() && !Prc.isEmpty() && !Cpy.isEmpty()) {
            PrintWriter pw = null;
            File f1 = new File("MedicineData.txt");

            try {
                FileWriter fw = new FileWriter(f1, true);
                pw = new PrintWriter(fw, true);
                pw.write(Id + " ");
                pw.write(Name + " ");
                pw.write(Type + " ");
                pw.write(Exp + " ");
                pw.write(Qty + " ");
                pw.write(Prc + " ");
                pw.write(Cpy + " ");
                pw.write("\r\n");
                JOptionPane.showMessageDialog(this.rootPane, "Medicine Added Successfully");
                this.didtxt.setText((String)null);
                this.dnametxt.setText((String)null);
                this.dtypetxt.setText((String)null);
                this.dmdtxt.setText((String)null);
                this.qtytxt.setText((String)null);
                this.prctxt.setText((String)null);
                this.jCompany.setText((String)null);
                fw.close();
            } catch (Exception var12) {
                JOptionPane.showMessageDialog(this.rootPane, "Error");
            }
        } else {
            JOptionPane.showMessageDialog(this.rootPane, "Please Enter All Informaton");
        }

    }

    private void dnametxtActionPerformed(ActionEvent evt) {
    }

    private void dmdtxtActionPerformed(ActionEvent evt) {
    }

    private void prctxtActionPerformed(ActionEvent evt) {
    }

    private void prctxtKeyPressed(KeyEvent evt) {
    }

    private void jCompanyActionPerformed(ActionEvent evt) {
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
            Logger.getLogger(AddMedicine.class.getName()).log(Level.SEVERE, (String)null, var5);
        } catch (InstantiationException var6) {
            Logger.getLogger(AddMedicine.class.getName()).log(Level.SEVERE, (String)null, var6);
        } catch (IllegalAccessException var7) {
            Logger.getLogger(AddMedicine.class.getName()).log(Level.SEVERE, (String)null, var7);
        } catch (UnsupportedLookAndFeelException var8) {
            Logger.getLogger(AddMedicine.class.getName()).log(Level.SEVERE, (String)null, var8);
        }

        EventQueue.invokeLater(new Runnable() {
            public void run() {
                (new AddMedicine()).setVisible(true);
            }
        });
    }
}
