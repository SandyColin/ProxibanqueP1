package fr.formation.proxibanque.metier.application;

import java.util.List;

import fr.formation.proxibanque.metier.Account;
import fr.formation.proxibanque.metier.Agency;
import fr.formation.proxibanque.metier.Client;
import fr.formation.proxibanque.metier.CurrentAccount;
import fr.formation.proxibanque.metier.PersonalAdvisor;
import fr.formation.proxibanque.persistence.AgencyNetwork;
import fr.formation.proxibanque.presentation.Interaction;

public class Banking {

	public Interaction interaction ;
	public AgencyNetwork agencyNetwork;
	public boolean running = true;
	public Client client;
//	public CurrentAccount currentAccount;
	
	
public Banking() {
	this.interaction = new Interaction();
	this.agencyNetwork = new AgencyNetwork();
}
	
	public void loadTestData() {
		
		this.agencyNetwork.agencies.add(new Agency ("81190", "02/03/1990"));
		this.agencyNetwork.agencies.get(0).personalAdvisors.add(new PersonalAdvisor("Banquier"));
		this.agencyNetwork.agencies.get(0).personalAdvisors.get(0).clients.add(new Client("Sarah", "Ourabah",
				 "avenue de la Paix", 75000, "Paris", "06.07.08.09.10"));
		this.agencyNetwork.agencies.get(0).personalAdvisors.get(0).clients.add(new Client("Sandy","Colin",
				"rue St Marc",93800, "Epinay", "03.26.48.97.21"));
		this.agencyNetwork.agencies.get(0).personalAdvisors.get(0).clients.add(new Client("Sylvie","Ritter",
				"rue St 24",93430, "Villetaneuse", "03.26.48.97.22"));
		this.agencyNetwork.agencies.get(0).personalAdvisors.get(0).clients.add(new Client("Marc","Part",
				"rue Marc",95600, "Eaubonne", "03.26.48.97.21"));
		this.agencyNetwork.agencies.get(0).personalAdvisors.get(0).clients.add(new Client("Jean","Bon",
				"rue St Leu",95560, "Baillet-en-France", "03.28.48.97.25"));
	}
	
	public void start() {
		this.loadTestData();
		while (this.running) {
		this.manageMainMenu();
		}
	}
	
	public void clientDataReader() {
		this.interaction.display(this.client.firstname);
		this.interaction.display(this.client.lastname);
		this.interaction.display(this.client.adress);
		this.interaction.display(String.valueOf(this.client.zipCode));
		this.interaction.display(this.client.city);
		this.interaction.display(this.client.tel);
	}
	public void clientCreation() {
		
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
		this.interaction.display("Entrez le numéro de compte courant:");
//		String currentAccount = this.interaction.readData();
//		this.interaction.display("Entrez le solde du compte courant:");
//		Double balanceCurrentAccount = Double.parseDouble(this.interaction.readData());
//		this.interaction.display("Entrez le numéro de compte épargne:");
//		String savingAccount = this.interaction.readData();
//		this.interaction.display("Entrez le solde du compte épargne:");
//		Double balanceSavingAccount = Double.parseDouble(this.interaction.readData());
		this.agencyNetwork.agencies.get(0).personalAdvisors.get(0).clients.add(new Client
				(lastname, firstname, adress, zipCode, city, tel));
		this.interaction.display(firstname + " " + lastname + " habitant "+adress + " "+zipCode + " "+city + 
				" ayant pour num�ro"+ tel + ". " +" a bien �t� ajout�." + "\nNuméro de comptes associés: " 
				+ currentAccount + " (solde: " + balanceCurrentAccount + "€)" + savingAccount + " (solde: " + balanceSavingAccount);
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
		this.interaction.display("Les comptes associés au client sélectionné sont les suivants:");
		this.interaction.display(this.client.currentAccount.accountNumber);
		
	}
	
	public void housingCreditSimulation() {
		this.interaction.display("D�sol�es J�r�my, c'est trop pour nous !!!");
	}
	public void dataChange() {
		this.interaction.changeMenu();
		String modif = this.interaction.readData();
		switch (modif)
		{
			case "1" : 
				this.interaction.display("Quelle est le nouveau pr�nom � entrer ?");
				String newFirstName = this.interaction.readData();
				this.client.firstname = newFirstName;
				this.interaction.display("Le pr�nom a bien �t� chang� en " + newFirstName);
            break;
			case "2" : 
				this.interaction.display("Quelle est le nouveau nom � entrer ?");
				String newName = this.interaction.readData();
				this.client.lastname = newName;
				this.interaction.display("Le nom a bien �t� chang� en " + newName);
            break; 
			case "3" :
				this.interaction.display("Quelle est la nouvelle adresse � entrer ?");
				String newAdress = this.interaction.readData();
				this.client.adress = newAdress;
				this.interaction.display("L'adresse a bien �t� chang�e en " + newAdress);
            break;
			case "4":
				this.interaction.display("Quelle est le nouveau code postal � entrer ?");
				int newZipCode = Integer.parseInt(this.interaction.readData());
				this.client.zipCode = newZipCode;
				this.interaction.display("Le code postal a bien �t� chang� en " + newZipCode);
            break;
			case "5" :
				this.interaction.display("Quelle est la nouvelle ville � entrer ?");
				String newCity = this.interaction.readData();
				this.client.city = newCity;
				this.interaction.display("La ville a bien �t� chang�e en " + newCity);
            break;
			case "6" :
				this.interaction.display("Quelle est le nouveau t�l�phone � entrer ?");
				String newTel = this.interaction.readData();
				this.client.tel = newTel;
				this.interaction.display("Le t�l�phone a bien �t� chang� en " + newTel);
            break;
			case "7" :
				this.interaction.mainMenu();
			break;
		}
		
	}
		
	
	

	public void consumptionCreditSimulation() {
		this.interaction.display("D�sol�es J�r�my, c'est trop pour nous !!!");
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
		this.interaction.display("Tapez le numéro associé au client concerné");
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
	
	
