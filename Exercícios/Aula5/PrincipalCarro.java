package Aula5;

public class PrincipalCarro {
	
	public static void main(String[] args) {
		Carro c = new Carro();
		c.cadastra();
		System.out.println(c.mostraDados());
		System.out.println(c.getPlaca());
	}

}
