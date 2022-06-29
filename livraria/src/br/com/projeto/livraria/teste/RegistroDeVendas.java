package br.com.projeto.livraria.teste;

import br.com.projeto.livraria.Autor;
import br.com.projeto.livraria.produtos.CarrinhoDeCompras;
import br.com.projeto.livraria.produtos.Ebook;
import br.com.projeto.livraria.produtos.LivroFisico;

public class RegistroDeVendas {
	public static void main(String[] args) {

		Autor autor = new Autor();
		autor.setNome("Mauricio Aniche");

		LivroFisico fisico = new LivroFisico(autor);
		fisico.setNome("Test-Driven Development");
		fisico.setValor(59.90);

		Ebook ebook = new Ebook(autor);
		ebook.setNome("Test-Driven Development");
		fisico.setValor(29.90);

		CarrinhoDeCompras carrinho = new CarrinhoDeCompras();

		carrinho.adiciona(fisico);
		carrinho.adiciona(ebook);

		System.out.println("Total " + carrinho.getTotal());

	}

}
