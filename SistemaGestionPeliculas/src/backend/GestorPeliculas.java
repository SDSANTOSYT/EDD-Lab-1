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
        leer();
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
            bw.write(pel.toString()+"\n");
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

    @Override
    public void actualizar(Long id, String datosNuevos) throws IOException {
        leer();
        if (peliculas.containsKey(id)) {
            Pelicula nuevaPel = new Pelicula(id + "," + datosNuevos);
            peliculas.put(id, nuevaPel);
            BufferedWriter bw = new BufferedWriter(new FileWriter(ruta + ".txt"));
            for (Map.Entry<Long, Pelicula> pelicula : peliculas.entrySet()) {
                Pelicula value = pelicula.getValue();
                bw.write(value.toString()+"\n");
                bw.close();
            }
            JOptionPane.showMessageDialog(null, "Pelicula actualizada con exito.", "Actualizar", 1);
        } else {
            JOptionPane.showMessageDialog(null, "La pelicula no se encuentra registrada.", "ERROR", 0);
        }
    }

    @Override
    public void eliminar(Long id) throws IOException {
        leer();
        if (peliculas.containsKey(id)) {
            peliculas.remove(id);
            BufferedWriter bw = new BufferedWriter(new FileWriter(ruta + ".txt"));
            for (Map.Entry<Long, Pelicula> pelicula : peliculas.entrySet()) {
                Pelicula value = pelicula.getValue();
                bw.write(value.toString()+"\n");
                bw.close();
            }
            JOptionPane.showMessageDialog(null, "Pelicula eliminada con exito.", "Eliminar", 1);
        } else {
            JOptionPane.showMessageDialog(null, "La pelicula no se encuentra registrada.", "ERROR", 0);
        }
    }

    @Override
    public String buscarPorId(Long id) {
        return peliculas.get(id).toString();
    }

    @Override
    public ArrayList buscarPorClaveSecundaria(String Clave, int Option) {
        ArrayList<String> filtrado = new ArrayList<String>();
        switch (Option) {
            //Por Autor
            case 1:
                for (Long id : this.peliculas.keySet()) {
                    if (this.peliculas.get(id).getDirector().equalsIgnoreCase(Clave)) {
                        filtrado.add(peliculas.get(id).toString());
                    }
                }
                break;
            //Por Genero
            case 2:
                for (Long id : this.peliculas.keySet()) {
                    if (this.peliculas.get(id).getGenero().equalsIgnoreCase(Clave)) {
                        filtrado.add(peliculas.get(id).toString());
                    }
                }
                break;
            //Por Titulo
            case 3:
                for (Long id : this.peliculas.keySet()) {
                    if (this.peliculas.get(id).getTitulo().equalsIgnoreCase(Clave)) {
                        filtrado.add(peliculas.get(id).toString());
                    }
                }
                break;
            default:
                throw new AssertionError();
        }

        if (filtrado.size() == 0) {
            JOptionPane.showMessageDialog(null, "No se encontraron películas");
        }
        return filtrado;
    }
    
    public static void main(String[] args) throws IOException {
        
        GestorPeliculas gesPel = new GestorPeliculas("PruebaPeliculas");
        gesPel.agregar(new Pelicula(1, "Pel1", "Dir1", 2012, "gen1", 1, 5));
        gesPel.agregar(new Pelicula(2, "Pel1", "Dir1", 2012, "gen1", 1, 5));
        gesPel.agregar(new Pelicula(3, "Pel1", "Dir1", 2012, "gen1", 1, 5));
        gesPel.agregar(new Pelicula(4, "Pel2", "Dir1", 2012, "gen1", 1, 5));
        gesPel.agregar(new Pelicula(5, "Pel2", "Dir2", 2013, "gen2", 2, 5));
        gesPel.agregar(new Pelicula(6, "Pel6", "Dir2", 2013, "gen2", 2, 5));
        gesPel.agregar(new Pelicula(7, "Pel7", "Dir2", 2013, "gen2", 2, 5));
        gesPel.agregar(new Pelicula(8, "Pel8", "Dir2", 2013, "gen2", 2, 5));
       
        gesPel.buscarPorId((long)1);
        //1 director
        //2 genero
        //3 titulo
        for (int i = 0; i < gesPel.buscarPorClaveSecundaria("Dir1", 1).size(); i++) {
            System.out.println(gesPel.buscarPorClaveSecundaria("Dir1", 1).get(i));
        }
        System.out.println("pausa");
        for (int i = 0; i < gesPel.buscarPorClaveSecundaria("Dir2", 1).size(); i++) {
            System.out.println(gesPel.buscarPorClaveSecundaria("Dir2", 1).get(i));
        }
        System.out.println("pausa");
        for (int i = 0; i < gesPel.buscarPorClaveSecundaria("gen1", 2).size(); i++) {
            System.out.println(gesPel.buscarPorClaveSecundaria("gen1", 2).get(i));
        }
        System.out.println("pausa");
        for (int i = 0; i < gesPel.buscarPorClaveSecundaria("Gen2", 2).size(); i++) {
            System.out.println(gesPel.buscarPorClaveSecundaria("gen2", 2).get(i));
        }
        System.out.println("pausa");
        for (int i = 0; i < gesPel.buscarPorClaveSecundaria("Pel1", 3).size(); i++) {
            System.out.println(gesPel.buscarPorClaveSecundaria("Pel1", 3).get(i));
        }
        System.out.println("pausa");
        for (int i = 0; i < gesPel.buscarPorClaveSecundaria("Pel2", 3).size(); i++) {
            System.out.println(gesPel.buscarPorClaveSecundaria("Pel2", 3).get(i));
        }
    }

}
