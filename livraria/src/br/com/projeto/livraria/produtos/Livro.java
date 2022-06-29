package br.com.projeto.livraria.produtos;

import br.com.projeto.exception.AutorNuloException;
import br.com.projeto.livraria.Autor;

public abstract class Livro implements Produto {

	private String nome;
	private String descricao;
	private double valor;
	private String isbn;
	private Autor autor;
//	private boolean impresso;

	public Livro(Autor autor) {

		if (autor == null) {
			throw new AutorNuloException("O Autor do Livro não pode ser nulo");
		}

		this.autor = autor;
		this.isbn = "000-00-00000-00-0";
//		this.setImpresso(true);
	}

	public boolean aplicaDesconto(double porcentagem) {
		return false;
	}

	public Livro() {
		// TODO Auto-generated constructor stub
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public Autor getAutor() {
		return autor;
	}

	public void setAutor(Autor autor) {
		this.autor = autor;
	}

	private String desconto;

	public void mostrarDetalhes() {
		System.out.println("Mostrando detalhes do livro");
		System.out.println("Nome: " + nome);
		System.out.println("Descricao: " + descricao);
		System.out.println("Valor: " + valor);
		System.out.println("ISBN: " + isbn);
		autor.mostrarDetalhes();
		System.out.println("--");

		if (this.temAutor()) {
			autor.mostrarDetalhes();
			System.out.println("--");
		}

	}

	boolean temAutor() {
		return this.autor != null;
	}

	public String getDesconto() {
		return desconto;
	}

	public void setDesconto(String desconto) {
		this.desconto = desconto;
	}

	void adicionaValor(double valor) {
		this.valor = valor;

	}

	double retornaValor() {
		return this.valor;
	}

	public String setValor() {

		return null;
	}
	
	@Override
	public int compareTo(Produto outro) {
		
		if (this.getValor() < outro.getValor()) {
			return -1;
		}
		if (this.getValor() > outro.getValor()) {
			return 1;
		}
		return 0;
	}

}
