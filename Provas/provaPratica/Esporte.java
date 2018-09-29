package provaPratica;

public class Esporte extends Hobbie{
	
	public Esporte() {
		super();
	}

	@Override
	public String toString(){
		return "Esporte - "+ getNome();
	}
}
