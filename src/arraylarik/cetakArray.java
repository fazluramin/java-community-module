/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arraylarik;

import java.util.Scanner;

/**
 *
 * @author #root
 */
public class cetakArray {
         public static void main(String[] args) {
         Scanner in=new Scanner(System.in);
         int nilai []=new int [5];
         System.out.println("Masukkan 5 buah data nilai");
         for (int i=0;i<5;i++)
         {
             System.out.print ("Data ke-" +(i+1)+ ": ");
             nilai [i]=in.nextInt();
         }
         System.out.print("data nilai yang dimasukkan :");
           for (int i=0;i<5;i++)
               System.out.print(" "+nilai [i]);
         }
}
