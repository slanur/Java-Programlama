package baslangic;

public class getter_setter_main {

	public static void main(String[] args) {
		getter_setter book1 = new getter_setter("Harry Potter","Rowling","Kodlama Vakti",400);
		System.out.println(book1.getNumberOfPage());
		book1.setNumberOfPage(200);
		System.out.println(book1.getNumberOfPage());

	}

}
