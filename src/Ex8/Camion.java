package Ex8;
import java.util.ArrayList;

public class Camion implements Transportator {

    private ArrayList<Transportabil> marfa = new ArrayList<>();

    @Override
    public void incarca(Transportabil produs) {
        marfa.add(produs);
        System.out.println(produs.getName() + "a fost incarcat in masina.");

    }

    @Override
        public void transportatLa(String magazin) {
            System.out.println("Camionul transporta marfa la " + magazin);
        }
}