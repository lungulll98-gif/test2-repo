import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {

        Scanner obj = new Scanner(System.in);
        System.out.print("Scrieti un numar: ");
        int number = obj.nextInt();

        if (number > 0 ) {
            System.out.println("Pozitiv");
        } else
            System.out.println("Negativ");
    }
}
