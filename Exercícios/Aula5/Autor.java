package Aula5;

import java.util.Scanner;

public class Autor {

	private String nome;
	private char sexo;
	private int idade;
	Scanner s = new Scanner(System.in);

	void cadastraAutor() {

		System.out.println("Nome do autor: ");
		setNome(s.nextLine());
		System.out.println("Sexo do autor: ");
		setSexo(s.next().charAt(0));
		System.out.println("Idade do autor: ");
		setIdade(s.nextInt());
		s.nextLine();

	}

	public void setNome(String nome) {
		if (nome.contains(" ")) {
			this.nome = nome;
		} else {
			System.out.println("Digite nome e sobrenome!");
			setNome(s.nextLine());
		}
	}

	public String getNome() {
		return nome;
	}

	public void setSexo(char sexo) {
		if ((sexo != 'm' & sexo != 'M' & sexo != 'F' & sexo != 'f')) {
			System.out.println("Digite um sexo valido. (M/F)");
			setSexo(s.next().charAt(0));
		} else
			this.sexo = sexo;
	}

	public char getSexo() {
		return sexo;
	}

	public void setIdade(int idade) {
		if (idade < 0) {
			System.out.println("Digite um idade válida!");
			setIdade(s.nextInt());
		} else
			this.idade = idade;
	}

	public int getIdade() {
		return idade;
	}

	public String mostraAutor() {
		return getNome() + " - Sexo> " + getSexo() + " - Idade: " + getIdade();
	}
}
