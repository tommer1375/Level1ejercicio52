
import java.io.*;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.*;
public class leerDirectorio {

    public static void leerCarpetas(File root) {


        File[] archivos = root.listFiles();

        if (archivos == null || archivos.length == 0) {
            System.out.println("No hay elementos dentro de la carpeta actual");

        } else {
            SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
            for (int i = 0; i < archivos.length; i++) {
                File archivo = archivos[i];

                System.out.println(String.format("%s (%s) - %s",
                        archivo.getName(),
                        archivo.isDirectory() ? "D" : "F",
                        sdf.format(archivo.lastModified())));

                if (archivos[i].isDirectory()) {
                    leerCarpetas(archivos[i]);
                }

            }
        }
    }
}





