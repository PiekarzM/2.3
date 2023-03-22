import java.util.Random;
class Main {
  public static void main(String[] args) {
   Random liczba  = new Random();
    int a = liczba.nextInt(90)+10;
     System.out.println(a);
    int b = liczba.nextInt(90)+10;
     System.out.println(b);
    int c = liczba.nextInt(90)+10;
     System.out.println(c);
    int d = liczba.nextInt(90)+10;
     System.out.println(d);
    int e = liczba.nextInt(90)+10;
     System.out.println(e);

    int suma = a*a + b*b + c*c + d*d + e*e; 
    System.out.println("suma ="+ suma);
      
    
    
    
     
  }
}