package adalid;

import java.util.List;

public class EmpleadoService {
	
	public List<Empleado> getEmpleados ()
	{
		List<Empleado> l_empleados = null;
		
			EmpleadoBD empleadoBD = new EmpleadoBD();
			l_empleados = empleadoBD.getEmpleadosBD();
		
		return l_empleados;
	}

}
