package introducaoPOO;

import javax.swing.JOptionPane;

public class Imc {
	
	public static void main(String[] args) {
		
		String[] nomes = new String[5];
		double[] pesos = new double[5];
		double[] alturas = new double[5];
		
		for(int i=0; i<5; i++){
			nomes[i] = JOptionPane.showInputDialog("Digite o nome");
			pesos[i] = Double.parseDouble(JOptionPane.showInputDialog("Digite o peso"));
			alturas[i] = Double.parseDouble(JOptionPane.showInputDialog("Digite a altura"));
		}
		
		String resultado = "***RESULTADO***\n";
		for(int i = 0; i<5; i++){
			resultado += nomes[i]+" - "+
		   (pesos[i]/(alturas[i]*alturas[i]))+"\n";
		}
		JOptionPane.showMessageDialog(null, resultado);
		
	}

}
