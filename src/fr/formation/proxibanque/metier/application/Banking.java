package fr.formation.proxibanque.metier.application;

import java.util.List;


import fr.formation.proxibanque.metier.Agency;
import fr.formation.proxibanque.metier.Client;

import fr.formation.proxibanque.metier.PersonalAdvisor;
import fr.formation.proxibanque.persistence.AgencyNetwork;
import fr.formation.proxibanque.presentation.Interaction;
/**
 * Classe regroupant toutes les méthodes permettant d'exécuter tous les traitements possibles
 * @author Adminl (Sarah Ourabah et Sandy Colin)
 *
 */
public class Banking {

	public Interaction interaction ;
	public AgencyNetwork agencyNetwork;
	public boolean running = true;
	public Client client;
	
	
	/**
	 * Constructeur par défaut de la classe Banking
	 *
	 */	
public Banking() {
	this.interaction = new Interaction();
	this.agencyNetwork = new AgencyNetwork();
}
/**
 * Méthode permettant la création d'une agence, d'un conseiller et de plusieurs clients
 *
 */	
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
	/**
	 * Méthode permettant le lancement et le bon déroulement de l'application
	 *
	 */
	public void start() {
		this.loadTestData();
		while (this.running) {
		this.manageMainMenu();
		}
	}
	/**
	 * Méthode permettant de lire les informations concernant un client en particulier
	 *
	 */
	public void clientDataReader() {
		this.interaction.display(this.client.firstname);
		this.interaction.display(this.client.lastname);
		this.interaction.display(this.client.adress);
		this.interaction.display(String.valueOf(this.client.zipCode));
		this.interaction.display(this.client.city);
		this.interaction.display(this.client.tel);
	}
	/**
	 * Méthode permettant la création d'un nouveau client avec toutes ses caractéristiques
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

		this.agencyNetwork.agencies.get(0).personalAdvisors.get(0).clients.add(new Client
				(lastname, firstname, adress, zipCode, city, tel));
		this.interaction.display(firstname + " " + lastname + " habitant "+adress + " "+zipCode + " "+city + 
				" ayant pour numï¿½ro"+ tel + ". " +" a bien ï¿½tï¿½ ajoutï¿½.");
		;
	}
	/**
	 * Méthode permettant la suppression d'un client et de toutes ses caractéristiques
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
    
	/**
	 * Méthode censée permettre de faire des virements d'un compte à l'autre
	 *
	 */
	public void bankTransfer() {
		this.interaction.display("Désolées Jérémy, nous avons essayé mais sans succès");
		
		
	}
	
	/**
	 * Méthode censée permettre de simuler un crédit
	 *
	 */
	public void housingCreditSimulation() {
		this.interaction.display("Dï¿½solï¿½es Jï¿½rï¿½my, c'est trop pour nous !!!");
	}
	/**
	 * Méthode permettant de changer une caractéristique d'un client donné
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
	 * Méthode censée permettre de simuler un crédit
	 *
	 */
	public void consumptionCreditSimulation() {
		this.interaction.display("Dï¿½solï¿½es Jï¿½rï¿½my, c'est trop pour nous !!!");
	}
		
	/**
	 * Méthode affichant le menu principal dans lequel il faut faire un choix
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
	 * Méthode permettant de sortir du programme
	 *
	 */
	public void exitProgram() {
		this.running = false;
	}
	/**
	 * Méthode affichant la liste des clients associés au conseiller
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
	 * Méthode affichant un menu principal dans lequel il faut faire un choix par rapport au client
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
	 * Méthode affichant un menu dans lequel il faut faire un choix par rapport au crédit.
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
	
	
