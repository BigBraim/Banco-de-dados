package projeto;



import java.sql.Connection; 
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;


public class AlunoDAO{
    
    public void salvarAluno(Aluno aluno) throws SQLException {
        
        Connection conexao = null;
    try {
        Class.forName("com.mysql.cj.jdbc.Driver");

        String url = "jdbc:mysql://localhost/escola"; 
        String usuario = "root"; 
        String senha = "";
        
        conexao = DriverManager.getConnection(url, usuario, senha);


        
        String sql = "INSERT INTO alunos (nome, matrícula, turma, foto)  VALUES (?, ?, ?, ?)";
        
        PreparedStatement stmt = conexao.prepareStatement (sql);
        stmt.setString( 1, aluno.getNome());
        stmt.setLong(2, aluno.getMatricula());
        stmt.setString( 3, aluno.getTurma()); 



        stmt.executeUpdate();

//Techar a conexão com o banco de dados

        stmt.close();
        conexao.close();

    } catch (ClassNotFoundException | SQLException e) {
        e.printStackTrace();
    }
    
    }

    public void atualizarAluno(Aluno aluno) throws SQLException{

        Connection conexao = null;
    try {
        
 
        
        Class.forName("com.mysql.cj.jdbc.Driver");

        String url = "jdbc:mysql://localhost/escola"; 
        String usuario = "root"; 
        String senha = "";
        
        conexao = DriverManager.getConnection(url, usuario, senha);

        String sql = "UPDATE alunos set nome=? ,matrícula= ?,turma= ?,foto= ? where id= ?";
        
        PreparedStatement stmt = conexao.prepareStatement (sql);
        stmt.setString( 1, aluno.getNome());
        stmt.setLong(2, aluno.getMatricula());
        stmt.setString( 3, aluno.getTurma()); 
        stmt.setInt(5,aluno.getId());



        stmt.executeUpdate();

//Techar a conexão com o banco de dados


    } catch (ClassNotFoundException | SQLException e) {
        e.printStackTrace();
    }

    }    
    public void deletarAluno(Aluno aluno) throws SQLException{
        
                Connection conexao = null;
    try {
        
 
        
        Class.forName("com.mysql.cj.jdbc.Driver");

        String url = "jdbc:mysql://localhost/escola"; 
        String usuario = "root"; 
        String senha = "";
        
        conexao = DriverManager.getConnection(url, usuario, senha);

        String sql = "DELETE FROM alunos where id= ?";
        
        PreparedStatement stmt = conexao.prepareStatement (sql);
        stmt.setInt(1,aluno.getId());



        stmt.executeUpdate();

//Techar a conexão com o banco de dados


    } catch (ClassNotFoundException | SQLException e) {
        e.printStackTrace();
    }
    }
    
}
