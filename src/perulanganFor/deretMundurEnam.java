/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package perulanganFor;
import java.util.Scanner;
/**
 *
 * @author #root
 */
public class deretMundurEnam {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a , b ;
        System.out.print("Batas Atas : ");
        a = in.nextInt();
        System.out.print("Batas Bawah :");
        b = in.nextInt();
        System.out.print("Deret : ");
        for (a = a; a>=b ; a=a-6){
            System.out.print(" "+a+",");
        }
    }
}
