import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int day=0, month=0, year=0, monthpair, monthimpair;
        boolean error= true;
        Scanner entrada = new Scanner(System.in);

        while (error) {
            error = false;
            System.out.println("Escriba un dia");
            day = entrada.nextInt();
            System.out.println("Escriba un mes del 1 al 12");
            month = entrada.nextInt();
            System.out.println("Escriba un año");
            year = entrada.nextInt();

            if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12) {
                if (day==31){
                    if (month != 12) {
                        month++;
                        day = 1;
                    } else {
                        day = 1;
                        month = 1;
                        year++;
                    }
                } else {
                    day++;
                }
            } else if (month == 4 || month == 6 || month == 9 || month == 11) {
                monthpair = month;
                if (day == 30){
                    month++;
                    day = 1;
                } else {
                    day++;
                }
            } else if (month == 2) {
                if (day > 28){
                    error = true;
                }
                if (day == 28){
                    day = 1;
                    month++;
                } else {
                    day++;
                }
            }

            if (month > 12 || month <= 0 || day < 1 || day > 31){
                error = true;
            }

            if (error){
                System.out.println("Has introducido algún dato erróneamente, indtroduzcalo de nuevo");
            }
        }

        System.out.println("El siguiente dia va a ser el " + day + " del mes numero " + month
        + " de " + year);
    }
}