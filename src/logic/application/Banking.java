package logic.application;

import java.util.ArrayList;

import data.AgencyNetwork;
import logic.Agency;
import logic.BankManager;
import logic.Client;
import logic.PersonalAdvisor;
import presentation.Interaction;

public class Banking {

	public Interaction interaction;
	public AgencyNetwork agencyNetwork;
	
	
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
	}
	
	public void clientDataReader() {
		
	}
	public void clientCreation() {
		this.loadTestData();
		this.interaction = new Interaction();
		Client client = new Client (null, null, null, 0, null, null);
		this.interaction.display("Entrez le nom :");
		client.lastname = this.interaction.readData();
		this.interaction.display("Entrez le prénom :");
		client.firstname = this.interaction.readData();
		this.interaction.display("Entrez l'adresse :");
		client.adress = this.interaction.readData();
		this.interaction.display("Entrez le code postal :");
		client.zipCode = Integer.parseInt(this.interaction.readData());
		this.interaction.display("Entrez la ville :");
		client.city = this.interaction.readData();
		this.interaction.display("Entrez le téléphone :");
		client.tel = this.interaction.readData();
		this.addClient();
		System.out.println(client.firstname + " " + client.lastname + " habitant "+client.adress + " "+client.zipCode + " "+client.city + " et ayant pour numéro"+ client.tel + " a bien été ajouté.");
		;
	}
	public void clientRemove() {
		
	}
	public void bankTransfert() {
		
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
}
