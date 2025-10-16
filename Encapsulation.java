package baslangic;

public class Encapsulation {

	/*
	 * Kapsülleme -> tanımladığımız bir sınıf içerisindeki değişkenin direk olarak değiştirilememesi, bunun yerine bizim izin veridğimiz ölçüde,
	 * metotlar aracılığıyla değiştirilmesi gerekmektedir
	 */
	public String name,author,publisher;
	private int numberOfPage;
	
	Encapsulation(String name,String author,String publisher,int numberOfPage){
		this.name = name;
		this.author = author;
		this.publisher = publisher;
		if(numberOfPage<1) {
			this.numberOfPage = 10;
		}
		else {
			this.numberOfPage = numberOfPage;
		}
	}
	
	public void pageSize() {
		System.out.println(numberOfPage);
	}
	 
	

}
