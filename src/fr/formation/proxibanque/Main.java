package fr.formation.proxibanque;

import fr.formation.proxibanque.metier.application.Banking;
/**
 * Classe Main repr�sentant le point d'entr�e de l'application
 * @author Adminl (Sarah Ourabah et Sandy Colin)
 *
 */
public class Main {
		public Banking banking ;
	public static void main(String[] args) {
		
		Banking bk = new Banking();
		bk.start();

	}

}
