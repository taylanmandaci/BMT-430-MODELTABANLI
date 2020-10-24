package ornek4;

public class KinderGarten {
	private Child[] childs;
	private Child[] age;
	private int childcount=0;
	public boolean addChild(Child aChild) {
		childs[childcount]=aChild;
		childcount++;
		return true;
	}
	public KinderGarten(String childs) {
		this.childs=new Child[100];
	}
	public Child findOldestChild() {
		
		return age[childcount];
		
	}
	public int getChildCount() {
		return this.childcount;
	}
	
	

}
