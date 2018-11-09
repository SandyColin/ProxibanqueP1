package fr.formation.proxibanque.persistence;

import java.util.ArrayList;
import java.util.List;

import fr.formation.proxibanque.metier.Agency;
/**
 * Classe permettant de caractériser un réseau d'agence via sa liste d'agences.
 * @author Adminl (Sarah Ourabah et Sandy Colin)
 *
 */
public class AgencyNetwork {
	
	public List<Agency> agencies;
	
	/**
	 * Constructeur par défaut de la classe AgencyNetwork
	 */ 	
	public AgencyNetwork() {
		this.agencies = new ArrayList<>();
	}

}
