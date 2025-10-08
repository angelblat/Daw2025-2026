import java.time.LocalDate;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        LocalDate fecha, anios;
        Scanner entrada = new Scanner(System.in);

        System.out.println("Ingrese la fecha actual con formato año-mes-dia. Ejemplo (2001-03-21)");
        fecha = LocalDate.parse(entrada.next());

        anios = LocalDate.now() - fecha;

    }
}