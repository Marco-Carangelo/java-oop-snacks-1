package org.java.snacks3.lesson;

import org.java.snacks.lesson.Studente;

public class Main {

	public static void main(String[] args) {
		
		//Creiamo un'istanza dell'oggetto registroStudenti
		
		RegistroStudenti nuovoRegistro = new RegistroStudenti();
		
		//Creiamo 10 istanze dell'oggetto studente e stampiamo il registro ad ogni iterazione
		for(int i=1;i<=10;i++) {
			
			Studente studente = new Studente("nome"+i,"cognome"+i,17+i );
			nuovoRegistro.aggiungiStudente(studente);
			
			//Stampa di controllo dello stato del registro ad ogni inserimento
			System.out.println("Stato del registro all'inserimento di "+ i +"studenti: \n");
			nuovoRegistro.stampaStudenti();
			
		}
		
		
		
	

}
}
