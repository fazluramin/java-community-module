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
public class nilaiIndex {
    public static void main(String[] args) {
        int [] tinggi;
        tinggi = new int[3];
        tinggi [0]=3;
        tinggi [1]=6;
        tinggi [2]=3;
        
        for (int i=0;i<tinggi.length;i++) {
            System.out.println("Tinggi indeks ke-" +i+" adalah " +tinggi[i]);
        }
    }
}
