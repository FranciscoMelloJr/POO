package provaPratica;
import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Funcionario {

	private String nome;
	private int idade;
	private char sexo;
	private String departamento;
	private ArrayList<Hobbie> hobbieF = new ArrayList<Hobbie>();
	private ArrayList<Integer> vezes = new ArrayList<Integer>();
	
	@Override
	public String toString() {
		return getNome()+ " - " + getIdade() + " - " + getSexo() + " - Departamento: " + getDepartamento();
	}
	
	public void associação(Hobbie h) {
		hobbieF.add(h);	
		int qt = Integer.parseInt(JOptionPane.showInputDialog("Quantas vezes por mês ?"));
		vezes.add(qt);	
		}
	
	public Funcionario(){
		setNome(JOptionPane.showInputDialog("Nome do funcionário: "));
		setIdade(Integer.parseInt(JOptionPane.showInputDialog("Idade do funcionário: ")));
		setSexo(JOptionPane.showInputDialog("Sexo do funcionário: ").toUpperCase().charAt(0));
		setDepartamento(JOptionPane.showInputDialog("Departamento do funcionário: "));
	}

	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public char getSexo() {
		return sexo;
	}
	public void setSexo(char sexo) {
		this.sexo = sexo;
	}
	public String getDepartamento() {
		return departamento;
	}
	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}
	public ArrayList<Hobbie> getHobbieF() {
		return hobbieF;
	}
	public void setHobbieF(ArrayList<Hobbie> hobbieF) {
		this.hobbieF = hobbieF;
	}
	public ArrayList<Integer> getVezes() {
		return vezes;
	}
	public void setVezes(ArrayList<Integer> vezes) {
		this.vezes = vezes;
	}
}
