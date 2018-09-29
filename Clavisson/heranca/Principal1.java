package heranca;

import java.util.ArrayList;
import java.util.Scanner;

public class Principal1 {
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		ArrayList<Aluno> alunos = new ArrayList<Aluno>();
		ArrayList<Pediatra> pediatras = new ArrayList<Pediatra>();
		String menu = "1 - Cadastrar Alunos\n"
				+ "2 - Cadastrar Pediatras\n"
				+ "3 - Listar todos os alunos\n"
				+ "4 - Listar todos os pediatras\n"
				+ "5 - Sair";
		int op = 0;
		do{
			System.out.println(menu);
			op = s.nextInt();
			s.nextLine();
			if(op==1){
				Aluno a = new Aluno();
				a.cadastra(s);
				alunos.add(a);
			}
			if(op==2){
				Pediatra p = new Pediatra();
				p.cadastra(s);
				pediatras.add(p);
			}
			if(op==3){
				String ret = "Alunos cadastrados\n\n";
				for (Aluno a : alunos) {
					ret += a + "\n";
				}
				System.out.println(ret);
			}
			if(op==4){
				String ret = "Pediatras cadastrados\n\n";
				for (Pediatra p : pediatras) {
					ret += p + "\n";
				}
				System.out.println(ret);
			}
			
		}while(op!=5);
	}

}
