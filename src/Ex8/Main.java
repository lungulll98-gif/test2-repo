package Ex8;

public class Main {
    public static void main(String[] args) {

        Fabrica fabrica      = new Fabrica();
        Transportator camion = new Camion();


        Transportabil cristinel  = fabrica.produce("Cristinel");
        Transportabil cristinuta = fabrica.produce("Cristinuta");


        camion.incarca(cristinel);
        camion.incarca(cristinuta);


        camion.transportatLa("Metro.");
        camion.transportatLa("Nr1.");
        camion.transportatLa("Linella.");
    }
}

