import java.util.Scanner;

public class Combination {
    public static void main(String args[]) {
      int b, t, total=1;
      Scanner inp = new Scanner(System.in);
      
      System.out.println("Üssü alınacak sayı: ");
      b = inp.nextInt();
      System.out.println("Üs olacak sayı: ");
      t = inp.nextInt();
      
      for(int i = 1; i<=t; i++){
          total *= b;
      }
      System.out.println("Sonuç: " + total);
    }
}
