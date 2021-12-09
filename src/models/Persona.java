package models;

public class Persona {
	
	//PROPIEDADES
	private String nombre;
	private String apellidos;
	private String dni;
	private double sueldo;
	private CuentaCorriente cuenta;
	
	//CONSTRUCTOR
	public Persona(String nombre, String apellidos, String dni, double sueldo, CuentaCorriente cuenta) {
		super();
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.dni = dni;
		this.sueldo = sueldo;
		this.cuenta = cuenta;
	}

	//GETTERS
	public String getNombre() {
		return nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public String getDni() {
		return dni;
	}

	public double getSueldo() {
		return sueldo;
	}
	
	public CuentaCorriente getCuenta() {
		return cuenta;
	}
	
	
	//SETTERS
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public void setSueldo(double sueldo) {
		this.sueldo = sueldo;
	}

	public void setCuenta(CuentaCorriente cuenta) {
		this.cuenta = cuenta;
	}

	
	//MÉTODOS
	public void cobrarSueldo() {
		
		cuenta.sumarCantidad(sueldo);
	}
	
	public void sacarPasta(double cantidad) {
		
		if(cantidad > cuenta.getSaldo()) {
			System.out.println("¡No dispones de esa cantidad!");
		} else {
			cuenta.restarCantidad(cantidad);
		}
		
	}
	
	public void subirSueldo(double nuevoSueldo) {
		
		sueldo = nuevoSueldo;
	}
	
	@Override
	public String toString() {
		return "Persona [Nombre: " + nombre + ", Apellidos: " + apellidos + ", DNI: " + dni + ", Sueldo: " + sueldo + "€ " + "Cuenta: " + cuenta +"]";
	}
	
	public String nombrePersona() {
		return nombre;
	}

}
