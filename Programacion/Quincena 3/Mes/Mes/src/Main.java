import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int mes;
        boolean fin = false;  // Variable de control para salir del ciclo
        Scanner entrada = new Scanner(System.in);

        while (!fin) {  // El ciclo sigue hasta que fin sea verdadero
            System.out.println("Introduce un mes por su número (1-12):");
            mes = entrada.nextInt();

            switch (mes) {
                case 1:
                    System.out.println("El mes introducido es Enero");
                    break;
                case 2:
                    System.out.println("El mes introducido es Febrero");
                    break;
                case 3:
                    System.out.println("El mes introducido es Marzo");
                    break;
                case 4:
                    System.out.println("El mes introducido es Abril");
                    break;
                case 5:
                    System.out.println("El mes introducido es Mayo");
                    break;
                case 6:
                    System.out.println("El mes introducido es Junio");
                    break;
                case 7:
                    System.out.println("El mes introducido es Julio");
                    break;
                case 8:
                    System.out.println("El mes introducido es Agosto");
                    break;
                case 9:
                    System.out.println("El mes introducido es Septiembre");
                    break;
                case 10:
                    System.out.println("El mes introducido es Octubre");
                    break;
                case 11:
                    System.out.println("El mes introducido es Noviembre");
                    break;
                case 12:
                    System.out.println("El mes introducido es Diciembre");
                    break;
                default:
                    System.out.println("No has introducido un número válido, vuelve a introducir otro número");
                    fin = true;  // Sale del ciclo solo si se ingresa un número no válido
            }
        }

        entrada.close();  // Cerramos el Scanner después de terminar el ciclo
    }
}
