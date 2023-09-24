import java.util.Scanner;
public class KDVTutar {
    public static void main(String args[]) {
      //Değişkenlerimizi oluşturduk.
      double tutar, kdvOran, kdvTutar, kdvliTutar;
      
      //Scanner sınıfımızı tanımlıyoruz.
      Scanner inp = new Scanner(System.in);
      
      //Kullanıcıdan değerleri alıyoruz.
      System.out.print("Alınacak Tutarı Giriniz: ");
      tutar = inp.nextDouble();
      
      kdvOran = (tutar>0 && tutar<1000 ? 0.18 : 0.08);
      kdvTutar = tutar * kdvOran;
      kdvliTutar = tutar + kdvTutar;
     
      System.out.println("KDV'siz Tutarı Giriniz: " + tutar);
      System.out.println("KDV Oranı: " + kdvOran);
      System.out.println("KDV Tutarı: " + kdvTutar);
      System.out.println("KDV'li Tutar: " + kdvliTutar);
      
    }
}
