package ornek4;

public class Child {
	private final String name;
	public Child(String name) {
		this.name=name;
	}
	public Child(){
		this.name="";
	}
	public String getChildname() {
		return name;
	}
	private int ageInMonths;

	public int getAgeInMonths() {
		return ageInMonths;
	}
	public void setAgeInMonths(int ageInMonths) {
		this.ageInMonths = ageInMonths;
	}
}
