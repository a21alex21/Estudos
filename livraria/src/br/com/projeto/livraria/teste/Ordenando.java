package br.com.projeto.livraria.teste;

import java.util.Arrays;
import java.util.List;

import br.com.projeto.livraria.Autor;
import br.com.projeto.livraria.produtos.Ebook;
import br.com.projeto.livraria.produtos.LivroFisico;
import br.com.projeto.livraria.produtos.Produto;

public class Ordenando {

	public static void main(String[] args) {

		Autor autor = new Autor();
		autor.setNome("Alex Santos");

		LivroFisico fisico = new LivroFisico(autor);
		fisico.setNome("Java 8 Prático");
		fisico.setValor(59.90);

		Ebook ebook = new Ebook(autor);
		ebook.setNome("Java 8 Prático");
		ebook.setValor(29.90);

		List<Produto> produtos = Arrays.asList(fisico, ebook);

		for (Produto produto : produtos) {
			System.out.println(produto.getValor());
		}
	}
}
