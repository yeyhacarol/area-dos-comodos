package acomodacoes;

import java.util.Scanner;

public class AreaT {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String comodos, resposta = "S";
		double largura, comprimento, areaC, areaT = 0;
		
		

		Scanner scanner = new Scanner(System.in);

		System.out.println("_____________________________");
		System.out.println("Cálculo da área de uma casa");
		System.out.println("_____________________________");
		System.out.println();

		while (resposta.equals("S") || resposta.equals("s")) {

			System.out.print("Qual o cômodo da casa? ");
			comodos = scanner.next();
			System.out.print("Qual a largura? ");
			largura = scanner.nextDouble();
			System.out.print("Qual o comprimento? ");
			comprimento = scanner.nextDouble();

			areaC = largura * comprimento;

			System.out.println("O cômodo " + comodos + " possui " + areaC + " metros quadrados.");

			System.out.println("Deseja calcular mais cômodos? \nDigite S para sim ou N para não.");
			resposta = scanner.next();

			areaT = areaT + areaC;
		}

		scanner.close();
		
		
		System.out.println("A casa possui " + areaT + " metros quadrados no total");
		
		if (resposta != "N") {
			System.out.println("Resposta inválida!");
		}
		
			System.out.println("* * F I M * *");


	}

}
