/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package manageProduct;

import data.connectionClass;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Ravindu
 */
public class productDAO {
    public static int insertProduct(product p) throws ClassNotFoundException,SQLException{
        Connection con = connectionClass.getConnection();
        Statement stmt = con.createStatement();
        String queryString = "insert into product_details(product_id, product_name, description, purchase_price, selling_price, quantity) values('"+p.getpid()+"','"+p.getpName()+"','"+p.getdesc()+"','"+p.getpPrice()+"','"+p.getsPrice()+"','"+p.getquantity()+"')";
        int i = stmt.executeUpdate(queryString);
        return i;
    }
    public static int deleteProduct(product p) throws ClassNotFoundException,SQLException{
        Connection con = connectionClass.getConnection();
        Statement stmt = con.createStatement();
        String queryString = "delete from product_details where customer_id='"+p.getpid()+"'";
        int i = stmt.executeUpdate(queryString);
        return i;
    }
    public static void selectProduct() throws ClassNotFoundException,SQLException{
        Connection con = connectionClass.getConnection();
        Statement stmt = con.createStatement();
        String queryString = "select * from product_details";
        ResultSet rs = stmt.executeQuery(queryString);
        while(rs.next()){
            String id=rs.getString("product_id");
            String name=rs.getString("product_name");
            String desc=rs.getString("descripton");
            String pprice=rs.getString("purches_price");
            String sprice=rs.getString("selling_price");
            String quantity=rs.getString("quantity");
            
            System.out.println(id+" "+name+" "+desc+" "+pprice+" "+sprice+" "+quantity);
        }
       
    }
    public static int updateProduct(product p) throws ClassNotFoundException,SQLException{
        Connection con = connectionClass.getConnection();
        Statement stmt = con.createStatement();
        String queryString = "";
        int i = stmt.executeUpdate(queryString);
        return i;
    }
    public static int updateProductStock(product p) throws ClassNotFoundException,SQLException{
        Connection con = connectionClass.getConnection();
        Statement stmt = con.createStatement();
        String queryString = "update product where product_id='"+p.getpid()+"' set quantity='"+p.getquantity()+"'";
        int i = stmt.executeUpdate(queryString);
        return i;
    }
}
