package br.com.engsenai;

import br.com.engsenai.model.Quadrado;
import br.com.engsenai.model.Retangulo;
import br.com.engsenai.model.Triangulo;

public class Resultado {

public static void main (String[] args) {
	
	Quadrado quadrado = new Quadrado();
	quadrado.setLado(5.6);
	quadrado.mostrarResultados();
	
	Retangulo retangulo = new Retangulo();
	retangulo.setBase(5);
	retangulo.setAltura(10);
	retangulo.mostrarResultados();
	
	Triangulo triangulo = new Triangulo();
	triangulo.setBase(3);
	triangulo.setAltura(8);
	triangulo.mostrarResultados();
}

}
