package adalid;

import java.util.List;

public class MainBaseDatos {
	
	public static void main(String[] args) {
		
		List<Empleado> lista_empleados = null;
		EmpleadoService empleado_service = null;
		
		empleado_service = new EmpleadoService();
		//lista_empleados = empleado_service.getEmpleados();
		lista_empleados = empleado_service.getEmpleadosByDpto(10);
		
		System.out.println("Nempleados = " + lista_empleados.size());
		
		int contador = 0;
		for (Empleado e: lista_empleados)
		{
			contador = contador+1;
			System.out.println("Nombre = " +contador + " " + e.getNombre());
		}
	}

}
