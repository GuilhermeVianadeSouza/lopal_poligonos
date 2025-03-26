package br.com.engsenai.dao;

import java.util.Scanner;

import br.com.engsenai.model.Trapezio;
import br.com.engsenai.ui.Menu;

public class TrapezioDao {
	
	public static void criarTrapezio() {
		Trapezio trapezio = new Trapezio();
		
		Scanner leitor = new Scanner(System.in);
		
		System.out.println();
		System.out.println("Criando um objeto trapézio...");
		
		System.out.println("Informe a base MAIOR: ");
		trapezio.setBaseMaior(leitor.nextDouble());
		
		System.out.println("Informe a base MENOR: ");
		trapezio.setBaseMenor(leitor.nextDouble());
		
		System.out.println("Informe a ALTURA: ");
		trapezio.setAltura(leitor.nextDouble());
		
		trapezio.mostrarResultados();
		
		Menu.retornar(leitor, "Guilherme");
	}

}
