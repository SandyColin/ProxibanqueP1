package logic;

import java.util.List;

public class Agency {
	
	public String id;
	public String creationDate;
	public BankManager bankManager;
	public List<PersonalAdvisor> personalAdvisor;
	
	public Agency(String id, String creationDate) {
		this.id = id;
		this.creationDate = creationDate;
	}

}
