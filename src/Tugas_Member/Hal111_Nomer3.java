
package Tugas_Member;

import java.util.Scanner;

public class Hal111_Nomer3 {
    public static void main(String [] args){
        String kar;
        
        Scanner in=new Scanner(System.in);
        System.out.print("Masukkan Karakter : ");
        kar=in.next();
       
        
        if(kar.equals("a")||kar.equals("i")||kar.equals("u")||kar.equals("e")||kar.equals("o")){
            System.out.println("Vokal");
        }
        else if(kar.equals("1")||kar.equals("2")||kar.equals("3")||kar.equals("4")||kar.equals("5")||
                kar.equals("6")||kar.equals("7")||kar.equals("8")||kar.equals("9")||kar.equals("0")){
            System.out.println("Angka");
        }
        else if(kar.equals("+")||kar.equals("-")||kar.equals("_")||kar.equals("=")||kar.equals(">")||
                kar.equals("<")||kar.equals("?")||kar.equals(".")||kar.equals(",")||kar.equals("@")||
                kar.equals("#")||kar.equals("$")||kar.equals("%")||kar.equals("^")||kar.equals("&")){
            System.out.println("Karakter Lain");
        }
        else if(kar.equals("*")){
            System.out.println("Program Selesai");
        }
        else{
            System.out.println("Karakter Lain");
        }
    }
}
