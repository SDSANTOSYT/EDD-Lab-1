package backend;

public class Pelicula {

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
}
