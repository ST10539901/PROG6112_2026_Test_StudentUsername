/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Q2;

/**
 *
 * @author Snqobile
 */
public abstract class Consoles implements IConsole {
   private String ConsoleType;
   private String StoreName;
   private int totalConsoleSales;
   
   public Consoles(String consoleType,String storeName,int totalConsoleSales){
       this.storeName = storeName;
       this.totalConsoleSales = totalConsoleSales;
       this.consoleType = consoleType;
   }
   @Override
    public String getConsoleType() {
        return consoleType;
    }
    @Override
    public String getStoreName() {
        return storeName;
    }
    @Override
    public int getTotalConsoleSales() {
       return totalConsoleSales; 
    }
}
