package cuentas;

/**
 * @author Carlos D. Pérez Dóniz
 * @version 1.5
 * 
 */

/** 
 * Clase para realizar las distintas operaciones que se pueden realizar en la cuenta corriente
 * tanto ingresos como retiradas de efectivo
 */

public class CCuenta {

	private String nombre;
	private String cuenta;
	private double saldo;
	private double tipoInterés;

	/**
	 * Constructor vacio de la clase CCuenta.
	 */
	public CCuenta() {
	}
	
	/**
	 * Constructor con parámetros de la clase CCuenta.
	 * @param nom Nombre del titular de la cuenta.
	 * @param cue Número de cuenta.
	 * @param sal El saldo actual de la cuenta.
	 * @param tipo El tipo de interés.
	 */

	public CCuenta(String nom, String cue, double sal, double tipo) {
		nombre = nom;
		cuenta = cue;
		saldo = sal;
	}
	
	/**
	 * Para obtener el nombre del titular.
	 * @return nombre.
	 */

	public String getNombre() {
		return nombre;
	}
	
	/**
	 * Para modificar el nombre del titular.
	 * @param nombre.
	 */

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	/**
	 * Para obtener el número de cuenta.
	 * @return cuenta.
	 */

	public String getCuenta() {
		return cuenta;
	}

	/**
	 * Para modificar el número de cuenta.
	 * @param cuenta
	 */
	
	public void setCuenta(String cuenta) {
		this.cuenta = cuenta;
	}
	
	/**
	 * Para obterner el saldo de la cuenta.
	 * @return saldo.
	 */

	public double getSaldo() {
		return saldo;
	}
	
	/**
	 * Para modificar el saldo de la cuenta.
	 * @param saldo
	 */

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	/**
	 * Para consultar el tipo de interés.
	 * @return tipo de interés.
	 */

	public double getTipoInterés() {
		return tipoInterés;
	}
	
	/**
	 * Para establecer el tipo de interés.
	 * @param tipoInterés
	 */

	public void setTipoInterés(double tipoInterés) {
		this.tipoInterés = tipoInterés;
	}
	
	/**
	 * Para obtener el estado del saldo de la cuenta.
	 * @return saldo de la cuenta.
	 */

	public double estado() {
		return saldo;
	}
	
	/**
	 * Método para realizar un ingreso de efectivo en la cuenta corriente.
	 * @param cantidad La cantidad de efectivo a ingresar.
	 * @throws Exception por si la cantidad a ingresar es negativa.
	 */

	public void ingresar(double cantidad) throws Exception {
		if (cantidad < 0)
			throw new Exception("No se puede ingresar una cantidad negativa");
		saldo = saldo + cantidad;
	}
	
	/**
	 * Método para realizar una retirada de efectivo de la cuenta corriente.
	 * @param cantidad La cantidad de efectivo retirada.
	 * @throws Exception por si la cantidad a retirar es negativa o no hay suficiente saldo en la cuenta
	 * para la cantidad a retirar.
	 */

	public void retirar(double cantidad) throws Exception {
		if (cantidad <= 0)
			throw new Exception("No se puede retirar una cantidad negativa");
		if (estado() < cantidad)
			throw new Exception("No se hay suficiente saldo");
		saldo = saldo - cantidad;
	}
}
