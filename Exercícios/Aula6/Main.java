package Aula6;

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Main {

	private static ArrayList<Cliente> listacliente = new ArrayList<Cliente>();
	private static ArrayList<Produto> listaproduto = new ArrayList<Produto>();
	
	private static void cadastraCliente () {
		listacliente.add(new Cliente());
	}
	private static void cadastraProduto () {
		listaproduto.add(new Produto());
	}
	
	private static Cliente buscaCliente() {
		String b = "Selecione um cliente: \n";
		for(int i=0;i<listacliente.size();i++)
			b += (i+1) + " - " +listacliente.get(i)+" \n";
		int escolha =  Integer.parseInt(JOptionPane.showInputDialog(b));
		return listacliente.get(escolha-1);
	}
	private static Produto buscaProduto() {
		String b = "Seleciona um produto: \n";
		for(int i=0;i<listaproduto.size();i++)
			b += (i+1) + " - " +listaproduto.get(i)+" \n";
		int escolha =  Integer.parseInt(JOptionPane.showInputDialog(b));
		return listaproduto.get(escolha-1);
	}
	
	private static void vender () {
		Venda v = new Venda();
		Cliente c = buscaCliente();
		String op = "";
		do {
			Produto p = buscaProduto();
			int qt = Integer.parseInt(JOptionPane.showInputDialog("Quantidade de "+p.getNome()));
			if (v.vender(p,c,qt)) {
				JOptionPane.showMessageDialog(null, "Feito!");
			}else{
				JOptionPane.showMessageDialog(null, "Sem estoque!");
			}
			op = JOptionPane.showInputDialog("Realizar outra venda ?(S/N)");
		}while (op.equalsIgnoreCase("S"));
		
	}	
	public static void listaProdutos() {
		String l = "-----Produtos Cadastrados-----\n\n";
		for (Produto p : listaproduto)
			l += (p+"\n");
		JOptionPane.showMessageDialog(null, l);
	}
	public static void listaClientes() {
		String l = "-----Clientes Cadastrados-----\n\n";
		for (Cliente c : listacliente)
			l += (c+"\n");
		JOptionPane.showMessageDialog(null, l);
	}

	public static void main(String[] args) {

		String menu = 	"\n1 - Cadastrar produto\n" 
					+ "2 - Cadastrar cliente\n"
					+ "3 - Realizar venda\n" 
					+ "4 - Listar produtos\n"
					+ "5 - Listar clientes\n\n"
					+ "6 - Sair";
		int op = 0;
		do {
			op= Integer.parseInt(JOptionPane.showInputDialog(menu));
			switch(op) {
			case 1:
				cadastraProduto();
				break;
			case 2:
				cadastraCliente();
				break;
			case 3:
				vender();
				break;
			case 4:
				listaProdutos();
				break;
			case 5:
				listaClientes();
				break;
			}
		}while (op!=6);
	}
}