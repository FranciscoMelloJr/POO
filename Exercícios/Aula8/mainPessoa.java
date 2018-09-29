package Aula8;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class mainPessoa {

	public static ArrayList<Aluno> aluno = new ArrayList<Aluno>();
	public static ArrayList<Pediatra> pediatra = new ArrayList<Pediatra>();

	public static void cadastraAluno() {
		aluno.add(new Aluno());
	}

	public static void cadastraPediatra() {
		pediatra.add(new Pediatra());
	}
	
	public static void listaAluno() {
		String l = "---------------Lista de Alunos---------------\n\n";
		for (Aluno acc : aluno)
			l += (acc + "\n");
		JOptionPane.showMessageDialog(null, l);
	}
	public static void listaPediatra() {
		String l = "---------------Lista de Pediatras---------------\n\n";
		for (Pediatra acc : pediatra)
			l += (acc + "\n");
		JOptionPane.showMessageDialog(null, l);
	}	
	
	public static void main(String[] args) {

		String menu = "1 - Cadastrar Alunos "
					+ "2 - Cadastrar Pediatras"
					+ "3 - Listar todos alunos (dados completos)"
					+ "4 - Listar todos os pediatras (dados completos)"
					+ "5 - Sair";
		int op = 0;
		do {
			op = Integer.parseInt(JOptionPane.showInputDialog(menu));
			switch (op) {
			case 1:
				cadastraAluno();
				break;
			case 2:
				cadastraPediatra();
				break;
			case 3:
				listaAluno();
				break;
			case 4:
				listaPediatra();
				break;
			}
		} while (op != 5);
	}
}
