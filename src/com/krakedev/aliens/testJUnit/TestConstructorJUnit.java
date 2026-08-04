package com.krakedev.aliens.testJUnit;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import com.krakedev.aliens.Alien;

public class TestConstructorJUnit {

	// Verifica que un tamaño válido se asigne correctamente
	@Test
	public void testTamanioValido() {
		Alien alien = new Alien(15, "Verde");

		assertEquals(15, alien.getTamanio());
		assertEquals("Verde", alien.getColor());
	}

	// Verifica que un tamaño menor al mínimo se ajuste a 5
	@Test
	public void testTamanioMenorAlMinimo() {
		Alien alien = new Alien(3, "Azul");

		assertEquals(5, alien.getTamanio());
	}

	// Verifica que un tamaño mayor al máximo se ajuste a 30
	@Test
	public void testTamanioMayorAlMaximo() {
		Alien alien = new Alien(40, "Rojo");

		assertEquals(30, alien.getTamanio());
	}

	// Verifica el cálculo de precios para un tamaño válido
	@Test
	public void testCalculoPrecios() {
		Alien alien = new Alien(20, "Morado");

		assertEquals(4.0, alien.getPrecioCuerpo(), 0.001);
		assertEquals(2.0, alien.getPrecioExtremidad(), 0.001);
		assertEquals(1.0, alien.getPrecioOjo(), 0.001);
		assertEquals(0.0, alien.getPrecioTotal(), 0.001);
	}

}