package entidades;

public class Administrativo extends Empleado {
	private float salario;
	
	public Administrativo(int numeroEmpleado, String nombre, String apellido1, String apellido2) {
		super(numeroEmpleado, nombre, apellido1, apellido2);
	}
	
	
	@Override
	String getTipoEmpleado() {
		return "ADMINISTRATIVO";
	}
	
	

	

}
