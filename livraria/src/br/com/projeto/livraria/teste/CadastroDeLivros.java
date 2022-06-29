package br.com.projeto.livraria.teste;

import br.com.projeto.livraria.Autor;
import br.com.projeto.livraria.produtos.Livro;
import br.com.projeto.livraria.produtos.LivroFisico;

public class CadastroDeLivros {
	public static void main(String[] args) {

		Autor autor = new Autor();
		autor.setNome("Alex Santos");
		autor.setEmail("alex.santos@nexus.com.br");
		autor.setCpf("123.476.789.10");

		Livro livro = new LivroFisico(autor);
		livro.setNome("Java 8 Prático");
		livro.setDescricao("Novos recursos da linguagem");
		livro.setValor(59.90);
		livro.setIsbn("Indisponível");

		livro.mostrarDetalhes();

		Autor outroAutor = new Autor();
		outroAutor.setNome("Samara Santos");
		outroAutor.setEmail("Samara.santos@nexus.com.br");
		outroAutor.setCpf("123.768.234.10");

		Livro outroLivro = new LivroFisico(outroAutor);
		outroLivro.setNome("Lógica de Programação");
		outroLivro.setDescricao("Crie seu primeiro programa");
		outroLivro.setValor(59.90);
		outroLivro.setIsbn("Não consta!");

		outroLivro.mostrarDetalhes();

		livro.setValor(59.90);
		System.out.println("Valor atual: " + livro.getValor());

		System.out.println("Para: " + livro.getAutor().getNome());
		livro.setValor(livro.getValor() - livro.getValor() * 0.1);
		System.out.println("Valor com desconto: " + livro.getValor());

	}

}
