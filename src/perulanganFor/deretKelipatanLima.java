/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package perulanganFor;
import java.util.Scanner;
/**
 *23
 * @author #root
 */
public class deretKelipatanLima {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int jumlah ;
        System.out.print("Masukan batas maksimal : ");
        jumlah = in.nextInt();
        System.out.print("Deret = ");
        for ( int a = 3; a <= jumlah ;a=a+5 ){
            System.out.print(" "+a);
            
        }
    }
}
