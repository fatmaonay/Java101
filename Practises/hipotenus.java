import java.util.Scanner;
public class MyClass {
    public static void main(String args[]) {
      //Değişkenlerimizi oluşturduk.
      int k1, k2;
      double hipo, alan;
      
      //Scanner sınıfımızı tanımlıyoruz.
      Scanner inp = new Scanner(System.in);
      
      //Kullanıcıdan değerleri alıyoruz.
      System.out.print("Birinci Kenarın Uzunluğunu Giriniz: ");
      k1 = inp.nextInt();
      
      System.out.print("İkinci Kenarın Uzunluğunu Giriniz: ");
      k2 = inp.nextInt();
      
      hipo = Math.sqrt((k1*k1) + (k2*k2));
      System.out.println("Hipotenüs Değeri: " + hipo);
      
      alan = (k1*k2)/2;
      System.out.println("Üçgenin Alanı: " + alan);

    }
}
