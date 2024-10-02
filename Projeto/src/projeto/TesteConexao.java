package projeto;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class TesteConexao {
    public static void main (String[] args) {
        Connection conexao = null;
        try {
            // Carregar o driver JDBC
            Class.forName("com.mysql.jdbc.Driver");


            String url = "jdbc:mysql://localhost:3307/escola";
            String usuario = "root";
            String senha = "root";

            conexao = DriverManager.getConnection(url, usuario, senha);

            System.out.println("Conexao com o banco de dados estabelecida com sucesso");
        } catch (ClassNotFoundException | SQLException ex) {

            System.out.println("Falha na conexao com o banco de dados"+ ex.getMessage());                   
        } finally {
            if (conexao != null){
                try {
                    conexao.close();
                } catch (SQLException ex) {
                    System.out.println("Falha ao fechar a conexao com o banco de dados"+ ex.getMessage());
                }
        {

                }
            }
        }
    }

}
