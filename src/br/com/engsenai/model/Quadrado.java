package br.com.engsenai.model;

public class Quadrado {
	
	private double lado;
	
	public void setLado(double lado) {
		this.lado = lado;
	}
	
	public double area;
	public double perimetro;
	
	public double calcularArea() {
		double area =  Math.pow(this.lado, 2);
		return area;
	}
	
	public double calcularPerimetro() {
		double perimetro = lado * 4;
		return perimetro;
	}
	
	public void mostrarResultados() {
		System.out.println("===================");
		System.out.println("Resultados do Quadrado");
		System.out.println("===================");
		System.out.println("Lado " + lado);
		System.out.println("Área " + calcularArea());
		System.out.println("Perímetro " + calcularPerimetro());
		System.out.println("===================");
	}
}