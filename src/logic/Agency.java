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
		this.personalAdvisors = new ArrayList<>();
		
		
		this.personalAdvisors.add(new PersonalAdvisor ("12345"));
		this.personalAdvisors.add(new PersonalAdvisor ("Jean1"));
		this.personalAdvisors.add(new PersonalAdvisor ("Jean2"));
		this.personalAdvisors.add(new PersonalAdvisor ("Jean3"));
	}
	
	
}
