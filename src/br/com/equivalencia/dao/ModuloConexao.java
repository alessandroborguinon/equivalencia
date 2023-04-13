package br.com.equivalencia.dao;
import java.sql.*;

public class ModuloConexao {
    
    //Método que cria e mantém a conexão com o banco de dados
    public static Connection conector(){
        //Chamando o driver de conexao com o banco
        java.sql.Connection conexao = null;
        
        String driver = "com.mysql.cj.jdbc.Driver";
        String url = "jdbc:mysql://localhost:3306/equivalencia";
        String user = "root";
        String password = "123456";        
        
        //Estabelecendo ao conexao com o banco
        try {
            Class.forName(driver);
            conexao = DriverManager.getConnection(url,user,password);
            return conexao;
        } catch (Exception e) {
            return null;
        }
    }
}
