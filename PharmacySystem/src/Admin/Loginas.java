package Admin;

import User.Registrationform1;
import java.awt.Color;
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
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.GroupLayout.Alignment;

public class Loginas extends JFrame implements Cloneable {

    private JButton jButton1;
    private JLabel jLabel1;
    private JButton jbthExit;
    private JButton jbtnAdmin;
    private JButton jbtnUser;

    public Loginas() {
        this.initComponents();
    }

    private void initComponents() {
        this.jLabel1 = new JLabel();
        this.jbtnAdmin = new JButton();
        this.jbtnUser = new JButton();
        this.jbthExit = new JButton();
        this.jButton1 = new JButton();
        this.setDefaultCloseOperation(3);
        this.jLabel1.setBackground(new Color(153, 255, 51));
        this.jLabel1.setFont(new Font("Tahoma", 1, 36));
        this.jLabel1.setText("Login Page");
        this.jbtnAdmin.setFont(new Font("Tahoma", 1, 24));
        this.jbtnAdmin.setText("Admin");
        this.jbtnAdmin.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                Loginas.this.jbtnAdminActionPerformed(evt);
            }
        });
        this.jbtnUser.setFont(new Font("Tahoma", 1, 24));
        this.jbtnUser.setText("User");
        this.jbtnUser.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                Loginas.this.jbtnUserActionPerformed(evt);
            }
        });
        this.jbthExit.setBackground(new Color(255, 255, 255));
        this.jbthExit.setFont(new Font("Tahoma", 1, 14));
        this.jbthExit.setForeground(new Color(204, 153, 0));
        this.jbthExit.setText("Exit");
        this.jbthExit.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                Loginas.this.jbthExitActionPerformed(evt);
            }
        });
        this.jButton1.setText("Back");
        this.jButton1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                Loginas.this.jButton1ActionPerformed(evt);
            }
        });
        GroupLayout layout = new GroupLayout(this.getContentPane());
        this.getContentPane().setLayout(layout);
        layout.setHorizontalGroup(layout.createParallelGroup(Alignment.LEADING).addGroup(Alignment.TRAILING, layout.createSequentialGroup().addContainerGap(-1, 32767).addComponent(this.jButton1).addGap(131, 131, 131).addComponent(this.jbthExit).addGap(211, 211, 211)).addGroup(layout.createSequentialGroup().addGroup(layout.createParallelGroup(Alignment.LEADING).addGroup(layout.createSequentialGroup().addGap(165, 165, 165).addComponent(this.jbtnAdmin).addGap(107, 107, 107).addComponent(this.jbtnUser, -2, 99, -2)).addGroup(layout.createSequentialGroup().addGap(224, 224, 224).addComponent(this.jLabel1))).addContainerGap(159, 32767)));
        layout.setVerticalGroup(layout.createParallelGroup(Alignment.LEADING).addGroup(layout.createSequentialGroup().addGap(41, 41, 41).addComponent(this.jLabel1).addGap(75, 75, 75).addGroup(layout.createParallelGroup(Alignment.BASELINE).addComponent(this.jbtnAdmin).addComponent(this.jbtnUser)).addGap(34, 34, 34).addGroup(layout.createParallelGroup(Alignment.BASELINE).addComponent(this.jButton1, -2, 31, -2).addComponent(this.jbthExit, -2, 31, -2)).addContainerGap(109, 32767)));
        this.setSize(new Dimension(655, 412));
        this.setLocationRelativeTo((Component)null);
    }

    protected Loginas clone() {
        try {
            return (Loginas) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
            return null;
        }
    }
    private void jbtnAdminActionPerformed(ActionEvent evt) {
        Adminlogin Info = new Adminlogin();
        Info.setVisible(true);
        this.dispose();
    }

    private void jbthExitActionPerformed(ActionEvent evt) {
        System.exit(0);
        this.dispose();
    }

    private void jbtnUserActionPerformed(ActionEvent evt) {
        Registrationform1 Info = new Registrationform1();
        Info.setVisible(true);
        this.dispose();
    }

    private void jButton1ActionPerformed(ActionEvent evt) {
        MainPage a = new MainPage();
        a.setVisible(true);
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
            Logger.getLogger(Loginas.class.getName()).log(Level.SEVERE, (String)null, var5);
        } catch (InstantiationException var6) {
            Logger.getLogger(Loginas.class.getName()).log(Level.SEVERE, (String)null, var6);
        } catch (IllegalAccessException var7) {
            Logger.getLogger(Loginas.class.getName()).log(Level.SEVERE, (String)null, var7);
        } catch (UnsupportedLookAndFeelException var8) {
            Logger.getLogger(Loginas.class.getName()).log(Level.SEVERE, (String)null, var8);
        }

        EventQueue.invokeLater(new Runnable() {
            public void run() {
                (new Loginas()).setVisible(true);
            }
        });
    }
}

