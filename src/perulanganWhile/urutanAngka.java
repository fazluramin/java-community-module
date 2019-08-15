/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package perulanganWhile;

/**
 *
 * @author #root
 */
public class urutanAngka {
        public static void main(String[] args) {
        int bil1 = 1;
        int bil2 = 10;
        int total =0 ;
        
        while ( bil1 <= bil2)
        {
            System.out.print(bil1+" ");
            bil1= bil1 + 1;
            
        }
        total = total +bil1;
            System.out.print(" ttl "+total);
    }
}
