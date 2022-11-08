package bootcamp;

import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int iva = 21;
        System.out.println("Ingrese el precio del articulo: ");
        double precio = sc.nextDouble();
        double precIva = precio + (precio*21/100);
        System.out.println("El precio mas IVA es: " + precIva);
    }
}
