import java.util.Arrays;

public class Ex5 {
    public static void main(String[] args) {

     int[] numere = {32 , 21 , 44 , 51, 2};
     int suma = 0;

        for (int i = 0; i < numere.length; i++) {
            suma = suma + numere[i];
        }
        System.out.println("Suma este: " + suma);

    }
}
