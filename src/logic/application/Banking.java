package logic.application;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import data.AgencyNetwork;
import logic.Agency;
import logic.BankManager;
import logic.Client;
import logic.PersonalAdvisor;
import presentation.Interaction;

public class Banking {

	public Interaction interaction ;
	public AgencyNetwork agencyNetwork;
	public boolean running = true;
	
public Banking() {
	this.interaction = new Interaction();
	this.agencyNetwork = new AgencyNetwork();
}
	
	public void loadTestData() {
		//this.agencyNetwork = new AgencyNetwork();
		//Agency	agency =new Agency ("81190", "02/03/1990");
		//agency.bankManager = new BankManager("SS");
		//agency.personalAdvisors = new ArrayList<>();
		//PersonalAdvisor personalAdvisor = new PersonalAdvisor("Banquier");
		//personalAdvisor.clients.add(new Client("Sarah", "Ourabah", "avenue de la Paix", 75000, "Paris", "06.07.08.09.10"));
		//agency.personalAdvisors.add(personalAdvisor);
		//this.agencyNetwork.agencies.add(agency);
		
		
		this.agencyNetwork.agencies.add(new Agency ("81190", "02/03/1990"));
		this.agencyNetwork.agencies.get(0).personalAdvisors.add(new PersonalAdvisor("Banquier"));
		this.agencyNetwork.agencies.get(0).personalAdvisors.get(0).clients.add(new Client("Sarah", "Ourabah", "avenue de la Paix", 75000, "Paris", "06.07.08.09.10"));
		
	}
	
	public void start() {
		this.loadTestData();
		while (this.running) {
		this.manageMainMenu();
		}
		}
	
	public void clientDataReader() {
		
	}
	public void clientCreation() {
		this.loadTestData();
		this.interaction.display("Entrez le nom :");
		String lastname = this.interaction.readData();
		this.interaction.display("Entrez le pr�nom :");
		String firstname = this.interaction.readData();

		this.interaction.display("Entrez l'adresse :");
		String adress = this.interaction.readData();
		this.interaction.display("Entrez le code postal :");
		int zipCode = Integer.parseInt(this.interaction.readData());
		this.interaction.display("Entrez la ville :");
		String city = this.interaction.readData();
		this.interaction.display("Entrez le t�l�phone :");
		String tel = this.interaction.readData();
		PersonalAdvisor personalAdvisor = new PersonalAdvisor();
		this.agencyNetwork.agencies.get(0).personalAdvisors.get(0).clients.add(new Client(lastname, firstname, adress, zipCode, city, tel));
		System.out.println(firstname + " " + lastname + " habitant "+adress + " "+zipCode + " "+city + " et ayant pour num�ro"+ tel + " a bien �t� ajout�.");

		;
	}
	public void clientRemove() {
//		PersonalAdvisor personalAdvisor = new PersonalAdvisor();
//		
//		for (Client client1 : this.clients)
//		for (Iterator iter = this.clients.iterator(); iter.hasNext();)
//	      {
//	       String  ch2= (String)iter.next();
//	        System.out.println(ch2)  ;
//	      }
//				
//		this.interaction.display("Quel client souhaitez vous supprimer");
//		int saisie = Integer.parseInt(this.interaction.readData());
//		
//		if (client.currentAccount.equals(Account)) {
//		this.deleteAccount();}
//        this.unableCreditCard();
    }
    
    public void deleteAccount() {
//        Map <cl�, Client> delete = new HashMap<>();
//        
//		client.lastname = this.interaction.readData();
//		
//		client.firstname = this.interaction.readData();
    }
    
    public void unableCreditCard() {
        
    }
	
	public void bankTransfer() {
		
	}
	
	public void housingCreditSimulation() {
		
	}
	public void dataChange() {
		
	}
	public void consumptionCreditSimulation() {
		
	}
	
	
	public void manageMainMenu() {
		this.interaction.mainMenu();
        this.interaction.display("Entrez votre choix.");
        String userInput = this.interaction.readData();
        if (userInput.equals("1")) {
            this.clientCreation();
        }else if (userInput.equals("2")) {
               this.selectClient();
            } 
		else if (userInput.equals("3")) {
			this.exitProgram();
            }
		}
	
	public void exitProgram() {
		this.running = false;
	}
	
	public void selectClient() {
		// afficher liste
		 
		List<Client> clients = this.agencyNetwork.agencies.get(0).personalAdvisors.get(0).clients;
		for (Client client : clients) {
			int index = clients.indexOf(client);
			this.interaction.display(index + " - "+ client.toString());}
		this.interaction.display("Tapez le numéro associé au client concerné");
	    String userInputIndex = this.interaction.readData();	
		
		this.interaction.mainMenu2();
		this.interaction.display("Entrez votre choix: ");
	     String userInput = this.interaction.readData();
	     if (userInput.equals("1")) {
	         this.clientDataReader();    
	     } else if (userInput.equals("2")) {
	             this.dataChange();
	             } else if (userInput.equals("3")) {
	                 this.bankTransfer();
	                 } else if (userInput.equals("4")) {
	                     this.creditSimulation();
	                     } else if (userInput.equals("5")) {
	                         this.clientRemove();
	                      } else if (userInput.equals("6")) {
	                     	 this.manageMainMenu();
	                      } else if (userInput.equals("7")) {
	                  			this.exitProgram();
	                      }

			
		}
	
        
	public void creditSimulation() {
        this.interaction.mainMenu3();
        this.interaction.display("Entrez votre choix: ");
        String userInput = this.interaction.readData();
        if (userInput.equals("1")) {
            this.housingCreditSimulation();    
            } else if (userInput.equals("2")) {
                this.consumptionCreditSimulation();
//            } else if (userInput.equals("3")) {
//                this.manageClient();
            } else if (userInput.equals("4")) {
     			this.exitProgram();
         }
    }
	
}
	
	
