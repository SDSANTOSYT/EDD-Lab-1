package backend;

import java.util.ArrayList;
import java.util.HashMap;

public class GestorCompras extends Gestor {

    private HashMap<Long, Compra> compras;

    public GestorCompras() {
    }

    public GestorCompras(HashMap<Long, Compra> compras) {
        this.compras = compras;
    }

    public GestorCompras(String ruta, HashMap<Long, Compra> compras) {
        super.ruta = ruta;
        this.compras = compras;
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
