/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Q1;

import java.util.Arrays;

/**
 *
 * @author Snqobile
 */
public class App {
    
     public static void main(String[] args) {
        int[][] sales = {
            //Cape Town
            {1000,2000,3000},
            //Port Elizabeth
            {2000,3000,4000},
            //Pretoria
            {1500,1100,1200},
        };
        String[] cities = {"Cape Town ","Port Elizabeth ","Pretoria "};
       int[] totals = new int[cities.length];
       System.out.println("--------------------------------------------");
       System.out.println("GAMING CONSOLE REPORT");
        System.out.println("--------------------------------------------");
       for(int i = 0;i<cities.length;i++){
          int [] oneDarray = sales[i]; 
          System.out.println(cities[i]+"  "+Arrays.toString(oneDarray));
          int PS5 = sales[i][0];
          int XBOX = sales[i][1];
          int SWITCH = sales[i][2];
          
          int total = PS5+XBOX+SWITCH;
          totals[i] = total;
       }
       
       //int highest = deliveries[0][0];
        int highest = 0;

     System.out.println("--------------------------------------------");
     System.out.println("CONSOLE SALES TOTALS FOR EACH CITY");
     System.out.println("--------------------------------------------"); 
       for(int i = 0;i<totals.length;i++){
           
           System.out.print(cities[i]+" "+totals[i]);

           }
       for(int i = 0;i<sales.length;i++){
          for(int j = 0;j<sales[i].length;j++){
            int currentValue = sales[i][j];
            //finding highest
            if(currentValue > highest){
                highest = currentValue;
            }
          }
       }
     }
}
       
       

