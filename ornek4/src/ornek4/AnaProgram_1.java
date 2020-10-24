package ornek4;

public class AnaProgram_1 {

	public static void main(String[] args) {
		Child aChild;
		KinderGarten rChild;
		aChild=new Child("Gurkan Guntekin",3);
		rChild=new KinderGarten("Gurkan Guntekin");
		rChild.addChild(aChild);
		aChild.setAgeInMonths(3);
		System.out.println(aChild.getChildname());
		System.out.println(aChild.getAgeInMonths());
		System.out.println("Çocuk Sayýsý:"+rChild.getChildCount());

		
	}

}
