package exJogador;

import java.util.ArrayList;
import java.util.Scanner;

public class Principal {
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		ArrayList<Time> times = new ArrayList<Time>();
		String menu = "1 - Cadastrar time\n"
				+ "2 - Listar jogadores de um time\n"
				+ "3 - Verificar artilheiro campeonato\n"
				+ "4 - Verificar time goleador\n\n"
				+ "5 - Sair";
		int op = 0;
		while(op!=5){
			System.out.println(menu);
			op = s.nextInt(); s.nextLine();
			if(op==1){
				Time t = new Time();
				t.cadastra(s);
				times.add(t);
			}
			if(op==2){
				System.out.println("Qual time deseja buscar?");
				String nome = s.nextLine();
				Time t = buscaTime(times, nome);
				if(t!=null){
					System.out.println(t.listaJogadores());
				}else{
					System.out.println("Time não cadastrado");
				}
			}
			if(op==3){
				Jogador ac = new Jogador();
				for (Time t : times) {
					if(t.artilheiroTime().gols>ac.gols){
						ac = t.artilheiroTime();
					}
				}
				System.out.println(ac.mostra());
			}
			
			if(op==4){
				Time tg = new Time();
				for (Time t : times) {
					if(t.qtGolsTime()>tg.qtGolsTime()){
						tg = t;
					}
				}
				System.out.println(tg.nome);
			}
		}
	}
	
	static Time buscaTime(ArrayList<Time> times, String nome){
		for (Time t : times) {
			if(t.nome.equalsIgnoreCase(nome))
				return t;
		}
		return null;
	}

}
