package fr.formation.proxibanque.presentation;

import java.util.Scanner;
/**
 * La classe interaction représente l'interface entre le programme et l'utilisateur.
 * Elle lui permet d'accéder aux différents traitements, à partir d'un menu principal.
 * 
 * @author Adminl (Sarah Ourabah et Sandy Colin)
 *
 */
public class Interaction {
	/**
	 * La méthode readData() de type String permet de lire et de retourner les entrées clavier 
	 * 
	 * @author Adminl (Sarah Ourabah et Sandy Colin)
	 *
	 */
	public String readData() {   
		Scanner sc = new Scanner (System.in);
		return sc.nextLine();
	}
	
	/**
	 * La méthode display() affiche dans la console un paramètre de type String et ne retourne aucune valeur.
	 * 
	 * @author Adminl (Sarah Ourabah et Sandy Colin)
	 *
	 */
	public void display(String message) {
		System.out.println(message);
	}
	
//	public void mainMenu0() {
//		this.display("Bonjour employé ProxiBanque, pour vous identifier, entrez votre ID () :");
//	}
	/**
	 * La mainMenu() affiche dans la console un paramètre de type String et ne retourne aucune valeur.
	 * 
	 * @author Adminl (Sarah Ourabah et Sandy Colin)
	 *
	 */
	public void mainMenu() {
		this.display("Que faire ?");
		this.display("1. Cr�er un client");
		this.display("2. G�rer un client");
		this.display("3. Sortir du programme");
	}
	
	public void mainMenu2() {
	        this.display("1. Lire les donn�es du client");
	        this.display("2. Modifier les donn�es d'un client");
	        this.display("3. Faire un virement");
	        this.display("4. Simuler un cr�dit");
	        this.display("5. Supprimer un client");
	        this.display("6. Revenir au menu précédent");
	        this.display("7. Sortir du programme");
	}
	
	public void mainMenu3() {
        this.display("Que faire ?");
        this.display("1. Simuler un cr�dit immobilier");
        this.display("2. Simuler un cr�dit � la consommation");
        this.display("3. Revenir au menu pr�c�dent");
        this.display("4. Sortir du programme");
    }
	public void changeMenu() {
        this.display("Que voulez-vous modifier ?");
        this.display("1. Pr�nom");
        this.display("2. Nom");
        this.display("3. Adresse");
        this.display("4. Code Postal");
        this.display("5. Ville");
        this.display("6. T�l�phone");
        this.display("7. Revenir au menu principal");
        
    }
}