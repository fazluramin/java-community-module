/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package selectCase;

import java.util.Scanner;

/**
 *
 * @author #root
 */
public class operator {
     public static void main(String[] args) {
         Scanner masuk=new Scanner (System.in);
int pil;{
double hasil,A,B;
System.out.println("Input Nilai A: ");
A=masuk.nextDouble();
System.out.println("Input Nilai B: ");
B=masuk.nextDouble();
System.out.println("Pilihan Operator: ");
System.out.println("1. Penjumlahan");
System.out.println("2. Perkalian");
System.out.println("3. Pengurangan");
System.out.println("4. Pembagian");
System.out.println("5. Keluar");
System.out.println("Masukkan Pilihan: ");
pil=masuk.nextInt();
switch (pil){
case 1:hasil=A+B;
System.out.println("Penjumlahan A dan B= "+hasil); break;
case 2:hasil=A*B;
System.out.println("Perkalian A dan B= "+hasil); break;
case 3:hasil=A-B;
System.out.println("Pengurangan A dan B= "+hasil); break;
case 4:hasil=A/B;
System.out.println("Pembagian A dan B= "+hasil); break;
case 5: System.exit(0); break;
default: System.out.println("Pilihan Salah!!!"); break;
}
}
}
}
