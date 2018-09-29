package contas;

public class ContaEspecial extends Conta{
	
	private double limite;
	
	@Override
	public boolean saque(double vl) {
		if((getSaldo()+getLimite()) >= vl){
			setSaldo(getSaldo()-vl);
			return true;
		}
		return false;
	}

	public double getLimite() {
		return limite;
	}

	public void setLimite(double limite) {
		this.limite = limite;
	}
	
	public void bloqueia(){
		if(getSaldo()<0)
			setLimite(limite/2);
		System.out.println("Bloqueado");
	}
	
	

}
