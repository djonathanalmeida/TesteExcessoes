package application;

import java.util.Scanner;

import entities.Conta;

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Informe os dados da conta");
		System.out.println("Número: ");
		Integer numero = sc.nextInt();
		System.out.println("Titular: ");
		String pessoa = sc.next();
		System.out.println("Saldo Inicial");
		Double saldo = sc.nextDouble();
		System.out.println("Limite de saque");
		Double limite = sc.nextDouble();
		
		Conta c = new Conta(numero, pessoa, saldo, limite);
		
		System.out.println("Informe uma quantia para sacar: ");
		Double valor = sc.nextDouble();
		
		try {
		c.saque(valor);
		System.out.println("Novo Saldo: " + c.getSaldo());
		
		}
		
		catch (RuntimeException e){
			System.out.println(e.getMessage());
		}
		
		sc.close();
		

	}

}
