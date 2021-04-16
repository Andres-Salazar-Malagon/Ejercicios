public class calculadora{
  private int num1;
  private int num2;

  public static void main(String[] args){
    calculadora micalculadora = new calculadora(10,2);

    int suma = micalculadora.sumar();
    System.out.println ("la suma"+suma);
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