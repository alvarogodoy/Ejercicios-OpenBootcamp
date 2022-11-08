package bootcamp;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        Coche bm = new Coche("Rojo","BMW","M5");
        Coche falcon = new Coche("Verde","Ford","Falcon");
        CocheCRUDImpl auto = new CocheCRUDImpl();
        auto.save(bm);
        auto.save(falcon);
        auto.delete(bm);
        List<Coche> coches = auto.findAll();
        for (Coche c : coches) {
            System.out.println(c.toString());
        }
    }
}
