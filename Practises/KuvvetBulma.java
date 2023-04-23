import java.util.Scanner;

public class MyClass {
    public static void main(String args[]) {
      int n;
      Scanner inp = new Scanner(System.in);
      
      System.out.print("Bir sayı girin: ");
      n = inp.nextInt();
      
      for(int i = 1; i <= n; i*=4)
          System.out.print(i + " ");

      System.out.println();
      
      for(int j = 1; j <= n; j*=5)
          System.out.print(j + " ");

    }
}
