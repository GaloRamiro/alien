package com.krakedev.aliens.testJUnit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.krakedev.aliens.Alien;

public class TestExtremidadesJUnit {

	// Agregar brazos correctamente
	@Test
	public void testAgregarBrazos() {

		Alien alien = new Alien(20, "Verde");

		boolean resultado = alien.agregarBrazos(4);

		assertTrue(resultado);
		assertEquals(4, alien.getNumeroBrazos());
	}

	// Agregar piernas correctamente
	@Test
	public void testAgregarPiernas() {

		Alien alien = new Alien(20, "Rojo");

		boolean resultado = alien.agregarPiernas(3);

		assertTrue(resultado);
		assertEquals(3, alien.getNumeroPies());
	}

	// Llegar exactamente al límite permitido
	@Test
	public void testLimiteExactoExtremidades() {

		Alien alien = new Alien(15, "Azul");

		alien.agregarBrazos(6);

		boolean resultado = alien.agregarPiernas(4);

		assertTrue(resultado);
		assertEquals(6, alien.getNumeroBrazos());
		assertEquals(4, alien.getNumeroPies());
	}

	// Exceder el límite de extremidades
	@Test
	public void testExcesoExtremidades() {

		Alien alien = new Alien(15, "Morado");

		alien.agregarBrazos(8);

		boolean resultado = alien.agregarPiernas(3);

		assertFalse(resultado);
		assertEquals(8, alien.getNumeroBrazos());
		assertEquals(0, alien.getNumeroPies());
	}

}