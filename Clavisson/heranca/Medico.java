package heranca;

import java.util.Scanner;

public class Medico extends Pessoa{
	protected String crm;
	
	@Override
	public String toString() {
		return super.toString()+"-"+getCrm();
	}
	
	@Override
	public void cadastra(Scanner s) {
		super.cadastra(s);
		System.out.println("CRM");
		setCrm(s.nextLine());
	}

	public String getCrm() {
		return crm;
	}

	public void setCrm(String crm) {
		this.crm = crm;
	}
	
	
}
