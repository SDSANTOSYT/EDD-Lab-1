
import java.util.ArrayList;

/**
 *
 */
public abstract class Gestor {

    /**
     * Default constructor
     */
    public Gestor() {
    }

    /**
     *
     */
    protected String ruta;

    /**
     * @return
     */
    public void crear() {
        // TODO implement here

    }

    /**
     * @return
     */
    public abstract void agregar();

    /**
     * @return
     */
    public abstract ArrayList leer();

    /**
     * @return
     */
    public abstract void actualizar();

    /**
     * @return
     */
    public abstract void eliminar();

    /**
     * @return
     */
    public abstract void buscarPorId();

    /**
     * @return
     */
    public abstract void buscarPorClaveSecunddaria();

}
