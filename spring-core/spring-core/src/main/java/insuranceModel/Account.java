package insuranceModel;

public class Account {

	private double AccNo;
	private String AccType;
	private double Initbal;
	public double getAccNo() {
		return AccNo;
	}
	public void setAccNo(double accNo) {
		AccNo = accNo;
	}
	public String getAccType() {
		return AccType;
	}
	public void setAccType(String accType) {
		AccType = accType;
	}
	public double getInitbal() {
		return Initbal;
	}
	public void setInitbal(double initbal) {
		Initbal = initbal;
	}

	@Override
	public String toString() {
		return "Account [AccNo=" + AccNo + ", AccType=" + AccType + ", Initbal=" + Initbal + "]";
	}

	
	
	
}
