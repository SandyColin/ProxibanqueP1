package fr.formation.proxibanque.persistence;

import java.util.ArrayList;
import java.util.List;

import fr.formation.proxibanque.metier.Agency;
/**
 * Classe permettant de caract�riser un r�seau d'agence via sa liste d'agences.
 * @author Adminl (Sarah Ourabah et Sandy Colin)
 *
 */
public class AgencyNetwork {
	
	public List<Agency> agencies;
	
	/**
	 * Constructeur par d�faut de la classe AgencyNetwork
	 */ 	
	public AgencyNetwork() {
		this.agencies = new ArrayList<>();
	}

}
