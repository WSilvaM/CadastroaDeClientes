/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.cliente.util;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.DriverManager;

/**
 *
 * @author tecsistem
 */
public class Conector {
    //jdbc:/ = Dados de conctor ao banco e qual banco conctar
    public static String url = "jdbc:mysql://localhost/cadastrocliente";
    public static String usuario = "root";
    public static String senha = "root";
    public static Connection con;
    
    public static Connection getConexao() throws SQLException{
        //tudo que estive dentro do metodo TRY escode o erro.
        try {
            //Class.forName("org.gjt.mm.mysql.Driver");
            if(con ==null){
            con=(Connection)DriverManager.getConnection(url,usuario,senha);
            }
            return con;
            
        } catch (SQLException e) {
            throw new SQLException(e.getMessage());
        }
    
    
    }
        
    }

