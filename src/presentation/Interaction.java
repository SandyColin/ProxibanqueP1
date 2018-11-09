package presentation;

import java.util.Scanner;

public class Interaction {
	

	
	public String readData() {   
		Scanner sc = new Scanner (System.in);
		
		return sc.nextLine();
		
	}
	
	public void display(String message) {
		System.out.println(message);
	}
	
	public void mainMenu() {
		this.display("Que faire ?");
		this.display("1. Cr�er un client");
		this.display("2. G�rer un client");
		this.display("3. Sortir du programme");
	}
	
	public void mainMenu2() {
        this.display("Que faire ?");
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
        this.display("3. Revenir au menu précédent");
        this.display("4. Sortir du programme");
    }
	
}