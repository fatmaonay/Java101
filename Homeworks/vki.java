import java.util.Scanner;
public class MyClass {
    public static void main(String args[]) {
      double m, kg, vki;
      
      Scanner inp = new Scanner(System.in);
      System.out.print("Lütfen boyunuzu (metre cinsinde) giriniz: ");
      m = inp.nextDouble();
      
      System.out.print("Lütfen kilonuzu giriniz: ");
      kg = inp.nextDouble();
      
      vki = kg / (m*m);
      System.out.print("Vücut kitle indeksiniz: " + vki);
     
    }
}
