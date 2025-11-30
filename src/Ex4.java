import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args) {

        Scanner obj = new Scanner(System.in);
        System.out.println("Introduceti trei numere: ");
        int i  = obj.nextInt();
        int i1 = obj.nextInt();
        int i2 = obj.nextInt();

        if (i == i1 && i1 == i2) {
            System.out.println("Toate numerele sunt egale.");
        } else if (i != i1 && i != i2 && i1 != i2) {
            System.out.println("Toate numerele sunt diferite.");
        } else {
            System.out.println("Nici nu sunt egale, nici diferite.");
        }
    }
}
