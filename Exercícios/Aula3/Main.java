package Aula3;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner r = new Scanner(System.in);
		ArrayList<Time> times = new ArrayList<Time>();
		String menu = "1 - Cadastrar Time\n" + "2 - Listar jogadores de um time\n"
				+ "3 - Verificar artilheiro campeonato\n" + "4 - Verificar time goleador\n\n" + "5 - Sair";
		int op = 0;
		do {
			System.out.println(menu);
			op = r.nextInt();
			r.nextLine();
			switch (op) {
			case 1:
				Time t = new Time();
				t.cadastra(r);
				times.add(t);
				break;
			case 2:
				System.out.println("Qual time deseja buscar?");
				String nome = r.nextLine();
				Time tt = buscaTime(times, nome);
				if (tt != null) {
					System.out.println(tt.listaJogadores());
				} else {
					System.out.println("Time não cadastrado");
				}
				break;
			case 3:
				Jogador ac = new Jogador();
				for (Time ttt : times) {
					if (ttt.artilheiroTime().gols > ac.gols) {
						ac = ttt.artilheiroTime();
					}
				}
				System.out.println(ac.mostra());
				break;
			case 4:
				Time tg = new Time();
				for (Time tttt : times) {
					if (tttt.qtGolsTime() > tg.qtGolsTime()) {
						tg = tttt;
					}
				}
				System.out.println(tg.nome);
				break;
			}
		} while (op != 5);

	}

	static Time buscaTime(ArrayList<Time> times, String nome) {
		for (Time t : times) {
			if (t.nome.equalsIgnoreCase(nome))
				return t;
		}
		return null;
	}
}
