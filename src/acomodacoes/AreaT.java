package acomodacoes;

import java.util.Scanner;

public class AreaT {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String comodos, resposta = "S";
		double largura, comprimento, areaC, areaT = 0;
		
		

		Scanner scanner = new Scanner(System.in);

		System.out.println("_____________________________");
		System.out.println("C�lculo da �rea de uma casa");
		System.out.println("_____________________________");
		System.out.println();

		while (resposta.equals("S") || resposta.equals("s")) {

			System.out.print("Qual o c�modo da casa? ");
			comodos = scanner.next();
			System.out.print("Qual a largura? ");
			largura = scanner.nextDouble();
			System.out.print("Qual o comprimento? ");
			comprimento = scanner.nextDouble();

			areaC = largura * comprimento;

			System.out.println("O c�modo " + comodos + " possui " + areaC + " metros quadrados.");

			System.out.println("Deseja calcular mais c�modos? \nDigite S para sim ou N para n�o.");
			resposta = scanner.next();

			areaT = areaT + areaC;
		}

		scanner.close();
		
		
		System.out.println("A casa possui " + areaT + " metros quadrados no total");
		
		if (resposta != "N") {
			System.out.println("Resposta inv�lida!");
		}
		
			System.out.println("* * F I M * *");


	}

}
