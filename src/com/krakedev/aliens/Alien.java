package com.krakedev.aliens;

public class Alien {
	private int tamanio;
	private String color;
	private int numeroOjos;
	private int numeroBrazos;
	private int numeroPies;

	private double precioExtremidad;
	private double precioOjo;
	private double precioCuerpo;
	private double precioTotal;

	public Alien(int tamanio, String color) {

		if (tamanio < 5) {
			this.tamanio = 5;
		} else if (tamanio > 30) {
			this.tamanio = 30;
		} else {
			this.tamanio = tamanio;
		}

		this.color = color;

		this.numeroOjos = 0;
		this.numeroBrazos = 0;
		this.numeroPies = 0;

		this.precioCuerpo = this.tamanio * 0.20;
		this.precioExtremidad = this.tamanio * 0.10;
		this.precioOjo = this.tamanio * 0.05;

		this.precioTotal = 0;
	}

	public int getTamanio() {
		return tamanio;
	}

	public String getColor() {
		return color;
	}

	public int getNumeroOjos() {
		return numeroOjos;
	}

	public int getNumeroBrazos() {
		return numeroBrazos;
	}

	public int getNumeroPies() {
		return numeroPies;
	}

	public double getPrecioExtremidad() {
		return precioExtremidad;
	}

	public double getPrecioOjo() {
		return precioOjo;
	}

	public double getPrecioCuerpo() {
		return precioCuerpo;
	}

	public double getPrecioTotal() {
		return precioTotal;
	}

	// agregar brazos
	public boolean agregarBrazos(int cantidad) {

		if (numeroBrazos + numeroPies + cantidad <= 10) {
			numeroBrazos += cantidad;
			calcularPrecioTotal();
			return true;
		} else {
			return false;
		}
	}

	// agregar piernas
	public boolean agregarPiernas(int cantidad) {

		if (numeroBrazos + numeroPies + cantidad <= 10) {
			numeroPies += cantidad;
			calcularPrecioTotal();
			return true;
		} else {
			return false;
		}
	}

	// precio total
	private void calcularPrecioTotal() {

		precioTotal = precioCuerpo + (numeroBrazos + numeroPies) * precioExtremidad + numeroOjos * precioOjo;
	}

	public void imprimir() {
		System.out.println("========== ALIEN ==========");
		System.out.println("Tamaño: " + tamanio + " cm");
		System.out.println("Color: " + color);
		System.out.println("Número de ojos: " + numeroOjos);
		System.out.println("Número de brazos: " + numeroBrazos);
		System.out.println("Número de pies: " + numeroPies);
		System.out.println("Precio del cuerpo: $" + precioCuerpo);
		System.out.println("Precio por extremidad: $" + precioExtremidad);
		System.out.println("Precio por ojo: $" + precioOjo);
		System.out.println("Precio total: $" + precioTotal);
		System.out.println("===========================");
	}
}
