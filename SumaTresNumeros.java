public class SumaTresNumeros {
   public static void main(String[] args) {
      int numero1 = 5;
      int numero2 = 10;
      int numero3 = 15;
      int resultado = sumaTresNumeros(numero1, numero2, numero3);
      System.out.println("La suma de los tres números es: " + resultado);
   }

   public static int sumaTresNumeros(int num1, int num2, int num3) {
      int suma = num1 + num2 + num3;
      return suma;
   }
}
