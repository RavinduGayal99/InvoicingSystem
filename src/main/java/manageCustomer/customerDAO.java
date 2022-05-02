/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package manageCustomer;

import admin.admin_tasks;
import data.connectionClass;
import java.io.IOException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Ravindu
 */
public class customerDAO {
    public static int insertCustomer(customer c) throws ClassNotFoundException,SQLException,IOException{
        Connection con = connectionClass.getConnection();
        Statement stmt = con.createStatement();
        admin_tasks aTsk =new admin_tasks();
        String queryString = "insert into customer_details(customer_id, customer_name, email, address, contact_number, date_of_birth, gender) values('"+c.getcId()+"','"+c.getc_name()+"','"+c.getemail()+"','"+c.getaddress()+"','"+c.getcNumber()+"','"+c.getdob()+"','"+c.getgender()+"')";
        int i = stmt.executeUpdate(queryString);
        if(i != 0){
            aTsk.fileWriter(queryString);
        }
        return i;
    }
    public static int deleteCustomer(customer c) throws ClassNotFoundException,SQLException,IOException{
        Connection con = connectionClass.getConnection();
        Statement stmt = con.createStatement();
        admin_tasks aTsk =new admin_tasks();
        String queryString = "delete from customer_details where customer_id='"+c.getcId()+"'";
        int i =stmt.executeUpdate(queryString);
        if(i != 0){
            aTsk.fileWriter(queryString);
        }
        return i;
    }
    public static void selectCustomer() throws ClassNotFoundException,SQLException{
        Connection con = connectionClass.getConnection();
        Statement stmt = con.createStatement();
        String queryString = "select * from customer_details";
        ResultSet rs = stmt.executeQuery(queryString);
        while(rs.next()){
            String id=rs.getString("customer_id");
            String name=rs.getString("customer_name");
            String email=rs.getString("email");
            String address=rs.getString("address");
            String no=rs.getString("contact_number");
            String dob=rs.getString("date_of_birth");
            String gender=rs.getString("gender");
            
            System.out.println(id+" "+name+" "+email+" "+address+" "+no+" "+dob+" "+gender);
        }
    }
    public static int updateCustomer(customer c) throws ClassNotFoundException,SQLException,IOException{
        Connection con = connectionClass.getConnection();
        Statement stmt = con.createStatement();
        admin_tasks aTsk =new admin_tasks();
        String queryString = "update customer_details where customer_id='"+c.getcId()+"' set";
        int i =stmt.executeUpdate(queryString);
        if(i != 0){
            aTsk.fileWriter(queryString);
        }
        return i;
    }
}
