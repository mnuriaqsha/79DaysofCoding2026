
import java.util.Scanner;

public class Day79 {
    public static void main(String[] args) {
        Scanner hi = new Scanner(System.in);

        int angka[] = new int[5];

        for (int i = 0; i < angka.length; i++) {
            angka[i] = hi.nextInt();
        }

        for (int j = 0; j < angka.length; j++) {
            System.out.println(angka[j]);
        }
    }
}
