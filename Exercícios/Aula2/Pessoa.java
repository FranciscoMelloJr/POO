package Aula2;

import java.util.Scanner;

public class Pessoa {

	String nome;
	int idade;
	char sexo;
	Carro c = new Carro();

	String mostraPessoa(){
		return nome+"-"+idade+"-"+sexo+"-"+c.mostraCarro();
	}

	void cadastra(Scanner r){
		System.out.println("Nome: ");
		nome = r.nextLine();
		System.out.println("Idade: ");
		idade = r.nextInt();
		System.out.println("Sexo");
		sexo = r.next().charAt(0);
		r.nextLine();
		c.cadastra(r);
	}
}