package br.com.engsenai.model;

public class Circurferencia {
	
	private double raio;
	
	public void setRaio(double raio) {
		this.raio = raio;
	}
	
	public double calcularArea() {
		double area = Math.pow(raio, 2) * Math.PI;
		return area;
	}
	
	public void mostrarResultados() {
		System.out.println("===================");
		System.out.println("Resultados do Circuferencia");
		System.out.println("===================");
		System.out.println("Raio: " + raio );
		System.out.println("Área = " + String.format("%.2f", calcularArea() ));
		System.out.println("===================");
	}
}
