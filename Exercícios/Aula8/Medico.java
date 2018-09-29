package Aula8;

import javax.swing.JOptionPane;

public class Medico extends Pessoa{

    protected String crm;
	
    @Override
    public String toString() {
    	return super.toString()+"CRM: "+ getCrm();
    }
    
    @Override
    public void cadastra() {
    	super.cadastra();
    	setCrm(JOptionPane.showInputDialog("CRM: "));
    }
	public String getCrm() {
		return crm;
	}
	public void setCrm(String crm) {
		this.crm = crm;
	}
}
