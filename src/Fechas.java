import java.util.Scanner;

public class Fechas {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario la primera fecha
        System.out.println("Ingrese la primera fecha como DD/MM/AAAA:");
        String fecha1String = scanner.nextLine();

        // Solicitar al usuario la segunda fecha
        System.out.println("Ingrese la segunda fecha como DD/MM/AAAA:");
        String fecha2String = scanner.nextLine();

        // Separar las partes de la primera fecha
        int dia1 = Integer.parseInt(fecha1String.substring(0, 2));
        int mes1 = Integer.parseInt(fecha1String.substring(3, 5));
        int anio1 = Integer.parseInt(fecha1String.substring(6));

        // Separar las partes de la segunda fecha
        int dia2 = Integer.parseInt(fecha2String.substring(0, 2));
        int mes2 = Integer.parseInt(fecha2String.substring(3, 5));
        int anio2 = Integer.parseInt(fecha2String.substring(6));

        // Comparar las fechas
        if (anio1 > anio2) {
            System.out.println("La primera fecha es mayor.");
        } else if (anio1 < anio2) {
            System.out.println("La segunda fecha es mayor.");
        } else {
            if (mes1 > mes2) {
                System.out.println("La primera fecha es mayor.");
            } else if (mes1 < mes2) {
                System.out.println("La segunda fecha es mayor.");
            } else {
                if (dia1 > dia2) {
                    System.out.println("La primera fecha es mayor.");
                } else if (dia1 < dia2) {
                    System.out.println("La segunda fecha es mayor.");
                } else {
                    System.out.println("Las fechas son iguales.");
                }
            }
        }
    }
}