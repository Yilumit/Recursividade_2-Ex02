package view;

import controller.DiviController;

public class Principal_Divisao {

	public static void main(String[] args) {
		DiviController cMet = new DiviController();
		int dividendo = 50;int divisor = 10;
		System.out.println("A divisao inteira de "+dividendo+" / "+divisor+" = "+cMet.divisao(dividendo, divisor, 0));

	}

}
