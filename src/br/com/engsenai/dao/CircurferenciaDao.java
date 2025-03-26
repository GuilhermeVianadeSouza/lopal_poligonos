package br.com.engsenai.dao;

import java.util.Scanner;

import br.com.engsenai.model.Circurferencia;
import br.com.engsenai.ui.Menu;

public class CircurferenciaDao {
	public static void criarCircuferencia() {
		Circurferencia circurferencia = new Circurferencia();
		
		System.out.println();
		System.out.println("Criando um objeto Circunferico...");
		System.out.print("Qual o raio da circurferencia? ");
		
		//criar um objeto scanner
		Scanner leitor = new Scanner(System.in);
		circurferencia.setRaio(leitor.nextDouble());
		circurferencia.mostrarResultados();
		
		
		Menu.retornar(leitor, "Guilherme");
		
	}

}

