package logic;

import java.util.ArrayList;
import java.util.List;

public class Agency {
	
	public String id;
	public String creationDate;
	public BankManager bankManager;
	public List<PersonalAdvisor> personalAdvisors;
	
	public Agency(String id, String creationDate) {
		this.id = id;
		this.creationDate = creationDate;
		
		//this.clients = new ArrayList<>();
		//this.clients.add("Jean","Peplu","rue St Marc",93800, "Epinay", "032648972");
		//this.clients.add("Jean","Fini","rue St 24",93800, "Villetaneuse", "032648972");
		//this.clients.add("Jean","Part","rue Marc",93450, "Epinay", "032648972");
		//this.clients.add("Jean","Bon","rue St Leu",93800, "Epinay", "032848972");
	}
	
	//public PersonalAdvisor (String id, List<Client> clients) {
		//this(id);
		//this.clients = clients;
		
		
		
		
		
	//}

}
