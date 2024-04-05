package backend;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Compra implements Comparable<Compra> {

    private long idCompra;
    private long idCliente;
    private long idPelicula;
    private LocalDate fecha;

    public Compra() {
    }

    public Compra(long idCompra, long idCliente, long idPelicula, String fecha) {
        this.idCompra = idCompra;
        this.idCliente = idCliente;
        this.idPelicula = idPelicula;
        this.fecha = LocalDate.parse(fecha, DateTimeFormatter.ofPattern("dd/MM/yyyy"));
    }

    public Compra(String datos) {
        this.idCompra = Long.parseLong(datos.split(",")[0]);
        this.idCliente = Long.parseLong(datos.split(",")[1]);
        this.idPelicula = Long.parseLong(datos.split(",")[2]);
        this.fecha = LocalDate.parse(datos.split(",")[3], DateTimeFormatter.ofPattern("dd/MM/yyyy"));
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

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = LocalDate.parse(fecha, DateTimeFormatter.ofPattern("dd/MM/yyyy"));
    }

    @Override
    public String toString() {
        return idCompra + "," + idCliente + "," + idPelicula + "," + fecha.format(DateTimeFormatter.ofPattern("dd/MM/yyyy"));
    }

    @Override
    public int compareTo(Compra o) {
        return this.getFecha().compareTo(o.getFecha());
    }
}
