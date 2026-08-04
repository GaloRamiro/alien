package com.krakedev.aliens.testJUnit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.krakedev.aliens.Alien;

public class TestOjosJUnit {

	// Verifica agregar ojos en un alien pequeño
	@Test
	public void testAgregarOjosAlienPequenio() {

		Alien alien = new Alien(8, "Verde");

		boolean resultado = alien.agregarOjos(3);

		assertTrue(resultado);
		assertEquals(3, alien.getNumeroOjos());
	}

	// Verifica agregar ojos en un alien mediano
	@Test
	public void testAgregarOjosAlienMediano() {

		Alien alien = new Alien(15, "Azul");

		boolean resultado = alien.agregarOjos(5);

		assertTrue(resultado);
		assertEquals(5, alien.getNumeroOjos());
	}

	// Verifica agregar ojos en un alien grande
	@Test
	public void testAgregarOjosAlienGrande() {

		Alien alien = new Alien(28, "Rojo");

		boolean resultado = alien.agregarOjos(7);

		assertTrue(resultado);
		assertEquals(7, alien.getNumeroOjos());
	}

	// Verifica que no se puedan agregar más ojos de los permitidos
	@Test
	public void testExcesoDeOjos() {

		Alien alien = new Alien(15, "Morado");

		alien.agregarOjos(4);

		boolean resultado = alien.agregarOjos(2);

		assertFalse(resultado);
		assertEquals(4, alien.getNumeroOjos());
	}

}