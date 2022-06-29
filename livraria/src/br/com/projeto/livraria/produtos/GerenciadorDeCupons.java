package br.com.projeto.livraria.produtos;

import java.util.HashMap;
import java.util.Map;

public class GerenciadorDeCupons {

	private Map<String, Double> cupons;

	public GerenciadorDeCupons() {

		this.cupons = new HashMap<>();

		cupons.put("cab11", 10.0);
		cupons.put("cab22", 12.0);
		cupons.put("cab33", 13.0);
		cupons.put("cab44", 14.0);
	}

//	public boolean validaCupom(String cupom) {
//		return this.cupons.containsKey(cupom);
//	}
//	

	public Double validaCupom(String cupom) {
		return this.cupons.get(cupom);
	}

}

//cupons.addAll(Arrays.asList("CUP74", "CUP158", "CUP14", "CUP52", "CUP21", "CUP221", "CUP91", "CUP327", "CUP410",
//"CUP275", "CUP484", "CUP207", "CUP96", "CUP119", "CUP174", "CUP291", "CUP1", "CUP115", "CUP222",
//"CUP272"));
//}
//
//public boolean validaCupom(String cupom) {
//return this.cupons.contains(cupom);
//}

//public boolean validaCupom(cupom) {
//return this.cupons.containsKey(cupom);
//}
