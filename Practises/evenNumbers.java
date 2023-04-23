import java.util.Scanner;

public class MyClass {
    public static void main(String args[]) {
      int k, total=0, numbers=0;
      double average;
      Scanner inp = new Scanner(System.in);
      
      System.out.print("Bir sayı giriniz: ");
      k = inp.nextInt();
      
      for(int i = 0; i<=k; i++){
          if(i%12==0){
              total += i;
              numbers++;
          }
      }
      average = total / numbers;
      System.out.println("Ortalamanız: " + average);
    }
}
