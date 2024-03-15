package backend;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import javax.swing.JOptionPane;

public class GestorPeliculas extends Gestor {

    private HashMap<Long, Pelicula> peliculas = new HashMap<>();

    public GestorPeliculas() {

    }

    public GestorPeliculas(String ruta) {
        this.ruta = ruta;
        crear(this.ruta);
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

    public void agregar(Pelicula pel) throws IOException {
        leer();
        if (peliculas.containsKey(pel.getId())) {
            JOptionPane.showMessageDialog(null, "La pelicula ya se encuentra registrada.", "ERROR", 0);
        } else {
            BufferedWriter bw = new BufferedWriter(new FileWriter(ruta + ".txt", true));
            bw.write(pel.toString());
            bw.close();
            peliculas.put(pel.getId(), pel);
            JOptionPane.showMessageDialog(null, "Pelicula registrada con exito.", "Registro", 1);
        }
    }

    @Override
    public ArrayList<String> leer() {
        ArrayList<String> datos = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(ruta + ".txt"))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                Pelicula peliculaGenerica = new Pelicula(linea);
                peliculas.put(peliculaGenerica.getId(), peliculaGenerica);
                datos.add(linea);
            }
        } catch (IOException e) {
            System.out.println(e);
        }
        return datos;
    }

    public void actualizar(Long id, String datosNuevos) throws IOException {
        leer();
        if (peliculas.containsKey(id)) {
            Pelicula nuevaPel = new Pelicula(id + "," + datosNuevos);
            peliculas.put(id, nuevaPel);
            BufferedWriter bw = new BufferedWriter(new FileWriter(ruta + ".txt"));
            for (Map.Entry<Long, Pelicula> pelicula : peliculas.entrySet()) {
                Pelicula value = pelicula.getValue();
                bw.write(value.toString());
                bw.close();
            }
            JOptionPane.showMessageDialog(null, "Pelicula actualizada con exito.", "Actualizar", 1);
        } else {
            JOptionPane.showMessageDialog(null, "La pelicula no se encuentra registrada.", "ERROR", 0);
        }
    }

    public void eliminar(Long id) throws IOException {
        leer();
        if (peliculas.containsKey(id)) {
            peliculas.remove(id);
            BufferedWriter bw = new BufferedWriter(new FileWriter(ruta + ".txt"));
            for (Map.Entry<Long, Pelicula> pelicula : peliculas.entrySet()) {
                Pelicula value = pelicula.getValue();
                bw.write(value.toString());
                bw.close();
            }
            JOptionPane.showMessageDialog(null, "Pelicula eliminada con exito.", "Eliminar", 1);
        } else {
            JOptionPane.showMessageDialog(null, "La pelicula no se encuentra registrada.", "ERROR", 0);
        }
    }

    @Override
    public String buscarPorId() {
        String resultado = "";
        return resultado;
    }

    @Override
    public ArrayList buscarPorClaveSecunddaria() {
        ArrayList resultados = new ArrayList<Pelicula>();
        return resultados;
    }
    
}
