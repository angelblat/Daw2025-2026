import java.text.NumberFormat;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int num1, num2, suma, resta, multiplicacion, division, resto, incremento1, decremento1, incremento2, decremento2;
        Scanner entrada = new Scanner(System.in);


        System.out.println("Introduce el primer número");
        num1 = entrada.nextInt();
        System.out.println("Introduce el segundo número");
        num2 = entrada.nextInt();

        suma = num1 + num2;
        resta = num1 - num2;
        multiplicacion = num1 * num2;
        division = num1 / num2;
        resto = num1 % num2;
        incremento1 = num1+1;
        decremento1 = num1-1;
        incremento2 = num2+1;
        decremento2 = num2-1;


        System.out.println("la suma de los dos números introducidos es " + suma);
        System.out.println("la resta de los dos números introducidos es " + resta);
        System.out.println("la multiplicación de los dos números introducidos es " + multiplicacion);
        System.out.println("la división de los dos números introducidos es " + division);
        System.out.println("el resto de la división de los dos números introducidos es " + resto);
        System.out.println("el incremento de num1 es " + incremento1);
        System.out.println("el decremento de num1 es " + decremento1);
        System.out.println("el incremento de num2 es " + incremento2);
        System.out.println("el decremento de num2 es " + decremento2);

        


    }
}