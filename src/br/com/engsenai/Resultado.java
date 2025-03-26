package br.com.engsenai;

import br.com.engsenai.ui.Menu;

public class Resultado {

public static void main (String[] args) {
	
//	double contador = 2;
//	while(contador <= 100) {
//		System.out.println("Senai - " + contador);
//		contador = Math.pow(contador, 3);
//	}
	Menu.mostrarMenu();
	
	System.out.println("Encerrando o aplicativo. GoodBye!");
	} 
    public static void escrever(String nome) {
    	System.out.println(nome);
    	escrever(nome);
    }
}
