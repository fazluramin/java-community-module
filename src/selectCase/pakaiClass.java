package selectCase;
import java.util.Scanner;
/**
 *
 * @author Hady
 */
public class pakaiClass {
    public static void main (String [] hady){
        String plat , kota;
        Scanner masuk = new Scanner(System.in);
        System.out.print("Masukan plat kendaraan : ");
        plat = masuk.next();
        switch (plat){
            case "B":
                kota = "Jakarta";
                break;
            case "D":
                kota = "Bandung";
                break;
            case "N":
                kota = "Malang";
                break;
            case "L":
                kota = "Surabaya";
                break;
            case "DH":
                kota = "Kupang";
                break;
            case "EB":
                kota = "Ende";
                break;
            case "ED":
                kota = "Waingapu";
                break;
            case "S":
                kota = "Lamongan";
                break;
            case "W":
                kota = "Sidoarjo";
                break;
            default:
                kota = "tidak ada";
        } 
        if (plat.equals(plat)){
            System.out.println("\nKendaraan berasal dari kota "+kota);
        }
    }
}
