/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arraylarik;

public class A {
    public static void main(String[] args) {
    int[][] angka = {{1,2},{3,4},{5,6}};
        for (int i=0;i<2;i++){
            for(int j=0;j<3;i++){
            angka[i][j]=angka[i][j]*10;
            System.out.print(angka[i][j]+" ");      
            }
        }  
    }
}
