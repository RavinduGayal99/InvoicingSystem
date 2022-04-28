/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package manageCustomer;

/**
 *
 * @author Ravindu
 */
public class customer {
    private String customer_id;
    private String customer_name;
    private String email;
    private String address;
    private int contact_number;
    private String date_of_birth;
    private String gender;
    
    //constructors
    customer(){
                        
    }
    public customer(String customer_id, String customer_name, String email, String address, int contact_number, String date_of_birth, String gender){
        this.customer_id = customer_id;
        this.customer_name = customer_name;
        this.email = email;
        this.address = address;
        this.contact_number = contact_number;
        this.date_of_birth = date_of_birth;
        this.gender = gender;
    }
    public customer(String customer_id){
        this.customer_id = customer_id;
    }
    //setters
    public void setcId(String customer_id){
        this.customer_id = customer_id;
    }
    public void setcName(String customer_name){
        this.customer_name = customer_name;
    }
    public void setemail(String email){
        this.email = email;
    }
    public void setaddress(String address){
        this.address = address;
    }
    public void setcNumber(int contact_number){
        this.contact_number = contact_number;
    }
    public void setdob(String date_of_birth){
        this.date_of_birth = date_of_birth;
    }
    public void setgender(String gender){
        this.gender = gender;
    }
    //getters
    public String getcId(){
        return customer_id;
    }
    public String getc_name(){
        return customer_name;
    }
    public String getemail(){
        return email;
    }
    public String getaddress(){
        return address;
    }
    public int getcNumber(){
        return contact_number;
    }
    public String getdob(){
        return date_of_birth;
    }
    public String getgender(){
        return gender;
    }
}
