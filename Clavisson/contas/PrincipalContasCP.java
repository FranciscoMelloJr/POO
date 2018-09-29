package contas;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class PrincipalContasCP {
	
	private static ArrayList<Agencia> agencias = new ArrayList<Agencia>();
	private static ArrayList<Cliente> clientes = new ArrayList<Cliente>();
	private static ArrayList<Conta> contas = new ArrayList<Conta>();
	private static String menu = "1 - Cadastrar Agencias\n"
			+ "2 - cadastrar clientes\n"
			+ "3 - cadastrar C Simples\n"
			+ "4 - Cadastrar C Especial\n"
			+ "5 - Cadastrar C Universitaria\n"
			+ "6 - Deposito\n"
			+ "7 - Saque\n"
			+ "8 - Transferência\n"
			+ "9 - Listar clientes e saldos\n\n"
			+ "10 - Sair";
	
	
	public static void main(String[] args) {
		int op = 0;
		do{
			op = Integer.parseInt(JOptionPane.showInputDialog(menu));
			switch (op) {
			case 1:
				agencias.add(new Agencia());
				break;
			case 2:
				clientes.add(new Cliente());
				break;
			case 3:
				Conta contaS = new Conta();
				contaS.setAg(buscaAgencia());
				contaS.setCli(buscaCliente());
				contaS.setSaldo(0);
				contas.add(contaS);
				break;
			case 4:
				ContaEspecial contaE = new ContaEspecial();
				contaE.setAg(buscaAgencia());
				contaE.setCli(buscaCliente());
				contaE.setSaldo(0);
				contaE.setLimite(Double.parseDouble(JOptionPane.showInputDialog("Limite")));
				contas.add(contaE);
				break;
			case 5:
				ContaUniversitaria contaU = new ContaUniversitaria();
				contaU.setAg(buscaAgencia());
				contaU.setCli(buscaCliente());
				contaU.setSaldo(0);
				contas.add(contaU);
				break;
			case 6:
				double vl = Double.parseDouble(JOptionPane.showInputDialog("Valor"));
				if(buscaConta().deposito(vl))
					JOptionPane.showMessageDialog(null, "OK");
				else
					JOptionPane.showMessageDialog(null, "Falha");
				break;
			case 7:
				vl = Double.parseDouble(JOptionPane.showInputDialog("Valor"));
				if(buscaConta().saque(vl))
					JOptionPane.showMessageDialog(null, "OK");
				else
					JOptionPane.showMessageDialog(null, "Falha");
				break;
			case 8:
				vl = Double.parseDouble(JOptionPane.showInputDialog("Valor"));
				JOptionPane.showMessageDialog(null, "Conta origem");
				Conta origem =buscaConta();
				JOptionPane.showMessageDialog(null, "Conta Destino");
				Conta destino = buscaConta();
				if(origem.transferencia(vl, destino))
					JOptionPane.showMessageDialog(null, "OK");
				else
					JOptionPane.showMessageDialog(null, "Falha");
				break;
			case 9:
				JOptionPane.showMessageDialog(null, retornaTodasAsContas());
				break;
				

			}
		}while(op!=10);
	}
	
	private static Agencia buscaAgencia(){
		String cad = "Agencidas cadastradas\n\n";
		for (int i=0; i<agencias.size();i++) {
			cad +=  (i+1)+"-"+agencias.get(i)+"\n";
		}
		int op = Integer.parseInt(JOptionPane.showInputDialog(cad));
		return agencias.get(op-1);
	}
	private static Cliente buscaCliente(){
		String cad = "Clientes cadastrados\n\n";
		for (int i=0; i<clientes.size();i++) {
			cad +=  (i+1)+"-"+clientes.get(i)+"\n";
		}
		int op = Integer.parseInt(JOptionPane.showInputDialog(cad));
		return clientes.get(op-1);
	}
	private static Conta buscaConta(){
		String cad = "Contas cadastradas\n\n";
		for (int i=0; i<contas.size();i++) {
			cad +=  (i+1)+"-"+contas.get(i)+"\n";
		}
		int op = Integer.parseInt(JOptionPane.showInputDialog(cad));
		return contas.get(op-1);
	}
	
	private static String retornaTodasAsContas(){
		String dados = "Cadastros\n\n";
		for (Conta c : contas) {
			if(c instanceof ContaEspecial){
				((ContaEspecial) c).bloqueia();
			}
			dados += c+"\n";
		}
		return dados;
	}

}
