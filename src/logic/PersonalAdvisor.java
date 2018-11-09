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
		this.clients = new ArrayList<>();
	}
	
	public PersonalAdvisor (String id, List<Client> clients) {
		this(id);
		this.clients = clients;
		
		this.clients = new ArrayList<>();
		this.clients.add(new Client("Jean","Peplu","rue St Marc",93800, "Epinay", "032648972"));
		this.clients.add(new Client("Jean","Fini","rue St 24",93800, "Villetaneuse", "032648972"));
		this.clients.add(new Client("Jean","Part","rue Marc",93450, "Epinay", "032648972"));
		this.clients.add(new Client("Jean","Bon","rue St Leu",93800, "Epinay", "032848972"));
		
		
		
	}

}
