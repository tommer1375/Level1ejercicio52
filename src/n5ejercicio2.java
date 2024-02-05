
import java.io.*;
import java.util.Arrays;
import java.util.*;

public class n5ejercicio2 {
    public static void main(String[] args) {


        Scanner myObj = new Scanner(System.in);

        System.out.println("Introduce la ruta a leer:");
        String datoString = myObj.nextLine();

        File directorio = new File(datoString);

        leerDirectorio.leerCarpetas(directorio);
    }
}



