package heranca;

import java.util.Scanner;

public class Pediatra extends Medico {
	
	private int idadeMax;
	
	@Override
	public String toString() {
		return super.toString()+"-"+getIdadeMax();
	}

	@Override
	public void cadastra(Scanner s) {
		super.cadastra(s);
		System.out.println("Idade Máxima:");
		setIdadeMax(s.nextInt());
		s.nextLine();
	}
	
	public int getIdadeMax() {
		return idadeMax;
	}

	public void setIdadeMax(int idadeMax) {
		this.idadeMax = idadeMax;
	}
	
}
