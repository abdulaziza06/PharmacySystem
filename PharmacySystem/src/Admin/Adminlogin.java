package Admin;

import java.awt.Component;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;

public class Adminlogin extends JFrame {
    private JButton jButton1;
    private JLabel jLabel1;
    private JLabel jLabel2;
    private JLabel jLabel3;
    private JPasswordField jPassword;
    private JTextField jTextUserId;
    private JButton jbtnExit;
    private JButton jbtnLogin;

    public Adminlogin() {
        this.initComponents();
    }

    private void initComponents() {
        this.jLabel1 = new JLabel();
        this.jLabel2 = new JLabel();
        this.jLabel3 = new JLabel();
        this.jTextUserId = new JTextField();
        this.jPassword = new JPasswordField();
        this.jbtnLogin = new JButton();
        this.jbtnExit = new JButton();
        this.jButton1 = new JButton();
        this.setDefaultCloseOperation(2);
        this.setResizable(false);
        this.jLabel1.setFont(new Font("Tahoma", 1, 24));
        this.jLabel1.setText("Admin Login");
        this.jLabel2.setFont(new Font("Tahoma", 1, 18));
        this.jLabel2.setText("Userid");
        this.jLabel3.setFont(new Font("Tahoma", 1, 18));
        this.jLabel3.setText("Password");
        this.jbtnLogin.setFont(new Font("Tahoma", 1, 14));
        this.jbtnLogin.setText("Login");
        this.jbtnLogin.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                Adminlogin.this.jbtnLoginActionPerformed(evt);
            }
        });
        this.jbtnExit.setFont(new Font("Tahoma", 1, 14));
        this.jbtnExit.setText("Exit");
        this.jbtnExit.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                Adminlogin.this.jbtnExitActionPerformed(evt);
            }
        });
        this.jButton1.setText("Back");
        this.jButton1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                Adminlogin.this.jButton1ActionPerformed(evt);
            }
        });
        GroupLayout layout = new GroupLayout(this.getContentPane());
        this.getContentPane().setLayout(layout);
        layout.setHorizontalGroup(layout.createParallelGroup(Alignment.LEADING).addGroup(Alignment.TRAILING, layout.createSequentialGroup().addGap(142, 142, 142).addComponent(this.jButton1).addPreferredGap(ComponentPlacement.RELATED, 192, 32767).addComponent(this.jbtnLogin).addGap(52, 52, 52).addComponent(this.jbtnExit).addGap(68, 68, 68)).addGroup(Alignment.TRAILING, layout.createSequentialGroup().addGap(77, 77, 77).addGroup(layout.createParallelGroup(Alignment.LEADING).addComponent(this.jLabel2).addComponent(this.jLabel3)).addGap(56, 56, 56).addGroup(layout.createParallelGroup(Alignment.LEADING).addComponent(this.jPassword).addComponent(this.jTextUserId)).addGap(83, 83, 83)).addGroup(Alignment.TRAILING, layout.createSequentialGroup().addContainerGap(-1, 32767).addComponent(this.jLabel1).addGap(231, 231, 231)));
        layout.setVerticalGroup(layout.createParallelGroup(Alignment.LEADING).addGroup(layout.createSequentialGroup().addGap(25, 25, 25).addComponent(this.jLabel1).addGap(52, 52, 52).addGroup(layout.createParallelGroup(Alignment.BASELINE).addComponent(this.jLabel2).addComponent(this.jTextUserId, -2, -1, -2)).addGap(42, 42, 42).addGroup(layout.createParallelGroup(Alignment.BASELINE).addComponent(this.jLabel3).addComponent(this.jPassword, -2, -1, -2)).addGap(45, 45, 45).addGroup(layout.createParallelGroup(Alignment.BASELINE).addComponent(this.jbtnLogin).addComponent(this.jbtnExit).addComponent(this.jButton1)).addContainerGap(219, 32767)));
        this.setSize(new Dimension(655, 525));
        this.setLocationRelativeTo((Component)null);
    }

    private void jbtnExitActionPerformed(ActionEvent evt) {
        System.exit(0);
        this.dispose();
    }

    private void jbtnLoginActionPerformed(ActionEvent evt) {
        String userid = this.jTextUserId.getText();
        String password = this.jPassword.getText();
        if (password.contains("1997") && userid.contains("hulk")) {
            this.jTextUserId.setText((String)null);
            this.jPassword.setText((String)null);
            MainMenu we = new MainMenu();
            we.setVisible(true);
        } else {
            JOptionPane.showMessageDialog((Component)null, "Invalid Login Details", "Login Error", 0);
            this.jPassword.setText((String)null);
            this.jTextUserId.setText((String)null);
        }

    }

    private void jButton1ActionPerformed(ActionEvent evt) {
        Loginas q = new Loginas();
        q.setVisible(true);
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
            Logger.getLogger(Adminlogin.class.getName()).log(Level.SEVERE, (String)null, var5);
        } catch (InstantiationException var6) {
            Logger.getLogger(Adminlogin.class.getName()).log(Level.SEVERE, (String)null, var6);
        } catch (IllegalAccessException var7) {
            Logger.getLogger(Adminlogin.class.getName()).log(Level.SEVERE, (String)null, var7);
        } catch (UnsupportedLookAndFeelException var8) {
            Logger.getLogger(Adminlogin.class.getName()).log(Level.SEVERE, (String)null, var8);
        }

        EventQueue.invokeLater(new Runnable() {
            public void run() {
                (new Adminlogin()).setVisible(true);
            }
        });
    }
}
