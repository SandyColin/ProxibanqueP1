package fr.formation.proxibanque.presentation;

import java.util.Scanner;
/**
 * La classe interaction représente l'interface entre le programme et l'utilisateur.
 * Elle lui permet d'accéder aux diffÃ©rents traitements, Ã  partir d'un menu principal.
 * 
 * @author Adminl (Sarah Ourabah et Sandy Colin)
 *
 */
public class Interaction {
	/**
	 * La méthode readData() de type String permet de lire et de retourner les entrées clavier 
	 * 
	 *
	 */
	public String readData() {   
		Scanner sc = new Scanner (System.in);
		return sc.nextLine();

	}
	/**
	 * La méthode display() affiche un message sur la console.
	 * 
	 *
	 */
	public void display(String message) {
		System.out.println(message);
	}
	
//	public void mainMenu0() {
//		this.display("Bonjour employé ProxiBanque, pour vous identifier, entrez votre ID () :");
//	}
	/**
	 * La mainMenu() affiche dans la console une liste d'instruction.
	 * 
	 * 
	 *
	 */
	public void mainMenu() {
		this.display("Que faire ?");
		this.display("1. Créer un client");
		this.display("2. Gérer un client");
		this.display("3. Sortir du programme");
	}
	
	/**
	 * La méthode mainMenu2() affiche une liste d'instruction et permet au conseiller de faire un choix.
	 * 
	 *
	 */
	public void mainMenu2() {
	        this.display("1. Lire les données du client");
	        this.display("2. Modifier les données d'un client");
	        this.display("3. Faire un virement");
	        this.display("4. Simuler un crédit");
	        this.display("5. Supprimer un client");
	        this.display("6. Revenir au menu précédent");
	        this.display("7. Sortir du programme");
	}
	
	/**
	 * La méthode mainMenu3() affiche une liste d'instruction et permet au conseiller de faire un choix.
	 * 
	 *
	 */public void mainMenu3() {
        this.display("Que faire ?");
        this.display("1. Simuler un crédit immobilier");
        this.display("2. Simuler un crédit à la consommation");
        this.display("3. Revenir au menu précédent");
        this.display("4. Sortir du programme");
    }
	 /**
		 * La méthode changeMenu() permet de changer la valeur d'un attribut du client
		 * 
		 *
		 */
	public void changeMenu() {
        this.display("Que voulez-vous modifier ?");
        this.display("1. Prénom");
        this.display("2. Nom");
        this.display("3. Adresse");
        this.display("4. Code Postal");
        this.display("5. Ville");
        this.display("6. Téléphone");
        this.display("7. Revenir au menu principal");
        
    }
}