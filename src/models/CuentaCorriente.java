package models;

public class CuentaCorriente {

	//PROPIEDADES
	private int numeroCuenta;
	private double saldo;
	private Persona titular;
	
	//CONSTRUCTOR
	public CuentaCorriente(int numeroCuenta, double saldo, Persona titular) {
		super();
		this.numeroCuenta = numeroCuenta;
		this.saldo = saldo;
		this.titular = titular;
	}
	
	//GETTERS
	public int getNumeroCuenta() {
		return numeroCuenta;
	}

	public double getSaldo() {
		return saldo;
	}

	public Persona getTitular() {
		return titular;
	}
	
	//SETTERS
	public void setNumeroCuenta(int numeroCuenta) {
		this.numeroCuenta = numeroCuenta;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public void setTitular(Persona titular) {
		this.titular = titular;
	}

	//MÉTODOS
	public void sumarCantidad(double cantidad) {
		
		saldo = saldo + cantidad;
		
	}
	
	public void restarCantidad(double cantidad) {
		
		saldo = saldo - cantidad;
		
	}
	
	
	@Override
	public String toString() {
		return "CuentaCorriente [Número de cuenta: " + numeroCuenta + ", Saldo: " + saldo + "€" + "]";
	} 
	
	
}


