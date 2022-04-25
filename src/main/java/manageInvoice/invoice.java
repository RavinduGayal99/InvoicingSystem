/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package manageInvoice;

/**
 *
 * @author Ravindu
 */
public class invoice {
    private int invoice_number;
    private String invoice_date;
    private String customer_name;
    private String product_names;
    private int upp;    //unit per product
    private double uppp;   //unit price per product 
    private double tppp;    //total price per product
    private double discount;//discount per product based on the quality
    
    //constructors
    
    invoice(){
        
    }
    public invoice(int invoice_number, String invoice_date, String customer_name, String product_names, int upp, double uppp, double tppp, double discount){
        this.invoice_number = invoice_number;
        this.invoice_date = invoice_date;
        this.customer_name = customer_name;
        this.product_names = product_names;
        this.upp = upp;
        this.uppp = uppp;
        this.tppp = tppp;
        this.discount = discount;
    }
    
    //setters
    
    public void setiNumber(int invoice_number){
        this.invoice_number = invoice_number;
    }
    public void setiDate(String invoice_date){
        this.invoice_date = invoice_date;
    }
    public void setcName(String customer_name){
        this.customer_name = customer_name;
    }
    public void setpNames(String product_names){
        this.product_names = product_names;
    }
    public void setupp(int upp){
        this.upp = upp;
    }
    public void setuppp(double uppp){
        this.uppp = uppp;
    }
    public void settppp(double tppp){
        this.tppp = tppp;
    }
    public void setdis(double discount){
        this.discount = discount;
    }
    //getter
    public int getiNumber(){
        return invoice_number;
    }
    public String getiDate(){
        return invoice_date;
    }
    public String getcName(){
        return customer_name;
    }
    public String getpNames(){
        return product_names;
    }
    public int getupp(){
        return upp;
    }
    public double getuppp(){
        return uppp;
    }
    public double gettppp(){
        return tppp;
    }
    public double getdis(){
        return discount;
    }
}
