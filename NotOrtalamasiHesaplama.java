package baslangic;
import java.util.Scanner;

public class NotOrtalamasiHesaplama {

	public static void main(String[] args) {
		int quiz,vize,ffinal;
		double ortalama;
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Quiz notunu giriniz:");
		quiz = input.nextInt();
		
		System.out.print("Vize notunu giriniz:");
		vize = input.nextInt();
		
		System.out.print("Fnal notunu giriniz:");
		ffinal = input.nextInt();
		
		ortalama = (quiz*0.2)+(vize*0.35)+(ffinal*0.45);
		
		System.out.println("Not ortalamanız:"+ortalama);
		String sonuc = (ortalama >= 50) ?"Gectiniz" : "Kaldınız";
		System.out.print(sonuc);
		
	
	}

}
