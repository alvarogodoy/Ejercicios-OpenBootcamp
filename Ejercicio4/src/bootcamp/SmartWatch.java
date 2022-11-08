package bootcamp;

public class SmartWatch extends SmartDevice{
    String mallaColor;
    String mallaMaterial;
    String sensor;

    public SmartWatch() {
    }

    public SmartWatch(String marca, String procesador, String bateria, String mallaColor, String mallaMaterial, String sensor) {
        super(marca, procesador, bateria);
        this.mallaColor = mallaColor;
        this.mallaMaterial = mallaMaterial;
        this.sensor = sensor;
    }

    @Override
    public String toString() {
        return "SmartWatch{" +
                "mallaColor='" + mallaColor + '\'' +
                ", mallaMaterial='" + mallaMaterial + '\'' +
                ", sensor='" + sensor + '\'' +
                ", marca='" + marca + '\'' +
                ", procesador='" + procesador + '\'' +
                ", bateria='" + bateria + '\'' +
                '}';
    }
}
