package ornek4;

public class AnaProgram_1 {

	public static void main(String[] args) {
		Toy toy1=new Toy("0X2DE", "Araba", 2);
		Clothing clot1=new Clothing("1X4AS", "Ayakkabý", 12, 36);
		
		Child clild1=new Child("Emre Can"); 
		clild1.setAgeInMonths(33);
		
		Child clild2=new Child("Dursun Er");
		clild2.setAgeInMonths(23);
		
		Child clild3=new Child("Durssssun Er");
		clild3.setAgeInMonths(233);
		
		Child clild4=new Child("Dursyyyun Er");
		clild4.setAgeInMonths(243);
		
		KinderGarten kinderGart=new KinderGarten();
		boolean ekleme=kinderGart.addChild(clild1);
		boolean ekleme1=kinderGart.addChild(clild2);
		boolean ekleme3=kinderGart.addChild(clild3);
		boolean ekleme4=kinderGart.addChild(clild4);
		System.out.println("En Büyük Yaþa Sahip çocuk: "+kinderGart.findOldestChild().getAgeInMonths());
		System.out.println("Ekleme baþarý durumu: "+ekleme+"\n Eklenen Çocuðun ismi: "+kinderGart.child[0].getChildname()+" Çocuðun Yaþý: "+kinderGart.child[0].getAgeInMonths());
		System.out.println("Ekleme baþarý durumu: "+ekleme+"\n Eklenen Çocuðun ismi: "+kinderGart.child[1].getChildname()+" Çocuðun Yaþý: "+kinderGart.child[1].getAgeInMonths());

		
	}

}
