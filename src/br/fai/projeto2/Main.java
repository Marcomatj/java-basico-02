package br.fai.projeto2;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Main app = new Main();
		app.start();
		
	}

	private void start() {
		
		double valor = 0;
		Scanner ler = new Scanner (System.in);
		System.out.println("Digite o valor do produto: ");
		valor = ler.nextDouble();
		int valorComCast = (int) valor;
		System.out.println("Valor com casas decimais: " + valor + "| Valor inteiro: " + valorComCast);
		
		int valor2 = 10;
		double valor2Convertido = valor2;
		System.out.println("Novo: " + valor2 + "| Convertido: " + valor2Convertido);
				
		
		
	}

}
