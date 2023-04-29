import java.util.Scanner;

public class Combination {
    public static void main(String args[]) {
      int n, r, sonuc, fark, totali = 1, totalj = 1, totalfark = 1;
      Scanner inp = new Scanner(System.in);
      
      System.out.println("n değerini giriniz: ");
      n = inp.nextInt();
      System.out.println("r değerini giriniz: ");
      r = inp.nextInt();
      fark = n - r;
      
      for(int i = 1; i<=n; i++){
          totali *= i;
      }for(int j = 1; j<=r; j++){
          totalj *= j;
      }for(int a = 1; a<=fark; a++){
          totalfark *= a;
      }
      
      sonuc = totali / (totalj * (totalfark));
      System.out.println("C("+n+","+r+")="+sonuc);
    }
}
