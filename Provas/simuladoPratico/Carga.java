package simuladoPratico;
import javax.swing.JOptionPane;

public class Carga extends Veiculo {

	private double carga;
	private String placa;

	public String toString(){
		return "Carga";
	}
	
	public Carga() {
		super();
		setCarga(Integer.parseInt(JOptionPane.showInputDialog("Carga do veiculo em kg: ")));

	}

	public double getCarga() {
		return carga;
	}

	public void setCarga(double carga) {
		this.carga = carga;
	}

	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}
	
}
