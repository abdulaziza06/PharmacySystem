package User;

import Decorator.EncryptionDecorator;
import Decorator.RegistrationDecorator;
import Decorator.ValidationDecorator;

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
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;

public class Registrationform1 extends JFrame {
    private JTextArea addressTxt;
    private JTextField firstTxt;
    private JButton jButton1;
    private JButton jButton2;
    private JLabel jLabel1;
    private JLabel jLabel10;
    private JLabel jLabel11;
    private JLabel jLabel12;
    private JLabel jLabel6;
    private JLabel jLabel8;
    private JLabel jLabel9;
    private JLabel jLabelRegister;
    private JPanel jPanel3;
    private JPasswordField jPassword;
    private JPasswordField jPassword1;
    private JScrollPane jScrollPane1;
    private JTextField lastTxt;
    private JTextField userTxt;

    public Registrationform1() {
        this.initComponents();
    }

    private void initComponents() {
        this.jLabel1 = new JLabel();
        this.jPanel3 = new JPanel();
        this.jLabel6 = new JLabel();
        this.jLabel8 = new JLabel();
        this.jPassword1 = new JPasswordField();
        this.jButton1 = new JButton();
        this.jButton2 = new JButton();
        this.jLabelRegister = new JLabel();
        this.jLabel9 = new JLabel();
        this.jPassword = new JPasswordField();
        this.jLabel10 = new JLabel();
        this.jLabel11 = new JLabel();
        this.firstTxt = new JTextField();
        this.lastTxt = new JTextField();
        this.userTxt = new JTextField();
        this.jLabel12 = new JLabel();
        this.jScrollPane1 = new JScrollPane();
        this.addressTxt = new JTextArea();
        this.setDefaultCloseOperation(3);
        this.jLabel1.setFont(new Font("Tahoma", 1, 24));
        this.jLabel1.setText("Registration Form");
        this.jPanel3.setCursor(new Cursor(12));
        this.jPanel3.setLayout((LayoutManager)null);
        this.jLabel6.setFont(new Font("Tahoma", 0, 18));
        this.jLabel6.setText("Address:");
        this.jPanel3.add(this.jLabel6);
        this.jLabel6.setBounds(60, 250, 80, 20);
        this.jLabel8.setFont(new Font("Tahoma", 0, 18));
        this.jLabel8.setText("Last Name:");
        this.jPanel3.add(this.jLabel8);
        this.jLabel8.setBounds(40, 90, 100, 20);
        this.jPassword1.setFont(new Font("Tahoma", 0, 14));
        this.jPassword1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                Registrationform1.this.jPassword1ActionPerformed(evt);
            }
        });
        this.jPanel3.add(this.jPassword1);
        this.jPassword1.setBounds(140, 210, 220, 30);
        this.jButton1.setFont(new Font("Tahoma", 0, 14));
        this.jButton1.setForeground(new Color(255, 0, 0));
        this.jButton1.setText("Cancel");
        this.jButton1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                Registrationform1.this.jButton1ActionPerformed(evt);
            }
        });
        this.jPanel3.add(this.jButton1);
        this.jButton1.setBounds(100, 400, 77, 32);
        this.jButton2.setFont(new Font("Tahoma", 1, 14));
        this.jButton2.setForeground(new Color(51, 51, 255));
        this.jButton2.setText("Create");
        this.jButton2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                Registrationform1.this.jButton2ActionPerformed(evt);
            }
        });
        this.jPanel3.add(this.jButton2);
        this.jButton2.setBounds(260, 400, 100, 32);
        this.jLabelRegister.setBackground(new Color(255, 255, 255));
        this.jLabelRegister.setFont(new Font("Tahoma", 0, 14));
        this.jLabelRegister.setForeground(new Color(102, 255, 102));
        this.jLabelRegister.setText("Click here to login");
        this.jLabelRegister.setCursor(new Cursor(12));
        this.jLabelRegister.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent evt) {
                Registrationform1.this.jLabelRegisterMouseClicked(evt);
            }
        });
        this.jPanel3.add(this.jLabelRegister);
        this.jLabelRegister.setBounds(160, 450, 130, 17);
        this.jLabel9.setFont(new Font("Tahoma", 0, 18));
        this.jLabel9.setText("Username:");
        this.jPanel3.add(this.jLabel9);
        this.jLabel9.setBounds(50, 130, 100, 20);
        this.jPassword.setFont(new Font("Tahoma", 0, 14));
        this.jPassword.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                Registrationform1.this.jPasswordActionPerformed(evt);
            }
        });
        this.jPanel3.add(this.jPassword);
        this.jPassword.setBounds(140, 170, 220, 30);
        this.jLabel10.setFont(new Font("Tahoma", 0, 18));
        this.jLabel10.setText("Password:");
        this.jPanel3.add(this.jLabel10);
        this.jLabel10.setBounds(50, 170, 80, 20);
        this.jLabel11.setFont(new Font("Tahoma", 0, 18));
        this.jLabel11.setText("First Name:");
        this.jPanel3.add(this.jLabel11);
        this.jLabel11.setBounds(40, 50, 100, 20);
        this.firstTxt.setFont(new Font("Tahoma", 0, 14));
        this.firstTxt.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                Registrationform1.this.firstTxtActionPerformed(evt);
            }
        });
        this.jPanel3.add(this.firstTxt);
        this.firstTxt.setBounds(140, 50, 220, 30);
        this.lastTxt.setFont(new Font("Tahoma", 0, 14));
        this.lastTxt.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                Registrationform1.this.lastTxtActionPerformed(evt);
            }
        });
        this.jPanel3.add(this.lastTxt);
        this.lastTxt.setBounds(140, 90, 220, 30);
        this.userTxt.setFont(new Font("Tahoma", 0, 14));
        this.userTxt.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                Registrationform1.this.userTxtActionPerformed(evt);
            }
        });
        this.jPanel3.add(this.userTxt);
        this.userTxt.setBounds(140, 130, 220, 30);
        this.jLabel12.setFont(new Font("Tahoma", 0, 18));
        this.jLabel12.setText("Retype Pass:");
        this.jPanel3.add(this.jLabel12);
        this.jLabel12.setBounds(30, 210, 110, 20);
        this.addressTxt.setColumns(20);
        this.addressTxt.setRows(5);
        this.jScrollPane1.setViewportView(this.addressTxt);
        this.jPanel3.add(this.jScrollPane1);
        this.jScrollPane1.setBounds(140, 250, 166, 100);
        GroupLayout layout = new GroupLayout(this.getContentPane());
        this.getContentPane().setLayout(layout);
        layout.setHorizontalGroup(layout.createParallelGroup(Alignment.LEADING).addGroup(layout.createSequentialGroup().addGap(99, 99, 99).addComponent(this.jPanel3, -2, 400, -2).addContainerGap(110, 32767)).addGroup(Alignment.TRAILING, layout.createSequentialGroup().addContainerGap(-1, 32767).addComponent(this.jLabel1, -2, 230, -2).addGap(170, 170, 170)));
        layout.setVerticalGroup(layout.createParallelGroup(Alignment.LEADING).addGroup(layout.createSequentialGroup().addContainerGap().addComponent(this.jLabel1).addPreferredGap(ComponentPlacement.UNRELATED).addComponent(this.jPanel3, -2, 510, -2).addContainerGap(30, 32767)));
        this.setSize(new Dimension(625, 630));
        this.setLocationRelativeTo((Component)null);
    }

    private void jPassword1ActionPerformed(ActionEvent evt) {
    }

    private void jButton2ActionPerformed(ActionEvent evt) {
        String fName = this.firstTxt.getText();
        String lName = this.lastTxt.getText();
        String uName = this.userTxt.getText();
        String pass1 = this.jPassword.getText();
        String pass2 = this.jPassword1.getText();
        String add = this.addressTxt.getText();
        if (!fName.isEmpty() && !lName.isEmpty() && !uName.isEmpty() && !pass1.isEmpty() && !pass2.isEmpty() && !add.isEmpty()) {
            PrintWriter pw = null;
            File f1 = new File("User Data.txt");

            try {
                FileWriter fw = new FileWriter(f1, true);
                pw = new PrintWriter(fw, true);
                pw.write(fName);
                pw.write("\r\n");
                pw.write(lName);
                pw.write("\r\n");
                pw.write(uName);
                pw.write("\r\n");
                pw.write(pass1);
                pw.write("\r\n");
                pw.write(pass2);
                pw.write("\r\n");
                pw.write(add);
                pw.write("\r\n");
                JOptionPane.showMessageDialog(this.rootPane, "Registration Successfull");
                this.firstTxt.setText((String)null);
                this.lastTxt.setText((String)null);
                this.userTxt.setText((String)null);
                this.jPassword.setText((String)null);
                this.jPassword1.setText((String)null);
                this.addressTxt.setText((String)null);
                fw.close();
            } catch (Exception var11) {
                JOptionPane.showMessageDialog(this.rootPane, "Error");
            }
        } else {
            JOptionPane.showMessageDialog(this.rootPane, "Please Enter All Informaton");
        }

        this.dispose();
    }

    private void jLabelRegisterMouseClicked(MouseEvent evt) {
        Loginform lgf = new Loginform();
        lgf.setVisible(true);
        lgf.pack();
        lgf.setLocationRelativeTo((Component)null);
        lgf.setDefaultCloseOperation(3);
        this.dispose();
    }

    private void jPasswordActionPerformed(ActionEvent evt) {
    }

    private void userTxtActionPerformed(ActionEvent evt) {
    }

    private void jButton1ActionPerformed(ActionEvent evt) {
        this.firstTxt.setText((String)null);
        this.lastTxt.setText((String)null);
        this.userTxt.setText((String)null);
        this.jPassword.setText((String)null);
        this.jPassword1.setText((String)null);
        this.addressTxt.setText((String)null);
    }

    private void firstTxtActionPerformed(ActionEvent evt) {
    }

    private void lastTxtActionPerformed(ActionEvent evt) {
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
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException e) {
            Logger.getLogger(Registrationform1.class.getName()).log(Level.SEVERE, null, e);
        }

        EventQueue.invokeLater(new Runnable() {
            public void run() {
                Registrationform1 form = new Registrationform1();

                // Create decorators
                ValidationDecorator validationDecorator = new ValidationDecorator(form);
                EncryptionDecorator encryptionDecorator = new EncryptionDecorator(form);

                // Add decorators as needed
                form.addDecorator(validationDecorator);
                form.addDecorator(encryptionDecorator);

                form.setVisible(true);
            }
        });
    }

    // New method to attach decorators
    public void addDecorator(RegistrationDecorator decorator) {
        decorator.actionPerformed();
    }

    public void validateInputs() {

    }
    public void encryptData() {
        // Add encryption logic here
    }
}

