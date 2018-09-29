package encapsulamento;

import java.util.Scanner;

public class Carro {
	
	private String marca, placa;
	private int ano;
	Scanner s = new Scanner(System.in);
	
	void cadastra(){
		System.out.println("Digite a marca:");
		setMarca(s.nextLine());
		System.out.println("Digite a Placa:");
		setPlaca(s.nextLine());
		System.out.println("Digite o Ano:");
		setAno(s.nextInt());
		s.nextLine();
	}
	
	String mostraDados(){
		return getMarca() + " - " + getPlaca() + " - " + getAno();
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		if(marca.length()<3){
			System.out.println("Digite a marca (mínimo 3 caracteres:");
			setMarca(s.nextLine());
		}else
			this.marca = marca;
	}

	public String getPlaca() {
		return placa.toUpperCase();
	}

	public void setPlaca(String placa) {
		if(placa.length()!=7){
			System.out.println("Digite a placa (7 caracteres:");
			setPlaca(s.nextLine());
		}else
			this.placa = placa;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		if(ano < 1980 ||  ano > 2017){
			System.out.println("Digite o ano (entre 1980 e 2017");
			setAno(s.nextInt());
			s.nextLine();
		}else
			this.ano = ano;
	}
	
	

}
