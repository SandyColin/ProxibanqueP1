package fr.formation.proxibanque.metier;

import java.util.ArrayList;
import java.util.List;

/**
 * Classe permettant de caractériser un conseiller via ses différents attributs
 * @author Adminl (Sarah Ourabah et Sandy Colin)
 *
 */
public class PersonalAdvisor {
	public String id;
	public List<Client> clients;
	
	
	public PersonalAdvisor() {
		this.clients = new ArrayList<>();
		}
	
	public PersonalAdvisor (String id) {
		this.id = id;
		this.clients = new ArrayList<>();
	}
	
	
	public PersonalAdvisor (String id, List<Client> clients) {
		this(id);
		this.clients = clients;
		
		this.clients = new ArrayList<>();
			
	
	}
	
	
}
