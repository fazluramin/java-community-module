package Tugas_Member;

import java.util.Scanner;
public class Hal229_Nomer2 {
    public static void main(String []args){
        String teks;
        int spasi = 0,
        hurufKecil = 0,
        hurufBesar = 0;
        
        Scanner in = new Scanner(System.in);
        System.out.print("Masukan kalimat : ");
        teks = in.nextLine();
        
        int panjangTeks = teks.length();
        for (int i = 0; i < panjangTeks; i++)//memanggil panjang karakter yang diinputkan
        {
            char kar = teks.charAt(i);//Memanggil karakter huruf sebagai char
            if (kar == 'a' || kar == 'b' || kar == 'c' || kar == 'd' || kar == 'e' ||
                kar == 'f' || kar == 'g' || kar == 'h' || kar == 'i' || kar == 'j' ||
                kar == 'k' || kar == 'l' || kar == 'm' || kar == 'n' || kar == 'o' ||
                kar == 'p' || kar == 'q' || kar == 'r' || kar == 's' || kar == 't' ||
                kar == 'u' || kar == 'v' || kar == 'w' || kar == 'x' || kar == 'y' || 
                kar == 'z')
                hurufKecil ++;      //menghitung jumlah huruf
            
            if (kar == 'A' || kar == 'B' || kar == 'C' || kar == 'D' || kar == 'E' ||
                kar == 'F' || kar == 'G' || kar == 'H' || kar == 'I' || kar == 'J' ||
                kar == 'K' || kar == 'L' || kar == 'M' || kar == 'N' || kar == 'O' ||
                kar == 'P' || kar == 'Q' || kar == 'R' || kar == 'S' || kar == 'T' ||
                kar == 'U' || kar == 'V' || kar == 'W' || kar == 'X' || kar == 'Y' || 
                kar == 'Z')
                hurufBesar ++;      //menghitung jumlah huruf
        }   

        System.out.println("Kalimatnya adalah : "+teks);
        System.out.println("Jumlah huruf kecil = " + hurufKecil);
        System.out.println("Jumlah huruf besar = " + hurufBesar);
    }
    
}

 
        
