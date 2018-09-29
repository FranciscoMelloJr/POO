package introducaoPOO;

import javax.swing.JOptionPane;

public class PrincipalImc {
	
	public static void main(String[] args) {
		Pessoa[] v = new Pessoa[5];
		for(int i=0; i<5; i++){
			v[i] = new Pessoa();
			v[i].cadastra();
		}
		String resultado = "***RESULTADO***\n";
		for(int i = 0; i<5; i++){
			resultado += v[i].mostraImc();
		}
		JOptionPane.showMessageDialog(null, resultado);
	}

}
