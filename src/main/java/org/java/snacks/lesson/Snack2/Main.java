package org.java.snacks.lesson.Snack2;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		ContoBancario nuovoCliente = new ContoBancario("0123456789");
		
		nuovoCliente.deposito(1000);
		System.out.println("Il saldo disponibile è " + nuovoCliente.getSaldo());
		nuovoCliente.prelievo(500);;
		System.out.println("Il saldo disponibile è " + nuovoCliente.getSaldo());

	}

}
