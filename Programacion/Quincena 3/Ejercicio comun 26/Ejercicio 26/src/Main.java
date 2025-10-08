import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int day=0, month=0, year=0, currentday=7, currentmonth=11, currentyear=2025, actualday =0, actualmonth=0, actualyear = 0;
        boolean error= true;
        Scanner entrada = new Scanner(System.in);

        while (error) {
            error = false;
            System.out.println("Escribe el dia que naciste");
            day = entrada.nextInt();
            System.out.println("Escribe el mes que naciste");
            month = entrada.nextInt();
            System.out.println("Escribe el año que naciste");
            year = entrada.nextInt();

            if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12) {
               if (day <= 0 || day > 31){
                   error = true;
               }
            } else if (month == 4 || month == 6 || month == 9 || month == 11) {
                if (day <= 0 || day > 30){
                    error = true;
                }
            } else if (month == 2) {
                if (day > 28 || day <= 0) {
                    error = true;
                }
            }

            if (month > 12 || month <= 0 || day < 1 || day > 31){
                error = true;
            }

            if (currentyear - year <= 0) {
                error=true;
            }

            if (error){
                System.out.println("Has introducido algún dato erróneamente, indtroduzcalo de nuevo");
            }
        }

        if (currentday - day < 0) {
            if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12) {
               actualday = 31 + currentday - day;
               actualmonth = currentmonth++;
            } else if (month == 4 || month == 6 || month == 9 || month == 11) {
                actualday = 30 + currentday - day;
                actualmonth = month++;
            } else if (month == 2) {
                actualday = 28 + currentday - day;
                actualmonth = currentmonth++;
            }
        }

        if (currentmonth - month < 1 ){
            year++;
            actualyear = (currentyear - year);
            actualmonth = month--;
        }

        if (currentday - day >= 1) {
            actualday = currentday - day;
        }



        



        System.out.println("Tienes " + actualyear + " años, " + actualmonth + " meses y " + actualday + " dias." );

    }
}