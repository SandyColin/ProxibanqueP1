package fr.formation.proxibanque.metier.application;

import java.util.List;

import fr.formation.proxibanque.metier.Agency;
import fr.formation.proxibanque.metier.Client;
import fr.formation.proxibanque.metier.PersonalAdvisor;
import fr.formation.proxibanque.persistence.AgencyNetwork;
import fr.formation.proxibanque.presentation.Interaction;

public class Banking {

	public Interaction interaction ;
	public AgencyNetwork agencyNetwork;
	public boolean running = true;
	public Client client;
	
	
public Banking() {
	this.interaction = new Interaction();
	this.agencyNetwork = new AgencyNetwork();
}
	
	public void loadTestData() {
		
		this.agencyNetwork.agencies.add(new Agency ("81190", "02/03/1990"));
		this.agencyNetwork.agencies.get(0).personalAdvisors.add(new PersonalAdvisor("Banquier"));
		this.agencyNetwork.agencies.get(0).personalAdvisors.get(0).clients.add(new Client("Sarah", "Ourabah",
				 "avenue de la Paix", 75000, "Paris", "06.07.08.09.10", "C01", "S01"));
		this.agencyNetwork.agencies.get(0).personalAdvisors.get(0).clients.add(new Client("Sandy","Colin",
				"rue St Marc",93800, "Epinay", "032648972", "C02", "S02"));
		this.agencyNetwork.agencies.get(0).personalAdvisors.get(0).clients.add(new Client("Sylvie","Ritter",
				"rue St 24",93430, "Villetaneuse", "032648972", "C03", "S03"));
		this.agencyNetwork.agencies.get(0).personalAdvisors.get(0).clients.add(new Client("Marc","Part",
				"rue Marc",95600, "Eaubonne", "032648972", "C04", "S04"));
		this.agencyNetwork.agencies.get(0).personalAdvisors.get(0).clients.add(new Client("Jean","Bon",
				"rue St Leu",95560, "Baillet-en-France", "032848972", "C05", "S05"));
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
		
		this.interaction.display("Entrez le nom :");
		String lastname = this.interaction.readData();
		this.interaction.display("Entrez le prï¿½nom :");
		String firstname = this.interaction.readData();
		this.interaction.display("Entrez l'adresse :");
		String adress = this.interaction.readData();
		this.interaction.display("Entrez le code postal :");
		int zipCode = Integer.parseInt(this.interaction.readData());
		this.interaction.display("Entrez la ville :");
		String city = this.interaction.readData();
		this.interaction.display("Entrez le tï¿½lï¿½phone :");
		String tel = this.interaction.readData();
		this.interaction.display("Entrez le numÃ©ro de compte:");
		String currentAccount = this.interaction.readData();
		this.interaction.display("Entrez le numÃ©ro de compte:");
		String savingAccount = this.interaction.readData();
		this.agencyNetwork.agencies.get(0).personalAdvisors.get(0).clients.add(new Client
				(lastname, firstname, adress, zipCode, city, tel, currentAccount, savingAccount));
		System.out.println(firstname + " " + lastname + " habitant "+adress + " "+zipCode + " "+city + 
				" ayant pour numï¿½ro"+ tel + " " + " a bien ï¿½tï¿½ ajoutï¿½.");

		;
	}
	public void clientRemove() {

		PersonalAdvisor personalAdvisor = this.agencyNetwork.agencies.get(0).personalAdvisors.get(0);
		List<Client> clients = personalAdvisor.clients;
		this.interaction.display("Etes vous sur de vouloir supprimer ce client ? O/N"); 
		String sup = this.interaction.readData();
		if (sup.equals("O")) {
			clients.remove(this.client);
		}
		else {
			this.manageMainMenu();
		}
		
    }
    
	public void bankTransfer() {
		this.interaction.display("Les comptes associÃ©s au client sÃ©lectionnÃ© sont les suivants:");
		String accountTable[] = {};
	}
	
	public void housingCreditSimulation() {
		
	}
	public void dataChange() {
		this.interaction.changeMenu3();
		String modif = this.interaction.readData();
		switch (modif)
		{
			case "1" : 
				this.interaction.display("Quelle est le nouveau prénom à entrer ?");
				String newFirstname = this.interaction.readData();
				this.client = Client (this.client.newFirstname,this.client.lastname,this.client.adress,this.client.zipCode,this.client.city,this.client.tel);
            break;
			case "2" : 
				this.interaction.display("Quelle est le nouveau nom à entrer ?");
				String newName = this.interaction.readData();
            break; 
			case "3" :
				this.interaction.display("Quelle est la nouvelle adresse à entrer ?");
				String newAdress = this.interaction.readData();
            break;
			case "4":
				this.interaction.display("Quelle est le nouveau code postal à entrer ?");
				String newZipCode = this.interaction.readData();
            break;
			case "5" :
				this.interaction.display("Quelle est la nouvelle ville à entrer ?");
				String newCity = this.interaction.readData();
            break;
			case "6" :
				this.interaction.display("Quelle est le nouveau téléphone à entrer ?");
				String newTel = this.interaction.readData();
            break;
			case "7" :
				this.interaction.mainMenu();
			break;
		}
		
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
	public void displayListClient() {
		PersonalAdvisor personalAdvisor = this.agencyNetwork.agencies.get(0).personalAdvisors.get(0);
		List<Client> clients = personalAdvisor.clients;
		
		for (Client client : clients) {
			int index = clients.indexOf(client);
		this.interaction.display(index + " - "+ client.toString());}
		this.interaction.display("Tapez le numÃ©ro associÃ© au client concernÃ©");
	    int userInputIndex = Integer.parseInt(this.interaction.readData());
	    this.client = clients.get(userInputIndex);
	}
	public void selectClient() { 
		this.displayListClient();
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
                this.selectClient();
            } else if (userInput.equals("4")) {
     			this.exitProgram();
         }
    }
	
}
	
	
