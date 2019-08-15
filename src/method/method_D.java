/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package method;

/**
 *
 * @author #root
 */
public class method_D {
       public static int jumlah (int a) {
        return (a+a);
    }
     public static void main(String[] args) {
         System.out.println("Panggil method jumlah dengan parameter 5");
         System.out.println(jumlah(5));
         System.out.println("Panggil method jumlah dengan parameter 15");
         System.out.println(jumlah (15));
     }
}
