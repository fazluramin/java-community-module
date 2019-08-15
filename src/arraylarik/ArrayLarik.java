package arraylarik;
import java.util.Scanner;
/**
 *
 * @author #root
 */
public class ArrayLarik {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int nilai [ ][ ] = new int [1][6];
        System.out.print("Masukan data : ");
        for (int i = 0 ; i < 1 ;i++) {
            for (int j = 0; j < 3; j++) {
	  System.out.print("("+ (i + 1 )+" , "+ (j+1) +")"+ " : ");
	    nilai[i][j]=in.nextInt();
                          }
	}
	System.out.println("Data nilai yang dimasukan");
	for (int i = 0; i < 2; i++){
                        for (int j = 0; j < 3; j++)
                        System.out.print(nilai[i][j]+" ");
                        System.out.println();
                 }
        }
}

