package Ex8;

public class Pufulet implements Transportabil {

    private String name;

    public Pufulet(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }
}