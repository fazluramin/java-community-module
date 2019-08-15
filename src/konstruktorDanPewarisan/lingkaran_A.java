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
public class lingkaran_A {
   public double jari;
    public void setJari(double r){
   
        jari=r;
}

public double hitungLuas(){
    return jari*jari*3.14;
}
public double hitungKeliling(){
    return 2*jari*3.14;
}
public lingkaran_A(){
} public lingkaran_A(double r){
    jari=r;
}
}
