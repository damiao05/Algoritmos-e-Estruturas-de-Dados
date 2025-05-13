package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import calculadora.Calculadora;

class CalculadoraTest {

	@Test
	void somaTest() {
		Calculadora calc = new Calculadora();
		assertEquals(2.0, calc.soma(1.0, 1.0), "Deve resultar 2");
	}
	
	void subtracaoTest() {
		Calculadora calc = new Calculadora();
		assertEquals(2.0, calc.subtracao(2.0, 2.0), "Deve resultar 2");
	}
	
	void multiplicacaoTest() {
		Calculadora calc = new Calculadora();
		assertEquals(4.0, calc.multipliacacao(2.0, 2.0), "Deve resultar 4");
	}
	
	void divisaoTest() {
		Calculadora calc = new Calculadora();
		assertEquals(1.0, calc.divisao(2.0, 2.0), "Deve resultar 1");
	}
	
	void potenciacaoTest() {
		Calculadora calc = new Calculadora();
		assertEquals(9.0, calc.potenciacao(3.0, 3.0), "Deve resultar 9");
	}


}
