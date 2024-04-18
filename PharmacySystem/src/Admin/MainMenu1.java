package Admin;

import User.ShowMedicinelist;
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
import javax.swing.LayoutStyle.ComponentPlacement;

public class MainMenu1 extends JFrame {
    private JButton jButton1;
    private JButton jButton2;
    private JLabel jLabel1;
    private JLabel jLabel2;
    private Panel panel1;
    private Panel panel2;

    public MainMenu1() {
        this.initComponents();
    }

    private void initComponents() {
        this.jLabel2 = new JLabel();
        this.panel1 = new Panel();
        this.panel2 = new Panel();
        this.jButton1 = new JButton();
        this.jButton2 = new JButton();
        this.jLabel1 = new JLabel();
        this.jLabel2.setText("jLabel2");
        this.setDefaultCloseOperation(3);
        this.panel1.setBackground(new Color(0, 0, 0));
        this.panel2.setBackground(new Color(255, 255, 255));
        this.jButton1.setFont(new Font("Tahoma", 0, 18));
        this.jButton1.setText("Search & Order Medicine");
        this.jButton1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                MainMenu1.this.jButton1ActionPerformed(evt);
            }
        });
        this.jButton2.setText("Back");
        this.jButton2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                MainMenu1.this.jButton2ActionPerformed(evt);
            }
        });
        GroupLayout panel2Layout = new GroupLayout(this.panel2);
        this.panel2.setLayout(panel2Layout);
        panel2Layout.setHorizontalGroup(panel2Layout.createParallelGroup(Alignment.LEADING).addGroup(panel2Layout.createSequentialGroup().addGap(124, 124, 124).addComponent(this.jButton1, -2, 290, -2).addContainerGap(205, 32767)).addGroup(Alignment.TRAILING, panel2Layout.createSequentialGroup().addContainerGap(-1, 32767).addComponent(this.jButton2, -2, 81, -2).addGap(125, 125, 125)));
        panel2Layout.setVerticalGroup(panel2Layout.createParallelGroup(Alignment.LEADING).addGroup(panel2Layout.createSequentialGroup().addGap(63, 63, 63).addComponent(this.jButton1, -2, 69, -2).addGap(32, 32, 32).addComponent(this.jButton2, -2, 43, -2).addContainerGap(422, 32767)));
        this.jLabel1.setFont(new Font("Tahoma", 1, 24));
        this.jLabel1.setForeground(new Color(51, 51, 255));
        this.jLabel1.setText("Welcome To The System");
        GroupLayout panel1Layout = new GroupLayout(this.panel1);
        this.panel1.setLayout(panel1Layout);
        panel1Layout.setHorizontalGroup(panel1Layout.createParallelGroup(Alignment.LEADING).addGroup(panel1Layout.createSequentialGroup().addGroup(panel1Layout.createParallelGroup(Alignment.LEADING).addGroup(panel1Layout.createSequentialGroup().addContainerGap().addComponent(this.panel2, -2, -1, -2)).addGroup(panel1Layout.createSequentialGroup().addGap(159, 159, 159).addComponent(this.jLabel1, -2, 305, -2))).addContainerGap(-1, 32767)));
        panel1Layout.setVerticalGroup(panel1Layout.createParallelGroup(Alignment.LEADING).addGroup(Alignment.TRAILING, panel1Layout.createSequentialGroup().addContainerGap(-1, 32767).addComponent(this.jLabel1, -2, 48, -2).addPreferredGap(ComponentPlacement.RELATED).addComponent(this.panel2, -2, -1, -2).addContainerGap()));
        GroupLayout layout = new GroupLayout(this.getContentPane());
        this.getContentPane().setLayout(layout);
        layout.setHorizontalGroup(layout.createParallelGroup(Alignment.LEADING).addGroup(layout.createSequentialGroup().addComponent(this.panel1, -2, -1, -2).addGap(67, 67, 67)));
        layout.setVerticalGroup(layout.createParallelGroup(Alignment.LEADING).addGroup(layout.createSequentialGroup().addComponent(this.panel1, -2, 522, -2).addGap(0, 0, 32767)));
        this.setSize(new Dimension(655, 551));
        this.setLocationRelativeTo((Component)null);
    }

    private void jButton2ActionPerformed(ActionEvent evt) {
        Loginas s1 = new Loginas();
        s1.setVisible(true);
        this.dispose();
    }

    private void jButton1ActionPerformed(ActionEvent evt) {
        ShowMedicinelist a = new ShowMedicinelist();
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
            Logger.getLogger(MainMenu1.class.getName()).log(Level.SEVERE, (String)null, var5);
        } catch (InstantiationException var6) {
            Logger.getLogger(MainMenu1.class.getName()).log(Level.SEVERE, (String)null, var6);
        } catch (IllegalAccessException var7) {
            Logger.getLogger(MainMenu1.class.getName()).log(Level.SEVERE, (String)null, var7);
        } catch (UnsupportedLookAndFeelException var8) {
            Logger.getLogger(MainMenu1.class.getName()).log(Level.SEVERE, (String)null, var8);
        }

        EventQueue.invokeLater(new Runnable() {
            public void run() {
                (new MainMenu1()).setVisible(true);
            }
        });
    }
}
