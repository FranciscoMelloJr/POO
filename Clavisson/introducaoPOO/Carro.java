package introducaoPOO;

import javax.swing.JOptionPane;

public class Carro {
	
	String placa, modelo;
	int ano;
	
	void cadastra(){
		placa = JOptionPane.showInputDialog("PLaca:");
		modelo = JOptionPane.showInputDialog("Modelo:");
		ano = Integer.parseInt(JOptionPane.showInputDialog("Ano:"));
	}
	
	String mostraCarro(){
		if(ano >= 2016)
			return placa + " - Novo\n";
		else
			return placa + " - Velho\n";
			
	}

}
