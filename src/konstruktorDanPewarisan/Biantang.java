/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package konstruktorDanPewarisan;
import konstruktorDanPewarisan.objek.burung;
import konstruktorDanPewarisan.objek.kucing;
import konstruktorDanPewarisan.objek.ular;

/**
 *
 * @author #root
 */
public class Biantang {
    public static void main(String[] args) {
        kucing obkucing= new kucing("Catty");
        ular obular= new ular("Snakey");
        burung obburung= new burung("Chucky");
            System.out.println("Nama Kucing = "+obkucing.keluaran());
            System.out.println("Nama Ular = "+obular.keluaran());
            System.out.println("Nama Burung = "+obburung.keluaran());
    }
}
