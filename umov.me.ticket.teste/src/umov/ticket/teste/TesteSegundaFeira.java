package src.umov.ticket.teste;


import static org.junit.Assert.assertEquals;

import org.junit.Test;

import src.umov.ticket.CalculaIngreco;

public class TesteSegundaFeira {

	// Calcule os seguintes descontos para as entradas dado o preço dos ingressos:
	// Crianças: R$ 5.50
	// Estudantes: R$ 8.00
	// Idosos: R$ 6.00
	//Segunda-Feira:
    // 10% para todos(crianças, idosos, estudantes)

	@Test
	public void testeDescontoCrianca() {
		double crianca = 5.50;

		double percentual = 10;

		CalculaIngreco calculaDesconto = new CalculaIngreco();

		double resultado = calculaDesconto.calculaDescontoCrianca(crianca, percentual);

		assertEquals("Desconto de 10 % Crianças.", 0.55	, resultado, 4.95);


	}

	@Test
	public void testeDescontoIdoso() {

		double idoso = 6.00;
		double percentual = 10;

		CalculaIngreco calculaDesconto = new CalculaIngreco();

		double resultadoDescontoIdoso = calculaDesconto.calculaDescontoIdoso(idoso, percentual);

		assertEquals("Desconto de 10 % Idosos.", 0.6, resultadoDescontoIdoso, 5.40);
	}

	@Test
	public void testeDescontoEstudante() {

		double estudante = 8.00;
		double percentual = 10;

		CalculaIngreco calculaDesconto = new CalculaIngreco();

		double resultadoDescontoEstudante;

		boolean carteira = true;
		if (carteira == true) {
			double descontoCarteira = 35;

			resultadoDescontoEstudante = calculaDesconto.calculaDescontoEstudante(estudante, descontoCarteira);
			assertEquals("Desconto de 35 % Estudantes que apresentar a carteira.", 2.80, resultadoDescontoEstudante, 5.20);
		} else if (carteira != true) {
			resultadoDescontoEstudante = calculaDesconto.calculaDescontoEstudante(estudante, percentual);
			assertEquals("Desconto de 10 % Estudantes.", 0.8, resultadoDescontoEstudante, 7.20);
		}
	}
}
