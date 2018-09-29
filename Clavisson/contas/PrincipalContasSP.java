package contas;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class PrincipalContasSP {
	
	private static ArrayList<Agencia> agencias = new ArrayList<Agencia>();
	private static ArrayList<Cliente> clientes = new ArrayList<Cliente>();
	private static ArrayList<Conta> cSimples = new ArrayList<Conta>();
	private static ArrayList<ContaEspecial> cEspecial = new ArrayList<ContaEspecial>();
	private static ArrayList<ContaUniversitaria> cUniversitaria = new ArrayList<ContaUniversitaria>();
	private static String menu = "1 - Cadastrar Agencias\n"
			+ "2 - cadastrar clientes\n"
			+ "3 - cadastrar C Simples\n"
			+ "4 - Cadastrar C Especial\n"
			+ "5 - Cadastrar C Universitaria\n"
			+ "6 - Deposito C Cimples\n"
			+ "7 - Depósito C Especial\n"
			+ "8 - Depósito C Universitaria\n"
			+ "9 - Saque C Cimples\n"
			+ "10 - Saque C Especial\n"
			+ "11 - Saque C Universitaria\n"
			+ "12 - Transf. C Cimples\n"
			+ "13 - Transf. C Especial\n"
			+ "14 - Transf. C Universitaria\n"
			+ "15 - Listar clientes e saldos\n\n"
			+ "16 - Sair";
	
	
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
				cSimples.add(contaS);
				break;
			case 4:
				ContaEspecial contaE = new ContaEspecial();
				contaE.setAg(buscaAgencia());
				contaE.setCli(buscaCliente());
				contaE.setLimite(Double.parseDouble(JOptionPane.showInputDialog("Limite")));
				contaE.setSaldo(0);
				cEspecial.add(contaE);
				break;
			case 5:
				ContaUniversitaria contaU = new ContaUniversitaria();
				contaU.setAg(buscaAgencia());
				contaU.setCli(buscaCliente());
				contaU.setSaldo(0);
				cUniversitaria.add(contaU);
				break;
			case 6:
				double vl = Double.parseDouble(JOptionPane.showInputDialog("Valor"));
				if(buscaCSimples().deposito(vl))
					JOptionPane.showMessageDialog(null, "OK");
				else
					JOptionPane.showMessageDialog(null, "Falha");
				break;
			case 7:
				vl = Double.parseDouble(JOptionPane.showInputDialog("Valor"));
				if(buscaCEspecial().deposito(vl))
					JOptionPane.showMessageDialog(null, "OK");
				else
					JOptionPane.showMessageDialog(null, "Falha");
				break;
			case 8:
				vl = Double.parseDouble(JOptionPane.showInputDialog("Valor"));
				if(buscaCUniversitaria().deposito(vl))
					JOptionPane.showMessageDialog(null, "OK");
				else
					JOptionPane.showMessageDialog(null, "Falha");
				break;
			case 9:
				vl = Double.parseDouble(JOptionPane.showInputDialog("Valor"));
				if(buscaCSimples().saque(vl))
					JOptionPane.showMessageDialog(null, "OK");
				else
					JOptionPane.showMessageDialog(null, "Falha");
				break;
			case 10:
				vl = Double.parseDouble(JOptionPane.showInputDialog("Valor"));
				if(buscaCEspecial().saque(vl))
					JOptionPane.showMessageDialog(null, "OK");
				else
					JOptionPane.showMessageDialog(null, "Falha");
				break;
			case 11:
				vl = Double.parseDouble(JOptionPane.showInputDialog("Valor"));
				if(buscaCUniversitaria().saque(vl))
					JOptionPane.showMessageDialog(null, "OK");
				else
					JOptionPane.showMessageDialog(null, "Falha");
				break;
			case 12:
				vl = Double.parseDouble(JOptionPane.showInputDialog("Valor"));
				JOptionPane.showMessageDialog(null, "Conta origem");
				Conta origem = buscaCSimples();
				JOptionPane.showMessageDialog(null, "Conta Destino");
				Conta destino = buscaCSimples();
				if(origem.transferencia(vl, destino))
					JOptionPane.showMessageDialog(null, "OK");
				else
					JOptionPane.showMessageDialog(null, "Falha");
				break;
			case 13:
				vl = Double.parseDouble(JOptionPane.showInputDialog("Valor"));
				JOptionPane.showMessageDialog(null, "Conta origem");
				ContaEspecial origemE = buscaCEspecial();
				JOptionPane.showMessageDialog(null, "Conta Destino");
				ContaEspecial destinoE = buscaCEspecial();
				if(origemE.transferencia(vl, destinoE))
					JOptionPane.showMessageDialog(null, "OK");
				else
					JOptionPane.showMessageDialog(null, "Falha");
				break;
			case 14:
				vl = Double.parseDouble(JOptionPane.showInputDialog("Valor"));
				JOptionPane.showMessageDialog(null, "Conta origem");
				ContaUniversitaria origemU = buscaCUniversitaria();
				JOptionPane.showMessageDialog(null, "Conta Destino");
				ContaUniversitaria destinoU = buscaCUniversitaria();
				if(origemU.transferencia(vl, destinoU))
					JOptionPane.showMessageDialog(null, "OK");
				else
					JOptionPane.showMessageDialog(null, "Falha");
				break;
			case 15:
				JOptionPane.showMessageDialog(null, retornaTodasAsContas());
				break;
				

			}
		}while(op!=16);
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
	private static Conta buscaCSimples(){
		String cad = "Contas Simples cadastradas\n\n";
		for (int i=0; i<cSimples.size();i++) {
			cad +=  (i+1)+"-"+cSimples.get(i)+"\n";
		}
		int op = Integer.parseInt(JOptionPane.showInputDialog(cad));
		return cSimples.get(op-1);
	}
	private static ContaEspecial buscaCEspecial(){
		String cad = "Contas Especiais cadastradas\n\n";
		for (int i=0; i<cEspecial.size();i++) {
			cad +=  (i+1)+"-"+cEspecial.get(i)+"\n";
		}
		int op = Integer.parseInt(JOptionPane.showInputDialog(cad));
		return cEspecial.get(op-1);
	}
	private static ContaUniversitaria buscaCUniversitaria(){
		String cad = "Contas Especiais cadastradas\n\n";
		for (int i=0; i<cUniversitaria.size();i++) {
			cad +=  (i+1)+"-"+cUniversitaria.get(i)+"\n";
		}
		int op = Integer.parseInt(JOptionPane.showInputDialog(cad));
		return cUniversitaria.get(op-1);
	}
	
	private static String retornaTodasAsContas(){
		String dados = "Cadastros\n\n";
		for (Conta c : cSimples) {
			dados += c+"\n";
		}
		for (ContaEspecial c : cEspecial) {
			dados += c+"\n";
		}
		for (ContaUniversitaria c : cUniversitaria) {
			dados += c+"\n";
		}
		return  dados;
	}

}
