package fr.formation.proxibanque.metier;

import java.util.ArrayList;
import java.util.List;

/**
 * Classe permettant de caractériser un conseiller via ses différents attributs (dont une liste de clients)
 * @author Adminl (Sarah Ourabah et Sandy Colin)
 *
 */
public class PersonalAdvisor {
	public String id;
	public List<Client> clients;
	
	/**
	 * Constructeur par défaut de la classe Banking
	 */ 	
	public PersonalAdvisor() {
		this.clients = new ArrayList<>();
		}
	/**
	 * Constructeur surchargé de la classe Banking
	 * @param id l'identifiant du conseiller
	 */ 	
	public PersonalAdvisor (String id) {
		this.id = id;
		this.clients = new ArrayList<>();
	}
	
	/**
	 * Constructeur surchargé de la classe Banking
	 * @param id l'identifiant du conseiller
	 * @param clients Liste des clients associé au conseiller
	 */ 	
	public PersonalAdvisor (String id, List<Client> clients) {
		this(id);
		this.clients = clients;
		
		this.clients = new ArrayList<>();
			
	
	}
	
	
}
