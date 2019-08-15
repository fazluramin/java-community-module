
package Tugas_Member;

import java.util.Scanner;

public class Hal58_Nomer7 {
    public Hal58_Nomer7(){
        int USD,SGD,RP,kode;
        int nominal,kursUSD,kursSGD,kursRP;
        
        Scanner in=new Scanner(System.in);
        
        System.out.print("Kurs US $ terhadap Rupiah               : ");
            USD=in.nextInt();
        System.out.print("Kurs Singapore Dollar terhadap rupiah   : ");
            SGD=in.nextInt();
        System.out.print("Kode Mata Uang yang hendak Dihitung     : ");
            kode=in.nextInt();
        switch(kode){
            case 1  :
                    System.out.print("Nominal jumlah                          : ");
                        nominal=in.nextInt();
                    kursRP=nominal*USD;
                    kursSGD=nominal+5;
                    
                    System.out.println("Nominal     : US$"+nominal+" adalah $"+kursSGD+"(Singapore) dan Rp."+kursRP);
                    break;
            case 2  :
                    System.out.print("Nominal jumlah                          : ");
                        nominal=in.nextInt();
                    kursRP=nominal*USD;
                    kursUSD=nominal-5;
                    
                    System.out.println("Nominal     :   $"+nominal+"(Singapore) adalah $"+kursUSD+" dan Rp."+kursRP);
                    break;
            case 3  :
                    System.out.print("Nominal jumlah                          : ");
                        nominal=in.nextInt();
                    kursUSD=nominal/USD;
                    kursSGD=nominal/SGD;
                    
                    System.out.println("Nominal     :   Rp."+nominal+" adalah $"+kursSGD+"(Singapore) dan US$"+kursUSD);
                    break;
            default : System.out.println("Kode yang anda masukkan Tidak tepat");
                    break;
    }
        
    }
    public static void main(String[] args){
        Hal58_Nomer7 No7=new Hal58_Nomer7();
    }
}
