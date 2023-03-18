import java.util.Scanner;

public class HesapMakinesi {
    public static void main(String args[]) {
      double n1, n2;
      
      Scanner input = new Scanner(System.in);
      System.out.print("Birinci Sayıyı Giriniz: ");
      n1 = input.nextDouble();
      System.out.print("İkinci Sayıyı Giriniz: ");
      n2 = input.nextDouble();
      
      System.out.println("İŞLEMLER\n1-Toplama\n2-Çıkarma\n3-Çarpma\n4-Bölme");
      System.out.print("İşlem seçiminiz nedir?: ");
      int select = input.nextInt();
      
      switch (select){
          case 1:
              System.out.println("Sonuç: " + (n1+n2));
              break;
          case 2:
              System.out.println("Sonuç: " + (n1-n2));
              break;
          case 3:
              System.out.println("Sonuç: " + (n1*n2));
              break;
          case 4:
              System.out.println("Sonuç: " + (n1/n2));
              break;
          default:
              System.out.println("Yanlış seçenek girdiniz!!");
      }
    }
}
