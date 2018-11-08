package logic;

public class Client {

	public String firstname;
	public String lastname;
	public String adress;
	public int zipCode;
	public String city;
	public int tel;
	public Account currentAccount;
	public Account savingAccount;
	public CreditCard creditCard;

	public Client(String firstname, String lastname, String adress, int zipCode, String city, int tel) {
		this.firstname = firstname;
		this.lastname = lastname;
		this.adress = adress;
		this.zipCode = zipCode;
		this.city = city;
		this.tel = tel;
		
	}
	
	
}