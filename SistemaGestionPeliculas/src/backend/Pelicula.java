package backend;

public class Pelicula implements Comparable<Pelicula> {

    private long id;
    private String titulo;
    private String director;
    private int year;
    private String genero;
    private double precio;
    private int numeroDeVentas;

    public Pelicula() {
    }

    public Pelicula(long id, String titulo, String director, int year, String genero, double precio, int numeroDeVentas) {
        this.id = id;
        this.titulo = titulo;
        this.director = director;
        this.year = year;
        this.genero = genero;
        this.precio = precio;
        this.numeroDeVentas = numeroDeVentas;
    }

    public Pelicula(String datos) {
        this.id = Long.parseLong(datos.split(",")[0]);
        this.titulo = datos.split(",")[1];
        this.director = datos.split(",")[2];
        this.year = Integer.parseInt(datos.split(",")[3]);
        this.genero = datos.split(",")[4];
        this.precio = Double.parseDouble(datos.split(",")[5]);
        this.numeroDeVentas = Integer.parseInt(datos.split(",")[6]);
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getNumeroDeVentas() {
        return numeroDeVentas;
    }

    public void setNumeroDeVentas(int numeroDeVentas) {
        this.numeroDeVentas = numeroDeVentas;
    }

    @Override
    public String toString() {
        return id + "," + titulo + "," + director + "," + year + "," + genero + "," + precio + "," + numeroDeVentas + "\n";
    }

    @Override
    public int compareTo(Pelicula otraPelicula) {
        if (this.getNumeroDeVentas() > otraPelicula.getNumeroDeVentas()) {
            return -1;
        }
        if (this.getNumeroDeVentas() < otraPelicula.getNumeroDeVentas()) {
            return 1;
        }
        return 0;
    }
}
