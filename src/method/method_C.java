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
public class method_C {
     public float jumlah (int a, float b) 
    {
        return (a+b);
    }
 public static void main(String[] args) {
     method_C obyek=new method_C ();
     System.out.print("panggil method jumlah dengan parameter 5 dan 1.5, hasilnya =");
     System.out.println(obyek.jumlah (5, 1.5f));
     System.out.print("panggil method jumlah dengan parameter 10 dan 2.2,hasilnya =");
     System.out.println(obyek.jumlah (10, 2.2f));
}
}
