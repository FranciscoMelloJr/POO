package heranca;

import java.util.Scanner;

public class Pessoa {
	
	protected String nome;
	protected char sexo;
	
	@Override
	public String toString() {
		return getNome()+"-"+getSexo();
	}
	
	public void cadastra(Scanner s){
		System.out.println("Nome:");
		setNome(s.nextLine());
		System.out.println("Sexo:");
		setSexo(s.nextLine().charAt(0));
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public char getSexo() {
		return sexo;
	}
	public void setSexo(char sexo) {
		this.sexo = sexo;
	}
	
	

}
