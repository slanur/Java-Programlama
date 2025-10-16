package baslangic;

import java.util.Scanner;
// konsoldan veri almak için bu kütüphaneyi eklememiz gerekiyor
 
public class KonsoldanVeriAlma {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int a,b;
		
		System.out.println("A sayısını giriniz:");
		a = input.nextInt();
		System.out.println("B sayısını giriniz:");
		b = input.nextInt();
		
		System.out.println("A sayısı:"+a);
		System.out.println("B sayısı:"+b);
		
		double c;
		System.out.println("double türünde sayı giriniz:");
		c = input.nextDouble(); // konsoldan double türünde veri yazarken nokta yerine virgül kullanmalıyız
		
		String str;
		System.out.println("String bir ifade giriniz");
		str = input.nextLine(); // burada nextline yerine nex'de kullanabilirdik ama next sadece boşluğa kadar olan kısmı alıyor 
	}

}
