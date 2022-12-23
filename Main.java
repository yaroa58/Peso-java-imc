import java.util.Scanner;

class Main {
  public static void main(String[] args) {
   
    double peso;
    double altura;
    Scanner sc = new Scanner(System.in);
    System.out.println("Ingrese el peso de la persona en kg: ");
    peso = sc.nextDouble();
    System.out.println("Ingrese la altura de la persona en metros: ");
    altura = sc.nextDouble();
    sc.close();
    double imc = peso / (altura * altura);
    System.out.println("El IMC de la persona es: " + imc);
if (imc < 18.5) {
  System.out.println("La persona tiene bajo peso.");
} else if (imc >= 18.5 && imc < 24.9) {
  System.out.println("La persona tiene peso normal.");
} else if (imc >= 25 && imc < 30) {
  System.out.println("La persona tiene sobrepeso.");
} else if (imc >= 30 && imc < 35) {
  System.out.println("La persona tiene obesidad grado I.");
} else if (imc >= 35 && imc < 40) {
  System.out.println("La persona tiene obesidad grado II.");
} else {
  System.out.println("La persona tiene obesidad grado III.");
}


  }
  
}