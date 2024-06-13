package org.java.snacks3.lesson;

import org.java.snacks.lesson.Studente;

public class Main {

	public static void main(String[] args) {
		
		//Creiamo un'istanza dell'oggetto registroStudenti
		
		RegistroStudenti nuovoRegistro = new RegistroStudenti();
		
		//Creiamo 10 istanze dell'oggetto studente
		for(int i=1;i<=10;i++) {
			
			Studente studente = new Studente("nome"+i,"cognome"+i,17+i );
			nuovoRegistro.aggiungiStudente(studente);
			
		}
		
		//Facciamo una prima stampa dopo l'inserimento dei primi 10 studenti
		System.out.println("Stato del registro all'inserimento dei primi 10 studenti: \n");
		nuovoRegistro.stampaStudenti();
		
		//Riempiamo il resto dell'array con altri 20 studenti
				for(int i=11;i<=30;i++) {
					
					Studente studente = new Studente("nome"+i,"cognome"+i,18+i );
					nuovoRegistro.aggiungiStudente(studente);
					
				}
				
		//Stampiamo il registro completo
		System.out.println("\nStato del registro completo: \n");
		nuovoRegistro.stampaStudenti();
	}
	

}
