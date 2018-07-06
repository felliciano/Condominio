/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Connection;

import java.sql.*;

/**
 *
 * @author o_0fe
 */
public class ModuloConexao {

    // metodfo responsavel para estabelecer conexao com o banco
    public static Connection conector() {
        java.sql.Connection conexao = null;
        // chama o driver que eu importei aqui para bibliotecas
        String driver = "com.mysql.jdbc.Driver";
        // Armazenamento de informações referente ao banco
        String url = "jdbc:mysql://localhost:3306/tcc_condomy";
        String user = "root";
        String password = "";
        // estabelecendo a conexão com o banco
        try {
            Class.forName(driver);
            conexao = DriverManager.getConnection(url, user, password);
            return conexao;
        } catch (Exception e) {
            // alinha abaixo serve de apoio para esclarecer o erro.
           
           // System.out.println(e);
            return null;
        }
    }
}
