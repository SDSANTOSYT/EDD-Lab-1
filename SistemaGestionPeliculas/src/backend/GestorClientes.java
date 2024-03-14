package backend;

import java.util.ArrayList;
import java.util.HashMap;

public class GestorClientes extends Gestor {

    private HashMap<Long, Cliente> clientes;

    public GestorClientes() {
    }

    public GestorClientes(HashMap<Long, Cliente> clientes) {
        this.clientes = clientes;
    }

    public GestorClientes(String ruta, HashMap<Long, Cliente> clientes) {
        super.ruta = ruta;
        this.clientes = clientes;
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
    public Object buscarPorId() {
        Cliente resultado = new Cliente();
        return resultado;
    }

    @Override
    public ArrayList buscarPorClaveSecunddaria() {
        ArrayList resultados = new ArrayList<Cliente>();
        return resultados;
    }

}
