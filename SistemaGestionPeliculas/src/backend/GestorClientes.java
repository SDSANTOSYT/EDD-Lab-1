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
            bw.write(cli.toString());
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
                bw.write(value.toString());
                bw.close();
            }
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
                bw.write(value.toString());
                bw.close();
            }
            JOptionPane.showMessageDialog(null, "Cliente eliminado con exito.", "Eliminar", 1);
        } else {
            JOptionPane.showMessageDialog(null, "El cliente no se encuentra registrado.", "ERROR", 0);
        }
    }

    @Override
    public String buscarPorId(Long id) {
        return clientes.get(id).toString();
    }

    @Override
    public ArrayList buscarPorClaveSecundaria(String Clave, int Option) {
        return null;
    }
    
    public static void main(String[] args) throws IOException {
        
        GestorClientes gesCli = new GestorClientes("PruebaClientes");
        gesCli.agregar(new Cliente(1, "n1", "e1", "d1", 1));
        gesCli.agregar(new Cliente(2, "n2", "e2", "d2", 1));
        gesCli.agregar(new Cliente(3, "n3", "e3", "d3", 1));
        gesCli.agregar(new Cliente(4, "n4", "e4", "d4", 1));
        gesCli.agregar(new Cliente(5, "n5", "e5", "d5", 1));
        gesCli.agregar(new Cliente(6, "n6", "e6", "d6", 1));
        gesCli.agregar(new Cliente(7, "n7", "e7", "d7", 1));
        gesCli.agregar(new Cliente(8, "n8", "e8", "d8", 1));
        gesCli.agregar(new Cliente(9, "n9", "e9", "d9", 1));
        gesCli.agregar(new Cliente(10, "n10", "e10", "d10", 1));
        
        System.out.println(gesCli.buscarPorId((long)5));
    }
}
