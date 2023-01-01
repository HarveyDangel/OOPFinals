public class Main
{
	public static void main(String[] args)
	{
		customer customer; //create object costumer

		RegCustomer regcustomer = new RegCustomer("Anne", 199); // new object of the Regcustomer class (Name, Amount)
		SeniorCustomer seniorcustomer = new SeniorCustomer("Jeff", 199); // new object of the Artillerytank class (Name, Amount)

		customer = regcustomer; // morphing the superclass object into subclass object 
		System.out.println(regcustomer.calculatebill()+" is the bill of "+regcustomer.getName());
		
		customer = seniorcustomer; // morphing the superclass object into subclass object 
		System.out.println(seniorcustomer.calculatebill()+" is the bill of " +seniorcustomer.getName()); 
	}
}
