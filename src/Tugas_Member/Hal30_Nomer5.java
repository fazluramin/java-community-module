
package Tugas_Member;

import java.util.Scanner;

public class Hal30_Nomer5 {
    public static void main (String [] args){
        double c;
        double f,r,k;
        
        System.out.print("Masukkan Besaran Suhu: ");
        Scanner in=new Scanner(System.in);
        c=in.nextDouble();
        
        f=(1.8*c)+32;
        r=(0.8*c);
        k=c+273.15;
        
        System.out.println(c+" Celcius = "+f+" Fahrenheit");
        System.out.println(c+" Celcius = "+r+" Reamur");
        System.out.println(c+" Celcius = "+k+" Kelvin");
    }
    
}
