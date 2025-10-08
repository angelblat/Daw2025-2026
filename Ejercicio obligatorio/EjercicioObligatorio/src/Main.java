import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int year, month, day = 0, actualday = 0, actualmonth=0, actualyear=0;
        int error = 0;
        Scanner entrada = new Scanner(System.in);

            System.out.println("Introduce el año");
            year = entrada.nextInt();

                System.out.println("Introduce el mes");
                month = entrada.nextInt();
                if (month > 12 || month < 1) {
                    System.out.println("Has introducido un mes mayor que 12 o menor que 1");
                    error=1;
                }

                if (error==0) {
                    System.out.println("Introduce el dia");
                    day = entrada.nextInt();
                    if (day>31 || day <1){
                        System.out.println("No puede ser el dia menor que 1 o mayor que 31");
                        error = 1;
                    }
                    switch (month) {
                        case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                            if (error==0){
                                if (month == 12 && day >= 25){
                                    actualmonth=1;
                                    actualyear = year+1;
                                    actualday= (day + 7) - 31;
                                } else {
                                    actualmonth=month;
                                    actualyear = year;
                                    actualday= (day + 7);
                                }
                            }
                        case 4: case 6: case 9: case 11:
                            if (day < 1 || day > 30 && error == 0) {
                                System.out.println("Este mes tiene 30 días.");
                                error = 1;
                            } else if (error == 0 && day >= 24) {
                                actualmonth = month + 1;
                                actualday = (day + 7) -30;
                                actualyear = year;
                            } else {
                                actualmonth = month ;
                                actualday = (day + 7);
                                actualyear = year;
                            }
                        case 2:
                            if (day < 1 || day > 28 && error == 0) {
                                System.out.println("Febrero tiene máximo 28 días.");
                                error = 1;
                            } else if (error == 0 && day >= 22) {
                                actualmonth = month + 1;
                                actualday = (day + 7) - 28;
                                actualyear = year;
                            } else {
                                actualmonth = month ;
                                actualday = (day + 7);
                                actualyear = year;
                            }
                    }
                }

        if (error == 0) {
            System.out.println("Fecha válida: " + day + "/" + month + "/" + year);
            System.out.println("Fecha 7 dias después: " + actualday + "/" + actualmonth + "/" + actualyear);
        }

    }
}