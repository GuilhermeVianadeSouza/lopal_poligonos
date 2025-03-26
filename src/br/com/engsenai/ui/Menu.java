package br.com.engsenai.ui;

import java.util.Scanner;

import br.com.engsenai.dao.CircurferenciaDao;
import br.com.engsenai.dao.QuadradoDao;
import br.com.engsenai.dao.RetanguloDao;
import br.com.engsenai.dao.TrapezioDao;
import br.com.engsenai.dao.TrianguloDao;

public class Menu {
	
	public static void mostrarMenu() {
		
		System.out.println("-------------------------------------");
		System.out.println("CALCULADORA DE POLÍGONOS");
		System.out.println("-------------------------------------");
		System.out.println("1 - Quadrado");
		System.out.println("2 - Retângulo");
		System.out.println("3 - Trapézio");
		System.out.println("4 - Circunferência");
		System.out.println("5 - Triângulo");
		System.out.println("6 - Sair");
		System.out.println("-------------------------------------");
		System.out.print("Escolha uma opção (1 - 5): ");
		
		Scanner leitor = new Scanner(System.in);
		
		int opcao = leitor.nextInt();
		
		if (opcao == 1) {
			QuadradoDao.criarQuadrado();
		} else if (opcao == 3) {
			TrapezioDao.criarTrapezio();
		} else if (opcao == 2) {
			RetanguloDao.criarRetangulo();
		} else if (opcao == 4) {
			CircurferenciaDao.criarCircuferencia();
		} else if (opcao == 5) {
			TrianguloDao.criarTriangulo();
		} else {
			System.out.println("Essa opção não foi implementada ainda.");
		}
		
	}
	
	public static void retornar(Scanner leitor, String nome) {
		String resposta = "";

		
		while (!resposta.equals("c") || !resposta.equals("S")) {
			System.out.println(nome + ", digite C para continuar ou S para sair... ");
		    resposta = leitor.next();
		}
		
		if (resposta.equalsIgnoreCase("c")) {
		Menu.mostrarMenu();
		}
		else if (resposta.equalsIgnoreCase("s")) {
			System.out.println("Esconda seus objetos valiosos");
			leitor.close();
		}
	}

}
