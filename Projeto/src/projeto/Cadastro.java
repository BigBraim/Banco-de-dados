 /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package projeto;

import java.sql.Statement;
import javax.swing.ImageIcon;
import java.sql.ResultSetMetaData;
import java.sql.ResultSet;
import java.sql.Connection; 
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Vector;
import java.util.logging.Level;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.*;
import java.awt.*;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.util.List;
import java.util.ArrayList;



/**
 *
 * @author Biblioteca
 */
public class Cadastro extends javax.swing.JFrame {
    
    byte [] pimage= null;
    String filename = null;
    


    /**
     * Creates new form Cadastro
     */
    public Cadastro() {

        initComponents();

        show_user();
        this.setLocationRelativeTo(null);
        setTitle("Cadastro");
        getContentPane().setBackground(Color.BLACK);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jAlterar = new javax.swing.JButton();
        jDeletar = new javax.swing.JButton();
        txtNome = new javax.swing.JTextField();
        txtMatricula = new javax.swing.JTextField();
        txtTurma = new javax.swing.JTextField();
        JCadastrar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        lblImage = new javax.swing.JLabel();
        jAddImage = new javax.swing.JButton();
        txtImage = new javax.swing.JTextField();
        jMais = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();

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
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jTable1);

        jAlterar.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jAlterar.setText("Alterar");
        jAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jAlterarActionPerformed(evt);
            }
        });

        jDeletar.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jDeletar.setText("Deletar");
        jDeletar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jDeletarActionPerformed(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1280, 720));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(txtNome, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 250, 270, 34));
        getContentPane().add(txtMatricula, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 350, 270, 33));
        getContentPane().add(txtTurma, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 300, 270, 32));

        JCadastrar.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        JCadastrar.setText("Cadastrar");
        JCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JCadastrarActionPerformed(evt);
            }
        });
        getContentPane().add(JCadastrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 410, 100, 30));

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Turma");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 280, 120, 20));

        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Matrícula");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 330, -1, -1));

        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Nome");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 230, -1, -1));

        lblImage.setBackground(new java.awt.Color(255, 255, 255));
        lblImage.setForeground(new java.awt.Color(255, 255, 255));
        lblImage.setText("            Inserir Image");
        lblImage.setToolTipText("       ");
        lblImage.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));
        getContentPane().add(lblImage, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 220, 150, 190));

        jAddImage.setText("Add Image");
        jAddImage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jAddImageActionPerformed(evt);
            }
        });
        getContentPane().add(jAddImage, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 500, 100, 30));
        getContentPane().add(txtImage, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 500, 340, 30));

        jMais.setText("Mais...");
        jMais.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMaisActionPerformed(evt);
            }
        });
        getContentPane().add(jMais, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 450, -1, -1));

        jPanel3.setBackground(new java.awt.Color(0, 0, 0));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createTitledBorder(null, "LOGIN", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 1, 24), new java.awt.Color(255, 255, 255)), "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 12), new java.awt.Color(255, 255, 255))); // NOI18N
        jPanel3.setForeground(new java.awt.Color(255, 255, 255));
        jPanel3.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 150, 550, 420));

        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 140, 570, 440));

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
    
    private void table_update(){
        
        int c;
        
        try {
            
        Class.forName("com.mysql.cj.jdbc.Driver");

        String url = "jdbc:mysql://localhost:3306/escola"; 
        String usuario = "root"; 
        String senha = "";
        
        con1 = DriverManager.getConnection(url, usuario, senha);

        insert = con1.prepareStatement("select * from alunos");
        
        ResultSet rs = insert.executeQuery();
        ResultSetMetaData Rss = rs.getMetaData();
        c = Rss.getColumnCount();
        
        DefaultTableModel Df = (DefaultTableModel)jTable1.getModel();
        
        Df.setRowCount(0);
        
        while(rs.next()){
            
            Vector v2 = new Vector();
            
            for(int a=1; a<=c; a++){
                v2.add(rs.getString("id"));
                v2.add(rs.getString("nome"));
                v2.add(rs.getString("turma"));
                v2.add(rs.getString("matrícula"));
                v2.add(rs.getString("foto"));
                
            }
            
        Df.addRow(v2);
            
        }
        

//Techar a conexão com o banco de dados

      
    } catch (ClassNotFoundException | SQLException e) {
        e.printStackTrace();
    }
        
        
        
    }
    
    

    
    private void JCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JCadastrarActionPerformed

        
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            String url = "jdbc:mysql://localhost:3306/escola";
            String usuario = "root";
            String senha = "";
            Connection conexao = DriverManager.getConnection(url, usuario, senha);
            
            String sql ="INSERT INTO alunos (nome, matrícula, turma, foto) VALUES (?, ?, ?, ?)";
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
            
                    
        JOptionPane.showMessageDialog(this, "Aluno Criado");
        
        txtNome.setText("");
        txtTurma.setText("");
        txtMatricula.setText("");
        lblImage.setIcon(null);
        txtNome.requestFocus();
                    
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
        
    }//GEN-LAST:event_JCadastrarActionPerformed
            

    
    private void jAddImageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jAddImageActionPerformed
        // TODO add your handling code here:
      JFileChooser chooser =  new JFileChooser(); 
        chooser.showOpenDialog(null);
        File f = chooser.getSelectedFile();
        filename = f.getAbsolutePath();
        ImageIcon imageIcon = new ImageIcon(new ImageIcon(filename).getImage().getScaledInstance(lblImage.getWidth(), lblImage.getHeight(), Image.SCALE_SMOOTH));
        lblImage.setIcon(imageIcon);
        try {
            File image = new File(filename);
            FileInputStream fis = new FileInputStream(image); 
            ByteArrayOutputStream bos = new ByteArrayOutputStream();
            byte [] buf = new byte[1024];
            for(int readNum;(readNum = fis.read(buf))!=-1;){
                bos.write(buf,0,readNum);
        }
          
            pimage= bos.toByteArray();
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        
    }//GEN-LAST:event_jAddImageActionPerformed

    private void jMaisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMaisActionPerformed
        database obj = new database();
        
        obj.show();
        
        dispose();
    }//GEN-LAST:event_jMaisActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        // TODO add your handling code here:

        DefaultTableModel Df = (DefaultTableModel)jTable1.getModel();
        int selectedIndex = jTable1.getSelectedRow();

        txtNome.setText(Df.getValueAt(selectedIndex, 1).toString());
        txtTurma.setText(Df.getValueAt(selectedIndex, 2).toString());
        txtMatricula.setText(Df.getValueAt(selectedIndex, 3).toString());
        txtImage.setText(Df.getValueAt(selectedIndex, 4).toString());
        
        byte[] img = (userList().get(selectedIndex).getFoto());
        ImageIcon image = new ImageIcon(new ImageIcon(img).getImage().getScaledInstance(lblImage.getWidth(), lblImage.getHeight(), Image.SCALE_DEFAULT));
        lblImage.setIcon(image);
    }//GEN-LAST:event_jTable1MouseClicked

    private void jAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jAlterarActionPerformed
        // TODO add your handling code here:
        DefaultTableModel Df = (DefaultTableModel)jTable1.getModel();
        int selectIndex = jTable1.getSelectedRow();

        try {

            int id = Integer.parseInt(Df.getValueAt(selectIndex, 0).toString());

            Aluno aluno = new Aluno();

            AlunoDAO tp = new AlunoDAO();

            aluno.setNome(txtNome.getText());
            aluno.setTurma(txtTurma.getText());
            aluno.setMatricula(Integer.parseInt(txtMatricula.getText()));
            aluno.setId(id);

            tp.atualizarAluno(aluno);

            JOptionPane.showMessageDialog(this,"Atualizado com sucesso");

            table_update();

            insert.executeUpdate();

        } catch (SQLException ex) {

        }
    }//GEN-LAST:event_jAlterarActionPerformed

    private void jDeletarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jDeletarActionPerformed

        DefaultTableModel Df = (DefaultTableModel)jTable1.getModel();
        int selectIndex = jTable1.getSelectedRow();

        try {

            int id = Integer.parseInt(Df.getValueAt(selectIndex, 0).toString());

            int dialogResult = JOptionPane.showConfirmDialog(null, "Voce deseja excluir esse aluno","Perigo",JOptionPane.YES_NO_OPTION);

            if(dialogResult == JOptionPane.YES_OPTION);
            {

                Aluno aluno = new Aluno();

                AlunoDAO tp = new AlunoDAO();

                aluno.setNome(txtNome.getText());
                aluno.setTurma(txtTurma.getText());
                aluno.setMatricula(Integer.parseInt(txtMatricula.getText()));
                aluno.setId(id);

                tp.deletarAluno(aluno);

                JOptionPane.showMessageDialog(this,"Deletado com sucesso");

                table_update();
                txtNome.setText("");
                txtTurma.setText("");
                txtMatricula.setText("");
                txtNome.requestFocus();

                insert.executeUpdate();

            }
        } catch (SQLException ex) {

        }
    }//GEN-LAST:event_jDeletarActionPerformed

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
            java.util.logging.Logger.getLogger(Cadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Cadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Cadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Cadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Cadastro().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JCadastrar;
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
