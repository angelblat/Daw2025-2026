import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int num1 = 0, num2 = 0, answer, addition, subtraction, multiplication, division;
        Scanner entrada = new Scanner(System.in);

        do {
            System.out.println("Escriba una de las siguientes opciones\n1. Suma\n2. Resta\n3. Multiplicación\n4. División\n5. Salir");
            answer = entrada.nextInt();
            if (answer >= 1 && answer <= 4) {
                System.out.println("Introduce el primer número");
                num1 = entrada.nextInt();
                System.out.println("Introduce el segundo número");
                num2 = entrada.nextInt();
            }

            if (answer == 1) {
                addition = num1 + num2;
                System.out.println("la suma de " + num1 + " y " + num2 + " es " + addition);
            }

            if (answer == 2) {
                subtraction = num1 - num2;
                System.out.println("la resta de " + num1 + " y " + num2 + " es " + subtraction);
            }

            if (answer == 3) {
                multiplication = num1 * num2;
                System.out.println("la multiplicación de " + num1 + " y " + num2 + " es " + multiplication);
            }

            if (answer == 4) {
                if (num2 != 0) { // Prevención de división por cero
                    division = num1 / num2;
                    System.out.println("la división de " + num1 + " y " + num2 + " es " + division);
                } else {
                    System.out.println("Error: No se puede dividir por cero.");
                }
            }

            if (answer == 5) {
                System.out.println("Has seleccionado salir, saliendo...");
            }
            
        } while (answer != 5 );
    }
}