package contas;

public class ContaUniversitaria extends Conta{
	
	@Override
	public boolean deposito(double vl) {
		if(getSaldo()+vl<=3000)
			return super.deposito(vl);
		return false;
	}
	
	

}
