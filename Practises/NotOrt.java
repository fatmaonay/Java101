import java.util.Scanner;
public class NotOrt {
    public static void main(String args[]) {
      //Değişkenlerimizi oluşturduk.
      int mat, fizik, kimya, turkce, tarih, muzik;
      
      //Scanner sınıfımızı tanımlıyoruz.
      Scanner inp = new Scanner(System.in);
      
      //Kullanıcıdan değerleri alıyoruz.
      System.out.print("Matematik Notunuzu Giriniz: ");
      mat = inp.nextInt();
      
      System.out.print("Fizik Notunuzu Giriniz: ");
      fizik = inp.nextInt();
      
      System.out.print("Kimya Notunuzu Giriniz: ");
      kimya = inp.nextInt();
      
      System.out.print("Türkçe Notunuzu Giriniz: ");
      turkce = inp.nextInt();
      
      System.out.print("Tarih Notunuzu Giriniz: ");
      tarih = inp.nextInt();
      
      System.out.print("Müzik Notunuzu Giriniz: ");
      muzik = inp.nextInt();
      
      int toplam = (mat+fizik+kimya+turkce+tarih+muzik);
      double sonuc = toplam / 6;
      
      System.out.println("Geçme Durumunuz: " + (sonuc>60 ? "Sınıfı Geçti" : "Sınıfta Kaldı"));
    }
}
