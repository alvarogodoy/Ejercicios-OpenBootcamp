package bootcamp;

public class SmartPhone extends SmartDevice {
    String pantalla;
    String camaraTrasera;
    String camaraFrontal;

    public SmartPhone(){
    }

    public SmartPhone(String marca, String procesador, String bateria, String pantalla, String camaraTrasera, String camaraFrontal) {
        super(marca, procesador, bateria);
        this.pantalla = pantalla;
        this.camaraTrasera = camaraTrasera;
        this.camaraFrontal = camaraFrontal;
    }

    @Override
    public String toString() {
        return "SmartPhone{" +
                "pantalla='" + pantalla + '\'' +
                ", camaraTrasera='" + camaraTrasera + '\'' +
                ", camaraFrontal='" + camaraFrontal + '\'' +
                ", marca='" + marca + '\'' +
                ", procesador='" + procesador + '\'' +
                ", bateria='" + bateria + '\'' +
                '}';
    }
}
