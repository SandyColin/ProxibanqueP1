package fr.formation.proxibanque.persistence;

import java.util.ArrayList;
import java.util.List;

import fr.formation.proxibanque.metier.Agency;

public class AgencyNetwork {
	
	public List<Agency> agencies;
	
	public AgencyNetwork() {
		this.agencies = new ArrayList<>();
	}

}
