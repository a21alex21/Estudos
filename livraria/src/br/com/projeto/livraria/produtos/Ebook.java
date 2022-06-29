package br.com.projeto.livraria.produtos;

import br.com.projeto.livraria.Autor;

public class Ebook extends Livro implements Promocional{

	private String waterMark;

	public Ebook(Autor autor) {
		super(autor);
	}
	@Override
	public boolean aplicaDesconto(double porcentagem) {
		if (porcentagem > 0.15) {
			return false;
		}
		System.out.println("aplicando desconto no Ebook");
		return super.aplicaDesconto(porcentagem);
	}
//		double desconto = this.getValor() * porcentagem;
//		this.setValor(this.getValor() - desconto);
//		return true;
//	}
		

	public void setWaterMark(String waterMark) {
		this.waterMark = waterMark;
	}

	public String getWaterMark() {
		return waterMark;
	}
}
