package fr.formation.proxibanque;

import fr.formation.proxibanque.metier.application.Banking;

public class Main {
		public Banking banking ;
	public static void main(String[] args) {
		
		Banking bk = new Banking();
		bk.start();

	}

}
