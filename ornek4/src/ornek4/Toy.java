package ornek4;

public class Toy extends Item {
	private int minAgeLimit; 
	public Toy(String barcode, String description, int minAgeLimit) 
	{
		super(barcode, description); 
		this.minAgeLimit= minAgeLimit;
	}
	public boolean isSuitable(Child aChild) 
	{ 
		if( aChild.getAgeInMonths()/12 >= minAgeLimit) {return true; }
		else {return false;}
	}

}
