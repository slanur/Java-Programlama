package baslangic;

public class dizilerde_foreach_kullanımı {

	public static void main(String[] args) {
		int[] liste = new int[4];
		
		liste[0]=1;
		liste[1]=2;
		liste[2]=3;
		liste[3]=4;
		
		// foreach dizileri yazmak için bir yöntemdir
		for(int value:liste) {
			System.out.println(value);
		}
		
		// cok buyutlu dizilerde kullanımı
		/*
		 for(int satır: tablo){
		 	for(int value: satır){
		 		System.out.println(value);
		 	}
		 }
		 */
		

	}

}
