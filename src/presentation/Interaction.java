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

}
