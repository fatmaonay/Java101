import java.util.Scanner;
public class MyClass {
    public static void main(String args[]) {
      double pi=3.14, r, alfa, alan;
      
      Scanner inp = new Scanner(System.in);
      System.out.print("Yarıçap Değerini Giriniz: ");
      r = inp.nextDouble();
      
      System.out.print("Açı Değerini Giriniz: ");
      alfa = inp.nextDouble();
      
      alan = (pi*(r*r)*alfa)/360;
      
      System.out.print("Dairenin Alanı: " + alan);
      
    }
}
