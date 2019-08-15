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
public class hurufAbjad {
        public static void main(String[] args) {
        char bil1 = 'A';
        char bil2 = 'Z';

        while ( bil1 <= bil2)
        {
            System.out.print(bil1+" ");
            bil1=(char) (bil1+1);
        }
    }
}
