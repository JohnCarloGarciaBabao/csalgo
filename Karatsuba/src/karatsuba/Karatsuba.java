/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package karatsuba;


import java.util.*;
/**
 *
 * @author jgbabao
 */
public class Karatsuba {
    public static void main(String[]args){
        Scanner i = new Scanner(System.in);
        String x;
        String y;
        int a,b,c,d;
        int ac,ad,bc,bd;
      
        int xy = 0;
        
        System.out.println("Enter X : ");
        x = i.nextLine();
        System.out.println("Enter Y : ");
        y = i.nextLine();
       // System.out.println ("x:  "+x+" y: " +y);
        a = Integer.parseInt(x.substring(0,2));
        b = Integer.parseInt(x.substring(2,4));
        c = Integer.parseInt(y.substring(0,2));
        d = Integer.parseInt(y.substring(2,4));
        
        ac = a*c;
        ad = a*d;
        bc = b*c;
        bd = b*d;
    
       
        int answer = ac*10000;
        int answer1=((ad+bc)*100);
        int  answer3= answer1+answer+bd;
        System.out.println("Answer: "+answer3);
        
    }
}