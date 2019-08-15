/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package String;

/**
 *
 * @author #root
 */
public class A {
    public static void main(String[] args) {
        String teks1="Aku Cinta Java";
        String teks2="Aku Cinta Indonesia";
        String teks3="Aku Cinta UIN";
        String teks4="Aku Cinta Programming";
        String teks5="Hady Eka Saputra";
        String teks6="Aku Cinta Bahasa Pemrograman Java";
        String teks7="Aku Cinta ";
        String teks8="Bahasa Java";
        //====================================================================
        System.out.println("1   = "+teks1.length());
        System.out.println("2   = "+teks2.length());
        System.out.println("3   = "+teks3.length());
        System.out.println("4   = "+teks4.length());
        System.out.println("5   = "+teks5.substring(0,4));
        System.out.println("6   = "+teks5.length());
        //====================================================================
        System.out.println("7   = "+teks5.substring(2,teks5.length()));
        //====================================================================
        System.out.println("8   = "+teks5.charAt(0));// mulai dari nol
        System.out.println("9   = "+teks5.charAt(teks5.length()-1));
        //====================================================================
        System.out.println("10  = "+teks6.indexOf('B'));
        System.out.println("11  = "+teks6.indexOf('a'));
        System.out.println("12  = "+teks6.indexOf('g'));
        System.out.println("13  = "+teks6.indexOf(' '));
        //====================================================================
        System.out.println("14  = "+teks6.toUpperCase());
        System.out.println("15  = "+teks6.toLowerCase());
        //====================================================================
        System.out.println("16  = "+teks7+teks8);
        //====================================================================
        }
    }