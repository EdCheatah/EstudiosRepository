import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main3 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner lector = new Scanner(new File("Ejercicio3"));

        while (lector.hasNextLine()) {
            int nPalitos = lector.nextInt();
            int tMax = 0;
            for (int i = 1; i <= nPalitos / 2; i++) {
                int j = nPalitos - i*2;
                int area = i * j;
                if (area > tMax) {
                    tMax = area;
                }
            }
            System.out.println(tMax/2);
        }

        lector.close();
    }
}
