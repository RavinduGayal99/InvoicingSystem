/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package manageInvoice;

import data.connectionClass;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Ravindu
 */
public class invoiceDAO {
    public static int insertInvoice(invoice in) throws ClassNotFoundException,SQLException{
        Connection con = connectionClass.getConnection();
        Statement stmt = con.createStatement();
        String queryString = "insert into invoice(invoice_number,customer_name,product_names,upp,uppp,tppp,discount) values('"+in.getiNumber()+"','"+in.getcName()+"','"+in.getpNames()+"','"+in.getupp()+"','"+in.getuppp()+"','"+in.gettppp()+"','"+in.getdis()+"')";
        int i = stmt.executeUpdate(queryString);
        return i;
    }

    public static void selectInvoice() throws ClassNotFoundException,SQLException{
        Connection con = connectionClass.getConnection();
        Statement stmt = con.createStatement();
        String queryString = "select * from invoice";
        ResultSet rs = stmt.executeQuery(queryString);
        while(rs.next()){
            String num=rs.getString("invoice_number");
            String date=rs.getString("invoice_name");
            String cName=rs.getString("customer_name");
            
            System.out.println(num+" "+date+" "+cName);
        }
    }
}
