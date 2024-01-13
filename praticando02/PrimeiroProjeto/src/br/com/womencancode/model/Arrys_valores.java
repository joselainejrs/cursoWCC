/**
 * 
 */
package br.com.womencancode.model;

/**
 * @author Joselaine Romao
 *
 */
public class Arrys_valores {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[]valores = new int [10];
		
		for(int i = 0; i < 10; i++) {
			valores[i] = i * 10;
		}
		
		for(int i = 0; i < 10; i++) {
			System.out.println(valores[i]);
		}
	}

}
