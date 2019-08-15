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
public class AB_beta extends AB_alpha{
    private int c = 9;
	public void info(){
		System.out.println("Dipanggil pada " + this.getClass().getName());
		System.out.println("b = " + b);
		System.out.println("c = " + c);
}
}
