package siniflar_ornek;

public class polindromik {

	public static void main(String[] args) {
		String str = "kapak", temp="";
		
		for(int i= str.length()-1; i>=0; i--) {
			temp+=str.charAt(i); //charAt() fonksiyonu, bir String içindeki belli bir konumda (indekste) bulunan karakteri döndürür.
		}
		if(temp.equals(str)) {
			System.out.print("Polindromik");

		}
		
	}

}
