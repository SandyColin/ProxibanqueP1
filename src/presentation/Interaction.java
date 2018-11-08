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
		this.display("1. Créer un client");
		this.display("2. Gérer un client");
		this.display("3. Sortir du programme");
	}
	
	public void mainMenu2() {
        this.display("Que faire ?");
        this.display("1. Lire les données du client");
        this.display("2. Modifier les données d'un client");
        this.display("3. Faire un virement");
        this.display("4. Simuler un crédit");
        this.display("5. Supprimer un client");
        this.display("6. Sortir du programme");
	}

	
	public void mainMenu3() {
        this.display("Que faire ?");
        this.display("1. Simuler un crédit immobilier");
        this.display("2. Simuler un crédit à la consommation");
        this.display("3. Sortir du programme");
    }
	
}