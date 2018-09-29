package Aula9;

public class ContaUniversitaria extends Conta {

	public ContaUniversitaria(Agencia agencia, Cliente cliente) {
		super(agencia, cliente);
	}

	@Override
	public boolean deposito(Conta c, double vl) {
		if (c.getSaldo() + vl <= 3000) {
			c.setSaldo(c.getSaldo() + vl);
			return true;
		} else
			return false;
	}

	@Override
	public boolean transferenciaI(Conta saque, Conta deposito, double vl) {
		if (saque.getA().equals(deposito.getA()))
			if (saque(saque, vl))
				return true;
		return false;
	}

	@Override
	public boolean transferenciaF(Conta saque, Conta deposito, double vl) {
		if (deposito.getSaldo() + vl <= 3000) {
			deposito.setSaldo(deposito.getSaldo() + vl);
			return true;
		} else {
			saque.setSaldo(saque.getSaldo() + vl);
			return false;
		}
	}
}