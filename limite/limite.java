import java.util.Scanner;

public class limite{
  static int num1;
  static int num2;
  public static  void main(String[] args){
    System.out.print("digite el priemer nuemero: ");
    Scanner entrada = new Scanner(System.in);
    num1 = entrada.nextInt();

    System.out.print("digite el segundo nuemero: ");
    Scanner entrada2 = new Scanner(System.in);
    num2 = entrada2.nextInt();

    System.out.println(num1);
    System.out.println(num2);
  }


}
