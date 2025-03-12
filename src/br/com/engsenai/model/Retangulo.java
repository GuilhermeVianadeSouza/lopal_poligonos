package br.com.engsenai.model;

public class Retangulo {
	
		private double base;
		private double altura;
		
		public void setBase(double base) {
			this.base = base;
		}
		
		public void setAltura(double altura) {
			this.altura = altura;
		}
		
		public double area;
		public double perimetro;
		
		public double calcularArea() {
			double area = base * altura;
			return area;
		}
		
		public double calcularPerimetro() {
			double perimetro = base + altura *2;
			return perimetro;
		}
		
		public void mostrarResultados() {
			System.out.println("===================");
			System.out.println("Resultados do Retangulo");
			System.out.println("===================");
			System.out.println("Base: " + base);
			System.out.println("Altura: " + altura);
			System.out.println("Área: " + calcularArea());
			System.out.println("Perímetro: " + calcularPerimetro());
			System.out.println("===================");
}
	}
