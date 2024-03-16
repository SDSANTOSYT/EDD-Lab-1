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

public class GestorCompras extends Gestor {

    private HashMap<Long, Compra> compras = new HashMap<>();

    public GestorCompras() {
    }

    public GestorCompras(String ruta) {
        this.ruta = ruta;
        crear(this.ruta);
    }

    public HashMap<Long, Compra> getCompras() {
        return compras;
    }

    public void setCompras(HashMap<Long, Compra> compras) {
        this.compras = compras;
    }

    public String getRuta() {
        return ruta;
    }

    public void setRuta(String ruta) {
        this.ruta = ruta;
    }

    public void agregar(Compra com) throws IOException {
        leer();
        if (compras.containsKey(com.getIdCompra())) {
            JOptionPane.showMessageDialog(null, "La compra ya se encuentra registrada.", "ERROR", 0);
        } else {
            BufferedWriter bw = new BufferedWriter(new FileWriter(ruta + ".txt", true));
            bw.write(com.toString());
            bw.close();
            compras.put(com.getIdCompra(), com);
            JOptionPane.showMessageDialog(null, "Compra registrada con exito.", "Registro", 1);
        }
    }

    @Override
    public ArrayList<String> leer() {
        ArrayList<String> datos = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(ruta + ".txt"))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                Compra compraGenerica = new Compra(linea);
                compras.put(compraGenerica.getIdCompra(), compraGenerica);
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
        if (compras.containsKey(id)) {
            Compra nuevaCom = new Compra(id + "," + datosNuevos);
            compras.put(id, nuevaCom);
            BufferedWriter bw = new BufferedWriter(new FileWriter(ruta + ".txt"));
            for (Map.Entry<Long, Compra> compra : compras.entrySet()) {
                Compra value = compra.getValue();
                bw.write(value.toString());
                bw.close();
            }
            JOptionPane.showMessageDialog(null, "Compra actualizada con exito.", "Actualizar", 1);
        } else {
            JOptionPane.showMessageDialog(null, "La compra no se encuentra registrada.", "ERROR", 0);
        }
    }

    @Override
    public void eliminar(Long id) throws IOException {
        leer();
        if (compras.containsKey(id)) {
            compras.remove(id);
            BufferedWriter bw = new BufferedWriter(new FileWriter(ruta + ".txt"));
            for (Map.Entry<Long, Compra> compra : compras.entrySet()) {
                Compra value = compra.getValue();
                bw.write(value.toString());
                bw.close();
            }
            JOptionPane.showMessageDialog(null, "Compra eliminada con exito.", "Eliminar", 1);
        } else {
            JOptionPane.showMessageDialog(null, "La compra no se encuentra registrada.", "ERROR", 0);
        }
    }

    @Override
    public String buscarPorId() {
        String resultado = "";
        return resultado;
    }

    @Override
    public ArrayList buscarPorClaveSecunddaria() {
        ArrayList resultados = new ArrayList<Compra>();
        return resultados;
    }
}
