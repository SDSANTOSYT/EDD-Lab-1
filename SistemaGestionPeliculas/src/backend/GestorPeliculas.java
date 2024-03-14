package backend;

import java.util.ArrayList;
import java.util.HashMap;

public class GestorPeliculas extends Gestor {

    private HashMap<Long, Pelicula> peliculas;

    public GestorPeliculas() {
    }

    public GestorPeliculas(HashMap<Long, Pelicula> peliculas) {
        this.peliculas = peliculas;
    }

    public GestorPeliculas(String ruta, HashMap<Long, Pelicula> peliculas) {
        super.ruta = ruta;
        this.peliculas = peliculas;
    }

    public HashMap<Long, Pelicula> getPeliculas() {
        return peliculas;
    }

    public void setPeliculas(HashMap<Long, Pelicula> peliculas) {
        this.peliculas = peliculas;
    }

    public String getRuta() {
        return ruta;
    }

    public void setRuta(String ruta) {
        this.ruta = ruta;
    }

    @Override
    public void agregar() {
    }

    @Override
    public ArrayList leer() {
        return null;
    }

    @Override
    public void actualizar() {
    }

    @Override
    public void eliminar() {
    }

    @Override
    public void buscarPorId() {
    }

    @Override
    public void buscarPorClaveSecunddaria() {
    }

}
