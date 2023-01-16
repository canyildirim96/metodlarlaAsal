import java.util.Scanner;
public class Practice {
static String hello(String cumle){
    return cumle;
}
  static boolean isPrime(int number , int a){
      if(number % a == 0) return false;
      if (a * a > number) return true;
      return isPrime(number , ++a);
  }
    public static void main(String[] args){
    int number;
    Scanner inp = new Scanner(System.in);
        System.out.println(hello("Programımıza Hoş Geldiniz"));
        do {
            System.out.print(hello("Lütfen Değer Giriniz: "));
            number = inp.nextInt();

            if (isPrime(number,2)) System.out.print(number + " Asal Sayıdır.");
            else System.out.println(number + " Asal Sayı Değildir.");
            System.out.println();

        }while (number >0);
        System.out.println(hello("Tekrar Görüşmek Dileğiyle, Hoşçakalın."));

    }
}
