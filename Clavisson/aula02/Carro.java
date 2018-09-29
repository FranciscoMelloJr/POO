package aula02;

import java.util.Scanner;

public class Carro {
	
	String placa;
	int ano;
	
	String mostraCarro(){
		if(ano >= 2016)
			return placa + " - novo";
		else
			return placa + " - velho";
	}
	
	void cadastra(Scanner r){
		System.out.println("Placa:");
		placa = r.nextLine();
		System.out.println("Ano:");
		ano = r.nextInt();
		r.nextLine();
	}

}
