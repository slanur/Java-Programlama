package sayi_tahmin_oyunu;

import java.util.Random;
import java.util.Scanner;

public class SayiTahminOyunu {

	public static void main(String[] args) {
		int tahmin;
		int tahminHakki = 5;
		Scanner input = new Scanner(System.in);
		Random random = new Random();
		int sayi = random.nextInt(100); 
		
		
		while(tahminHakki>0) {
			System.out.print("Tahmininizi giriniz:");
			tahmin = input.nextInt();
			if(tahmin > sayi){
				System.out.println("Daha kucuk bir sayi giriniz!!");
			}
			else if(tahmin < sayi) {
				System.out.println("Daha buyuk bir sayi giriniz!!");
			}
			else {
				System.out.println("Doğru sayiyi buldunuz!!");
				break;
			}
			tahminHakki--;
			if(tahminHakki == 0) {
				System.out.print("Bulamadiniz! Doğru sayi:"+sayi);
			}
		}
		
	}

}
