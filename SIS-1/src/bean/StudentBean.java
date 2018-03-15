package bean;

public class StudentBean {

	private String sid;
	private String name;
	private int credit_taken;
	private int credit_graduate;
	private int credit_end_of_term;
	
	public StudentBean(String sid, String name, int credit_taken, int credit_graduate, int credit_end_of_term)
	{
		this.sid = sid;
		this.name = name;
		this.credit_taken = credit_taken;
		this.credit_graduate = credit_graduate;
		this.credit_end_of_term = credit_end_of_term;
	}

	public String getSid() {
		return sid;
	}

	public void setSid(String sid) {
		this.sid = sid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getCredit_taken() {
		return credit_taken;
	}

	public void setCredit_taken(int credit_taken) {
		this.credit_taken = credit_taken;
	}

	public int getCredit_graduate() {
		return credit_graduate;
	}

	public void setCredit_graduate(int credit_graduate) {
		this.credit_graduate = credit_graduate;
	}
	
	public void setCredit_end_of_term(int credit_end_of_term) {
		this.credit_end_of_term = credit_end_of_term;
	}

	public int getCredit_end_of_term() {
		return credit_end_of_term;
	}
}
