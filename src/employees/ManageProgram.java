/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package employees;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class ManageProgram {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
     

        String filename = "data.txt";
        Scanner sc = new Scanner(System.in);
        System.out.println("1.Add new employee");
        System.out.println("2.Remover an employee");
        System.out.println("3.Promoting the employee");
        System.out.println("4.Print the list");
        System.out.println("5.Save to files");
        System.out.println("6.Quit");
        

        
        boolean changed = false;
        EmpList list = new EmpList();
        list.AddFromFile(filename);
        
        int num=0;
        do{
            System.out.println("\nEmployee manager:");
            num=sc.nextInt();
            switch(num){
                case 1: list.addNewEmp();
                changed = true;
                break;
                case 2: list.removeEmp();
                changed = true;
                break;
                case 3: list.promote();
                changed = true;
                break;
                case 4: list.print();
                break;
                case 5: list.saveToFile(filename);
                changed= false;
                default : if (changed){
                    System.out.println("Save changes Y/N");
                    String response = sc.nextLine().toUpperCase();
                    
                    if (response.startsWith("Y"))
                        list.saveToFile(filename);
                }
                
            }
        
        
        } while (num>0 && num<6);
        
        
        
        
        
        
        
    }
    
}
