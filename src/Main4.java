import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class Main4 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner lector = new Scanner(new File("Ejercicio4"));
        System.out.println("");
        while(lector.hasNext())
        {
            int suma = 0;
            String linea = lector.nextLine();
            String[] grupos = linea.split(" ");

            for(int i = 0; i < grupos.length; i++)
            {
                String grupo = grupos[i];
                for(int j = 0; j < grupo.length(); j++)
                {
                    char letra = grupo.charAt(j);
                    int posicionAlfabeto = letra - 'A';
                    int nGrupo = i;
                    int nLetra = j;
                    suma += posicionAlfabeto + nGrupo + nLetra;
                }
            }
            System.out.println(suma);
        }
        lector.close();
    }
}
