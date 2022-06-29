package br.com.projeto.livraria.teste;

import br.com.projeto.livraria.Autor;
import br.com.projeto.livraria.produtos.Livro;
import br.com.projeto.livraria.produtos.LivroFisico;

public class ComparandoReferencias {

	public static void main(String[] args) {
		Autor autor = new Autor();
		autor.setNome("Alex Santos");
		autor.setEmail("alex.santos@nexus.com.br");
		autor.setCpf( "123.476.789.10");

		Autor autor2 = new Autor();
		autor2.setNome( "Alex Santos");
		autor2.setEmail( "alex.santos@nexus.com.br");
		autor2.setCpf ( "123.476.789.10");

		if (autor == autor2) {
			System.out.println("Iguais, mesmo autor!");

		}else {
			System.out.println("hein!? Porque diferentes?");
		}
		Autor autor1 = new Autor();
		autor.setNome ( "Alex Santos");
		
		Livro livro = new LivroFisico(autor1);
		livro.setAutor(autor);
		
		livro.getAutor().setNome ( "Samara!");
		
		System.out.println(autor.getNome());
	}
}
