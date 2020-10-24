package ornek3;

public class AnaProgram_1 {

	public static void main(String[] args) {
		GalericiInsan patron;
		patron=new GalericiInsan("Taylan Mandacý");

		Araba araba1,araba2;
		araba1=new Araba("06 TS 002");
		araba2=new Araba("03 TS 002");
		Araba yeni=new Araba("04 TT 006");
		patron.setGaleriAdi("Ayyýldýz");

		patron.arabaEkle(araba1);
		patron.arabaEkle(araba2);
		System.out.println(patron.toString());
		
		patron.arabaSat(araba1);
		System.out.println(patron.toString());
		patron.arabaSat(araba2);
		System.out.println(patron.toString());
		
		patron.arabaEkle(yeni);
		System.out.println(patron.toString());
		
		

	}

}
