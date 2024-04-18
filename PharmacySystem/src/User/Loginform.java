package User;

import Admin.MainMenu1;
import java.awt.Color;
import java.awt.Component;
import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.LayoutManager;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.GroupLayout.Alignment;

public class Loginform extends JFrame {
    private JButton jButton1;
    private JButton jButton2;
    private JLabel jLabel1;
    private JLabel jLabel5;
    private JLabel jLabel7;
    private JLabel jLabelRegister;
    private JPanel jPanel2;
    private JPasswordField jPasswordField1;
    private JTextField jTextField1;

    public Loginform() {
        this.initComponents();
    }

    private void initComponents() {
        this.jPanel2 = new JPanel();
        this.jLabel5 = new JLabel();
        this.jLabel7 = new JLabel();
        this.jTextField1 = new JTextField();
        this.jPasswordField1 = new JPasswordField();
        this.jButton1 = new JButton();
        this.jButton2 = new JButton();
        this.jLabelRegister = new JLabel();
        this.jLabel1 = new JLabel();
        this.setDefaultCloseOperation(3);
        this.jPanel2.setCursor(new Cursor(12));
        this.jPanel2.setLayout((LayoutManager)null);
        this.jLabel5.setFont(new Font("Tahoma", 0, 18));
        this.jLabel5.setText("Password:");
        this.jPanel2.add(this.jLabel5);
        this.jLabel5.setBounds(40, 90, 80, 20);
        this.jLabel7.setFont(new Font("Tahoma", 0, 18));
        this.jLabel7.setText("Username:");
        this.jPanel2.add(this.jLabel7);
        this.jLabel7.setBounds(40, 46, 100, 20);
        this.jTextField1.setFont(new Font("Tahoma", 0, 14));
        this.jTextField1.setText("       ");
        this.jTextField1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                Loginform.this.jTextField1ActionPerformed(evt);
            }
        });
        this.jPanel2.add(this.jTextField1);
        this.jTextField1.setBounds(140, 40, 220, 30);
        this.jPasswordField1.setFont(new Font("Tahoma", 0, 14));
        this.jPanel2.add(this.jPasswordField1);
        this.jPasswordField1.setBounds(140, 90, 220, 30);
        this.jButton1.setFont(new Font("Tahoma", 0, 14));
        this.jButton1.setForeground(new Color(255, 0, 0));
        this.jButton1.setText("Cancel");
        this.jButton1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                Loginform.this.jButton1ActionPerformed(evt);
            }
        });
        this.jPanel2.add(this.jButton1);
        this.jButton1.setBounds(140, 150, 77, 32);
        this.jButton2.setFont(new Font("Tahoma", 1, 14));
        this.jButton2.setForeground(new Color(51, 51, 255));
        this.jButton2.setText("Login");
        this.jButton2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                Loginform.this.jButton2ActionPerformed(evt);
            }
        });
        this.jPanel2.add(this.jButton2);
        this.jButton2.setBounds(290, 150, 77, 32);
        this.jLabelRegister.setFont(new Font("Tahoma", 0, 14));
        this.jLabelRegister.setForeground(new Color(102, 102, 0));
        this.jLabelRegister.setText("Click to create a new account ");
        this.jLabelRegister.setCursor(new Cursor(12));
        this.jLabelRegister.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent evt) {
                Loginform.this.jLabelRegisterMouseClicked(evt);
            }
        });
        this.jPanel2.add(this.jLabelRegister);
        this.jLabelRegister.setBounds(140, 220, 220, 17);
        this.jLabel1.setFont(new Font("Tahoma", 1, 24));
        this.jLabel1.setText("User Login Form");
        GroupLayout layout = new GroupLayout(this.getContentPane());
        this.getContentPane().setLayout(layout);
        layout.setHorizontalGroup(layout.createParallelGroup(Alignment.LEADING).addGroup(layout.createSequentialGroup().addGap(212, 212, 212).addComponent(this.jLabel1).addContainerGap(231, 32767)).addGroup(layout.createParallelGroup(Alignment.LEADING).addGroup(Alignment.TRAILING, layout.createSequentialGroup().addContainerGap(81, 32767).addComponent(this.jPanel2, -2, 419, -2).addGap(139, 139, 139))));
        layout.setVerticalGroup(layout.createParallelGroup(Alignment.LEADING).addGroup(layout.createSequentialGroup().addGap(32, 32, 32).addComponent(this.jLabel1).addContainerGap(452, 32767)).addGroup(layout.createParallelGroup(Alignment.LEADING).addGroup(layout.createSequentialGroup().addGap(92, 92, 92).addComponent(this.jPanel2, -2, 279, -2).addContainerGap(142, 32767))));
        this.setSize(new Dimension(655, 552));
        this.setLocationRelativeTo((Component)null);
    }

    private void jLabelRegisterMouseClicked(MouseEvent evt) {
        Registrationform1 rgf = new Registrationform1();
        rgf.setVisible(true);
        rgf.pack();
        rgf.setLocationRelativeTo((Component)null);
        rgf.setDefaultCloseOperation(3);
        this.dispose();
    }

    private void jButton2ActionPerformed(ActionEvent evt) {
        MainMenu1 me = new MainMenu1();
        me.setVisible(true);
        this.dispose();
    }

    private void jButton1ActionPerformed(ActionEvent evt) {
        this.jTextField1.setText((String)null);
        this.jPasswordField1.setText((String)null);
    }

    private void jTextField1ActionPerformed(ActionEvent evt) {
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
            Logger.getLogger(Loginform.class.getName()).log(Level.SEVERE, (String)null, var5);
        } catch (InstantiationException var6) {
            Logger.getLogger(Loginform.class.getName()).log(Level.SEVERE, (String)null, var6);
        } catch (IllegalAccessException var7) {
            Logger.getLogger(Loginform.class.getName()).log(Level.SEVERE, (String)null, var7);
        } catch (UnsupportedLookAndFeelException var8) {
            Logger.getLogger(Loginform.class.getName()).log(Level.SEVERE, (String)null, var8);
        }

        EventQueue.invokeLater(new Runnable() {
            public void run() {
                (new Loginform()).setVisible(true);
            }
        });
    }
}
