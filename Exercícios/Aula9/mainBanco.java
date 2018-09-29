package Aula9;
//As transferências só podem ser feitas entre contas da mesma agência(especial normal e uni)
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class mainBanco {

	private static ArrayList<Cliente> listacliente = new ArrayList<Cliente>();
	private static ArrayList<Agencia> listaAgencia = new ArrayList<Agencia>();
	private static ArrayList<Conta> listaconta = new ArrayList<Conta>();
	private static ArrayList<ContaEspecial> listaespecial = new ArrayList<ContaEspecial>();
	private static ArrayList<ContaUniversitaria> listauniversitaria = new ArrayList<ContaUniversitaria>();

	private static void lista() {
		if ((listacliente.size() >= 1) & (listaconta.size() == 0))
			JOptionPane.showMessageDialog(null, "Necessário criar pelo menos uma conta para o cliente primeiro!");
		if ((listaconta.size() >= 1) & (listacliente.size() == 0))
			JOptionPane.showMessageDialog(null, "Necessário ter pelomenos um cliente primeiro!");
		if ((listacliente.size() >= 1) & (listaconta.size() >= 1)) {
			String l = "< Lista de Contas Normais >\n\n";
			for (Conta acc : listaconta)
				l += (acc + "\n");
				l += "\n< Lista de Contas Especiais >\n\n ";
			for (ContaEspecial acc : listaespecial)
				l += (acc + "\n");
				l += "\n< Lista de Contas Universitarias >\n\n";
			for (ContaUniversitaria acc : listauniversitaria)
				l += (acc + "\n");
			JOptionPane.showMessageDialog(null, l);
		}
		if ((listacliente.size() == 0) & (listaconta.size() == 0))
			JOptionPane.showMessageDialog(null, "Necessário cadastrar pelo menos uma conta e um cliente!");
	}

	private static void transferencia() {
		if ((listaconta.size() >= 1) | (listaespecial.size() >= 1) | (listauniversitaria.size() >= 1)) {
			JOptionPane.showMessageDialog(null, "A seguir, escolha uma conta para realizar o saque!");
			Conta saque = buscaConta();
			int vl = Integer.parseInt(JOptionPane.showInputDialog("Valor de saque para transferir: "));
			JOptionPane.showMessageDialog(null, "A seguir, escolha uma conta para realizar o depósito!");
			Conta deposito = buscaConta();
			if (saque.transferenciaI(saque, deposito, vl)) {
				if (deposito.transferenciaF(saque, deposito, vl)) {
					JOptionPane.showMessageDialog(null, "Feito!");
				} else
					JOptionPane.showMessageDialog(null, "Saldo de conta universitaria excedeu o limite!");
				} else 
					JOptionPane.showMessageDialog(null, "Impossivel realizar a transferencia!");
		}		
	}

	private static void saque() {
		if ((listaconta.size() >= 1) | (listaespecial.size() >= 1) | (listauniversitaria.size() >= 1)) {
			Conta acc = buscaConta();
			int vl = Integer.parseInt(JOptionPane.showInputDialog("Valor de saque: "));
			if (acc.saque(acc, vl)) {
				JOptionPane.showMessageDialog(null, "Feito!");
			} else {
				JOptionPane.showMessageDialog(null, "Sem saldo!");
			}
		} else {
			JOptionPane.showMessageDialog(null, "Nenhuma conta encontrada!");
		}
	}

	private static void deposito() {
		if ((listaconta.size() >= 1) | (listaespecial.size() >= 1) | (listauniversitaria.size() >= 1)) {
			Conta acc = buscaConta();
			int vl = Integer.parseInt(JOptionPane.showInputDialog("Valor para depósito: "));
			if (acc.deposito(acc, vl)) {
			JOptionPane.showMessageDialog(null, "Feito!");
			}else {
				JOptionPane.showMessageDialog(null,"Limite de conta atingido, impossivel realizar o deposito!");
			}
			} else {
			JOptionPane.showMessageDialog(null, "Nenhuma conta encontrada!");
		}
	}

	private static Conta buscaConta() {
		String b ="Selecione uma conta:\n\n"
				+ "< Contas Normais >\n";
		int i =0;
		for (i = 0; i < listaconta.size(); i++)
			b += (i + 1) + " - " + listaconta.get(i) + " \n";
		b += "\n< Contas Especiais >\n";
		for (int j = 0; j < listaespecial.size(); j++) {
			b += (i + 1) + " - " + listaespecial.get(j) + " \n";
			i++;
		}
		b += "\n< Contas Universitarias >\n";
		for (int k = 0; k < listauniversitaria.size(); k++) {
			b += (i + 1) + " - " + listauniversitaria.get(k) + " \n";
			i++;
		}
		int escolha = Integer.parseInt(JOptionPane.showInputDialog(b));
		if (escolha<=listaconta.size())
			return listaconta.get(escolha - 1);
		if ((escolha>listaconta.size()) & (escolha<=(listaespecial.size()+listaconta.size()))) {
			escolha = escolha - listaconta.size();
			return listaespecial.get(escolha - 1);
		}
		if (escolha>(listaespecial.size()+listaconta.size())) {
			escolha = escolha - (listaespecial.size()+listaconta.size());
			return listauniversitaria.get(escolha - 1);
		}
			return null;
	}

	private static Agencia buscaAgencia() {
		String b = "Selecione uma agencia: \n";
		for (int i = 0; i < listaAgencia.size(); i++)
			b += (i + 1) + " - " + listaAgencia.get(i) + " \n";
		int escolha = Integer.parseInt(JOptionPane.showInputDialog(b));
		return listaAgencia.get(escolha - 1);
	}

	private static Cliente buscaCliente() {
		String b = "Selecione um cliente: \n";
		for (int i = 0; i < listacliente.size(); i++)
			b += (i + 1) + " - " + listacliente.get(i) + " \n";
		int escolha = Integer.parseInt(JOptionPane.showInputDialog(b));
		return listacliente.get(escolha - 1);
	}

	private static void cadastraAgencia() {
		listaAgencia.add(new Agencia());
	}

	private static void cadastraCliente() {
		listacliente.add(new Cliente());
	}

	private static void cadastraConta() {
		if ((listacliente.size() >= 1) && (listaAgencia.size() >= 1)) {
			String menu = "< Tipos de Conta >\n"
						+ "1 - Conta Normal\n"
						+ "2 - Conta Especial\n"
						+ "3 - Conta Universitaria";
			int op = 0;
			op = Integer.parseInt(JOptionPane.showInputDialog(menu));
			switch (op) {
			case 1:
				Cliente c = buscaCliente();
				Agencia a = buscaAgencia();
				listaconta.add(new Conta(a, c));
				break;
			case 2:
				Cliente cc = buscaCliente();
				Agencia aa = buscaAgencia();
				listaespecial.add(new ContaEspecial(aa, cc));
				break;
			case 3:
				Cliente ccc = buscaCliente();
				Agencia aaa = buscaAgencia();
				listauniversitaria.add(new ContaUniversitaria(aaa, ccc));
				break;
			default :
				JOptionPane.showMessageDialog(null, "Opção inexistente!");
				break;
			}
		} else {
			JOptionPane.showMessageDialog(null, "Cliente/Agencia insuficientes!");
		}
	}
	
	public static void main(String[] args) {

		String menu = "\n1 - Cadastrar agencia\n" 
					+ "2 - Cadastrar cliente\n" 
					+ "3 - Cadastrar conta\n"
					+ "4 - Realizar saque\n" 
					+ "5 - Realizar depósito\n" 
					+ "6 - Realizar transferencia\n"
					+ "7 - Listar clientes\n\n" 
					+ "8 - Sair";
		int op = 0;
		do {
			op = Integer.parseInt(JOptionPane.showInputDialog(menu));
			switch (op) {
			case 1:
				cadastraAgencia();
				break;
			case 2:
				cadastraCliente();
				break;
			case 3:
				cadastraConta();
				break;
			case 4:
				saque();
				break;
			case 5:
				deposito();
				break;
			case 6:
				transferencia();
				break;
			case 7:
				lista();
				break;
			}
		} while (op != 8);
	}
}