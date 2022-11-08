package bootcamp;

import java.util.Scanner;

public class Ejercicio {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el texto a invertir: ");
        String texto = scanner.nextLine();
        System.out.println(reverse(texto));
    }

    public static String reverse(String texto){
        String textoInvert = "";
        String[] lines = texto.split("");
        for (int i = lines.length-1; i >= 0; i--){
            textoInvert+= lines[i];
        }
        return textoInvert;
    }
}
