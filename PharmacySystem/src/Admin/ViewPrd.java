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
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.table.DefaultTableModel;

public class ViewPrd extends JFrame {
    private JButton jButton1;
    private JLabel jLabel1;
    private JScrollPane jScrollPane4;
    private Panel panel1;
    private JTable ptable3;

    public ViewPrd() {
        this.initComponents();
        this.showList();
    }

    public void showList() {
        String filePath = "C:\\Users\\HP\\Desktop\\project.zip\\project\\MedicineData.txt";
        File f1 = new File(filePath);

        try {
            FileReader fr = new FileReader(f1);
            BufferedReader br = new BufferedReader(fr);
            DefaultTableModel table = (DefaultTableModel)this.ptable3.getModel();
            Object[] lines = br.lines().toArray();

            for(int i = 0; i < lines.length; ++i) {
                String[] row = lines[i].toString().split(" ");
                table.addRow(row);
            }
        } catch (IOException var9) {
            System.out.println("IOException has occured");
        }

    }

    private void initComponents() {
        this.panel1 = new Panel();
        this.jLabel1 = new JLabel();
        this.jScrollPane4 = new JScrollPane();
        this.ptable3 = new JTable();
        this.jButton1 = new JButton();
        this.setDefaultCloseOperation(3);
        this.panel1.setBackground(new Color(0, 0, 0));
        this.jLabel1.setFont(new Font("Tahoma", 1, 24));
        this.jLabel1.setForeground(new Color(51, 51, 255));
        this.jLabel1.setText("List of Products");
        GroupLayout panel1Layout = new GroupLayout(this.panel1);
        this.panel1.setLayout(panel1Layout);
        panel1Layout.setHorizontalGroup(panel1Layout.createParallelGroup(Alignment.LEADING).addGroup(panel1Layout.createSequentialGroup().addGap(213, 213, 213).addComponent(this.jLabel1, -2, 210, -2).addContainerGap(-1, 32767)));
        panel1Layout.setVerticalGroup(panel1Layout.createParallelGroup(Alignment.LEADING).addGroup(panel1Layout.createSequentialGroup().addContainerGap().addComponent(this.jLabel1, -2, 45, -2).addContainerGap(28, 32767)));
        this.ptable3.setModel(new DefaultTableModel(new Object[0][], new String[]{"Id", "name", "type", "Expiry Date", "Quantity", "Price", "Company"}) {
            Class[] types = new Class[]{String.class, String.class, String.class, String.class, String.class, String.class, Object.class};
            boolean[] canEdit = new boolean[]{false, false, false, false, false, false, false};

            public Class getColumnClass(int columnIndex) {
                return this.types[columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return this.canEdit[columnIndex];
            }
        });
        this.ptable3.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent evt) {
                ViewPrd.this.ptable3MouseClicked(evt);
            }
        });
        this.jScrollPane4.setViewportView(this.ptable3);
        this.jButton1.setBackground(new Color(255, 51, 51));
        this.jButton1.setFont(new Font("Tahoma", 0, 18));
        this.jButton1.setText("Back");
        this.jButton1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                ViewPrd.this.jButton1ActionPerformed(evt);
            }
        });
        GroupLayout layout = new GroupLayout(this.getContentPane());
        this.getContentPane().setLayout(layout);
        layout.setHorizontalGroup(layout.createParallelGroup(Alignment.LEADING).addComponent(this.panel1, Alignment.TRAILING, -1, -1, 32767).addGroup(layout.createSequentialGroup().addContainerGap().addComponent(this.jScrollPane4, -1, 619, 32767).addContainerGap()).addGroup(Alignment.TRAILING, layout.createSequentialGroup().addContainerGap(-1, 32767).addComponent(this.jButton1).addGap(127, 127, 127)));
        layout.setVerticalGroup(layout.createParallelGroup(Alignment.LEADING).addGroup(layout.createSequentialGroup().addComponent(this.panel1, -2, -1, -2).addPreferredGap(ComponentPlacement.RELATED).addComponent(this.jScrollPane4, -2, 285, -2).addGap(18, 18, 18).addComponent(this.jButton1).addContainerGap(18, 32767)));
        this.setSize(new Dimension(655, 753));
        this.setLocationRelativeTo((Component)null);
    }

    private void ptable3MouseClicked(MouseEvent evt) {
    }

    private void jButton1ActionPerformed(ActionEvent evt) {
        MainMenu m = new MainMenu();
        m.setVisible(true);
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
            Logger.getLogger(ViewPrd.class.getName()).log(Level.SEVERE, (String)null, var5);
        } catch (InstantiationException var6) {
            Logger.getLogger(ViewPrd.class.getName()).log(Level.SEVERE, (String)null, var6);
        } catch (IllegalAccessException var7) {
            Logger.getLogger(ViewPrd.class.getName()).log(Level.SEVERE, (String)null, var7);
        } catch (UnsupportedLookAndFeelException var8) {
            Logger.getLogger(ViewPrd.class.getName()).log(Level.SEVERE, (String)null, var8);
        }

        EventQueue.invokeLater(new Runnable() {
            public void run() {
                (new ViewPrd()).setVisible(true);
            }
        });
    }
}
