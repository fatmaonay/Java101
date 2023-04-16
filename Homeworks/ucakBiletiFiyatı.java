import java.util.Scanner;

public class MyClass {
    public static void main(String args[]) {
      int yas, tip, mesafe, fiyat;
      double normalFiyat, yasIndirimi, indirimliFiyat, toplam; 
      Scanner inp = new Scanner(System.in);
      
      System.out.println("Yaşınızı giriniz: ");
      yas = inp.nextInt();
      System.out.println("Gideceğiniz mesafeyi giriniz: ");
      mesafe = inp.nextInt();
      System.out.println("Yolculuk tipini giriniz (Tek yön için 1'i, gidiş-dönüş için 2'yi tuşlayınız): ");
      tip = inp.nextInt();
      

      if(mesafe>0 && yas>0){
          switch(tip){
              case 1:
                  if(yas<12){
                      normalFiyat = mesafe * 0.10;
                      yasIndirimi = normalFiyat * 0.5;
                      indirimliFiyat = normalFiyat - yasIndirimi;
                      System.out.println("Toplam Fiyat: " + indirimliFiyat);
                  } else if(12<=yas && 24>yas){
                      normalFiyat = mesafe * 0.10;
                      yasIndirimi = normalFiyat * 0.1;
                      indirimliFiyat = normalFiyat - yasIndirimi;
                      System.out.println("Toplam Fiyat: " + indirimliFiyat);
                  } else if(yas>65){
                      normalFiyat = mesafe * 0.10;
                      yasIndirimi = normalFiyat * 0.3;
                      indirimliFiyat = normalFiyat - yasIndirimi;
                      System.out.println("Toplam Fiyat: " + indirimliFiyat);
                  } else{
                      normalFiyat = mesafe * 0.10;
                      System.out.println("Toplam Fiyat: " + normalFiyat);
                  }
                  break;
              case 2:
                  if(yas<12){
                      normalFiyat = mesafe * 0.10;
                      yasIndirimi = normalFiyat * 0.5;
                      indirimliFiyat =(normalFiyat - yasIndirimi) * 0.2;
                      System.out.println("Toplam Fiyat: " + indirimliFiyat);
                  } else if(12<=yas && 24>yas){
                      normalFiyat = mesafe * 0.10;
                      yasIndirimi = normalFiyat * 0.1;
                      indirimliFiyat = (normalFiyat - yasIndirimi) * 0.2;
                      System.out.println("Toplam Fiyat: " + indirimliFiyat);
                  } else if(yas>65){
                      normalFiyat = mesafe * 0.10;
                      yasIndirimi = normalFiyat * 0.3;
                      indirimliFiyat = (normalFiyat - yasIndirimi) * 0.2;
                      System.out.println("Toplam Fiyat: " + indirimliFiyat);
                  } else{
                      normalFiyat = mesafe * 0.10;
                      indirimliFiyat = normalFiyat * 0.2;
                      System.out.println("Toplam Fiyat: " + indirimliFiyat);
                  }
                  break;
              default:
                  System.out.println("Hatalı veri girdiniz, lütfen 1 veya 2'yi tuşlayın");
          }
      }
      else{
           System.out.println("Pozitif değer giriniz.");
      }
    }
}
