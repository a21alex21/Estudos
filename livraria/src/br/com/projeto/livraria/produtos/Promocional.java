package br.com.projeto.livraria.produtos;
@FunctionalInterface
public interface Promocional {
	
	boolean aplicaDesconto(double porcentagem);
//	boolean naoSouMaisUmaIterfaceFuncional();
	
	default boolean aplicaDescontoDe10Porcento() {
	return aplicaDesconto(0.1);
	
	}
}
