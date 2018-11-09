package fr.formation.proxibanque.metier.application;

import java.util.List;

import fr.formation.proxibanque.metier.Agency;
import fr.formation.proxibanque.metier.Client;
import fr.formation.proxibanque.metier.CurrentAccount;
import fr.formation.proxibanque.metier.PersonalAdvisor;
import fr.formation.proxibanque.persistence.AgencyNetwork;
import fr.formation.proxibanque.presentation.Interaction;
/**
 * Classe qui intéragit avec toutes les autres classes et qui contient les méthodes permettant
 *  au conseiller de faire tous les traitements qu'il souhaite
 * @author Adminl (Sarah Ourabah et Sandy Colin)
 *
 */
public class Banking {

	public Interaction interaction ;
	public AgencyNetwork agencyNetwork;
	public boolean running = true;
	public Client client;
//	public CurrentAccount currentAccount;
	
	/**
	 * Constructeur par défaut de la classe Banking
	 */ 	
public Banking() {
	this.interaction = new Interaction();
	this.agencyNetwork = new AgencyNetwork();
}
	
/**
 * Méthode permettant au conseiller de supprimer un client et toutes ses caractéristiques
 *
 *
 */ 
	public void loadTestData() {
		
		this.agencyNetwork.agencies.add(new Agency ("81190", "02/03/1990"));
		this.agencyNetwork.agencies.get(0).personalAdvisors.add(new PersonalAdvisor("Banquier"));
		this.agencyNetwork.agencies.get(0).personalAdvisors.get(0).clients.add(new Client("Sarah", "Ourabah",
				 "avenue de la Paix", 75000, "Paris", "06.07.08.09.10", "C01", 4005.0, "S01", 6659.55));
		this.agencyNetwork.agencies.get(0).personalAdvisors.get(0).clients.add(new Client("Sandy","Colin",
				"rue St Marc",93800, "Epinay", "03.26.48.97.21", "C02",10589.33, "S02", 5900.0));
		this.agencyNetwork.agencies.get(0).personalAdvisors.get(0).clients.add(new Client("Sylvie","Ritter",
				"rue St 24",93430, "Villetaneuse", "03.26.48.97.22", "C03", -5.0, "S03", 350.0));
		this.agencyNetwork.agencies.get(0).personalAdvisors.get(0).clients.add(new Client("Marc","Part",
				"rue Marc",95600, "Eaubonne", "03.26.48.97.21", "C04", 2005.5, "S04", 300.0));
		this.agencyNetwork.agencies.get(0).personalAdvisors.get(0).clients.add(new Client("Jean","Bon",
				"rue St Leu",95560, "Baillet-en-France", "03.28.48.97.25", "C05", 500.0, "S05", 251.65));
	}
	
	/**
	 * Méthode permettant de lancer le programme et de n'en sortir que lorsque le conseiller l'a décidé
	 *
	 *
	 */ 
	public void start() {
		this.loadTestData();
		while (this.running) {
		this.manageMainMenu();
		}
	}
	
	/**
	 * Méthode permettant au conseiller de lire les informations d'un client précis
	 *
	 *
	 */ 
	public void clientDataReader() {
		this.interaction.display(this.client.firstname);
		this.interaction.display(this.client.lastname);
		this.interaction.display(this.client.adress);
		this.interaction.display(String.valueOf(this.client.zipCode));
		this.interaction.display(this.client.city);
		this.interaction.display(this.client.tel);
		this.interaction.display(String.valueOf(this.client.currentAccount));
		this.interaction.display(String.valueOf(this.client.savingAccount));
	}
	
	/**
	 * Méthode permettant au conseiller de supprimer un client et toutes ses caractéristiques
	 *
	 */ 
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
		this.interaction.display("Entrez le numÃ©ro de compte courant:");
		String currentAccount = this.interaction.readData();
		this.interaction.display("Entrez le solde du compte courant:");
		Double balanceCurrentAccount = Double.parseDouble(this.interaction.readData());
		this.interaction.display("Entrez le numÃ©ro de compte Ã©pargne:");
		String savingAccount = this.interaction.readData();
		this.interaction.display("Entrez le solde du compte Ã©pargne:");
		Double balanceSavingAccount = Double.parseDouble(this.interaction.readData());
		this.agencyNetwork.agencies.get(0).personalAdvisors.get(0).clients.add(new Client
				(lastname, firstname, adress, zipCode, city, tel));
		this.interaction.display(firstname + " " + lastname + " habitant "+adress + " "+zipCode + " "+city + 
				" ayant pour numï¿½ro"+ tel + ". " +" a bien ï¿½tï¿½ ajoutï¿½." + "\nNumÃ©ro de comptes associÃ©s: " 
				+ currentAccount + " (solde: " + balanceCurrentAccount + "â‚¬)" + savingAccount + " (solde: " + balanceSavingAccount);
		;
	}
	/**
	 * Méthode permettant au conseiller de supprimer un client et toutes ses caractéristiques
	 * 
	 *
	 */ 
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
		this.interaction.display(this.client.currentAccount.accountNumber);
		
	}
	
	/**
	 * Méthode censée permettre au conseiller de simuler un crédit de consumption
	 * 
	 *
	 */ 
	public void housingCreditSimulation() {
		this.interaction.display("Sélectionner le montant de crédit souhaité");
		this.interaction.readData();
		this.interaction.display("Désolé vous ne remplissez pas les conditions requises");
	}
	/**
	 * Méthode permettant au conseiller de changer une caractéristique du client
	 *
	 */ 
	public void dataChange() {
		this.interaction.changeMenu();
		String modif = this.interaction.readData();
		switch (modif)
		{
			case "1" : 
				this.interaction.display("Quelle est le nouveau prï¿½nom ï¿½ entrer ?");
				String newFirstName = this.interaction.readData();
				this.client.firstname = newFirstName;
				this.interaction.display("Le prï¿½nom a bien ï¿½tï¿½ changï¿½ en " + newFirstName);
            break;
			case "2" : 
				this.interaction.display("Quelle est le nouveau nom ï¿½ entrer ?");
				String newName = this.interaction.readData();
				this.client.lastname = newName;
				this.interaction.display("Le nom a bien ï¿½tï¿½ changï¿½ en " + newName);
            break; 
			case "3" :
				this.interaction.display("Quelle est la nouvelle adresse ï¿½ entrer ?");
				String newAdress = this.interaction.readData();
				this.client.adress = newAdress;
				this.interaction.display("L'adresse a bien ï¿½tï¿½ changï¿½e en " + newAdress);
            break;
			case "4":
				this.interaction.display("Quelle est le nouveau code postal ï¿½ entrer ?");
				int newZipCode = Integer.parseInt(this.interaction.readData());
				this.client.zipCode = newZipCode;
				this.interaction.display("Le code postal a bien ï¿½tï¿½ changï¿½ en " + newZipCode);
            break;
			case "5" :
				this.interaction.display("Quelle est la nouvelle ville ï¿½ entrer ?");
				String newCity = this.interaction.readData();
				this.client.city = newCity;
				this.interaction.display("La ville a bien ï¿½tï¿½ changï¿½e en " + newCity);
            break;
			case "6" :
				this.interaction.display("Quelle est le nouveau tï¿½lï¿½phone ï¿½ entrer ?");
				String newTel = this.interaction.readData();
				this.client.tel = newTel;
				this.interaction.display("Le tï¿½lï¿½phone a bien ï¿½tï¿½ changï¿½ en " + newTel);
            break;
			case "7" :
				this.interaction.mainMenu();
			break;
		}
		
	}
		
	
	
	/**
	 * Méthode censée permettre au conseiller de simuler un crédit de consumption
	 *
	 */ 
	public void consumptionCreditSimulation() {
		this.interaction.display("Sélectionner le montant de crédit souhaité");
		this.interaction.readData();
		this.interaction.display("Désolé vous ne remplissez pas les conditions requises");
	}
		
	/**
	 * Méthode permettant d'afficher au conseiller un menu principal lui permettant de faire divers traitements (créer ou gérer un client)
	 *
	 *
	 */ 
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
	
	/**
	 * Méthode permettant de quitter le programme
	 *
	 */ 
	public void exitProgram() {
		this.running = false;
	}
	
	/**
	 * Méthode permettant d'afficher une liste de client qui sont identifiés par un index.
	 *
	 *
	 */ 
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
	/**
	 * Méthode permettant au conseiller de choisir quel traitement il souhaite faire pour un client qu'il aura choisi dans la liste
	 *
	 */ 
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
	
	/**
	 * Méthode permettant au conseiller de choisir entre 2 types de simulation de crédit
	 *
	 *
	 */     
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
	
	
