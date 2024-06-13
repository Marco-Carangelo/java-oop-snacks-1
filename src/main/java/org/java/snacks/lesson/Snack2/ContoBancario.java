package org.java.snacks.lesson.Snack2;

public class ContoBancario {
	
	//Snack 2: Gestione di un Conto
		//Crea una classe ContoBancario con attributi per numero di conto e saldo. 
		//Implementa un costruttore che accetta il numero di conto e inizializza il saldo a zero. 
		//Aggiungi metodi pubblici per depositare denaro sul conto, prelevare denaro dal conto e ottenere il saldo corrente.
		
		
		//Dichiarazione delle variabili di stanza
		
		private String numeroConto;
		private float saldo;
		
		//Metodo costruttore
		
		public ContoBancario(String numeroConto) {
			
			this.numeroConto= numeroConto;
			this.saldo=0;
			
		}
		
		public void deposito(int versamento) {
			
			saldo+= versamento;
			
		}
		
        public void prelievo(int prelievo) {
        	
			if(saldo > prelievo) {
				saldo-= prelievo;
			}
				
		
			
		}

		public float getSaldo() {
			return saldo;
		}

		
		
		

}
