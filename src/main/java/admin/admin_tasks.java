/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package admin;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author Ravindu
 */
public class admin_tasks {
    public static void fileWriter(String log) throws ClassNotFoundException,IOException{
        FileWriter adminTsk = new FileWriter("AdminLog.txt",true);
        adminTsk.write(log+"\n");
        adminTsk.close();
    }
    public static void fileReader() throws ClassNotFoundException,IOException{
        File adminTsk = new File("AdminLog.txt");
        Scanner scan = new Scanner(adminTsk);
        while(scan.hasNextLine()){
            String log = scan.nextLine();
            System.out.println(log);
        }
        scan.close();
    }
}
