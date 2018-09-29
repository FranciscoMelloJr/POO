package provaPratica;
import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Main {

	private static ArrayList<Hobbie> listaHobbie = new ArrayList<Hobbie>();
	private static ArrayList<Funcionario> listaFuncionario = new ArrayList<Funcionario>();
	
	private static void cadastraFuncionario() {
		listaFuncionario.add(new Funcionario());
	}
	
	private static Funcionario buscaFuncionario() {
		String b = "Selecione um funcionario: \n";
		for(int i=0;i<listaFuncionario.size();i++)
			b += (i+1) + " - " +listaFuncionario.get(i)+" \n";
		int escolha =  Integer.parseInt(JOptionPane.showInputDialog(b));
		return listaFuncionario.get(escolha-1);
	}
	
	private static Hobbie buscaHobbie() {
		String b = "Selecione um Hobbie: \n";
		for(int i=0;i<listaHobbie.size();i++)
			b += (i+1) + " - " +listaHobbie.get(i)+" \n";
		int escolha =  Integer.parseInt(JOptionPane.showInputDialog(b));
		return listaHobbie.get(escolha-1);
	}
	
	private static void Associar() {
		if ((listaHobbie.size()>0)&(listaFuncionario.size()>0)) {
			Funcionario f = buscaFuncionario();
			Hobbie h = buscaHobbie();
			f.associação(h);
		} else JOptionPane.showMessageDialog(null, "Hobbie/Funcionário não registrado"); 
	}
	
	private static void listarHobbie(){
		if ((listaHobbie.size()>0)&(listaFuncionario.size()>0)) {
		Funcionario f = buscaFuncionario();
		String l = "Lista dos Hobbies\n";
		for(int i=0;i<f.getHobbieF().size();i++) {
		l += f.getHobbieF().get(i)+ " ";
		l += f.getVezes().get(i)+ " vezes por mês\n";
		}
		JOptionPane.showMessageDialog(null, l);
		} else JOptionPane.showMessageDialog(null, "Hobbie/Funcionário não registrado ou associado"); 
	}

	
	private static void cadastraHobbie() {
			String menu = "< Escolha o tipo de Hobbie >\n"
				+ "1 - Esporte\n"
				+ "2 - Música\n"
				+ "3 - Filme\n"
				+ "4 - Culinária\n"
				+ "5 - Festas\n"
				+ "6 - Estudo\n"
				+ "7 - Conhecimento Intrapessoal\n"
				+ "8 - Artes\n";		
		int op = 0;
		op = Integer.parseInt(JOptionPane.showInputDialog(menu));
		switch (op) {
		case 1:
			listaHobbie.add(new Esporte());
			break;
		case 2:
			listaHobbie.add(new Musica());
			break;
		case 3:
			listaHobbie.add(new Filme());
			break;
		case 4:
			listaHobbie.add(new Culinaria());
			break;
		case 5:
			listaHobbie.add(new Festas());
			break;
		case 6:
			listaHobbie.add(new Estudo());
			break;
		case 7:
			listaHobbie.add(new CIntra());
			break;
		case 8:
			listaHobbie.add(new Artes());
			break;
		default :
			JOptionPane.showMessageDialog(null, "Opção inexistente!");
			break;
			}
	}
	
	public static void classificacao(){
		String menu = "< Escolha o tipo de Hobbie para informação >\n"
				+ "1 - Esporte\n"
				+ "2 - Música\n"
				+ "3 - Filme\n"
				+ "4 - Culinária\n"
				+ "5 - Festas\n"
				+ "6 - Estudo\n"
				+ "7 - Conhecimento Intrapessoal\n"
				+ "8 - Artes\n";		
		int op = 0;
		op = Integer.parseInt(JOptionPane.showInputDialog(menu));
		switch (op) {
		case 1:
			String a = ""; 
			for (Funcionario f : listaFuncionario) {
				for(int i=0;i<f.getHobbieF().size();i++)
				if(f.getHobbieF().get(i) instanceof Esporte)
					a+= (f+"\n");
			}
			if (a != "")
				JOptionPane.showMessageDialog(null, a);
				else JOptionPane.showMessageDialog(null, "Não há funcionarios praticantes deste hobbie");
				break;
		case 2:
			String b = ""; 
			for (Funcionario f : listaFuncionario) {
				for(int i=0;i<f.getHobbieF().size();i++)
				if(f.getHobbieF().get(i) instanceof Musica)
					b += (f+"\n");
			}
			if (b != "")
				JOptionPane.showMessageDialog(null, b);
				else JOptionPane.showMessageDialog(null, "Não há funcionarios praticantes deste hobbie");
				break;
		case 3:
			String c = ""; 
			for (Funcionario f : listaFuncionario) {
				for(int i=0;i<f.getHobbieF().size();i++)
				if(f.getHobbieF().get(i) instanceof Filme)
					c+= (f+"\n");
			}
			if (c != "")
				JOptionPane.showMessageDialog(null, c);
				else JOptionPane.showMessageDialog(null, "Não há funcionarios praticantes deste hobbie");
				break;
		case 4:
			String d = ""; 
			for (Funcionario f : listaFuncionario) {
				for(int i=0;i<f.getHobbieF().size();i++)
				if(f.getHobbieF().get(i) instanceof Culinaria)
					d+= (f+"\n");
			}
			if (d != "")
				JOptionPane.showMessageDialog(null, d);
				else JOptionPane.showMessageDialog(null, "Não há funcionarios praticantes deste hobbie");
				break;
		case 5:
			String e = ""; 
			for (Funcionario f : listaFuncionario) {
				for(int i=0;i<f.getHobbieF().size();i++)
				if(f.getHobbieF().get(i) instanceof Festas)
					e+= (f+"\n");
			}
			if (e != "")
				JOptionPane.showMessageDialog(null, e);
				else JOptionPane.showMessageDialog(null, "Não há funcionarios praticantes deste hobbie");
				break;
		case 6:
			String g = ""; 
			for (Funcionario f : listaFuncionario) {
				for(int i=0;i<f.getHobbieF().size();i++)
				if(f.getHobbieF().get(i) instanceof Estudo)
					g+= (f+"\n");
			}
			if (g != "")
				JOptionPane.showMessageDialog(null, g);
				else JOptionPane.showMessageDialog(null, "Não há funcionarios praticantes deste hobbie");
				break;
		case 7:
			String h = ""; 
			for (Funcionario f : listaFuncionario) {
				for(int i=0;i<f.getHobbieF().size();i++)
				if(f.getHobbieF().get(i) instanceof CIntra)
					h+= (f+"\n");
			}
			if (h != "")
				JOptionPane.showMessageDialog(null, h);
				else JOptionPane.showMessageDialog(null, "Não há funcionarios praticantes deste hobbie");
				break;
		case 8:
			String k = ""; 
			for (Funcionario f : listaFuncionario) {
				for(int i=0;i<f.getHobbieF().size();i++)
				if(f.getHobbieF().get(i) instanceof Artes)
					k+= (f+"\n");
			}
				if (k != "")
				JOptionPane.showMessageDialog(null, k);
				else JOptionPane.showMessageDialog(null, "Não há funcionarios praticantes deste hobbie");
				break;
		default :
			JOptionPane.showMessageDialog(null, "Opção inexistente!");
			break;
			}
		
	}
	
	public static void main(String[] args) {
	
		String menu = "\n1 - Cadastrar Hobbies\n" +
						"2 - Cadastrar Funcionários\n" +
						"3 - Assosciar Hobbie para Funcionário\n" + 
						"4 - Listar os hobbies de um funcionário\n" + 
						"5 - Listar os funcionários que praticam determinado hobbie por classificação\n\n" + 
						"6 - Sair";
		int op = 0;
		do {
			op = Integer.parseInt(JOptionPane.showInputDialog(menu));
			switch (op) {
			case 1:
				cadastraHobbie();
				break;
			case 2:
				cadastraFuncionario();
				break;
			case 3:
				Associar();
				break;
			case 4:
				listarHobbie();
				break;
			case 5:
				classificacao();
				break;	
			} 
		}while (op != 6);
		}
	}