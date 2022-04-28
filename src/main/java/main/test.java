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
        
        int inno,upp;
        String date,cName,pNames;
        double uppp,tppp,disc;
        
        productDAO pm = new productDAO();
        customerDAO cm = new customerDAO();
        invoiceDAO ig = new invoiceDAO();
        try{
        do{
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
                            pid=sc.next();
                            pname=sc.next();
                            pdesc=sc.next();
                            pp=sc.nextDouble();
                            sp=sc.nextDouble();
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
                            break;
                        case 4:
                            String id=sc.next();
                            product pd=new product(id);
                            pd.setpid(id);
                            pm.deleteProduct(pd);
                            break;
                        case 0:
                            break;
                        default:
                            System.out.println("Enter a valid number!");
                        break;
                    }
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
                        case 2:
                            cid=sc.next();
                            cname=sc.next();
                            email=sc.next();
                            address=sc.next();
                            tno=sc.nextInt();
                            dob=sc.next();
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
                        case 3:
                        case 4:
                        break;
                    }
                case 3:
                    System.out.println("Select a case from Invoice generation");
                    System.out.println("1. Generate invoice");
                    System.out.println("2. View invoice");
                    System.out.println("Input No. ");
                    int invoice=sc.nextInt();
                    switch(invoice){
                        case 1:
                            int inNo=sc.nextInt();
                            date=sc.next();
                            cName=sc.next();
                            pNames=sc.next();
                            upp=sc.nextInt();
                            uppp=sc.nextDouble();
                            tppp=sc.nextDouble();
                            disc=sc.nextDouble();
                            invoice i=new invoice(inNo,date,cName,pNames,upp,uppp,tppp,disc);
                            ig.insertInvoice(i);
                            break;
                        case 2:
                            ig.selectInvoice();
                            break;
                    }
                case 4:
                    int x;
                    break;
                case 0:
                    result=false;
                    break;
                default:
                    System.out.println("Enter a valid number from the list!");
                    break;
        }
        }while(result);
        }catch(ClassNotFoundException ex){
            
        }
        catch(SQLException ex){
            
        }
    }
}
