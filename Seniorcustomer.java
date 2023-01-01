class SeniorCustomer extends customer{
	private double discount = 0.20;
	// costructor of the subclass Regcustomer
	public SeniorCustomer(String name, int amount){	
		super(name, amount); // calling the costructor of the superclass via "super" to be used by subclass
	}

	@Override
	public double calculatebill()
	{
		// TODO: Implement this method
		amount=amount-(amount*discount);
		return amount;
	}

}
