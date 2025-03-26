package br.com.engsenai.dao;

import java.util.Scanner;

import br.com.engsenai.model.Triangulo;
import br.com.engsenai.ui.Menu;

public class TrianguloDao {
	public static void criarTriangulo() {
		Triangulo triangulo = new Triangulo();
		
		System.out.println();
		System.out.println("Criando um Triangulo...");
		System.out.println("Qual a base do Triangulo? ");
		Scanner leitor = new Scanner(System.in);
		triangulo.setBase(leitor.nextDouble());
		
		System.out.println("Qual a altura do Triangulo? ");
		triangulo.setAltura(leitor.nextDouble());
		
		triangulo.mostrarResultados();
		
		Menu.retornar(leitor, "Guilherme");
		
	}

}
