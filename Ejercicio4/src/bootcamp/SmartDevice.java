package bootcamp;

public abstract class SmartDevice {
    String marca;
    String procesador;
    String bateria;

    public SmartDevice(){
    }
    public SmartDevice(String marca, String procesador, String bateria) {
        this.marca = marca;
        this.procesador = procesador;
        this.bateria = bateria;
    }
}
