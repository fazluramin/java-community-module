/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package scannerOnly;
import java.util.Scanner;

/**
 *
 * @author #root
 */
public class nilaiMhs {
        public static void main (String [] args ) {
        Scanner hady = new Scanner (System.in);
        String nama , nim;
        double tugas , quis , uts , uas , nilai ;
        double ttugas , tquis , quts ,quas , nilaikali , a, k;
        a = 0.15;
        k = 0.35 ;
        System.out.print ("Nama : ");
        nama = hady.next();
        System.out.print("Nim : ");
        nim = hady.next();
        System.out.print("Nilai Tugas :");
        tugas = hady.nextDouble();
        System.out.print("Nilai Quis :");
        quis = hady.nextDouble();
        System.out.print("Nilai UTS :");
        uts = hady.nextDouble();
        System.out.print("Nilai UAS :");
        uas = hady.nextDouble();
        ttugas = tugas * a;
        tquis = quis * a;
        quts = uts * k ;
        quas = uas * k;
        nilai = ttugas + tquis + quts + quas ;
        System.out.print("Total nilai = " +nilai);
    }
}
