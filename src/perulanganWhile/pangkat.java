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
public class pangkat {
        public static void main(String[] args) {
        //2^4
        int bil1 = 2;
        int bil2 = 20;

        while ( bil1 <= bil2)
        {
            System.out.print(bil1+" ");
            bil1=(bil1 * 2);
        }
    }
}
