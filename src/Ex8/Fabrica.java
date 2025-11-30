package Ex8;

public class Fabrica {

        public Pufulet produce(String nume) {
        System.out.println("A fost creat pufuletul " + nume + " in fabrica.");
        return new Pufulet(nume);
    }
  }

