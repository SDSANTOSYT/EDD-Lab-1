package backend;

public class Cliente implements Comparable<Cliente> {

    private long id;
    private String nombre;
    private String email;
    private String direccion;
    private int numeroDeCompras;

    public Cliente() {
    }

    public Cliente(long id, String nombre, String email, String direccion, int numeroDeCompras) {
        this.id = id;
        this.nombre = nombre;
        this.email = email;
        this.direccion = direccion;
        this.numeroDeCompras = numeroDeCompras;
    }

    public Cliente(String datos) {
        this.id = Long.parseLong(datos.split(",")[0]);
        this.nombre = datos.split(",")[1];
        this.email = datos.split(",")[2];
        this.direccion = datos.split(",")[3];
        this.numeroDeCompras = Integer.parseInt(datos.split(",")[4]);
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getNumeroDeCompras() {
        return numeroDeCompras;
    }

    public void setNumeroDeCompras(int numeroDeCompras) {
        this.numeroDeCompras = numeroDeCompras;
    }

    @Override
    public String toString() {
        return id + "," + nombre + "," + email + "," + direccion + "," + numeroDeCompras;
    }

    @Override
    public int compareTo(Cliente otroCliente) {
        if (this.getNumeroDeCompras() > otroCliente.getNumeroDeCompras()) {
            return -1;
        }
        if (this.getNumeroDeCompras() < otroCliente.getNumeroDeCompras()) {
            return 1;
        }
        return 0;
    }
}
