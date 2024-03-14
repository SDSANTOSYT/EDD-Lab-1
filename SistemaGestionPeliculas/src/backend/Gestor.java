package backend;

import java.util.ArrayList;

public abstract class Gestor {

    protected String ruta;
    
    public void crear() {
        
    }
    
    public abstract void agregar();
    public abstract ArrayList leer();
    public abstract void actualizar();
    public abstract void eliminar();
    public abstract Object buscarPorId();
    public abstract ArrayList buscarPorClaveSecunddaria();

}
