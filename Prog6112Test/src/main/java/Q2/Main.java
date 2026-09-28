/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Q2;

import java.util.Scanner;

/**
 *
 * @author Snqobile
 */
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter console device type : ");
        String console = input.nextLine();
        System.out.print("Enter store name : ");
        String store = input.nextLine();
        System.out.print("Enter total amounts of sales for the store : ");
        int total = input.nextInt();
        
        
        ConsoleSales consoleSales = new ConsoleSales(PS5,XBOX,SWITCH);
        System.out.println("");
        System.out.println("CONSOLE SALES REPORT");
        System.out.println("*************************");
        consoleSales.printAccidentReport();
        System.out.println("*************************");
    }   
}
