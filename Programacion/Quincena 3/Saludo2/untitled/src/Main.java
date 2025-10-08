import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        String nombre;
        Scanner entrada = new Scanner(System.in);

        System.out.println("Cual es su nombre?");
        nombre = entrada.nextLine();
        System.out.println("Buenos dias.\nSr/a. " + nombre + ".\nQue tenga un buen dia.");
    }
}