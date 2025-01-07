package comunicacion;

public class Fabula extends Escrito{
	
	private String ensenansas;
	private String interpretacion;
	
	public Fabula(String origen,String titulo, String autor, int paginas,String ensenansas,String interpretacion) {
		super(origen,titulo,autor,paginas);
		this.ensenansas = ensenansas;
		this.interpretacion = interpretacion;
	}
	
	public int palabrasTotales(int parametro) {
		int total = parametro*this.getPaginas()*1;
		return total;
	}
	
	public String interpretacion() {
		return this.interpretacion;
	}
	
	public void setInterpretacion(String interpretacion) {
		this.interpretacion = interpretacion;
	}
	
	public String getEnsenansas() {
		return this.ensenansas;
	}
	
	public void setEnsenansas(String ensenansas) {
		this.ensenansas = ensenansas;
	}
	
	public String toString() {
		
		String cadena = this.getOrigen()+"\n"+
				this.getTitulo()+"\n"+
				this.getAutor()+"\n"+
				this.getPaginas()+"\n"+
				this.ensenansas+"\n"+
				this.interpretacion;
		
		return cadena;
	}
	
}
