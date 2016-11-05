/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gcd;

/**
 *
 * @author jgbabao
 */

import java.util.Scanner;
public class Gcd {
    public static void main(String[] args) {
        int num1, num2;
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Input number 1: ");
        num1 = sc.nextInt();
        System.out.print("Input number 2: ");
        num2 = sc.nextInt();
        
        System.out.println(gcd(num1, num2));
        System.out.println("Test git");
    }
    
    static int gcd(int m, int n){
        if(n==0){
            return m;
        }
        else return gcd(n, m%n);
    }
}