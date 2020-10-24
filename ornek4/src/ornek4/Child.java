package ornek4;

public class Child {
	private final String name="";
	private String childname;
	private int age;
	public Child(String childname,int age) {
		this.childname=childname;
		this.age=age;
	}
	public String getChildname() {
		return childname;
	}
	private int ageInMonths;

	public int getAgeInMonths() {
		return ageInMonths;
	}
	public void setAgeInMonths(int ageInMonths) {
		this.ageInMonths = ageInMonths;
	}
	public String getName() {
		return name;
	}

}
