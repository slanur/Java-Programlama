package baslangic;

public class getter_setter {
	
	// getter-> class'ta private olarak tanımlanan bir değeri bastırmak için kullanılıyor
	// setter -> class'ta private olarak tanımlanan bir değişkenin değerini değiştirmek için kullanılır
	
	public String name,author,publisher;
	private int numberOfPage;
	
	getter_setter(String name,String author,String publisher,int numberOfPage){
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
	
	public int getNumberOfPage(){
		return this.numberOfPage;
	}
	
	public void setNumberOfPage(int size) {
		if(size<1) {
			System.out.println("Sayfa sayisi negatif olamaz");
			this.numberOfPage = 10;
		}
		else {
			this.numberOfPage = size;
		}
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getPublisher() {
		return publisher;
	}

	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}

}
