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
		System.out.println("Valor com casas decimais: " + valor);
		
		int valorComCast = (int) valor;
		System.out.println("Valor inteiro: " + valorComCast);
		
		int valor2 = 10;
		double valor2ComCast = (double) valor2;
		System.out.println("Novo: " + valor2 + " Convertido: " + valor2ComCast);
		
	}

}
 
/*Criar um projeto capaz de:
obter o valor de um produto, sendo que o mesmo deve ter até 02 casas decimais. (Digite o valor do produto: xx.xx)
converter este valor para o tipo int e exibir o resultado como:
Valor com casas decimais: xx,xx | Valor inteiro: xx 
converter o valor 10 (int) para double de forma implícita. E exibir: 
Novo: xx | Convertido: xx
converter o valor 10 (double) para int de forma implícita.
*/