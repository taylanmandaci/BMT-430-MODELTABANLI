package ornek4;

public class KinderGarten {
	private int max=100;
	Child[] child=new Child[max];
	private int count=0;
	public boolean addChild(Child childs) {
		this.child[count]=childs;
		count++;
		return true;
	}

	public Child findOldestChild() {
		int sira=0;
		for(int i=0;i<count-1;i++) {
			if(this.child[sira].getAgeInMonths()>this.child[i].getAgeInMonths()) {
				sira=i;
			}
			else {continue;}
		}
		return this.child[sira];
	}
	

}
