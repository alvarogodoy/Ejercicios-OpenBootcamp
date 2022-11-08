package bootcamp;

public class Main {
    public static void main(String[] args){
        SmartPhone s20 = new SmartPhone("samsung","Ryzen 3","1400AMP","6'","17MPX","12MPX");
        SmartWatch s20Watch = new SmartWatch("samsung","I3","1400AMP","Rojo","Fibra","Pulsaciones");
        System.out.println(s20.toString());
        System.out.println(s20Watch.toString());
    }
}
