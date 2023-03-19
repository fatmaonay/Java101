import java.util.Scanner;

public class MyClass {
    public static void main(String args[]) {
      int heat;
      
      Scanner input = new Scanner(System.in);
      System.out.print("Sıcaklık değerini giriniz: ");
      heat = input.nextInt();
      
      if(heat<5){
          System.out.print("Kayak yapmaya gidebilirsiniz.");
      }else if(heat>=5 && heat<=25){
          if(heat<=15){
              System.out.println("Sinemaya gitmeye ne dersin?");
          }
          if(heat>=10){
              System.out.println("Tam piknik havası!");
          }
      }
       else{
           System.out.print("Sıcaklar çok fena! Yüzmeye gidip biraz serinleyebilirsin.");
       }
    }
}
