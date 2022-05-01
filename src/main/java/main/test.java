/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

import java.sql.SQLException;
import java.util.Scanner;
import manageCustomer.customer;
import manageCustomer.customerDAO;
import manageInvoice.invoice;
import manageInvoice.invoiceDAO;
import manageProduct.product;
import manageProduct.productDAO;

/**
 *
 * @author Ravindu
 */
public class test {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        boolean result = true;
        
        String pid,pname,pdesc;
        double pp,sp;
        int qt;
        
        String cid,cname,email,address,dob,gender;
        int tno;
        
        int inNo,upp;
        String cName,pNames;
        double uppp,tppp,disc;
        
        String id;
        
        productDAO pm = new productDAO();
        customerDAO cm = new customerDAO();
        invoiceDAO ig = new invoiceDAO();
        try{
        
            System.out.println("Select a case from menu");
            System.out.println("1. Manage Products");
            System.out.println("2. Manage Customers");
            System.out.println("3. Invoice generation");
            System.out.println("4. Admin tasks");
            System.out.println("0. Exit program");
            System.out.println("Input No.");
            int Invoicing=sc.nextInt();
            switch(Invoicing){
                case 1:
                    System.out.println("Select a case from Products");
                    System.out.println("1. Veiw products");
                    System.out.println("2. Insert product");
                    System.out.println("3. Update product");
                    System.out.println("4. Delete product");
                    System.out.println("0. Main menu");
                    System.out.println("Input No. ");
                    int product=sc.nextInt();
                    switch(product){
                        case 1:
                            pm.selectProduct();
                            break;
                        case 2:
                            System.out.println("Enter product id:");
                            pid=sc.next();
                            System.out.println("Enter product name:");
                            pname=sc.next();
                            System.out.println("Enter product description:");
                            pdesc=sc.next();
                            System.out.println("Enter product purches price:");
                            pp=sc.nextDouble();
                            System.out.println("Enter product selling price:");
                            sp=sc.nextDouble();
                            System.out.println("Enter product quantity:");
                            qt=sc.nextInt();
                            product p=new product(pid,pname,pdesc,pp,sp,qt);
                            p.setpid(pid);
                            p.setpName(pname);
                            p.setDesc(pdesc);
                            p.setpPrice(pp);
                            p.setsPrice(sp);
                            p.setqauantity(qt);
                            pm.insertProduct(p);
                            break;
                        case 3:
                            System.out.println("Enter product id:");
                            id=sc.next();
                            
                            break;
                        case 4:
                            System.out.println("Enter product id:");
                            id=sc.next();
                            product pd=new product(id);
                            pd.setpid(id);
                            pm.deleteProduct(pd);
                            break;
                        case 0:
                            break;
                        default:
                            System.out.println("Enter a valid number!");
                            break;
                    }break;
                case 2:
                    System.out.println("Select a case from Customers");
                    System.out.println("1. Veiw customers");
                    System.out.println("2. Insert customer");
                    System.out.println("3. Update customer");
                    System.out.println("4. Delete customer");
                    System.out.println("0. Main menu");
                    System.out.println("Input No. ");
                    int customer=sc.nextInt();
                    switch(customer){
                        case 1:
                            cm.selectCustomer();
                            break;
                        case 2:
                            System.out.println("Enter customer id:");
                            cid=sc.next();
                            System.out.println("Enter customer name:");
                            cname=sc.next();
                            System.out.println("Enter customer email:");
                            email=sc.next();
                            System.out.println("Enter customer address:");
                            address=sc.next();
                            System.out.println("Enter customer phone number:");
                            tno=sc.nextInt();
                            System.out.println("Enter cusomer date of birth(yyyy-mm-dd):");
                            dob=sc.next();
                            System.out.println("Enter customer gender:");
                            gender=sc.next();
                            customer c=new customer(cid,cname,email,address,tno,dob,gender);
                            c.setcId(cid);
                            c.setcName(cname);
                            c.setemail(email);
                            c.setaddress(address);
                            c.setcNumber(tno);
                            c.setdob(dob);
                            c.setgender(gender);
                            cm.insertCustomer(c);
                            break;
                        case 3:
                            System.out.println("Enter customer id:");
                            id = sc.next();
                            
                            break;
                        case 4:
                            System.out.println("Enter customer id:");
                            id = sc.next();
                            customer cd = new customer(id);
                            cd.setcId(id);
                            cm.deleteCustomer(cd);
                            break;
                    }break;
                case 3:
                    System.out.println("Select a case from Invoice generation");
                    System.out.println("1. Generate invoice");
                    System.out.println("2. View invoice");
                    System.out.println("Input No. ");
                    int invoice=sc.nextInt();
                    switch(invoice){
                        case 1:
                            System.out.println("Enter invoice number:");
                            inNo=sc.nextInt();
                            System.out.println("Enter customer name:");
                            cName=sc.next();
                            System.out.println("Enter product names:");
                            pNames=sc.next();
                            System.out.println("Enter units per product:");
                            upp=sc.nextInt();
                            System.out.println("Enter unit price per product:");
                            uppp=sc.nextDouble();
                            System.out.println("Enter total price per product:");
                            tppp=sc.nextDouble();
                            System.out.println("Enter discount:");
                            disc=sc.nextDouble();
                            invoice i=new invoice(inNo,cName,pNames,upp,uppp,tppp,disc);
                            ig.insertInvoice(i);
                            break;
                        case 2:
                            ig.selectInvoice();
                            break;
                    }break;
                case 4:
                    //admin tasks
                    break;
                case 0:
                    
                    break;
                default:
                    System.out.println("Enter a valid number from the list!");
                    break;
        }
        }catch(ClassNotFoundException ex){
            
        }
        catch(SQLException ex){
            
        }
    }
}
