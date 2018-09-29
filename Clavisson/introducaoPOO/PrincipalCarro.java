package introducaoPOO;

import javax.swing.JOptionPane;

public class PrincipalCarro {
	
	public static void main(String[] args) {
		int n = Integer.parseInt(JOptionPane.showInputDialog("Qt carros?"));
		Carro[] v = new Carro[n];
		for(int i=0; i<n; i++){
			v[i] = new Carro();
			v[i].cadastra();
		}
		String resultado = "***RESULTADO***\n";
		for(int i = 0; i<n; i++){
			resultado += v[i].mostraCarro();
		}
		JOptionPane.showMessageDialog(null, resultado);
	}

}
