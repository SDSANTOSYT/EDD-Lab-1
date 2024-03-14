package backend;

import java.util.Date;

public class Compra {

    private long idCompra;
    private long idCliente;
    private long idPelicula;
    private Date fecha;

    public Compra() {
    }

    public Compra(long idCompra, long idCliente, long idPelicula, Date fecha) {
        this.idCompra = idCompra;
        this.idCliente = idCliente;
        this.idPelicula = idPelicula;
        this.fecha = fecha;
    }

    public long getIdCompra() {
        return idCompra;
    }

    public void setIdCompra(long idCompra) {
        this.idCompra = idCompra;
    }

    public long getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(long idCliente) {
        this.idCliente = idCliente;
    }

    public long getIdPelicula() {
        return idPelicula;
    }

    public void setIdPelicula(long idPelicula) {
        this.idPelicula = idPelicula;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    @Override
    public String toString() {
        return idCompra + "," + idCliente + "," + idPelicula + "," + fecha + "\n";
    }
}
