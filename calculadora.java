package ucsal;

import java.util.Scanner;

public class calculadora {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double valor1 = 0, valor2 = 0, resultado;
		int operacao;
		
		System.out.println("Informe a opção desejada: "
				+ " (1) Soma"
				+ " (2) Subtracao"
				+ " (3) Mutiplicacao"
				+ " (4) Divisao"
				+ "(5) Raiz Quadrada"
				+ "(6) Potenciacao");
		operacao = input.nextInt();
		
		if (operacao == 5) {
			System.out.println("Informe o numero desejado: ");
			valor1 = input.nextDouble();
		}
		if (operacao == 6) {
			System.out.println("Informe o numero desejado: ");
			valor1 = input.nextDouble();
			System.out.println("Informe a potencia:  ");
			valor2 = input.nextDouble();
			
		}
		if (operacao != 5 && operacao != 6) {
			System.out.println("Digite o primeiro valor desejado): ");
			valor1 = input.nextDouble();
			
			System.out.println("Digite o segundo valor desejado: ");
			valor2 = input.nextDouble();
		}

	if (valor1 > 0 | valor2 > 0)
		switch (operacao) {
		case 1:
			resultado = valor1 + valor2;
			System.out.println("O resultado da soma foi "+ resultado);
			break;
		
		case 2:
			resultado = valor1 - valor2;
			System.out.println("O resultado da subtracao foi " + resultado);
			break;
			
		case 3:
			resultado = valor1 * valor2;
			System.out.println("O resultado da mutiplicacao foi " + resultado);
			break;
			
		case 4:
			resultado = valor1 / valor2;
			System.out.println("O resultado da divisao foi " + resultado);
			break;
		case 5:
			resultado = Math.sqrt(valor1);
			System.out.println("O resultado da raiz quadrada foi " + resultado);
			break;
			
		case 6: 
			resultado = Math.pow(valor1, valor2);
			System.out.println("O resultado da potenciacao foi " + resultado);
			break;
			
		default:
			System.out.println("ERRO, Repita a operação novamente");
			break;
		}
	}
}
