package provaPratica;

public class Musica extends Hobbie {

	public Musica() {
		super();
	}
	
	@Override
	public String toString(){
		return "Musica - "+ getNome();
	}
}
