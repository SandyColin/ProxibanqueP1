package logic.application;

import java.util.ArrayList;

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
	
	
	
	public void loadTestData() {
		this.agencyNetwork = new AgencyNetwork();
		Agency	agency =new Agency ("81190", "02/03/1990");
		agency.bankManager = new BankManager("SS");
		agency.personalAdvisors = new ArrayList<>();
		PersonalAdvisor personalAdvisor = new PersonalAdvisor("Banquier");
		personalAdvisor.clients.add(new Client("Sarah", "Ourabah", "avenue de la Paix", 75000, "Paris", "06.07.08.09.10"));
		agency.personalAdvisors.add(personalAdvisor);
		this.agencyNetwork.agencies.add(agency);
		
	}
	
	public void start() {
		this.loadTestData();
		this.manageMainMenu();
		}
	
	public void clientDataReader() {
		
	}
	public void clientCreation() {
		this.loadTestData();
		this.interaction = new Interaction();
		Client client = new Client (null, null, null, 0, null, null);
		this.interaction.display("Entrez le nom :");
		client.lastname = this.interaction.readData();
		this.interaction.display("Entrez le pr�nom :");
		client.firstname = this.interaction.readData();
		this.interaction.display("Entrez l'adresse :");
		client.adress = this.interaction.readData();
		this.interaction.display("Entrez le code postal :");
		client.zipCode = Integer.parseInt(this.interaction.readData());
		this.interaction.display("Entrez la ville :");
		client.city = this.interaction.readData();
		this.interaction.display("Entrez le t�l�phone :");
		client.tel = this.interaction.readData();
		this.addClient();
		System.out.println(client.firstname + " " + client.lastname + " habitant "+client.adress + " "+client.zipCode + " "+client.city + " et ayant pour num�ro"+ client.tel + " a bien �t� ajout�.");
		;
	}
	public void clientRemove() {
		this.deleteAccount();
        this.unableCreditCard();
    }
    
    public void deleteAccount() {
        
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
	public void addClient(){
		PersonalAdvisor personalAdvisor = new PersonalAdvisor();
		personalAdvisor.clients.add(new Client("name", "firstname", "adress", 0, "city", "tel"));
	}
	
	public void manageMainMenu() {
		this.interaction = new Interaction();
		this.interaction.mainMenu();
        this.interaction.display("Entrez votre choix.");
        String userInput = this.interaction.readData();
        if (userInput.equals("1")) {
            this.clientCreation();
        }else if (userInput.equals("2")) {
               this.manageClient();
            } 
		else if (userInput.equals("3")) {
			this.exitProgram();
            }
		}
	
	public void exitProgram() {
		this.running = false;
	}

	private void manageClient() {
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
            } else if (userInput.equals("3")) {
                this.manageClient();
            } else if (userInput.equals("4")) {
     			this.exitProgram();
         }
    }
	
}
	
	
