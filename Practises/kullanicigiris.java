import java.util.Scanner;

public class MyClass {
    public static void main(String args[]) {
      String userName = "Java101" , password = "1234", login_userName, login_password, newPassword;
      int select;
      
      Scanner inp = new Scanner(System.in);
      
      System.out.print("Kullanıcı adınızı giriniz: ");
      login_userName = inp.nextLine();
      System.out.print("Şifrenizi giriniz: ");
      login_password = inp.nextLine();
      
      if(login_userName.equals(userName) && login_password.equals(password)){
          System.out.print("Giriş başarılı!");
      }
      else{
          System.out.println("Yanlış bilgi girişi!!");
          System.out.println("Şifrenizi değiştirmek istemiyorsanız 1'i, değiştirmek istiyorsanız 2'yi tuşlayınız. ");
          select = inp.nextInt();
          switch(select){
              case 1:
                  System.out.print("İşlem sonlanmıştır. İyi günler.");
                  break;
              case 2:
                  Scanner parola = new Scanner(System.in);
                  System.out.print("Yeni şifrenizi giriniz: ");
                  newPassword = parola.nextLine();
                  if(newPassword.equals(password)){
                      System.out.print("Yeni şifreniz eskisi ile aynıdır. Tekrar deneyiniz.");
                  }else{
                      System.out.print("Şifreniz başarıyla değiştirilmiştir.");
                  }
                  break;
              default:
                  System.out.print("Geçersiz giriş!");
                  break;
          }
      }
    }
}
