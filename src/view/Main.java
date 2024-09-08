package view;

import java.util.Scanner;

import controller.ConverteController;

public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ConverteController converteController = new ConverteController();
		int decimal = -1;
		
		while (decimal < 0 || decimal > 1000) {
			System.out.println("Digite um número entre 0 e 1000:");
			decimal = sc.nextInt();
		}
				
		String binario = converteController.decToBin(decimal);
		System.out.println(decimal + " em binário é: " + binario);
	}
}
