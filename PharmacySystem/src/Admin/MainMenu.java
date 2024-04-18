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
import javax.swing.LayoutStyle.ComponentPlacement;

public class MainMenu extends JFrame {
    private JButton jButton1;
    private JButton jButton2;
    private JButton jButton3;
    private JButton jButton4;
    private JButton jButton5;
    private JButton jButton6;
    private JLabel jLabel1;
    private Panel panel1;
    private Panel panel2;

    public MainMenu() {
        this.initComponents();
    }

    private void initComponents() {
        this.panel1 = new Panel();
        this.jLabel1 = new JLabel();
        this.panel2 = new Panel();
        this.jButton1 = new JButton();
        this.jButton2 = new JButton();
        this.jButton3 = new JButton();
        this.jButton4 = new JButton();
        this.jButton5 = new JButton();
        this.jButton6 = new JButton();
        this.setDefaultCloseOperation(3);
        this.panel1.setBackground(new Color(51, 51, 255));
        this.panel1.setForeground(new Color(255, 255, 255));
        this.jLabel1.setFont(new Font("Tahoma", 1, 24));
        this.jLabel1.setForeground(new Color(255, 255, 0));
        this.jLabel1.setText("Welcome to the System Admin");
        this.panel2.setBackground(new Color(0, 0, 0));
        this.jButton1.setBackground(new Color(255, 255, 255));
        this.jButton1.setFont(new Font("Tahoma", 1, 18));
        this.jButton1.setText("Add Products");
        this.jButton1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                MainMenu.this.jButton1ActionPerformed(evt);
            }
        });
        this.jButton2.setFont(new Font("Tahoma", 1, 18));
        this.jButton2.setText("Update Products");
        this.jButton2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                MainMenu.this.jButton2ActionPerformed(evt);
            }
        });
        this.jButton3.setFont(new Font("Tahoma", 1, 18));
        this.jButton3.setText("Delete Products");
        this.jButton3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                MainMenu.this.jButton3ActionPerformed(evt);
            }
        });
        this.jButton4.setFont(new Font("Tahoma", 1, 18));
        this.jButton4.setText("Product List");
        this.jButton4.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                MainMenu.this.jButton4ActionPerformed(evt);
            }
        });
        this.jButton5.setFont(new Font("Tahoma", 1, 18));
        this.jButton5.setText("Log Out");
        this.jButton5.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                MainMenu.this.jButton5ActionPerformed(evt);
            }
        });
        this.jButton6.setFont(new Font("Tahoma", 1, 18));
        this.jButton6.setText("Back");
        this.jButton6.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                MainMenu.this.jButton6ActionPerformed(evt);
            }
        });
        GroupLayout panel2Layout = new GroupLayout(this.panel2);
        this.panel2.setLayout(panel2Layout);
        panel2Layout.setHorizontalGroup(panel2Layout.createParallelGroup(Alignment.LEADING).addGroup(panel2Layout.createSequentialGroup().addGap(122, 122, 122).addGroup(panel2Layout.createParallelGroup(Alignment.LEADING, false).addComponent(this.jButton3, -1, -1, 32767).addComponent(this.jButton1, -1, -1, 32767)).addGap(58, 58, 58).addGroup(panel2Layout.createParallelGroup(Alignment.LEADING, false).addComponent(this.jButton2, -1, -1, 32767).addComponent(this.jButton4, -1, -1, 32767)).addContainerGap(101, 32767)).addGroup(panel2Layout.createSequentialGroup().addGap(159, 159, 159).addComponent(this.jButton6).addGap(148, 148, 148).addComponent(this.jButton5).addGap(0, 0, 32767)));
        panel2Layout.setVerticalGroup(panel2Layout.createParallelGroup(Alignment.LEADING).addGroup(panel2Layout.createSequentialGroup().addGap(60, 60, 60).addGroup(panel2Layout.createParallelGroup(Alignment.BASELINE).addComponent(this.jButton1, -2, 38, -2).addComponent(this.jButton2, -2, 38, -2)).addGap(49, 49, 49).addGroup(panel2Layout.createParallelGroup(Alignment.LEADING).addComponent(this.jButton3, -2, 42, -2).addComponent(this.jButton4, -2, 42, -2)).addPreferredGap(ComponentPlacement.RELATED, 150, 32767).addGroup(panel2Layout.createParallelGroup(Alignment.BASELINE).addComponent(this.jButton6).addComponent(this.jButton5)).addGap(206, 206, 206)));
        GroupLayout panel1Layout = new GroupLayout(this.panel1);
        this.panel1.setLayout(panel1Layout);
        panel1Layout.setHorizontalGroup(panel1Layout.createParallelGroup(Alignment.LEADING).addComponent(this.panel2, Alignment.TRAILING, -1, -1, 32767).addGroup(Alignment.TRAILING, panel1Layout.createSequentialGroup().addContainerGap(-1, 32767).addComponent(this.jLabel1).addGap(134, 134, 134)));
        panel1Layout.setVerticalGroup(panel1Layout.createParallelGroup(Alignment.LEADING).addGroup(panel1Layout.createSequentialGroup().addGap(21, 21, 21).addComponent(this.jLabel1, -2, 61, -2).addPreferredGap(ComponentPlacement.RELATED).addComponent(this.panel2, -2, -1, -2).addContainerGap(20, 32767)));
        GroupLayout layout = new GroupLayout(this.getContentPane());
        this.getContentPane().setLayout(layout);
        layout.setHorizontalGroup(layout.createParallelGroup(Alignment.LEADING).addComponent(this.panel1, -1, -1, 32767));
        layout.setVerticalGroup(layout.createParallelGroup(Alignment.LEADING).addGroup(layout.createSequentialGroup().addComponent(this.panel1, -2, -1, -2).addGap(0, 0, 32767)));
        this.setSize(new Dimension(655, 623));
        this.setLocationRelativeTo((Component)null);
    }

    private void jButton1ActionPerformed(ActionEvent evt) {
        AddMedicine info = new AddMedicine();
        info.setVisible(true);
        this.dispose();
    }

    private void jButton2ActionPerformed(ActionEvent evt) {
        UpdateProducts u = new UpdateProducts();
        u.setVisible(true);
        this.dispose();
    }

    private void jButton4ActionPerformed(ActionEvent evt) {
        ViewPrd v = new ViewPrd();
        v.setVisible(true);
        this.dispose();
    }

    private void jButton5ActionPerformed(ActionEvent evt) {
        MainPage a = new MainPage();
        a.setVisible(true);
        this.dispose();
    }

    private void jButton6ActionPerformed(ActionEvent evt) {
        Loginas l = new Loginas();
        l.setVisible(true);
        this.dispose();
    }

    private void jButton3ActionPerformed(ActionEvent evt) {
        UpdateDelateMed q = new UpdateDelateMed();
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
            Logger.getLogger(MainMenu.class.getName()).log(Level.SEVERE, (String)null, var5);
        } catch (InstantiationException var6) {
            Logger.getLogger(MainMenu.class.getName()).log(Level.SEVERE, (String)null, var6);
        } catch (IllegalAccessException var7) {
            Logger.getLogger(MainMenu.class.getName()).log(Level.SEVERE, (String)null, var7);
        } catch (UnsupportedLookAndFeelException var8) {
            Logger.getLogger(MainMenu.class.getName()).log(Level.SEVERE, (String)null, var8);
        }

        EventQueue.invokeLater(new Runnable() {
            public void run() {
                (new MainMenu()).setVisible(true);
            }
        });
    }
}
