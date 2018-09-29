package provaPratica;

public class Filme extends Hobbie{
	
	public Filme(){
		super();
	}

	@Override
	public String toString(){
		return "Filme - "+ getNome();
	}
}
