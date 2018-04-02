package entidades;

public abstract class Empleado extends Persona {

	private int numeroEmpleado;
	
	Empleado(int numeroEmpleado, String nombre, String apellido1, String apellido2) {
		super(nombre, apellido1, apellido2);
		setNumeroEmpleado(numeroEmpleado);
	}
	
	abstract String getTipoEmpleado();
	
	public int getNumeroEmpleado() {
		return numeroEmpleado;
	}
	private void setNumeroEmpleado(int numeroEmpleado) {
		this.numeroEmpleado = numeroEmpleado;
	}
	
	public void mostrar() {
		System.out.println("Empleado" + getTipoEmpleado());
	}
}
