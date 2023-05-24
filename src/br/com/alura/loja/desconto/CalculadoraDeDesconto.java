package br.com.alura.loja.desconto;

import java.math.BigDecimal;

import br.com.alura.loja.orcamento.Orcamento;

public class CalculadoraDeDesconto {
	
	public BigDecimal calcular(Orcamento orcamento) {
		Desconto cadeiaDeDesconto =	
				new DescontoParaOrcamentoComMaisDeCincoItens(
						new DescontoParaOrcamentoComValorMaiorQueQuinhentos(
								new SemDesconto()));
					
		return cadeiaDeDesconto.efutuarCalculo(orcamento);
	}

}
