package baslangic;

//overloading nedir: Java’da fonksiyonlarda aşırı yüklenme (method overloading), aynı isimde birden fazla 
//metod tanımlayabilmektir. Bu metotlar farklı parametre listelerine (sayısı, tipi ya da sırası farklı) sahip olmalıdır.

public class fonksiyonlarda_overloading {
    // 2 int sayıyı toplar
    public int topla(int a, int b) {
        return a + b;
    }

    // 3 int sayıyı toplar
    public int topla(int a, int b, int c) {
        return a + b + c;
    }

    // 2 double sayıyı toplar
    public double topla(double a, double b) {
        return a + b;
    }

    public static void main(String[] args) {
        Hesaplama h = new Hesaplama();

        System.out.println(h.topla(2, 3));       // int versiyonu -> 5
        System.out.println(h.topla(2, 3, 4));    // 3 parametreli versiyon -> 9
        System.out.println(h.topla(2.5, 3.7));   // double versiyonu -> 6.2
    }


}
