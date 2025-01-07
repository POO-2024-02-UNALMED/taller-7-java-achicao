package comunicacion;

public class Periodico extends Escrito{
	
	private String fecha;
	private String primicia;
	private String interpretacion;
	
	public Periodico(String origen,String titulo, String autor, int paginas,String fecha,String primicia,String interpretacion) {
		super(origen,titulo,autor,paginas);
		this.fecha = fecha;
		this.primicia = primicia;
		this.interpretacion = interpretacion;
		
	}
	
	public int palabrasTotales(int parametro) {
		int total = parametro*this.getPaginas()*10;
		return total;
	}
	
	public String interpretacion() {
		return this.interpretacion;
	}
	
	public String toString() {
		
		String cadena = this.getOrigen()+"\n"+
				this.getTitulo()+"\n"+
				this.getAutor()+"\n"+
				this.getPaginas()+"\n"+
				this.fecha+"\n"+
				this.primicia+"\n"+
				this.interpretacion;
		
		return cadena;
		
	}
	
}
