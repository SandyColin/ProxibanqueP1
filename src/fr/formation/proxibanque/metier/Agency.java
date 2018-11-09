package fr.formation.proxibanque.metier;

import java.util.ArrayList;
import java.util.List;

/**
 * Classe permettant de caractériser une agence via ses différents attributs (dont une liste de conseillers)
 * @author Adminl (Sarah Ourabah et Sandy Colin)
 *
 */
public class Agency {
	
	public String id;
	public String creationDate;
	public BankManager bankManager;
	public List<PersonalAdvisor> personalAdvisors;
	
	public Agency(String id, String creationDate) {
		this.id = id;
		this.creationDate = creationDate;
		this.personalAdvisors = new ArrayList<>();

	}
	
	
}
