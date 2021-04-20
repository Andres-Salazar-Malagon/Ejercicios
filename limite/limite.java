import java.util.Scanner;

public class limite{
  static int num1;
  static int num2;
  public static  void main(String[] args){
    int i;

    System.out.print("digite el limite inferior: ");
    Scanner entrada = new Scanner(System.in);
    num1 = entrada.nextInt();

    System.out.print("digite el limite superior: ");
    Scanner entrada2 = new Scanner(System.in);
    num2 = entrada2.nextInt();

    for(i=num1; i<=num2; i++){
      if(i % 2 == 0){
        System.out.println("El numero es par: "+i);
      }else{
        System.out.println("El numero no es par: "+i);
      }
    }
  }


}
