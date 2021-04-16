import java.util.Scanner;

public class calculadora{
  static int num1;
  static int num2;

  public static void main(String[] args){

    //Scanner entrada = new Scanner(System.in);

    int numero;
    System.out.print("digite el priemer nuemero: ");
    Scanner entrada = new Scanner(System.in);
    num1 = entrada.nextInt();

    System.out.print("digite el segundo nuemero: ");
    Scanner entrada2 = new Scanner(System.in);
    num2 = entrada2.nextInt();

    System.out.print("Seleccione una de las siguientes opciones:\n1.Suma\n2.Resta\n3.Multiplicación\n4.Divicion\n");
    Scanner entrada3 = new Scanner(System.in);
    numero = entrada3.nextInt();

    calculadora micalculadora = new calculadora(num1,num2);

    if (numero == 1){
      int suma = micalculadora.sumar();
      System.out.println ("la suma es: "+suma);
    }
    if (numero == 2){
      int resta = micalculadora.restar();
      System.out.println ("la resta es: "+resta);
    }
    if (numero == 3){
      int mult = micalculadora.multi();
      System.out.println ("la multiplicacion es: "+mult);
    }
    if (numero == 4){
      double divi = micalculadora.dividir();
      System.out.println ("la divicion es: "+divi);
    }
    
    
  }

  public calculadora(){

  }
  public calculadora(int num1, int num2){
    this.num1=num1;
    this.num2=num2;
  }

  public int sumar(){
    int suma = this.num1 + this.num2;
    return suma;
  }
  public int restar(){
    int resta = this.num1 - this.num2;
    return resta;
  }
  public int multi(){
    int mult = this.num1 * this.num2;
    return mult;
  }
  public double dividir(){
    double divi = (double)this.num1 / (double)this.num2;
    return divi;
  }

  public int getNum1(){
    return num1;
  }
  public void setNum1(int num1){
    this.num1 = num1;
  }
  public int getNum2(){
    return num2;
  }
  public void setNum2(int num1){
    this.num2 = num2;
  }

}