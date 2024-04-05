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

public class GestorClientes extends Gestor {

    private HashMap<Long, Cliente> clientes = new HashMap<>();

    public GestorClientes() {
    }

    public GestorClientes(String ruta) {
        this.ruta = ruta;
        crear(this.ruta);
        for (String linea : leer()) {
            clientes.put(Long.valueOf(linea.split(",")[0]), new Cliente(linea));
        }
    }

    public HashMap<Long, Cliente> getClientes() {
        return clientes;
    }

    public void setClientes(HashMap<Long, Cliente> clientes) {
        this.clientes = clientes;
    }

    public String getRuta() {
        return ruta;
    }

    public void setRuta(String ruta) {
        this.ruta = ruta;
    }

    public void agregar(Cliente cli) throws IOException {
        leer();
        if (clientes.containsKey(cli.getId())) {
            JOptionPane.showMessageDialog(null, "El cliente ya se encuentra registrado.", "ERROR", 0);
        } else {
            BufferedWriter bw = new BufferedWriter(new FileWriter(ruta + ".txt", true));
            bw.write(cli.toString() + "\n");
            bw.close();
            clientes.put(cli.getId(), cli);
            JOptionPane.showMessageDialog(null, "Cliente registrado con exito.", "Registro", 1);
        }
    }

    @Override
    public ArrayList<String> leer() {
        ArrayList<String> datos = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(ruta + ".txt"))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                Cliente pepito = new Cliente(linea);
                clientes.put(pepito.getId(), pepito);
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
        if (clientes.containsKey(id)) {
            Cliente nuevoCli = new Cliente(id + "," + datosNuevos);
            clientes.put(id, nuevoCli);
            BufferedWriter bw = new BufferedWriter(new FileWriter(ruta + ".txt"));
            for (Map.Entry<Long, Cliente> cliente : clientes.entrySet()) {
                Cliente value = cliente.getValue();
                bw.write(value.toString() + "\n");
            }
            bw.close();
            JOptionPane.showMessageDialog(null, "Cliente actualizado con exito.", "Actualizar", 1);
        } else {
            JOptionPane.showMessageDialog(null, "El cliente no se encuentra registrado.", "ERROR", 0);
        }
    }

    @Override
    public void eliminar(Long id) throws IOException {
        leer();
        if (clientes.containsKey(id)) {
            clientes.remove(id);
            BufferedWriter bw = new BufferedWriter(new FileWriter(ruta + ".txt"));
            for (Map.Entry<Long, Cliente> cliente : clientes.entrySet()) {
                Cliente value = cliente.getValue();
                bw.write(value.toString() + "\n");
            }
            bw.close();
            JOptionPane.showMessageDialog(null, "Cliente eliminado con exito.", "Eliminar", 1);
        } else {
            JOptionPane.showMessageDialog(null, "El cliente no se encuentra registrado.", "ERROR", 0);
        }
    }

    @Override
    public String buscarPorId(Long id) {
        if (id == null) {
            return "";
        } else {
            return clientes.get(id).toString();
        }

    }

    @Override
    public ArrayList buscarPorClaveSecundaria(String Clave, int Option) {
        return null;
    }
}
