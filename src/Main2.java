import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class Main2 {
    public static void main(String[] args) throws FileNotFoundException {

        Scanner lector = new Scanner(new File("Ejercicio2"));
        while (lector.hasNextLine()) {
            String linea = lector.nextLine();
            String[] numeros = linea.split(" ");

            int min = Integer.parseInt(numeros[0]);
            int max = Integer.parseInt(numeros[1]);
            int factor = Integer.parseInt(numeros[2]);
            int cont = 0;
            for(int i = min; i <= max; i++)
            {
                if(i % factor == 0 )
                    cont++;
            }
            System.out.println(cont);
        }


        lector.close();

    }
}
