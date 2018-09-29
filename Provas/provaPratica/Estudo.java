package provaPratica;

public class Estudo extends Hobbie {

	public Estudo(){
		super();
	}
	
	@Override
	public String toString(){
		return "Estudo - "+ getNome();
	}
}
