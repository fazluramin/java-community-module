/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package konstruktorDanPewarisan;

/**
 *
 * @author #root
 */
public class segitiga_A {
    int alas= 10;
    int tinggi=6;
    int luas;
    public void cari(){
    System.out.println("alas = "+alas);
    System.out.println("tinggi = "+tinggi);
    luas=(int) (alas*tinggi*0.5);
    System.out.println("luas = "+luas);
}
}
