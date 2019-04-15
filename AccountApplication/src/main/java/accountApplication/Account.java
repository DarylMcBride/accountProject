package accountApplication;

public class Account {

	private String fName;
	private String lName;
	private float accountNumber;

	public Account(String fName, String lName, float accountNumber) {
		this.fName = fName;
		this.lName = lName;
		this.accountNumber = accountNumber;
	}

	public String getfName() {
		return fName;
	}

	public void setfName(String fName) {
		this.fName = fName;
	}

	public String getlName() {
		return lName;
	}

	public void setlName(String lName) {
		this.lName = lName;
	}

	public float getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(float accountNumber) {
		this.accountNumber = accountNumber;
	}

}
