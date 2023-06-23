
package projeto;

import java.awt.Color;
import java.awt.Image;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.Vector;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import java.io.File;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author informática
 */
public class database extends javax.swing.JFrame {
     
        byte [] pimage= null;
        String filename = null;
    
    public database() {
        initComponents();
        show_user();
        getContentPane().setBackground(Color.BLACK);
        setTitle("TEST");
        this.setLocationRelativeTo(null);
    }
    

    
    Connection con1;
    PreparedStatement insert;
    
    public ArrayList<Aluno> userList(){
        ArrayList<Aluno> userList = new ArrayList<>();

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            String url = "jdbc:mysql://localhost:3306/escola";
            String usuario = "root";
            String senha = "";
            
            Connection  con = DriverManager.getConnection(url,usuario,senha);
            String query1= "Select * From alunos";
            Statement st= con.createStatement();
            ResultSet rs= st.executeQuery(query1);
            Aluno aluno;
            while(rs.next()){
                aluno=new Aluno(rs.getInt("id"),rs.getInt("Matrícula"),rs.getString("Nome"),rs.getString("Turma"),rs.getBytes("foto"));
                userList.add(aluno);
                
            }
            
        } catch (Exception e) {
        }
        return userList;
    }
    
    public void show_user(){
        ArrayList<Aluno> list = userList();
        DefaultTableModel Df = (DefaultTableModel)jTable1.getModel();
        Object[] row = new Object[4];
        for(int i=0;i<list.size();i++){
            
            row[0]=list.get(i).getId();
            row[1]=list.get(i).getNome();
            row[2]=list.get(i).getTurma();
            row[3]=list.get(i).getMatricula();
            Df.addRow(row);
            
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtNome = new javax.swing.JTextField();
        txtMatricula = new javax.swing.JTextField();
        txtTurma = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        lblImage = new javax.swing.JLabel();
        jAddImage = new javax.swing.JButton();
        txtImage = new javax.swing.JTextField();
        jMais = new javax.swing.JButton();
        jAlterar = new javax.swing.JButton();
        jDeletar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1280, 720));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(txtNome, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 230, 270, 34));
        getContentPane().add(txtMatricula, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 330, 270, 33));
        getContentPane().add(txtTurma, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 280, 270, 32));

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Turma");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 260, 120, 20));

        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Matrícula");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 310, -1, -1));

        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Nome");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 210, -1, -1));

        lblImage.setBackground(new java.awt.Color(255, 255, 255));
        lblImage.setForeground(new java.awt.Color(255, 255, 255));
        lblImage.setText("            Inserir Image");
        lblImage.setToolTipText("       ");
        lblImage.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));
        getContentPane().add(lblImage, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 200, 150, 190));

        jAddImage.setText("Add Image");
        jAddImage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jAddImageActionPerformed(evt);
            }
        });
        getContentPane().add(jAddImage, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 480, 100, 30));
        getContentPane().add(txtImage, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 480, 340, 30));

        jMais.setText("Voltar");
        jMais.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMaisActionPerformed(evt);
            }
        });
        getContentPane().add(jMais, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 430, -1, -1));

        jAlterar.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jAlterar.setText("Alterar");
        jAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jAlterarActionPerformed(evt);
            }
        });
        getContentPane().add(jAlterar, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 390, -1, -1));

        jDeletar.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jDeletar.setText("Deletar");
        jDeletar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jDeletarActionPerformed(evt);
            }
        });
        getContentPane().add(jDeletar, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 390, -1, -1));

        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 130, 570, 440));

        jPanel3.setBackground(new java.awt.Color(0, 0, 0));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createTitledBorder(null, "LOGIN", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 1, 24), new java.awt.Color(255, 255, 255)), "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 12), new java.awt.Color(255, 255, 255))); // NOI18N
        jPanel3.setForeground(new java.awt.Color(255, 255, 255));
        jPanel3.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 140, 550, 420));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "id", "Nome", "Turma", "Matricula", "Foto"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.Long.class, java.lang.Byte.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jTable1.getTableHeader().setReorderingAllowed(false);
        jTable1.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                jTable1AncestorAdded(evt);
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jTable1);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 30, 520, 610));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    
    private void jAddImageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jAddImageActionPerformed
        // TODO add your handling code here:
        JFileChooser arquivo  = new JFileChooser();

        arquivo.setDialogTitle("Selecione uma Imagem");
        arquivo.setFileSelectionMode(JFileChooser.FILES_ONLY);
        int op = arquivo.showOpenDialog(this);
        if (op == JFileChooser.APPROVE_OPTION);{
            File file = new File("");
            file = arquivo.getSelectedFile();
            String fileName = file.getAbsolutePath();
            txtImage.setText(fileName);
            ImageIcon image = new ImageIcon(file.getPath());
            lblImage.setIcon(new ImageIcon(image.getImage().getScaledInstance(lblImage.getWidth(), lblImage.getHeight(), Image.SCALE_DEFAULT)));

        }

    }//GEN-LAST:event_jAddImageActionPerformed

    private void jMaisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMaisActionPerformed
        Cadastro obj = new Cadastro();

        obj.show();

        dispose();
    }//GEN-LAST:event_jMaisActionPerformed

    private void jAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jAlterarActionPerformed
        // TODO add your handling code here:

        try {
            
            Class.forName("com.mysql.cj.jdbc.Driver");
            String url = "jdbc:mysql://localhost:3306/escola";
            String usuario = "root";
            String senha = "";            
            Connection conexao = DriverManager.getConnection(url, usuario, senha);
            int row = jTable1.getSelectedRow();
            String value = (jTable1.getModel().getValueAt(row, 0).toString());
            
            String sql ="UPDATE alunos set nome= ? , matrícula= ? , turma= ? , foto= ? where matrícula="+value;
            PreparedStatement atmt = conexao.prepareStatement(sql);
            atmt.setString(1, txtNome.getText());
            atmt.setLong(2, Integer.parseInt(txtMatricula.getText()));
            atmt.setString(3, txtTurma.getText());
            atmt.setBytes(4, pimage);
            
            atmt.executeUpdate();
            DefaultTableModel Df =(DefaultTableModel) jTable1.getModel();
            Df.setRowCount(0);
            
            show_user();
            atmt.close();
            conexao.close();
        JOptionPane.showMessageDialog(this, "Aluno Atualizado");
        
        txtNome.setText("");
        txtTurma.setText("");
        txtMatricula.setText("");
        lblImage.setIcon(null);
        txtNome.requestFocus();
                    
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_jAlterarActionPerformed

    private void jDeletarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jDeletarActionPerformed

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            String url = "jdbc:mysql://localhost:3306/escola";
            String usuario = "root";
            String senha = "";
            
            Connection conexao = DriverManager.getConnection(url, usuario, senha);
            int row = jTable1.getSelectedRow();
            String value = (jTable1.getModel().getValueAt(row, 0).toString());
            
            String sql ="Delete From alunos where nome="+value;
            PreparedStatement atmt = conexao.prepareStatement(sql);
            
            atmt.executeUpdate();
            DefaultTableModel Df =(DefaultTableModel) jTable1.getModel();
            Df.setRowCount(0);
            
            show_user();
            atmt.close();
            conexao.close();
            
                    
        JOptionPane.showMessageDialog(this, "Aluno Deletado");
        
        txtNome.setText("");
        txtTurma.setText("");
        txtMatricula.setText("");
        lblImage.setIcon(null);
        txtNome.requestFocus();
                    
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_jDeletarActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        // TODO add your handling code here:
        
        DefaultTableModel Df = (DefaultTableModel)jTable1.getModel();
        int selectedIndex = jTable1.getSelectedRow();

        txtNome.setText(Df.getValueAt(selectedIndex, 1).toString());
        txtTurma.setText(Df.getValueAt(selectedIndex, 2).toString());
        txtMatricula.setText(Df.getValueAt(selectedIndex, 3).toString());
        
        byte[] img = (userList().get(selectedIndex).getFoto());
        ImageIcon image = new ImageIcon(new ImageIcon(img).getImage().getScaledInstance(lblImage.getWidth(), lblImage.getHeight(), Image.SCALE_DEFAULT));
        lblImage.setIcon(image);
    }//GEN-LAST:event_jTable1MouseClicked

    private void jTable1AncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_jTable1AncestorAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_jTable1AncestorAdded

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(database.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(database.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(database.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(database.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new database().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jAddImage;
    private javax.swing.JButton jAlterar;
    private javax.swing.JButton jDeletar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JButton jMais;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel lblImage;
    private javax.swing.JTextField txtImage;
    private javax.swing.JTextField txtMatricula;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextField txtTurma;
    // End of variables declaration//GEN-END:variables
}
