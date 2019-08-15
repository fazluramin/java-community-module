/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package perulanganWhile;

import java.util.Scanner;

/**
 *
 * @author #root
 */
public class conter_A {
  public static void main(String[] args) {
        Scanner data = new Scanner (System.in);
        int nilai , count = 1, nilaike ,jumlah = 0;
        double rerata;
        System.out.print("Jumlah nilai : ");
        nilai = data.nextInt();
        do {
        System.out.print("Nilai Ke-"+count+"=");
        nilaike =data.nextInt();
        count++; 
        jumlah += nilaike;
        rerata =jumlah /nilai;
        } while (count<=nilai);
        System.out.println("\njumlah total= "+jumlah);
        System.out.println("Rata-Rata= "+rerata);
        
    } 
}
