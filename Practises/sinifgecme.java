import java.util.Scanner;

public class MyClass {
    public static void main(String args[]) {
      int mat, turkce, fizik, kimya, muzik, ders = 5;
      double ort;
      
      Scanner input = new Scanner(System.in);
      System.out.println("Sınıfı geçme durumunuzu öğrenmek için notlarınızı giriniz.");
      
      System.out.print("Matematik notunuz: ");
      mat = input.nextInt();
      if(mat<0 || mat>100){
          mat = 0;
          ders--;
      }
      
      System.out.print("Türkçe notunuz: ");
      turkce = input.nextInt();
      if(turkce<0 || turkce>100){
          turkce = 0;
          ders--;
      }
      
      System.out.print("Fizik notunuz: ");
      fizik = input.nextInt();
      if(fizik<0 || fizik>100){
          fizik = 0;
          ders--;
      }
      
      System.out.print("Kimya notunuz: ");
      kimya = input.nextInt();
      if(kimya<0 || kimya>100){
          kimya = 0;
          ders--;
      }

      System.out.print("Müzik notunuz: ");
      muzik = input.nextInt();
      if(muzik<0 || muzik>100){
          muzik = 0;
          ders--;
      }
      
      ort = (mat+turkce+fizik+kimya+muzik)/ders;
      
      if(ort>=55){
          System.out.println("Tebrikler. Sınıfı geçtiniz!");
      }
      else{
          System.out.println("Üzgünüm. Sınıfta kaldınız. Gelecek dönem görüşmek üzere...");
      }
      System.out.print("Ortalamanız: " + ort);
      
    }
}
