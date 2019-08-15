/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arraylarik;

/**
 *
 * @author #root
 */
public class penjumlahanMatriks {
    public static void main(String[] args) {
    int [][] A = {{1,2},{3,4}};
    int [][] B = {{5,6},{7,8}};
    int[][] C ;
    int baris = 2 , kolom = 2;
    C = new int [baris][kolom] ;
    System.out.println("Matriks A");
    for (int b = 0 ; b < 2 ; b++){
      for (int k=0 ; k< 2 ; k++){
        A [b][k] = A [b][k];
        System.out.print(A [b][k]+" ");
      }
      System.out.println();
    }
    System.out.println("Matriks B");
    for (int b = 0 ; b < 2 ; b++){
      for (int k=0 ; k< 2 ; k++){
        B [b][k] = B [b][k];
        System.out.print(B [b][k]+" ");
      }
      System.out.println();
    }
    System.out.println("Hasil penjumlahan matriks = ");
    for (int b = 0 ; b< 2 ; b++){
      for (int k = 0 ; k< 2 ; k++){
        C [b][k] = A[b][k]+B[b][k];
        System.out.print(C[b][k]+" ");
      }
      System.out.println();
    }
}    
}
