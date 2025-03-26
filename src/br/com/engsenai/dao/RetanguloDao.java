package br.com.engsenai.dao;

import java.util.Scanner;

import br.com.engsenai.model.Retangulo;
import br.com.engsenai.ui.Menu;

public class RetanguloDao {
	public static void criarRetangulo() {
		Retangulo retangulo = new Retangulo();
		
		System.out.println();
		System.out.println("Criando um Rentangular...");
		System.out.println("Qual a base do Retangulo? ");
		Scanner leitor = new Scanner(System.in);
		retangulo.setBase(leitor.nextDouble());
		
		System.out.println("Qual a altura do Retangulo? ");
		retangulo.setAltura(leitor.nextDouble());
		
		retangulo.mostrarResultados();
		
		Menu.retornar(leitor, "Guilherme");
		
	}

}
