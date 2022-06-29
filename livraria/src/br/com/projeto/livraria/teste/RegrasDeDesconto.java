package br.com.projeto.livraria.teste;

import br.com.projeto.livraria.Autor;
import br.com.projeto.livraria.produtos.Ebook;
import br.com.projeto.livraria.produtos.Livro;
import br.com.projeto.livraria.produtos.MiniLivro;

public class RegrasDeDesconto {
	public static void main(String[] args) {

		Autor autor = new Autor();
		autor.setNome("Samara Santos");

		Livro livro = new MiniLivro(autor);
		livro.setValor(39.90);

		if (!livro.aplicaDesconto(0.3)) {
			System.out.println("Desconto no livro não pode ser maior que 30%");

		} else {
			System.out.println("Valor do livro com desconto " + livro.getValor());
		}

		Ebook ebook = new Ebook(autor);
		ebook.setValor(29.90);

		if (!ebook.aplicaDesconto(0.15)) {
			System.out.println("Desconto no ebook não pode ser maior que 15%");
		} else {
			System.out.println("Valor do ebook com desconto: " + ebook.getValor());
		}

	}

}
