package entidades;

import java.util.ArrayList;
import java.util.Iterator;

public class Director extends Empleado {
	
	private double sueldoBaseGerente;
	private ArrayList <Gerente> listaGerentes = new ArrayList<Gerente>();
	//listaGerentes = new ArrayList<Gerentes>;
	
	public Director(int numeroEmpleado, String nombre, String apellido1, String apellido2) {
		super(numeroEmpleado, nombre, apellido1, apellido2);
		
	}
	
	public double getSueldoBaseGerente() {
		return sueldoBaseGerente;
	}



	public void setSueldoBaseGerente(double sueldoBaseGerente) {
		this.sueldoBaseGerente = sueldoBaseGerente;
	}



	@Override
	public int getNumeroEmpleado() {
		// TODO Auto-generated method stub
		return super.getNumeroEmpleado();
	}

	@Override
	String getTipoEmpleado() {
		return "DIRECTOR";
	}

	public void setSalarioGerente(Gerente gerente, double salario) {
		//gerente.setSalario(, salario);
	}

	
	public void creaListaGerentes(Gerente[] gerentes) {	
		for (int i = 0; i < gerentes.length; i++){
			listaGerentes.add(gerentes[i]);
		}
	}
	
	public void mostrarGerentes() {
		Iterator<Gerente> iter = listaGerentes.iterator();
		while(iter.hasNext())
			  System.out.println(iter.next());
	}
	
	
	public void mostrar() {
		System.out.println(getTipoEmpleado());
		super.mostrar();
	}
	
	
}
