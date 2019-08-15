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
public class buatMatriks {
         public static void main(String[] args) {
         Scanner in=new Scanner(System.in);
         int nilai [] [] = new int[2][3];
         System.out.println("Masukkan data nilai");
         for (int i=0;i<2;i++)
         {
             for (int j=0;j<3;j++){
     System.out.print("("+(i+1)+","+(j+1)+")"+":");
             nilai [i][j]=in.nextInt();
         }
     }
     System.out.println("Data nilai yang dimasukkan");
     for (int i=0;i<2;i++){
    for (int j=0;j<3;j++)
         System.out.print(nilai [i][j]+" ");
    System.out.println();}
     }
}
