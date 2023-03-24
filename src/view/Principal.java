/*
RESUMO      : Exercicio 2, thread padrão que exibe seu número
PROGRAMADORA: Luiza Felix
DATA        : 09/03/2023
 */

package view;

import controller.TM;

public class Principal {

	public static void main(String[] args) {
		int[][] matriz = new int[3][5];
		
		for(int l = 0; l < 3; l++) {
			for(int c = 0; c < 5; c++) {
				matriz[l][c] = (int) (Math.random() * 10) + 1;
			}
		}
		
		for(int i = 0; i< 3; i++) {
			Thread thread = new TM(i, matriz[i]);
			thread.start();
		}
		
		

	}

}
