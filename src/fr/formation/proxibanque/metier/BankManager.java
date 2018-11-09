package fr.formation.proxibanque.metier;

/**
 * Classe permettant de caractériser un directeur d'agence via ses différents attributs
 * @author Adminl (Sarah Ourabah et Sandy Colin)
 *
 */
public class BankManager {

	public String id;
	public Agency agency;
	
	/**
	 * Constructeur de la classe BankManager
	 * @param id Identifiant du directeur d'agence
	 */ 
	public BankManager (String id) {
		this.id = id;
	}
}
