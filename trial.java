/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Switchconverter;

import java.util.Scanner;

/**
 *
 * @author Fedrequilan_CPE
 */
public class trial {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        
        Scanner input=new Scanner (System.in);
        System.out.println("Select option"
                + " [1: Temperature Converter]"
                + " [2: Even and Odd Checker]"
                + " [3: Trigonometry Calculations]"
                + " [4: Polygons surface area]") ;
        int a = input.nextInt();
        
        switch (a) {
            case 1: {
                System.out.println ("Select Option:"
                        + " [1: C to F]"
                        + " [2: F to C]"
                        + " [3: K to F]"
                        + " [4: F to K]"
                        + " [5: K to C]"
                        + " [6: C to K]");
                int g=input.nextInt();
                
                if (g==1) { 
                 System.out.println (" Enter No. of Celcius");
                int c = input.nextInt();
                double ans = (c*9/5) + (32);
                 System.out.println("The answer is:" + ans + " Fahrenheit");
        } 
        
                else if (g==2){
                System.out.println ("Enter No. of Fahrenheit");
                int t = input.nextInt();
                float ans = (t-32) * 5/9f;
                System.out.println("The answer is:" + ans + " Celcius");
        }
                 else if (g==3){
                 System.out.println ("Enter No. of Kelvin");
                int r = input.nextInt();
                float ans = ((r - 273.15f)*9/5 + 32);
                System.out.println("The answer is:" + ans+ " Fahrenheit");
        } 
                else if (g==4){
                System.out.println ("Enter No. of Fahrenheit");
                double p = input.nextInt();
                double ans = (((p - 32)*5/9)+ 273.15) ;
                System.out.println("The answer is:" + ans + " Kelvin");
        }
         
                else if (g==5){
                System.out.println ("Enter No. of Kelvin");
                int h = input.nextInt();
                double ans = (h - 273.15) ;
                System.out.println("The answer is:" + ans + " Celcius");
        } 
                else if (g==6){
                System.out.println ("Enter No. of Celcius");
                int j = input.nextInt();
                double ans = (j + 273.15) ;
                System.out.println("The answer is:" + ans + " Kelvin");
                }
                break;
        }
            case 2: {
                System.out.println("Even and Odd Checker");
                System.out.println("Enter Number:");
                int b=input.nextInt();
                if (b%2==0) {
                System.out.println("The Number is Even");        
                } else {
                 System.out.println("The nummber is Odd");
                }
                break;
        }        
            case 3: 
                System.out.println("Select Trigo Function:"
                                    + " 1: Sin"
                                    + " 2: Cos"
                                    + " 3: Tan");
                int e=input.nextInt();
                
                
                if (e==1){
                System.out.println ("Enter Number");  
                int f=input.nextInt();
                double ans = Math.sin(f*(Math.PI/180));
                System.out.println(ans);
        }      
                else if (e==2) {
                System.out.println ("Enter Number");  
                int f=input.nextInt();
                double ans = Math.cos(f*(Math.PI/180));
                System.out.println(ans);
                
        }
                else if (e==3) {
                System.out.println ("Enter Number");  
                int f=input.nextInt();
                double ans = Math.tan(f*(Math.PI/180));
                System.out.println(ans);
                
                break;
                
        }
            case 4:
                System.out.println ("Select Polygons"
                                    + " 1: Triangle"
                                    + " 2: Sqaure"
                                    + " 3: Rectangle"
                                    + " 4: Parallelogram");
                int r=input.nextInt();
                
                if (r==1){
                System.out.println ("Enter the measurement of height");
                int h=input.nextInt();
                System.out.println ("Enter the measurement of base");
                int g=input.nextInt();
                double x=(h*g)* 1/2;
                System.out.println (x);      
        }
                else if (r==2){
                System.out.println ("Enter the measurement of side");
                int h=input.nextInt();
                double k=h*h;
                System.out.println (k); 
        }
                else if (r==3){
                System.out.println ("Enter the measurement of length");
                int h=input.nextInt();
                System.out.println ("Enter the measurement of width");
                int k=input.nextInt();
                double b= k*h;
                System.out.println (b);
        }
                else if (r==4){
                System.out.println ("Enter the measurement of base");
                int h=input.nextInt();
                System.out.println ("Enter the measurement of height");
                int k=input.nextInt();
                double b= k*h;
                System.out.println (b);
        }
                
            break;
            default:
                break;
                
                
        }
}
    }