package bootcamp;

public class Ejercicio3 {
    public static void main(String[] args){
        String[] textos = {"Hola","Mundo","Soy","Messi"};
        String textoFin = "";
        for (String i : textos){
            textoFin+= i;
        }
        System.out.println(textoFin);
    }
}
