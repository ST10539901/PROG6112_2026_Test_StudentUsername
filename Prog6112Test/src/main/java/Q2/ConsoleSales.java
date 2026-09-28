/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Q2;

/**
 *
 * @author Snqobile
 */
public class ConsoleSales extends Consoles {
    
    public ConsoleSales(String consoleType,String storeName,int totalSales){
        super(consoleType,storeName,totalSales);
    }
    public void printAccidentReport(){
       System.out.println("Console Type : "+super.getConsoleType());
       System.out.println("Store Name : "+ super.getStoreName());
       System.out.println("Sales Total : "+ super.getTotalSales());
    }
}
