package selectCase;

/**
 *
 * @author #root
 */
public class cumaPakeCase {
 public static void main (String [] hady)    {
     String plat="N" , kota;
     switch (plat){
            case "B":
                kota = "Jakarta";
                break;
            case "D":
                kota = "Bandung";
                break;
            default:
                kota = "tidak ada";
        }
     System.out.println("berasal dari kota "+kota);
    }
}
