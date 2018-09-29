package Aula1;

import javax.swing.JOptionPane;

public class Exer1 {

	public static void main(String[] args) {

		int i, n = Integer.parseInt(JOptionPane.showInputDialog("Quantidade de carros: "));
		Carro vetor[] = new Carro[n];
		for (i = 0; i < n; i++) {
			vetor[i] = new Carro();
			vetor[i].cadastra();
		}
		String resultado = "---Resultado---\n";
		for (i = 0; i < n; i++) 
			resultado += vetor[i].mostraCarro();
			System.out.print(resultado);
	}
}