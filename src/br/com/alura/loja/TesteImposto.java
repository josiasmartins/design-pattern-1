package br.com.alura.loja;

import java.math.BigDecimal;

import br.com.alura.loja.desconto.CalculadoraDeDesconto;
import br.com.alura.loja.imposto.CalculadoraDeImposto;
import br.com.alura.loja.imposto.ICMS;
import br.com.alura.loja.imposto.ISS;
import br.com.alura.loja.imposto.Imposto;
import br.com.alura.loja.orcamento.Orcamento;

public class TesteImposto {
	
	public static void main(String[] args) {
		Orcamento orcamento = new Orcamento(new BigDecimal("100"), 4);
		
		CalculadoraDeImposto calculadora = new CalculadoraDeImposto();
		System.out.println(calculadora.calcular(orcamento, new ICMS()));
	}

}
