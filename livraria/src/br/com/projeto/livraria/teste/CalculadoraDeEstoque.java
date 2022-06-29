package br.com.projeto.livraria.teste;

public class CalculadoraDeEstoque {
	public static void main(String[] args) {
//		int numero = 4;
//		int outroNumeroIgual = numero;
//		String texto = "Eu sou uma String";
//		System.out.println(texto);

//		numero = numero + 5;
//		System.out.println(numero);
//		System.out.println(outroNumeroIgual += numero / outroNumeroIgual * numero % numero * numero + outroNumeroIgual);
//		
//		double soma = livroJava8 + livroTDD;

//		int contador = 0;

//		while (contador < 35) {
//			double valorDoLivro = 59.90;
//			soma = soma + valorDoLivro;
//			soma += valorDoLivro;
//			contador = contador + 1;
//			contador += 1;
//			contador ++;

		double soma = 0;
		for (int contador = 0; contador < 35; contador++) {
			soma += 59.90;
		}

		System.out.println("O total em estoque é: " + soma);

//		if (soma < 150) {
//			System.out.println("Seu estoque está muito baixo!");
//		}else {
//			System.out.println("Seu estoque está bom!");
//		}

		if (soma < 150) {
			System.out.println("Seu estoque esta muito baixo!");

		} else if (soma >= 2000) {
			System.out.println("Seu estoque está muito alto!");
		} else {
			System.out.println("Seu estoque está bom!");
		}
		for (int i = 0; i <= 10; i++) {
			if (i == 8) {
//				continue;
				break;
			}
			System.out.println(i);
		}

	}

}
