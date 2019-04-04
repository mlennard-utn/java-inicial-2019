package ar.edu.utn.modelo;

public class Galletita {
	private String nombre;
	private String descripcion;
	private Double precio;
	
	/*
	 * Protected modifica el ambito 
	 * de visibilidad del constructor en 
	 * este caso.
	 * 
	 * Protected permite que el metodo sea
	 * visible solamente por las clases
	 * que estan en el mismo paquete.
	 *  
	 */
	
	protected Galletita() {
		this.descripcion = "";
		this.precio = new Double(0.0);
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public String getDescripcion() {
		return descripcion;
	}
	
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	
	public Double getPrecio() {
		return precio;
	}
	
	public void setPrecio(Double p) {
		this.precio = p;
	}

	@Override
	public String toString() {
		return String.format("Galletita: %s sale $ %.2f", this.nombre, this.precio);
	}
	
	
	
}
