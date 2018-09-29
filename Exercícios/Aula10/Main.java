package Aula10;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Main {

	private static ArrayList<Produto> listaProduto = new ArrayList<Produto>();
	private static ArrayList<Cliente> listaCliente = new ArrayList<Cliente>();

	private static void cadastraProduto() {
		String menu = "< Tipo de Produto >\n"
				+ "1 - Medicamento\n"
				+ "2 - Perfumaria\n"
				+ "3 - Acessorio Cirurgico";
		int op = 0;
		op = Integer.parseInt(JOptionPane.showInputDialog(menu));
		switch (op) {
		case 1:
			listaProduto.add(new Medicamento());
			break;
		case 2:
			listaProduto.add(new Perfumaria());
			break;
		case 3:	
			listaProduto.add(new AcessorioCirurgico());
			break;
		default :
			JOptionPane.showMessageDialog(null, "Opção inexistente!");
			break;
		}
	}

	private static void cadastraCliente() {
		listaCliente.add(new Cliente());
	}
	private static void venda () {
		if ((listaCliente.size()>0)&(listaProduto.size()>0)) {
		Cliente c = buscaCliente();
		int op = JOptionPane.YES_NO_OPTION;
		do {
			Produto p = buscaProduto();
			int qt = Integer.parseInt(JOptionPane.showInputDialog("Quantidade de "+p.getNome()));
			if (p.vender(c,qt)) {
				JOptionPane.showMessageDialog(null, "Feito!");
			}else{
				if(p instanceof Perfumaria) 
					if (p.getEstoque()<qt)
					JOptionPane.showMessageDialog(null, "Sem estoque!");
				else	 JOptionPane.showMessageDialog(null, "Limite de divida atingido!");
				
					if(p instanceof Medicamento)
						if(p.getEstoque()<qt) 
						JOptionPane.showMessageDialog(null, "Sem estoque!");
					else JOptionPane.showMessageDialog(null, "Receita necessária!");
			}
			op = JOptionPane.showConfirmDialog(null, "Realizar outra venda com o cliente?", "", op);
		}while (op==0);
		} else JOptionPane.showMessageDialog(null, "Cliente/Produto Insuficiente"); 
	}
	
	private static Produto buscaProduto() {
		String b = "Seleciona um produto: \n";
		for(int i=0;i<listaProduto.size();i++)
			b += (i+1) + " - " +listaProduto.get(i)+" \n";
		int escolha =  Integer.parseInt(JOptionPane.showInputDialog(b));
		return listaProduto.get(escolha-1);
	}
	
	private static Cliente buscaCliente() {
		String b = "Selecione um cliente: \n";
		for(int i=0;i<listaCliente.size();i++)
			b += (i+1) + " - " +listaCliente.get(i)+" \n";
		int escolha =  Integer.parseInt(JOptionPane.showInputDialog(b));
		return listaCliente.get(escolha-1);
	}
	
	public static void listaCliente() {
		if(listaCliente.size()>0) {
		String l = "-----Clientes Cadastrados-----\n\n";
		for (Cliente c : listaCliente)
			l += (c+"\n");
		JOptionPane.showMessageDialog(null, l);
		} else JOptionPane.showMessageDialog(null, "Nenhum cliente cadastrado!"); 
	}
	
	public static void listaProduto() {
		if(listaProduto.size()>0) {
		String l = "-----Produtos Cadastrados-----\n\n";
		for (Produto p : listaProduto)
			l += (p+"\n");
		JOptionPane.showMessageDialog(null, l);
		}else  JOptionPane.showMessageDialog(null, "Nenhum produto cadastrado!"); 
	}
	public static void main(String[] args) {

		String menu = "\n1 - Cadastrar produto\n" + "2 - Cadastrar cliente\n" + "3 - Realizar venda\n"
				+ "4 - Lista de clientes\n" + "5 - Lista de produtos\n" + "6 - Sair";
		int op = 0;
		do {
			op = Integer.parseInt(JOptionPane.showInputDialog(menu));
			switch (op) {
			case 1:
				cadastraProduto();
				break;
			case 2:
				cadastraCliente();
				break;
			case 3:
				venda();
				break;
			case 4:
				listaCliente();
				break;
			case 5:
				listaProduto();
				break;
			}
		} while (op != 6);
	}
}