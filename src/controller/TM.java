/*
RESUMO      : Exercicio 2, thread de soma dos valores da linha de um vetor
PROGRAMADORA: Luiza Felix
DATA        : 09/03/2023
 */

package controller;

public class TM extends Thread {

	private int l;
	private int[][] m;

	public TM(int linha, int[][] matriz) {
		this.l = linha;
		this.m = matriz;
	}

	@Override
	public void run() {
		System.out.println("#TID" + getId() + " \n	LINHA: " + l + "\n	SOMA: " + matriz());
	}

	private int matriz() {

		int soma = 0;
		for (int i = 0; i < 5; i++) {
//			pego só a linha da matriz
			soma += m[l][i];
		}
		return soma;
	}
}
