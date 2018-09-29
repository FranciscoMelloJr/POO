package Aula7;

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class mainBanco {

	private static ArrayList<Cliente> listacliente = new ArrayList<Cliente>();
	private static ArrayList<Agencia> listaAgencia = new ArrayList<Agencia>();
	private static ArrayList<Conta> listaconta = new ArrayList<Conta>();

	public static void lista() {
		if ((listacliente.size() >= 1) & (listaconta.size() == 0))
			JOptionPane.showMessageDialog(null, "Necessário criar pelo menos uma conta para o cliente primeiro!");
		if ((listaconta.size() >= 1) & (listacliente.size() == 0))
			JOptionPane.showMessageDialog(null, "Necessário ter pelomenos um cliente primeiro!");
		if ((listacliente.size() >= 1) & (listaconta.size() >= 1)) {
			String l = "---------------Lista de Clientes e suas Contas/Saldo---------------\n\n";
			for (Conta acc : listaconta)
				l += (acc + "\n");
			JOptionPane.showMessageDialog(null, l);
		}
		if ((listacliente.size() == 0) & (listaconta.size() == 0))
			JOptionPane.showMessageDialog(null, "Necessário cadastrar pelo menos uma conta e um cliente!");
	}

	private static void saque() {
		if (listaconta.size() >= 1) {
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
		if (listaconta.size() >= 1) {
			Conta acc = buscaConta();
			int vl = Integer.parseInt(JOptionPane.showInputDialog("Valor para depósito: "));
			acc.deposito(acc, vl);
			JOptionPane.showMessageDialog(null, "Feito!");
		} else {
			JOptionPane.showMessageDialog(null, "Nenhuma conta encontrada!");
		}
	}

	private static Conta buscaConta() {
		String b = "Selecione uma conta: \n";
		for (int i = 0; i < listaconta.size(); i++)
			b += (i + 1) + " - " + listaconta.get(i) + " \n";
		int escolha = Integer.parseInt(JOptionPane.showInputDialog(b));
		return listaconta.get(escolha - 1);
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
			Cliente c = buscaCliente();
			Agencia a = buscaAgencia();
			listaconta.add(new Conta(a, c));
		} else {
			JOptionPane.showMessageDialog(null, "Cliente/Agencia insuficientes!");
		}
	}

	public static void main(String[] args) {

		String menu = "\n1 - Cadastrar agencia\n" + "2 - Cadastrar cliente\n" + "3 - Cadastra conta\n"
				+ "4 - Realizar saque\n" + "5 - Realizar depósito\n" + "6 - Listar clientes\n\n" + "7 - Sair";
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
				lista();
				break;
			}
		} while (op != 7);
	}
}