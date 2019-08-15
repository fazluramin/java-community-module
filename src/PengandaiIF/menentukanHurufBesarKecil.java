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
public class menentukanHurufBesarKecil {
    public static void main(String[] args) {
       Scanner in = new Scanner(System.in);
       int spasi = 0,
       hurufHidup = 0,
       huruf = 0;
       String kalimat1;

        System.out.print("Masukan kalimat : ");
        kalimat1 = in.nextLine();
        int panjangTeks = kalimat1.length();
        for (int i = 0; i < panjangTeks; i ++)
        {

            char kar = Character.toLowerCase(kalimat1.charAt(i));
            if (kar == 'a' || kar == 'e' || kar == 'i' || kar == 'o' || kar == 'u')
                hurufHidup ++;


            if (Character.isLetter (kar))
                huruf ++;


            if (Character.isWhitespace(kar))
                spasi ++;
        }

        System.out.println("Kalimatnya adalah : "+kalimat1);
        System.out.println("Jumlah huruf hidup = " + hurufHidup);
        System.out.println("Jumlahkonsonan = " + (huruf - hurufHidup));
        System.out.println("Jumlah spasi = " + spasi);
    }
    
}
