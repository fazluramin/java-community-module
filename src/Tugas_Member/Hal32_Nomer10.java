
package Tugas_Member;

import java.util.Scanner;

public class Hal32_Nomer10 {
    public static void main (String [] args){
        String a;
        Scanner in=new Scanner(System.in);
        System.out.print("Masukkan angka(5-Digit) : ");
        a=in.next();
        
        System.out.println("Angka "+a+" merupakan penjumlahan dari : "
                        +a.substring(0, 1)+"0000+"+a.substring(1, 2)+"000+"
                        +a.substring(2, 3)+"00+"+a.substring(3, 4)+"0+"
                        +a.substring(4, 5));
        
    }
}
