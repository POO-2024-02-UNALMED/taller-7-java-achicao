package comunicacion;
import java.util.ArrayList;

public class Alfabeto extends Pictograma {
	private static ArrayList<String> letras = new ArrayList<String>();
	private String interpretacion;
	
	public Alfabeto(String origen,ArrayList<String> letras,String interpretacion) {
		super(origen);
		Alfabeto.letras = letras;
		this.interpretacion = interpretacion;
	}
	
	public int cantidadLetras() {
		int numero = letras.size();
		return numero;
	}
	
	public String interpretacion() {
		return this.interpretacion;
	}
	
	public String toString() {
		String resultado = String.join(", ", Alfabeto.letras);
	    return resultado;
	}
	
	public ArrayList<String> getLetras() {
	    return letras;
	}

	public void setLetras(ArrayList<String> letras) {
	    Alfabeto.letras = letras;
	}
	
	public String getInterpretacion() {
	    return interpretacion;
	}

	public void setInterpretacion(String interpretacion) {
	    this.interpretacion = interpretacion;
	}
}
