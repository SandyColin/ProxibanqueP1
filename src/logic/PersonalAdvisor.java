package logic;

import java.util.ArrayList;
import java.util.List;



public class PersonalAdvisor {
	
	public String id;
	public List<Client> clients;
	
	public PersonalAdvisor() {
	this.clients = new ArrayList<>();
	}
	
	public PersonalAdvisor (String id) {
		this.id = id;
	}

}
