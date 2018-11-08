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

}
