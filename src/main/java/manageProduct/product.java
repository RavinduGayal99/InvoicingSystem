/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package manageProduct;

/**
 *
 * @author Ravindu
 */
public class product {
    private String product_id;
    private String product_name;
    private String description;
    private double purchase_price;
    private double selling_price;
    private int quantity;
    
    product(){
        
    }
    //constructors
    
    public product(String product_id, String product_name, String description, double purchase_price,double selling_price, int quantity){
        this.product_id = product_id;
        this.product_name = product_name;
        this.description = description;
        this.purchase_price = purchase_price;
        this.selling_price = selling_price;
        this.quantity = quantity;
    }
    
    public product(String product_id){
        this.product_id=product_id;
    }
    
    //setters
    
    public void setpid(String product_id){
        this.product_id = product_id;
    }
    public void setpName(String product_name){
        this.product_name = product_name;
    }
    public void setDesc(String description){
        this.description = description;
    }
    public void setpPrice(double purchase_price){
        this.purchase_price = purchase_price;
    }
    public void setsPrice(double selling_price){
        this.selling_price = selling_price;
    }
    public void setqauantity(int quantity){
        this.quantity = quantity;
    }
    //getters
    
    public String getpid(){
        return product_id;
    }
    public String getpName(){
        return product_name;
    }
    public String getdesc(){
        return description;
    }
    public double getpPrice(){
        return purchase_price;
    }
    public double getsPrice(){
        return selling_price;
    }
    public int getquantity(){
        return quantity;
    }
}
