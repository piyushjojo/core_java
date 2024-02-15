package inheritance;

public class Faculty extends Person {
	private int expInYears;
	private String sme;

	public Faculty(String fn1, String ln1, int expInYears, String sme) {
		super(fn1, ln1);
		System.out.println("in faculty");
		this.expInYears = expInYears;
		this.sme = sme;
	}

	@Override
	public String toString() {
		return "Faculty " + super.toString() + " exp in years " + expInYears + " expert in " + sme;
	}

	// add new functionality teach : lastname teaching for yrs in domain
	public void teach() {
		System.out.println(getLastName() + " teaching for " + expInYears + " yrs , expert in " + sme);
	}

}
