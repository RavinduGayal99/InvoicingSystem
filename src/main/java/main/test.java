/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

import java.sql.SQLException;
import java.util.Scanner;
import manageCustomer.customerDAO;
import manageInvoice.invoiceDAO;
import manageProduct.productDAO;

/**
 *
 * @author Ravindu
 */
public class test {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        boolean result = true;
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
                            
                            break;
                        case 2:
                        case 3:
                            
                        case 4:
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
                            System.out.println("");
                        case 2:
                        case 3:
                        case 4:
                        break;
                    }
                case 3:
                    System.out.println("Input No. ");
                    int invoice=sc.nextInt();
                    switch(invoice){
                        case 1:
                            System.out.println("");
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
