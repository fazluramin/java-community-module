/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package perulanganFor;

/**
 *
 * @author #root
 */
public class hitungMundur {
    public static void main(String[] args) {
        for (int i=0;i<=0;i++) {
        System.out.println("Nilai i="+i); }
        System.out.println("\nHitung Mundur");
        
        for (int i=10;i>0;i--) {
            System.out.println("Nilai i="+i);
        }
        System.out.println("\nNested Loop");
        for (int i=0;i<10;i++) {
            for (int j=0;j<=10;j++) {
                System.out.println("Nilai i="+i+" ;nilai j="+j);
                
        }
    
        System.out.println("\n");
        }
    }
}
