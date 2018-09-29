package contas;

public class Conta {
	
	protected Agencia ag;
	protected Cliente cli;
	protected double saldo;
	
	
	public boolean deposito(double vl){
		setSaldo(getSaldo()+vl);
		return true;
	}
	
	public boolean saque(double vl){
		if(getSaldo()>=vl){
			setSaldo(getSaldo()-vl);
			return true;
		}
		return false;
	}
	
	public boolean transferencia(double vl, Conta destino){
		if(getAg().getNumero()==destino.getAg().getNumero()){
			if(saque(vl)){
				if(destino.deposito(vl)){
					return true;
				}else{
					deposito(vl);
					return false;
				}
			}else{
				return false;
			}
		}
		return false;
		
	}

	public Agencia getAg() {
		return ag;
	}

	public void setAg(Agencia ag) {
		this.ag = ag;
	}

	public Cliente getCli() {
		return cli;
	}

	public void setCli(Cliente cli) {
		this.cli = cli;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	
	@Override
	public String toString() {
		return getAg()+"-"+getCli()+" R$ "+getSaldo();
	}
	

}
