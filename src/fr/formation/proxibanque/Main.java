package fr.formation.proxibanque;

import fr.formation.proxibanque.metier.application.Banking;
/**
 * Classe Main représentant le point d'entrée de l'application
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
