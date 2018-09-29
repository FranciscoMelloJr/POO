package contas;

import javax.swing.JOptionPane;

public class Agencia {
	
	private int numero;
	private String cidade;
	private String bairro;
	
	public Agencia(){
		cadastra();
	}
	
	public void cadastra(){
		setNumero(Integer.parseInt(JOptionPane.showInputDialog("Nr. da agencia")));
		setCidade(JOptionPane.showInputDialog("Cidade"));
		setBairro(JOptionPane.showInputDialog("Bairro"));
	}
	
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public String getCidade() {
		return cidade;
	}
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
	public String getBairro() {
		return bairro;
	}
	public void setBairro(String bairro) {
		this.bairro = bairro;
	}
	
	@Override
	public String toString() {
		return getCidade()+" ("+getBairro()+")";
	}

}
