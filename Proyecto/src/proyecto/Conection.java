/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto;

/**
 *
 * @author Mexzziv
 */

import java.sql.*;
public class Conection {
    Connection conexion = null;
    Statement comando = null;
    ResultSet registro;
    
    public Connection MySQLConnect(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            String servidor = "jdbc:mysql://localhost:3306/calculadora";
            String usuario = "root";
            String pass = "";
            
            conexion = DriverManager.getConnection(servidor,usuario,pass);
        }catch(ClassNotFoundException ex){
            System.out.print("El error es "+ex);
        }finally{
            System.out.print("Conexion exitosa");
            return conexion;
        }
    }
}
