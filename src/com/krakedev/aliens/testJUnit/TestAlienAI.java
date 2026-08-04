package com.krakedev.aliens.testJUnit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.krakedev.aliens.Alien;

public class TestAlienAI {

	// Verifica que el constructor asigne correctamente un tamaño válido
	@Test
	public void testConstructorValido() {
		Alien alien = new Alien(18, "Verde");

		assertEquals(18, alien.getTamanio());
		assertEquals("Verde", alien.getColor());
	}

	// Verifica que el tamaño menor al mínimo se ajuste a 5
	@Test
	public void testTamanoMinimo() {
		Alien alien = new Alien(2, "Azul");

		assertEquals(5, alien.getTamanio());
	}

	// Verifica que el tamaño mayor al máximo se ajuste a 30
	@Test
	public void testTamanoMaximo() {
		Alien alien = new Alien(40, "Rojo");

		assertEquals(30, alien.getTamanio());
	}

	// Verifica agregar brazos correctamente
	@Test
	public void testAgregarBrazos() {
		Alien alien = new Alien(20, "Morado");

		assertTrue(alien.agregarBrazos(4));
		assertEquals(4, alien.getNumeroBrazos());
	}

	// Verifica que no se exceda el máximo de extremidades
	@Test
	public void testExcesoExtremidades() {
		Alien alien = new Alien(20, "Negro");

		alien.agregarBrazos(8);

		assertFalse(alien.agregarPiernas(3));
		assertEquals(8, alien.getNumeroBrazos());
		assertEquals(0, alien.getNumeroPies());
	}

	// Verifica agregar ojos respetando el límite
	@Test
	public void testAgregarOjos() {
		Alien alien = new Alien(25, "Gris");

		assertTrue(alien.agregarOjos(7));
		assertEquals(7, alien.getNumeroOjos());
	}

	// Verifica el cálculo del precio total
	@Test
	public void testPrecioTotal() {
		Alien alien = new Alien(20, "Verde");

		alien.agregarBrazos(4);
		alien.agregarPiernas(2);
		alien.agregarOjos(5);

		assertEquals(21.0, alien.getPrecioTotal(), 0.001);
	}
}