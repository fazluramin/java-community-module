/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PengandaiIF;

/**
 *
 * @author #root
 */
public class angkaRomawi {
    public static void main (String [] hady){
            int angka = 900;
            System.out.print ("Angka "+angka+" di konversi ke angka romawi = ");
            if (angka<1||angka>500000000){
                System.out.print("error");
            }
            else{
                while (angka>=1000){
                    System.out.print ("M");
                    angka = angka - 1000;
                }
                if (angka>=500){
                    if(angka>=900){
                        System.out.print ("CM");
                        angka = angka - 900;
                    }
                    else{
                        System.out.print ("D");
                        angka = angka - 500;
                    }
                }
                while(angka>=100){
                    if (angka>=400){
                        System.out.print ("CD");
                        angka = angka - 400;
                    }
                    else{
                        System.out.print ("C");
                        angka = angka - 100;
                    }
                }
                if (angka>=50){
                    if (angka>=90){
                        System.out.print ("XC");
                        angka = angka - 90;
                    }
                    else{
                        System.out.print ("L");
                        angka = angka - 50;
                    }
                }
                while(angka>=10){
                    if (angka>=40){
                        System.out.print("XL");
                        angka = angka - 40;
                    }
                    else{
                        System.out.print ("X");
                        angka = angka - 10;
                    }
                }
                if (angka >=5){
                    if (angka == 9){
                        System.out.print ("IX");
                        angka = angka - 9;
                    }
                    else 
                        System.out.print ("V");
                        angka = angka - 5;
                }
            }
            while(angka>=1){
                if (angka == 4){
                    System.out.print ("IV");
                    angka = angka - 4;
                }
                else
                    System.out.print ("I");
                    angka = angka - 1;
            } 
          System.out.println ();
    }
}
