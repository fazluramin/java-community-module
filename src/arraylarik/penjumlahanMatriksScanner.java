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
public class penjumlahanMatriksScanner {
    Scanner masuk=new Scanner(System.in);
     public void masukData(int data[][]) {
         for (int i=0;i<2;i++){
         for (int j=0;j<2;j++) {
  System.out.print("("+(i+1)+","+(j+1)+")"+":");
  data[i][j] =masuk.nextInt();
         }
         }
     }
     public int[][] tambah (int AA[][],int BB[][]) {
         int hasil [][]=new int[3][3];
         for (int i=0;i<2;i++)
             for (int j=0;j<2;j++)
                 hasil [i][j]=AA[i][j]+BB[i][j];
            return hasil;
    }
    public void tampilData (int data[][],char nama){
        for (int i=0;i<2;i++){
            for (int j=0;j<2;j++)
            System.out.print(data[i][j]+" ");
            System.out.println();
    }
      
     }
    public static void main(String args[]) {
        int A[][]=new int [2][2];
        int B[][]=new int [2][2];
        int C[][]=new int [2][2];
          penjumlahanMatriksScanner jumlah=new penjumlahanMatriksScanner();
            System.out.println("Masukkan data matriks A");
            jumlah.masukData(A);
            jumlah.tampilData(A,'A');
            System.out.println("Masukkan data matriks B");
            jumlah.masukData(B);
            jumlah.tampilData(B,'B');
            C= jumlah.tambah(A,B);
            System.out.println("hasil penjumlahan matriks A dan B adalah=");
            jumlah.tampilData(C, 'C');
    }
}
