package com.krakedev.aliens.test;
import com.krakedev.aliens.Alien;
public class TestConstructores {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("----- Alien 1 -----");
		Alien alien1 = new Alien(15, "Verde");
		alien1.imprimir();

		System.out.println();

		System.out.println("----- Alien 2 -----");
		Alien alien2 = new Alien(35, "Morado");
		alien2.imprimir();

		System.out.println();

		System.out.println("----- Alien 3 -----");
		Alien alien3 = new Alien(3, "Azul");
		alien3.imprimir();
	}

}
