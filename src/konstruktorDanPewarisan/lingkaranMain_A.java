/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package konstruktorDanPewarisan;

/**
 *
 * @author #root
 */
public class lingkaranMain_A {
    public static void main(String []args){
    lingkaran_A coba1, coba2;
    coba1 = new lingkaran_A(); // Linkaran coba1 = new Lingkaran();
    coba2 = new lingkaran_A(9);      
    coba1.setJari(10);
   
   
    System.out.println("Luas Lingkaran dengan jari-jari = "+coba1.jari+" adalah = " +coba1.hitungLuas());
    System.out.println("Keliling Lingkaran dengan jari-jari = "+coba1.jari+" adalah = " +coba1.hitungKeliling());
    System.out.println("");
    System.out.println("Luas Lingkaran dengan jari-jari = "+coba2.jari+" adalah = " +coba2.hitungLuas());
    System.out.println("Keliling Lingkaran dengan jari-jari = "+coba2.jari+" adalah = " +coba2.hitungKeliling());
  }
}
