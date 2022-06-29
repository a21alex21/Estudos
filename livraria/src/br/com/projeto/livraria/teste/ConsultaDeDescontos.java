package br.com.projeto.livraria.teste;

public class ConsultaDeDescontos {
	
	
	@SuppressWarnings("unused")
	public static void main(String[] args) {
	
	
		
		Double desconto = 10.0;
		if(desconto != null) {
			System.out.println("Cupom de desconto valido. ");
			System.out.println("Valor "+ desconto);
			
		}else {
			System.out.println("Esse cupom não existe. ");
		}
	}

}
