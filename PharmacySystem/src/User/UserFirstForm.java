package User;

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
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.GroupLayout.Alignment;

public class UserFirstForm extends JFrame {
    private JButton jButton1;
    private JButton jButton2;

    public UserFirstForm() {
        this.initComponents();
    }

    private void initComponents() {
        this.jButton1 = new JButton();
        this.jButton2 = new JButton();
        this.setDefaultCloseOperation(2);
        this.jButton1.setBackground(new Color(255, 255, 255));
        this.jButton1.setFont(new Font("Tahoma", 0, 14));
        this.jButton1.setForeground(new Color(255, 0, 0));
        this.jButton1.setText("Log Out");
        this.jButton1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                UserFirstForm.this.jButton1ActionPerformed(evt);
            }
        });
        this.jButton2.setBackground(new Color(255, 255, 255));
        this.jButton2.setFont(new Font("Tahoma", 0, 14));
        this.jButton2.setForeground(new Color(51, 51, 255));
        this.jButton2.setText("Search & Order Medicine");
        this.jButton2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                UserFirstForm.this.jButton2ActionPerformed(evt);
            }
        });
        GroupLayout layout = new GroupLayout(this.getContentPane());
        this.getContentPane().setLayout(layout);
        layout.setHorizontalGroup(layout.createParallelGroup(Alignment.LEADING).addGroup(Alignment.TRAILING, layout.createSequentialGroup().addContainerGap(79, 32767).addComponent(this.jButton2).addGap(47, 47, 47).addComponent(this.jButton1).addGap(80, 80, 80)));
        layout.setVerticalGroup(layout.createParallelGroup(Alignment.LEADING).addGroup(layout.createSequentialGroup().addGap(117, 117, 117).addGroup(layout.createParallelGroup(Alignment.BASELINE).addComponent(this.jButton1).addComponent(this.jButton2, -2, 25, -2)).addContainerGap(248, 32767)));
        this.setSize(new Dimension(486, 429));
        this.setLocationRelativeTo((Component)null);
    }

    private void jButton2ActionPerformed(ActionEvent evt) {
        ShowMedicinelist in = new ShowMedicinelist();
        in.setVisible(true);
    }

    private void jButton1ActionPerformed(ActionEvent evt) {
        JOptionPane.showMessageDialog(this.rootPane, "Thanks for using our System.\n Allah Hafeez");
        System.exit(0);
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
            Logger.getLogger(UserFirstForm.class.getName()).log(Level.SEVERE, (String)null, var5);
        } catch (InstantiationException var6) {
            Logger.getLogger(UserFirstForm.class.getName()).log(Level.SEVERE, (String)null, var6);
        } catch (IllegalAccessException var7) {
            Logger.getLogger(UserFirstForm.class.getName()).log(Level.SEVERE, (String)null, var7);
        } catch (UnsupportedLookAndFeelException var8) {
            Logger.getLogger(UserFirstForm.class.getName()).log(Level.SEVERE, (String)null, var8);
        }

        EventQueue.invokeLater(new Runnable() {
            public void run() {
                (new UserFirstForm()).setVisible(true);
            }
        });
    }
}

