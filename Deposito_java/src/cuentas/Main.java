package cuentas;

/** 
 * 
 * @author Carlos D. Pérez Dóniz
 * @version 1.5
 * 
 */

public class Main {

	public static void main(String[] args) {
		CCuenta cuenta1;
        double saldoActual;

        /** Datos iniciales de la cuenta con el nombre, nº de cuenta y saldo inicial*/
        
        cuenta1 = new CCuenta("Antonio López","1000-2365-85-1230456789",2500,0);
        saldoActual = cuenta1.estado();
        System.out.println("El saldo actual es " + saldoActual);
        
    
        	operativa_cuenta(cuenta1,100);  
	}

	/** Método que realiza ingresos y retiradas de efectivo de la cuenta corriente dando al final el 
	 * saldo actualizado
	 * @param cuenta1
	 * @param cantidad
	 */
	public static void operativa_cuenta(CCuenta cuenta1, float cantidad) {
		
		
		try {
			cuenta1.retirar(2300);
		} catch (Exception e) {
			System.out.print("Fallo al retirar");
		}
		try {
			System.out.println("Ingreso en cuenta");
			cuenta1.ingresar(695);
		} catch (Exception e) {
			System.out.print("Fallo al ingresar");
		}
		System.out.println("El saldo actualizado es " + cuenta1.estado());
	}

}
