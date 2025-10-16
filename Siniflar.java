package baslangic;

public class Siniflar {

	public static void main(String[] args) {
		// object oriented programming
		// SınıfAdı objeAdı = new SınıfAdı();
		// constructor(Yapıcı)
		
		HesapMakinesi m1 = new HesapMakinesi(10,5,"Siyah");
		
		System.out.println(m1.toplama());
		System.out.println(m1.cikarma());
		
		
	}

}
