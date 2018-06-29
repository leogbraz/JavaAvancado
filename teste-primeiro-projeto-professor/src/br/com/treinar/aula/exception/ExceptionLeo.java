package br.com.treinar.aula.exception;

import java.util.Scanner;

public class ExceptionLeo {

	public static void main(String[] args) {
		try {
			verificaNum();
		} catch (Exception e) {
			System.out.println("Numero digitado incompatível!");
			// e.printStackTrace();
		}
	}

	private static void verificaNum() throws Exception {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite um numero menor que 48: ");
		int num = sc.nextInt();
		sc.close();
		if (num > 48) {
			throw new Exception();
		} else
			System.out.println("Numero digitado: " + num);
	}
}
