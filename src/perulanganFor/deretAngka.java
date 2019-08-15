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
public class deretAngka {
    public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int c , a;
    System.out.print("Masukan jumlah deret : ");
    a = in.nextInt();
    System.out.print("Deret = ");
    for(c=1;c<=a;c++)
       System.out.print(" " + c);
 }
}
