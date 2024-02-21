/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package perpusdigital_mayaa;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

public class koneksi {
    Connection koneksi=null;
    
    public static Connection koneksiDb()
    {
        try{
            String ur1="jdbc:mysql://localhost/db_perpusdigital";
            String user="root";
            String pass="";
            Class.forName("com.mysql.jdbc.Driver");
            Connection koneksi=DriverManager.getConnection(ur1,user,pass);
            return koneksi;
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, e);
            return null;
        }
    }
    }