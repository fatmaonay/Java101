import java.util.Scanner;
public class ManavKasa {
    public static void main(String args[]) {
      double armut, elma, domates, muz, patlican, toplam;
      
      Scanner inp = new Scanner(System.in);
      System.out.print("Kaç kilo armut aldığınızı giriniz: ");
      armut = inp.nextDouble();
      
      System.out.print("Kaç kilo elma aldığınızı giriniz: ");
      elma = inp.nextDouble();
      
      System.out.print("Kaç kilo domates aldığınızı giriniz: ");
      domates = inp.nextDouble();
      
      System.out.print("Kaç kilo muz aldığınızı giriniz: ");
      muz = inp.nextDouble();
      
      System.out.print("Kaç kilo patlıcan aldığınızı giriniz: ");
      patlican = inp.nextDouble();
      
      toplam = (armut*2.14) + (elma*3.67) + (domates*1.11) + (muz*0.95) + (patlican*5);
      System.out.print("Toplam tutar: " + toplam);
     
    }
}
