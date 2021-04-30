
public class Student extends User {

	private String creditCardNo;

	public Student(int id, String firstName, String lastName, String eMail, String passWord, String creditCardNo) {
		super(id, firstName, lastName, eMail, passWord);
		this.creditCardNo = creditCardNo;
	}
	
	public Student() {
		
	}

	public String getCreditCardNo() {
		return creditCardNo;
	}

	public void setCreditCardNo(String creditCardNo) {
		this.creditCardNo = creditCardNo;
	}
}
