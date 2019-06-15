/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ams;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Ejiga Samuel
 */
public class DBUpdaterT {
    
    String conString = "jdbc:mysql://localhost/rainh";
    String username = "root";
    String password = null;
    
    //RETRIEVE DATA
    public DefaultTableModel getData() {
        //ADD COLUMNS TO TABLE MODEL
        DefaultTableModel dm = new DefaultTableModel();
        dm.addColumn("teacherid");
        dm.addColumn("teachername");
        

        //SQL STATEMENT
        String sql = "SELECT * FROM teacher";

        try {
            Connection con = DriverManager.getConnection(conString, username, password);

            //PREPARED STMT
            Statement s = con.prepareStatement(sql);
            ResultSet rs = s.executeQuery(sql);

            //LOOP THRU GETTING ALL VALUES
            while (rs.next()) {
                //GET VALUES
                String id = rs.getString(1);
                String name = rs.getString(2);
                //String pos = rs.getString(3);
                //String team = rs.getString(4);

                dm.addRow(new String[]{id, name,});
            }

            return dm;

        } catch (SQLException ex) {
            ex.printStackTrace();
        }

        return null;
        
    }
    
    //DELETE DATA
    public Boolean delete(String name)
    {
        //SQL STMT
        String sql="DELETE FROM teacher WHERE teachername ='"+name+"'";

        try
        {
            //GET COONECTION
            Connection con=DriverManager.getConnection(conString, username, password);

            //STATEMENT
            Statement s=con.prepareStatement(sql);

            //EXECUTE
            s.execute(sql);

            return true;

        }catch(Exception ex)
        {
            ex.printStackTrace();
            return false;
        }
    }
    
}
