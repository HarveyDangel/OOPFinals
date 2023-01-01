abstract class customer{
	// private and protected attributes of superclass customer
	private String name;
	protected double amount;
	// constructor of superclass customer with parameters 
	public customer (String name, int amount){
		this.name = name;
		this.amount = amount;
	}
	//abstract method of superclass customer
	public abstract double calculatebill();
	//methods of the superclass
	public String getName(){
		return name;
	}
	public void setName(String name){
		this.name=name;
	}
	public double getAmount(){
		return amount;
	}
	public void setAmount(int amount){
		this.amount=amount;
	}
}
