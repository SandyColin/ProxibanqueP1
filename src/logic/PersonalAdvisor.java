package logic;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import fr.formation.exos.quizz.Answer;

public class PersonalAdvisor {
	public Map<String,Client> clientSheet;
	public String id;
	public List<Client> clients;
	public String personalAdvisor;
	public int currentClient;
	
	public PersonalAdvisor() {
		this.clients = new ArrayList<>();
		}
	
	public PersonalAdvisor (String id) {
		this.id = id;
		this.clients = new ArrayList<>();
	}
	
	
	private void nextClient() {
			for (this.currentClient = 0; currentClient < clients.size(); currentClient++) {
			this.nextClient();}
				this.clientSheet.put("1.", personalAdvisor.clients.get(0));
				this.clientSheet.put("2.", question.answers.get(1));
				this.clientSheet.put("3.", question.answers.get(2));
				this.clientSheet.put("4.", question.answers.get(3));	
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
