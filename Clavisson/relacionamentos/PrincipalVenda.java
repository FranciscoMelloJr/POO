package relacionamentos;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class PrincipalVenda {
	
	private static ArrayList<Produto> produtos = new ArrayList<Produto>();
	private static ArrayList<Cliente> clientes = new ArrayList<Cliente>();
	
	private static void cadastraCliente(){
		clientes.add(new Cliente());
	}
	private static void cadastraProduto(){
		produtos.add(new Produto());
	}
	
	private static Cliente buscaCliente(){
		String l = " Selecione um cliente \n";
		for(int i=0; i<clientes.size(); i++){
			l += (i+1)+ " - " + clientes.get(i)+"\n";
		}
		int escolha = Integer.parseInt(JOptionPane.showInputDialog(l));
		return clientes.get(escolha-1);
	}
	private static Produto buscaProduto(){
		String l = " Selecione um Produto \n";
		for(int i=0; i<produtos.size(); i++){
			l += (i+1)+ " - " + produtos.get(i)+"\n";
		}
		int escolha = Integer.parseInt(JOptionPane.showInputDialog(l));
		return produtos.get(escolha-1);
	}
	
	private static void vender(){
		Venda v = new Venda();
		Cliente c =  buscaCliente();
		String op = "";
		do{
			Produto p = buscaProduto();
			int qt = Integer.parseInt(JOptionPane.showInputDialog("Qt de "+p.getNome()));
			if(v.vender(p, c, qt)){
				JOptionPane.showMessageDialog(null, "OK");
			}else{
				JOptionPane.showMessageDialog(null, "Sem estoque");
			}
			op = JOptionPane.showInputDialog("Mais produtos? (S/N)");
		}while(op.equalsIgnoreCase("S"));
	}
	
	private static void listaProdutos(){
		String r = "Produtos cadastrados\n\n";
		for (Produto p : produtos) {
			r += p +"\n";
		}
		JOptionPane.showMessageDialog(null, r);
	}
	private static void listaClientes(){
		String r = "Clientes cadastrados\n\n";
		for (Cliente c : clientes) {
			r += c +"\n";
		}
		JOptionPane.showMessageDialog(null, r);
	}
	
	
	public static void main(String[] args) {
		
		String menu = "1 - Cadastrar Clientes\n"
				+ "2 - Cadastrar Produtos\n"
				+ "3 - Realizar venda\n"
				+ "4 - Listar Clientes\n"
				+ "5 - Listar Produtos\n\n"
				+ "6 - Sair";
		int op = 0;
		do{
			op = Integer.parseInt(JOptionPane.showInputDialog(menu));
			switch (op) {
			case 1:
				cadastraCliente();
				break;
			case 2:
				cadastraProduto();
				break;
			case 3:
				vender();
				break;
			case 4:
				listaClientes();
				break;
			case 5:
				listaProdutos();
				break;
			}
		}while(op!=6);
				
		
	}

}
