package backend;

import java.io.IOException;
import java.time.LocalDate;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Collections;

public class Reporte {

    //Constructor vacío
    public Reporte() {

    }

    /**
     * Peliculas más vendidas Películas ordenadas por numero de ventas
     */
    public ArrayList<String> generarReportePeliculas(GestorCompras gesCom, GestorPeliculas gesPel) {
        ArrayList<String> resultado = new ArrayList<>();
        ArrayList<Pelicula> peliculas = (ArrayList<Pelicula>) gesPel.getPeliculas().values();
        Collections.sort(peliculas);
        for (Pelicula pelicula : peliculas) {
            resultado.add(pelicula.toString());
        }
        return resultado;
    }

    /**
     * Clientes con más compras Clientes ordenados por numero de compras
     */
    public ArrayList<String> generarReporteClientes(GestorClientes gesCli, GestorCompras gesCom) {
        ArrayList<String> resultado = new ArrayList<>();
        ArrayList<Cliente> clientes = (ArrayList<Cliente>) gesCli.getClientes().values();
        Collections.sort(clientes);
        for (Cliente cliente : clientes) {
            resultado.add(cliente.toString());
        }
        return resultado;
    }

    /**
     * Ventas por periodo de tiempo Mes de compra organizado por numero de
     * ventas
     */
    public ArrayList<String> generarReporteVentas(GestorCompras gesCom) {
        ArrayList<Compra> compras = (ArrayList<Compra>) gesCom.getCompras().values();
        Collections.sort(compras);
        Month[] meses = Month.values();
        ArrayList<String> resultado = new ArrayList<>();
        for (Month mes : meses) {
            int numeroDeVentas = 0;
            for (Compra compra : compras) {
                if (compra.getFecha().getMonth().equals(mes)) {
                    numeroDeVentas++;
                }
            }
            resultado.add(mes.toString() + "," + numeroDeVentas);
        }
        return resultado;
    }

    public static void main(String[] args) throws IOException {
        Reporte rep = new Reporte();
        
        //Reporte peliculas
        GestorPeliculas gesPel = new GestorPeliculas("PruebaPeliculas");
        gesPel.agregar(new Pelicula(1, "Pel1", "Dir1", 2012, "gen1", 1, 5));
        gesPel.agregar(new Pelicula(2, "Pel2", "Dir2", 2013, "gen2", 2, 5));
        //rep.generarReportePeliculas(gesCom, gesPel);
        
        //Reporte de Clientes
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
        //rep.generarReporteClientes(gesCli, gesCom);
        
        //Reporte de Compras
        GestorCompras gesCom = new GestorCompras("PruebaCompras");
        gesCom.agregar(new Compra(1, 1, 1, LocalDate.parse("29/12/2005", DateTimeFormatter.ofPattern("dd/MM/yyyy"))));
        gesCom.agregar(new Compra(2, 2, 2, LocalDate.parse("29/12/2006", DateTimeFormatter.ofPattern("dd/MM/yyyy"))));
        gesCom.agregar(new Compra(3, 3, 1, LocalDate.parse("29/12/2008", DateTimeFormatter.ofPattern("dd/MM/yyyy"))));
        gesCom.agregar(new Compra(4, 4, 2, LocalDate.parse("29/12/2009", DateTimeFormatter.ofPattern("dd/MM/yyyy"))));
        gesCom.agregar(new Compra(5, 5, 1, LocalDate.parse("29/11/2005", DateTimeFormatter.ofPattern("dd/MM/yyyy"))));
        gesCom.agregar(new Compra(6, 6, 2, LocalDate.parse("29/11/2006", DateTimeFormatter.ofPattern("dd/MM/yyyy"))));
        gesCom.agregar(new Compra(7, 7, 1, LocalDate.parse("29/11/2007", DateTimeFormatter.ofPattern("dd/MM/yyyy"))));
        gesCom.agregar(new Compra(8, 8, 2, LocalDate.parse("29/11/2008", DateTimeFormatter.ofPattern("dd/MM/yyyy"))));
        gesCom.agregar(new Compra(9, 9, 1, LocalDate.parse("29/11/2009", DateTimeFormatter.ofPattern("dd/MM/yyyy"))));
        gesCom.agregar(new Compra(10, 10, 2, LocalDate.parse("29/07/2007", DateTimeFormatter.ofPattern("dd/MM/yyyy"))));
        //rep.generarReporteVentas(gesCom);
    }
}
