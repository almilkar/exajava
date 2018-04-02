package entidades;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;

public class Gerente extends Empleado implements Serializable {
	private double salario;
	Director miDirector;
	private ArrayList <Administrativo> listaAdministrativos = new ArrayList<Administrativo>();
	
	public Gerente(Director miDirector, int numeroEmpleado, String nombre, String apellido1, String apellido2) {
		super(numeroEmpleado, nombre, apellido1, apellido2);
		this.miDirector = miDirector;
		this.salario = miDirector.getSueldoBaseGerente();
	}
	@Override
	String getTipoEmpleado() {
		return "Gerente";
	}
	public double getSalario() {
		return salario;
	}
	public void setSalarioDesdeDirector(double salario) {
		this.salario = miDirector.getSueldoBaseGerente();
	}
	public void creaListaAdministrativos(Administrativo[] administrativos) {	
		for (int i = 0; i < administrativos.length; i++){
			listaAdministrativos.add(administrativos[i]);
		}
	}
	
	public void mostrarAdministrativos() {
		Iterator<Administrativo> iter = listaAdministrativos.iterator();
		while(iter.hasNext())
			  System.out.println(iter.next());
	}
	
}
