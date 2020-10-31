package ornek3;

public class GalericiInsan extends Insan {
	private String galeriAdi;
	private Araba[] arabalar;
	public final static int maxAraba = 30;
	private int arabaSayisi=0;
	public GalericiInsan(String isim) {
	super(isim);
	arabaSayisi=0;
	arabalar=new Araba[maxAraba];
	}
	public String getGaleriAdi () { return galeriAdi ;}
	public void setGaleriAdi(String galeriAdi ) {
	this.galeriAdi = galeriAdi ;
	}
	public String toString(){
		String tanitim=super.toString();
		tanitim="Merhaba adým:"+getIsim();
		tanitim+="\nÜstelik "+galeriAdi+" adlý bir galerim var.\n";
		tanitim+= "Galerimde " + arabaSayisi + " adet araba var.";
		return tanitim;
	}
	public void arabaMevcutmu(Araba araba) {
		for(int i=0;i<maxAraba;i++) {
			if(arabalar[i]==araba)
			{
				System.out.println("Araba Mevcut!");
				break;
			}
			else {
				arabalar[arabaSayisi]=araba;
				arabaSayisi++;
				break;
			}
		}
		
	}
	public boolean arabaEkle(Araba araba) {
		if(arabaSayisi<maxAraba) {
			arabaMevcutmu(araba);
			return true;
		}
		else {
			return false;
		}
	}
	public void arabaSat(Araba araba) {
		if(araba!=null)
		{
			for(int i=0;i<maxAraba;i++) {
				if(arabalar[i]==araba)
				{
					arabalar[arabaSayisi]=null;
					arabaSayisi--;
					break;
				}
			}
		}
	}

	
	
}
