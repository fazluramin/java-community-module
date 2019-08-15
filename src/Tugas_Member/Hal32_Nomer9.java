
package Tugas_Member;

import java.util.Scanner;

public class Hal32_Nomer9 {
    public static void main (String [] args){
        String a;
        Scanner in=new Scanner(System.in);
        System.out.print("Masukkan angka(5-Digit) : ");
        a=in.next();
        
        if(a.length()>5){
            System.out.print("TERMINATED, Maksimal 5-Digit");
        }
        else if(a.length()<=5){
            
            System.out.println("Angka yang ada adalah : "
                        +"\n"+a.substring(0, 1)
                        +"\n"+a.substring(1, 2)
                        +"\n"+a.substring(2, 3)
                        +"\n"+a.substring(3, 4)
                        +"\n"+a.substring(4, 5));
            int total;
            int geta=Integer.parseInt(a.substring(0, 1));
            int getb=Integer.parseInt(a.substring(1, 2));
            int getc=Integer.parseInt(a.substring(2, 3));
            int getd=Integer.parseInt(a.substring(3, 4));
            int gete=Integer.parseInt(a.substring(4, 5));
            
            total=geta+getb+getc+getd+gete;
            System.out.print("Jumlah Total= "+total);
        }
}
}
