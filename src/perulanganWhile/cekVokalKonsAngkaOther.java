/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package perulanganWhile;
import java.util.Scanner;
/**
 *
 * @author #root
 */
public class cekVokalKonsAngkaOther {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String karakter;
        String a [ ]= {"1","2","3","4","5","6","7","8","9","0"};
        String vokal [ ] ={"a" , "e" , "i" , "u" , "o"};   
        String konsonan [] = {"b"};
        do {
            System.out.print("Masukan Karakter : ");
            karakter = in.next();
            if (!vokal.equals(karakter)){
                System.out.println("Vokal");    
            }
            else if(!a.equals(karakter)){
                System.out.println("Angka");
            }
            else if (konsonan.equals(karakter)){
                System.out.println("Konsonan");
            } 
            else {
                System.out.println("Karakrer laun");
            }
        }
            while (!karakter.equals("*"));
                System.out.println("Selesai");
            
        }
     
        
        
    }
