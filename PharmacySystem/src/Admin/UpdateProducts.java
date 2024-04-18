package Admin;

import java.awt.Component;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.RowFilter;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

public class UpdateProducts extends JFrame {
    private JTextField cmptxt;
    private JTextField edtxt;
    private JTextField idtxt;
    private JButton jButton1;
    private JButton jButton2;
    private JButton jButton3;
    private JLabel jLabel1;
    private JLabel jLabel2;
    private JLabel jLabel3;
    private JLabel jLabel4;
    private JLabel jLabel5;
    private JLabel jLabel6;
    private JLabel jLabel7;
    private JLabel jLabel8;
    private JScrollPane jScrollPane1;
    private JTextField jTextField1;
    private JTextField nametxt;
    private JTextField prctxt;
    private JTable ptable;
    private JTextField qtytxt;
    private JTextField typetxt;

    public UpdateProducts() {
        this.initComponents();
        this.showList();
    }

    public void showList() {
        String filePath = "C:\\Users\\HP\\Desktop\\project.zip\\project\\MedicineData.txt";
        File f1 = new File(filePath);

        try {
            FileReader fr = new FileReader(f1);
            BufferedReader br = new BufferedReader(fr);
            DefaultTableModel table = (DefaultTableModel)this.ptable.getModel();
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
        this.jScrollPane1 = new JScrollPane();
        this.ptable = new JTable();
        this.jLabel1 = new JLabel();
        this.jLabel2 = new JLabel();
        this.jLabel3 = new JLabel();
        this.jLabel4 = new JLabel();
        this.jLabel5 = new JLabel();
        this.jLabel6 = new JLabel();
        this.jLabel7 = new JLabel();
        this.jTextField1 = new JTextField();
        this.jLabel8 = new JLabel();
        this.idtxt = new JTextField();
        this.nametxt = new JTextField();
        this.typetxt = new JTextField();
        this.edtxt = new JTextField();
        this.qtytxt = new JTextField();
        this.prctxt = new JTextField();
        this.cmptxt = new JTextField();
        this.jButton1 = new JButton();
        this.jButton2 = new JButton();
        this.jButton3 = new JButton();
        this.setDefaultCloseOperation(3);
        this.ptable.setModel(new DefaultTableModel(new Object[0][], new String[]{"Id", "name", "type", "Expiry Date", "Quantity", "Price", "Company"}) {
            Class[] types = new Class[]{String.class, String.class, String.class, String.class, String.class, String.class, Object.class};
            boolean[] canEdit = new boolean[]{false, false, false, false, false, false, false};

            public Class getColumnClass(int columnIndex) {
                return this.types[columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return this.canEdit[columnIndex];
            }
        });
        this.ptable.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent evt) {
                UpdateProducts.this.ptableMouseClicked(evt);
            }
        });
        this.jScrollPane1.setViewportView(this.ptable);
        if (this.ptable.getColumnModel().getColumnCount() > 0) {
            this.ptable.getColumnModel().getColumn(0).setResizable(false);
            this.ptable.getColumnModel().getColumn(1).setResizable(false);
            this.ptable.getColumnModel().getColumn(2).setResizable(false);
            this.ptable.getColumnModel().getColumn(4).setResizable(false);
            this.ptable.getColumnModel().getColumn(5).setResizable(false);
            this.ptable.getColumnModel().getColumn(6).setResizable(false);
        }

        this.jLabel1.setFont(new Font("Tahoma", 0, 14));
        this.jLabel1.setText("New Id");
        this.jLabel1.setToolTipText("");
        this.jLabel2.setFont(new Font("Tahoma", 0, 14));
        this.jLabel2.setText("New Name");
        this.jLabel3.setFont(new Font("Tahoma", 0, 14));
        this.jLabel3.setText("New Type");
        this.jLabel4.setFont(new Font("Tahoma", 0, 14));
        this.jLabel4.setText("New Quantity");
        this.jLabel5.setFont(new Font("Tahoma", 0, 14));
        this.jLabel5.setText("New Expiry Date");
        this.jLabel6.setFont(new Font("Tahoma", 0, 14));
        this.jLabel6.setText("Company");
        this.jLabel7.setFont(new Font("Tahoma", 0, 14));
        this.jLabel7.setText("New Price");
        this.jTextField1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                UpdateProducts.this.jTextField1ActionPerformed(evt);
            }
        });
        this.jTextField1.addKeyListener(new KeyAdapter() {
            public void keyReleased(KeyEvent evt) {
                UpdateProducts.this.jTextField1KeyReleased(evt);
            }
        });
        this.jLabel8.setFont(new Font("Tahoma", 0, 14));
        this.jLabel8.setText("Search");
        this.idtxt.setFont(new Font("Tahoma", 0, 12));
        this.idtxt.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                UpdateProducts.this.idtxtActionPerformed(evt);
            }
        });
        this.nametxt.setFont(new Font("Tahoma", 0, 12));
        this.typetxt.setFont(new Font("Tahoma", 0, 12));
        this.edtxt.setFont(new Font("Tahoma", 0, 12));
        this.qtytxt.setFont(new Font("Tahoma", 0, 12));
        this.prctxt.setFont(new Font("Tahoma", 0, 12));
        this.cmptxt.setFont(new Font("Tahoma", 0, 12));
        this.jButton1.setFont(new Font("Tahoma", 1, 14));
        this.jButton1.setText("Update Product");
        this.jButton1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                UpdateProducts.this.jButton1ActionPerformed(evt);
            }
        });
        this.jButton2.setFont(new Font("Tahoma", 1, 18));
        this.jButton2.setText("Back");
        this.jButton2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                UpdateProducts.this.jButton2ActionPerformed(evt);
            }
        });
        this.jButton3.setFont(new Font("Tahoma", 1, 14));
        this.jButton3.setText("Exit");
        this.jButton3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                UpdateProducts.this.jButton3ActionPerformed(evt);
            }
        });
        GroupLayout layout = new GroupLayout(this.getContentPane());
        this.getContentPane().setLayout(layout);
        layout.setHorizontalGroup(layout.createParallelGroup(Alignment.LEADING).addComponent(this.jScrollPane1, Alignment.TRAILING).addGroup(Alignment.TRAILING, layout.createSequentialGroup().addGroup(layout.createParallelGroup(Alignment.LEADING).addGroup(layout.createSequentialGroup().addGroup(layout.createParallelGroup(Alignment.LEADING).addGroup(layout.createSequentialGroup().addGap(227, 227, 227).addComponent(this.jLabel8, -2, 50, -2).addPreferredGap(ComponentPlacement.RELATED, -1, 32767).addComponent(this.jTextField1, -2, 117, -2)).addGroup(layout.createSequentialGroup().addGap(85, 85, 85).addComponent(this.jLabel1, -2, 57, -2).addGap(188, 188, 188)).addGroup(Alignment.TRAILING, layout.createSequentialGroup().addContainerGap(-1, 32767).addGroup(layout.createParallelGroup(Alignment.LEADING).addComponent(this.jLabel5, Alignment.TRAILING).addComponent(this.jLabel3, Alignment.TRAILING, -2, 65, -2).addComponent(this.jLabel4, Alignment.TRAILING).addComponent(this.jLabel7, Alignment.TRAILING).addComponent(this.jLabel6, Alignment.TRAILING)).addGap(26, 26, 26).addGroup(layout.createParallelGroup(Alignment.LEADING).addComponent(this.idtxt, -2, 135, -2).addGroup(layout.createParallelGroup(Alignment.LEADING, false).addComponent(this.qtytxt, -1, 135, 32767).addComponent(this.prctxt).addComponent(this.cmptxt)).addComponent(this.nametxt, -2, 135, -2).addComponent(this.typetxt, -2, 135, -2).addComponent(this.edtxt, -2, 135, -2)).addGap(141, 141, 141))).addPreferredGap(ComponentPlacement.RELATED, -1, 32767)).addGroup(Alignment.TRAILING, layout.createSequentialGroup().addGap(0, 0, 32767).addComponent(this.jLabel2).addGap(324, 324, 324))).addGroup(layout.createParallelGroup(Alignment.LEADING).addComponent(this.jButton3, -2, 105, -2).addComponent(this.jButton1).addComponent(this.jButton2, -2, 114, -2)).addGap(97, 97, 97)));
        layout.setVerticalGroup(layout.createParallelGroup(Alignment.LEADING).addGroup(layout.createSequentialGroup().addGap(20, 20, 20).addGroup(layout.createParallelGroup(Alignment.BASELINE).addComponent(this.jTextField1, -2, 27, -2).addComponent(this.jLabel8, -2, 27, -2)).addPreferredGap(ComponentPlacement.RELATED, -1, 32767).addComponent(this.jScrollPane1, -2, 177, -2).addPreferredGap(ComponentPlacement.UNRELATED).addGroup(layout.createParallelGroup(Alignment.BASELINE).addComponent(this.jLabel1, -2, 28, -2).addComponent(this.idtxt, -2, 28, -2)).addGap(21, 21, 21).addGroup(layout.createParallelGroup(Alignment.LEADING).addComponent(this.jLabel2, -2, 33, -2).addComponent(this.nametxt, -2, 26, -2)).addPreferredGap(ComponentPlacement.UNRELATED).addGroup(layout.createParallelGroup(Alignment.LEADING).addGroup(layout.createSequentialGroup().addGap(0, 0, 32767).addComponent(this.jLabel3, -2, 28, -2)).addGroup(layout.createSequentialGroup().addComponent(this.typetxt).addPreferredGap(ComponentPlacement.RELATED))).addGroup(layout.createParallelGroup(Alignment.BASELINE).addComponent(this.edtxt, -2, 28, -2).addComponent(this.jLabel5, -2, 28, -2)).addGap(8, 8, 8).addGroup(layout.createParallelGroup(Alignment.BASELINE).addComponent(this.qtytxt, -2, 28, -2).addComponent(this.jButton1, -2, 41, -2).addComponent(this.jLabel4, -2, 28, -2)).addGroup(layout.createParallelGroup(Alignment.LEADING).addGroup(layout.createSequentialGroup().addGap(11, 11, 11).addGroup(layout.createParallelGroup(Alignment.BASELINE).addComponent(this.prctxt, -2, 28, -2).addComponent(this.jLabel7, -2, 28, -2)).addGap(11, 11, 11).addGroup(layout.createParallelGroup(Alignment.BASELINE).addComponent(this.cmptxt, -2, 28, -2).addComponent(this.jLabel6, -2, 28, -2))).addGroup(Alignment.TRAILING, layout.createSequentialGroup().addGap(42, 42, 42).addComponent(this.jButton2, -2, 40, -2))).addGap(18, 18, 18).addComponent(this.jButton3, -2, 35, -2).addGap(939, 939, 939)));
        this.setSize(new Dimension(655, 691));
        this.setLocationRelativeTo((Component)null);
    }

    private void ptableMouseClicked(MouseEvent evt) {
        int selectedRow = this.ptable.getSelectedRow();
        DefaultTableModel m = (DefaultTableModel)this.ptable.getModel();
        this.idtxt.setText(m.getValueAt(selectedRow, 0).toString());
        this.nametxt.setText(m.getValueAt(selectedRow, 1).toString());
        this.typetxt.setText(m.getValueAt(selectedRow, 2).toString());
        this.edtxt.setText(m.getValueAt(selectedRow, 3).toString());
        this.qtytxt.setText(m.getValueAt(selectedRow, 4).toString());
        this.prctxt.setText(m.getValueAt(selectedRow, 5).toString());
        this.cmptxt.setText(m.getValueAt(selectedRow, 6).toString());
    }

    private void jTextField1ActionPerformed(ActionEvent evt) {
    }

    private void jButton1ActionPerformed(ActionEvent evt) {
        int l = this.ptable.getSelectedRow();
        DefaultTableModel m = (DefaultTableModel)this.ptable.getModel();
        if (l >= 0) {
            m.setValueAt(this.idtxt.getText(), l, 0);
            m.setValueAt(this.nametxt.getText(), l, 1);
            m.setValueAt(this.typetxt.getText(), l, 2);
            m.setValueAt(this.edtxt.getText(), l, 3);
            m.setValueAt(this.qtytxt.getText(), l, 4);
            m.setValueAt(this.prctxt.getText(), l, 5);
            m.setValueAt(this.cmptxt.getText(), l, 6);
            JOptionPane.showMessageDialog(this.rootPane, "Updated Successfully");
            this.idtxt.setText((String)null);
            this.nametxt.setText((String)null);
            this.typetxt.setText((String)null);
            this.edtxt.setText((String)null);
            this.qtytxt.setText((String)null);
            this.prctxt.setText((String)null);
            this.cmptxt.setText((String)null);
        } else {
            JOptionPane.showMessageDialog((Component)null, "Please select a product to Update");
        }

        String filePath = "C:\\Users\\HP\\Desktop\\project.zip\\project\\MedicineData.txt";
        File file = new File(filePath);

        try {
            FileWriter fw = new FileWriter(file);
            BufferedWriter bw = new BufferedWriter(fw);

            for(int i = 0; i < this.ptable.getRowCount(); ++i) {
                for(int j = 0; j < this.ptable.getColumnCount(); ++j) {
                    Object var10001 = this.ptable.getValueAt(i, j);
                    bw.write(var10001.toString() + " ");
                }

                bw.newLine();
            }

            bw.close();
            fw.close();
        } catch (IOException var10) {
        }

    }

    private void jTextField1KeyReleased(KeyEvent evt) {
        DefaultTableModel table = (DefaultTableModel)this.ptable.getModel();
        String search = this.jTextField1.getText().toLowerCase();
        TableRowSorter<DefaultTableModel> tr = new TableRowSorter(table);
        this.ptable.setRowSorter(tr);
        tr.setRowFilter(RowFilter.regexFilter(search, new int[0]));
    }

    private void idtxtActionPerformed(ActionEvent evt) {
    }

    private void jButton2ActionPerformed(ActionEvent evt) {
        MainMenu m = new MainMenu();
        m.setVisible(true);
        this.dispose();
    }

    private void jButton3ActionPerformed(ActionEvent evt) {
        System.exit(0);
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
            Logger.getLogger(UpdateProducts.class.getName()).log(Level.SEVERE, (String)null, var5);
        } catch (InstantiationException var6) {
            Logger.getLogger(UpdateProducts.class.getName()).log(Level.SEVERE, (String)null, var6);
        } catch (IllegalAccessException var7) {
            Logger.getLogger(UpdateProducts.class.getName()).log(Level.SEVERE, (String)null, var7);
        } catch (UnsupportedLookAndFeelException var8) {
            Logger.getLogger(UpdateProducts.class.getName()).log(Level.SEVERE, (String)null, var8);
        }

        EventQueue.invokeLater(new Runnable() {
            public void run() {
                (new UpdateProducts()).setVisible(true);
            }
        });
    }
}

