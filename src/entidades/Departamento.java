package entidades;

public class Departamento {
	private String nombre;
	private String extension;
	private Gerente gerente;
	
	public Departamento(String nombre, String telefono) {
		this.nombre = nombre;
		this.extension = telefono;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getExtension() {
		return extension;
	}
	public void setExtension(String telefono) {
		this.extension = telefono;
	}
	public Gerente getGerente() {
		return gerente;
	}
	public void setGerente(Gerente gerente) {
		this.gerente = gerente;
	}
	
	
	
	

}
