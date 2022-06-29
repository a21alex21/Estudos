package br.com.projeto.livraria.teste;

import java.util.Arrays;
import java.util.List;

import br.com.projeto.livraria.Autor;
import br.com.projeto.livraria.produtos.Livro;
import br.com.projeto.livraria.produtos.LivroFisico;

public class NovidadesDoJava8 {

	public static void main(String[] args) {

		Autor autor = new Autor();
		autor.setNome("Samara Santos");

		Livro javaoo = new LivroFisico(autor);
		javaoo.setNome("Java 0.0");

		Livro java8 = new LivroFisico(autor);
		java8.setNome("Java 8  Prático");

		Livro ruby = new LivroFisico(autor);
		ruby.setNome("Livro de Ruby");

		List<Livro> livros = Arrays.asList(javaoo, java8);

		System.out.println("Minha Coleção!.");

		for (Livro livro : livros) {
			System.out.println(livro.getNome());

		}
	}

}
