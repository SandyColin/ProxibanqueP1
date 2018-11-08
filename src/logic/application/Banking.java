package logic.application;

import java.util.ArrayList;

import data.AgencyNetwork;
import logic.Agency;
import logic.BankManager;
import presentation.Interaction;

public class Banking {

	public Interaction interaction;
	public AgencyNetwork agencyNetwork;
	
	
	public void loadTestData() {
		this.agencyNetwork = new ArrayList<>();
		Agency	agency =new Agency ("81190", "02/03/1990");
		agency.bankManager = new BankManager("SS");
		agency.personalAdvisor = new ArrayList<>();
		PersonalAdvisor personalAdvisor = 
	}
	
	public void start() {
		
	}
	
	public void clientDataReader() {
		
	}
	public String clientCreation() {
		this.agencyNetwork = new AgencyNetwork();
		//this.agencyNetwork.agency.
		this.interaction = new Interaction();
		this.interaction.display("Entrez le nom :");
		lastname = this.interaction.readData();
		this.interaction.display("Entrez le prénom :");
		firstname = this.interaction.readData();
		this.interaction.display("Entrez l'adresse :");
		adress = this.interaction.readData();
		this.interaction.display("Entrez le code postal :");
		zipCode = this.interaction.readData();
		this.interaction.display("Entrez la ville :");
		city = this.interaction.readData();
		this.interaction.display("Entrez le téléphone :");
		tel = this.interaction.readData();
		
		return null;
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
		
	}
}
