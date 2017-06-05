package adalid;

import java.util.List;

public class MainBaseDatos {
	
	public static void main(String[] args) {
		
		List<Empleado> lista_empleados = null;
		EmpleadoService empleado_service = null;
		
		empleado_service = new EmpleadoService();
		lista_empleados = empleado_service.getEmpleados();
	
		for (Empleado e: lista_empleados)
		{
			System.out.println("Nombre = " + e.getNombre());
		}
	}

}
