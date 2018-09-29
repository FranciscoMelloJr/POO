package Aula1;

public class IMC {

	public static void main(String[] args) {

		Pessoa vetor[] = new Pessoa[5];

		for (int i = 0; i < 5; i++) {
			vetor[i] = new Pessoa();
			vetor[i].cadastra();

		}
		String resultado = "---Resultado---\n";
		for (int i = 0; i < 5; i++) {
			resultado += vetor[i].mostraImc();
		}
		System.out.println(resultado);
	}
}