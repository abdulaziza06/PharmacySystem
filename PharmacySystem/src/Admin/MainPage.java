package Admin;

import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Panel;
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

public class MainPage extends JFrame {
    private JButton jButton1;
    private JButton jButton2;
    private JLabel jLabel1;
    private JLabel jLabel2;
    private Panel panel1;
    private Panel panel2;
    private Panel panel3;

    public MainPage() {
        this.initComponents();
    }

    private void initComponents() {
        this.panel1 = new Panel();
        this.panel2 = new Panel();
        this.jLabel1 = new JLabel();
        this.jButton1 = new JButton();
        this.panel3 = new Panel();
        this.jLabel2 = new JLabel();
        this.jButton2 = new JButton();
        this.setDefaultCloseOperation(3);
        this.panel1.setBackground(new Color(0, 0, 0));
        this.jLabel1.setFont(new Font("Tahoma", 1, 18));
        this.jLabel1.setForeground(new Color(0, 0, 255));
        this.jLabel1.setText("Greetings!\nWelcome To the System.");
        GroupLayout panel2Layout = new GroupLayout(this.panel2);
        this.panel2.setLayout(panel2Layout);
        panel2Layout.setHorizontalGroup(panel2Layout.createParallelGroup(Alignment.LEADING).addGroup(Alignment.TRAILING, panel2Layout.createSequentialGroup().addContainerGap(-1, 32767).addComponent(this.jLabel1).addGap(166, 166, 166)));
        panel2Layout.setVerticalGroup(panel2Layout.createParallelGroup(Alignment.LEADING).addGroup(Alignment.TRAILING, panel2Layout.createSequentialGroup().addContainerGap(83, 32767).addComponent(this.jLabel1, -2, 70, -2).addContainerGap()));
        this.jButton1.setFont(new Font("Tahoma", 1, 18));
        this.jButton1.setForeground(new Color(0, 255, 0));
        this.jButton1.setText("Continue");
        this.jButton1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                MainPage.this.jButton1ActionPerformed(evt);
            }
        });
        this.jLabel2.setFont(new Font("Tahoma", 1, 18));
        this.jLabel2.setForeground(new Color(255, 0, 0));
        this.jLabel2.setText("Pharmacy Management System");
        GroupLayout panel3Layout = new GroupLayout(this.panel3);
        this.panel3.setLayout(panel3Layout);
        panel3Layout.setHorizontalGroup(panel3Layout.createParallelGroup(Alignment.LEADING).addGroup(panel3Layout.createSequentialGroup().addGap(183, 183, 183).addComponent(this.jLabel2, -2, 294, -2).addContainerGap(-1, 32767)));
        panel3Layout.setVerticalGroup(panel3Layout.createParallelGroup(Alignment.LEADING).addGroup(panel3Layout.createSequentialGroup().addContainerGap().addComponent(this.jLabel2, -2, 62, -2).addContainerGap(27, 32767)));
        this.jButton2.setFont(new Font("Tahoma", 0, 18));
        this.jButton2.setForeground(new Color(0, 255, 0));
        this.jButton2.setText("Exit");
        this.jButton2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                MainPage.this.jButton2ActionPerformed(evt);
            }
        });
        GroupLayout panel1Layout = new GroupLayout(this.panel1);
        this.panel1.setLayout(panel1Layout);
        panel1Layout.setHorizontalGroup(panel1Layout.createParallelGroup(Alignment.LEADING).addComponent(this.panel2, -1, -1, 32767).addComponent(this.panel3, -1, -1, 32767).addGroup(panel1Layout.createSequentialGroup().addGap(183, 183, 183).addComponent(this.jButton1, -2, 141, -2).addGap(100, 100, 100).addComponent(this.jButton2, -2, 76, -2).addContainerGap(164, 32767)));
        panel1Layout.setVerticalGroup(panel1Layout.createParallelGroup(Alignment.LEADING).addGroup(panel1Layout.createSequentialGroup().addComponent(this.panel3, -2, -1, -2).addGap(33, 33, 33).addComponent(this.panel2, -2, -1, -2).addGap(90, 90, 90).addGroup(panel1Layout.createParallelGroup(Alignment.BASELINE).addComponent(this.jButton1, -2, 50, -2).addComponent(this.jButton2, -2, 50, -2)).addContainerGap(215, 32767)));
        GroupLayout layout = new GroupLayout(this.getContentPane());
        this.getContentPane().setLayout(layout);
        layout.setHorizontalGroup(layout.createParallelGroup(Alignment.LEADING).addGroup(Alignment.TRAILING, layout.createSequentialGroup().addGap(0, 0, 0).addComponent(this.panel1, -1, -1, 32767)));
        layout.setVerticalGroup(layout.createParallelGroup(Alignment.LEADING).addComponent(this.panel1, -2, -1, -2));
        this.setSize(new Dimension(680, 627));
        this.setLocationRelativeTo((Component)null);
    }

    private void jButton2ActionPerformed(ActionEvent evt) {
        System.exit(0);
        this.dispose();
    }

    private void jButton1ActionPerformed(ActionEvent evt) {
        Loginas we = new Loginas();
        we.setVisible(true);
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
            Logger.getLogger(MainPage.class.getName()).log(Level.SEVERE, (String)null, var5);
        } catch (InstantiationException var6) {
            Logger.getLogger(MainPage.class.getName()).log(Level.SEVERE, (String)null, var6);
        } catch (IllegalAccessException var7) {
            Logger.getLogger(MainPage.class.getName()).log(Level.SEVERE, (String)null, var7);
        } catch (UnsupportedLookAndFeelException var8) {
            Logger.getLogger(MainPage.class.getName()).log(Level.SEVERE, (String)null, var8);
        }

        EventQueue.invokeLater(new Runnable() {
            public void run() {
                (new MainPage()).setVisible(true);
            }
        });
    }
}

