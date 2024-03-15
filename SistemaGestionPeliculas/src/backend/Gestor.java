package backend;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

public abstract class Gestor {

    protected String ruta;

    //Si el archivo no esta creado, crearlo
    public void crear(String nombreArchivo) {
        File archivo = new File(nombreArchivo + ".txt");
        try {
            archivo.createNewFile();
        } catch (IOException ex) {
            System.out.println(ex);
        }
    }

    public abstract ArrayList<String> leer();
    
    public abstract String buscarPorId();

    public abstract ArrayList buscarPorClaveSecunddaria();

}
