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
public class piramidaSiku {
    public static void main(String[] args) {
int i=1, j;
        while (i<5) {
            j=1;
            while (j<=i) {
                System.out.print("*");
             j++;
            }
            System.out.println();
            i++;
        }
    }
    }

