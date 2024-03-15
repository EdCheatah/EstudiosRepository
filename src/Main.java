import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner lector = new Scanner(new File("Ejercicio1"));

        while (lector.hasNextLine()) {
            String linea = lector.nextLine();
            Scanner lineaScanner = new Scanner(linea);
            int numero;
            float promedio = 0;
            int cont = 0;
            int cont10 = 0;
            while(lineaScanner.hasNext())
            {
                numero = lineaScanner.nextInt();
                promedio += numero;
                cont++;
            }

            while(promedio/cont < 9.5)
            {
                promedio+=10;
                cont++;
                cont10++;
            }
            System.out.println(cont10);
            lineaScanner.close();
        }

    }
}