package insuranceModel;

public class IndividualInsurance implements IRDA {
	private int duration;
	private double amount;
	
	IndividualInsurance()
	{
		System.out.println("Individual-Insurance");
	}
	
	
	public int getDuration() {
		return duration;
	}



	public void setDuration(int duration) {
		this.duration = duration;
	}



	public double getAmount() {
		return amount;
	}



	public void setAmount(double amount) {
		this.amount = amount;
	}



	@Override
	public double calculatePremium( int age) {
		// TODO Auto-generated method stub
		return amount*age/duration;
	}


}
