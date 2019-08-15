/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PengandaiIF;
import java.util.Scanner;
/**
 *
 * @author #root
 */
public class besarDanKecil {
    public static void main(String[] args) {
        int A , B , C , D;
        Scanner in = new Scanner(System.in);
        System.out.print("Data A : ");
        A = in.nextInt();
        System.out.print("Data B : ");
        B = in.nextInt();
        if (A > B ){
            System.out.println("Bilangan yang dimasukan : "+A+" dan " + B);
        }
        else {
            System.out.println("Bilangan yang hgfhfdimasukan : "+B+" dan " + A);
        }
        System.out.print("\n-----------------------------\n");
        System.out.print("Data C : ");
        C = in.nextInt();
        System.out.print("Data D : ");
        D = in.nextInt();
        if (C > D){
            System.out.print("Bilangan yang dimasukan : "+C+" dan " + D);
        }
        else {
            System.out.print("Bilangan yang dimasukan : "+D+" dan " + C);
        }
        
    }
}
