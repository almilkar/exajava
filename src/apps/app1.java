package apps;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

import entidades.Administrativo;
import entidades.Departamento;
import entidades.Director;
import entidades.Gerente;

public class app1 {

	public static void main(String[] args)  {
		
		// Departamentos de la empresa
		Departamento dRRHH = new Departamento("Recursos Humanos", "383");
		Departamento dVentas = new Departamento("Ventas", "505");
		Departamento dCompras = new Departamento("Compras", "132");
		Departamento dLogistica = new Departamento("Logística", "098");
		// Director único con varios gerentes
		Director director = new Director(0, "Jose Luis", "Álvarez", "García"); 
		director.setSueldoBaseGerente(3500.50);

		// Lista de gerentes asociados al director
		Gerente gRRHH = new Gerente(director, 100,"Alberto", "Álvarez", "García");
		Gerente gVentas = new Gerente(director, 200, "Amancio", "Álvarez", "García");;
		Gerente gCompras = new Gerente(director, 300, "Eugenio", "Álvarez", "García");;
		Gerente gLogistica = new Gerente(director, 400, "Edelmiro", "Álvarez", "García");;
		// Asignar gerente a cada departamento
		dRRHH.setGerente(gRRHH);
		dVentas.setGerente(gVentas);
		dCompras.setGerente(gCompras);
		dLogistica.setGerente(gLogistica);
		// Asociar gerentes al director
		Gerente arrayGerentes[] = {gRRHH, gVentas, gCompras, gLogistica};
		director.creaListaGerentes(arrayGerentes);

		// Administrativos Empleados, dos por departamento
		// Administrativos de RRHH
		Administrativo admin1 = new Administrativo(101, "Agustin", "Álvarez", "García");
		Administrativo admin2 = new Administrativo(102, "Pedro", "Álvarez", "García");
		// Asignar administrativos a gerentes
		Administrativo[] arr = {admin1, admin2};
		gRRHH.creaListaAdministrativos(arr);
		// Administrativos de Ventas
		Administrativo admin3 = new Administrativo(201, "Francisco", "Álvarez", "García");
		Administrativo admin4 = new Administrativo(202, "Fernando", "Álvarez", "García");
		arr[0] = admin3; arr[1] = admin4;
		gVentas.creaListaAdministrativos(arr);
		// Administrativos de Compras
		Administrativo admin5 = new Administrativo(301, "Antonio", "Álvarez", "García");
		Administrativo admin6 = new Administrativo(302, "Jose Antonio", "Álvarez", "García");
		arr[0] = admin5; arr[1] = admin6;
		gCompras.creaListaAdministrativos(arr);
		// Administrativos de Logística
		Administrativo admin7 = new Administrativo(401, "Alvaro", "Álvarez", "García");
		Administrativo admin8 = new Administrativo(402, "Israel", "Álvarez", "García");
		arr[0] = admin7; arr[1] = admin8;
		gLogistica.creaListaAdministrativos(arr);
		
		/// ------------------------   Serializar Gerentes  -------------------------
		
		try {
			FileOutputStream fileOut = new FileOutputStream("x_gerente.ser");
			ObjectOutputStream out = new ObjectOutputStream(fileOut);
			out.writeObject(gLogistica);
			out.close();
			fileOut.close();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		} 
		
		
		
		
		
		
	}	

	
	
}
