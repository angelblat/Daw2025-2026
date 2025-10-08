import java.util.Scanner;

/*• Una agencia de viajes necesita un programa que le ayude a determinar el coste de un billete
  de avión de ida y vuelta para sus clientes, de acuerdo a las siguientes condiciones:
  1. el precio se calcula de acuerdo a la distancia en kilómetros del destino
  2. si la distancia es superior a 800 km y el viajero piensa quedarse en el destino más de 7
  días, se le aplica un descuento del 30% sobre el precio final
  3. el precio por kilómetro es de 8.5 euros*/

public class Main {
    public static void main(String[] args) {
        int km;
        float price=0, discount=0, totalPrice=0;
        String days = "";
        Scanner entrada = new Scanner (System.in);

        System.out.println("Cuanta distancia va a recorrer?");
        km = entrada.nextInt();

        // Se hace para consumir el salto de línea que se queda en el Scanner.
        entrada.nextLine();

        if (km > 800){
            while (!days.equalsIgnoreCase("si") && !days.equalsIgnoreCase("no")) {
                System.out.println("Se va a quedar mas de 7 noches? Si/No");
                days = entrada.nextLine();
                if (!days.equalsIgnoreCase("si") && !days.equalsIgnoreCase("no")){
                    System.out.println("La respuesta debe de ser Si o No (es indiferente las mayúsculas o minúsculas) \nvuelva a introducirla");
                }
            }
            if (days.equalsIgnoreCase("si")){
                discount = 0.3f;
            }
        }

        price = (km*8.5f);
        totalPrice = price - (price * discount);

        System.out.print("El precio total de su viaje de " + km + " km ");
        if (discount > 0){
            System.out.print ("y con mas de 7 noches (por lo que se aplica un descuento del 30%) ");
        }
        System.out.print ("es de " + totalPrice + " euros.");

    }
}