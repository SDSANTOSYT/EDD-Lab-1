package backend;

import java.io.IOException;
import java.time.Month;
import java.util.ArrayList;
import java.util.Collections;

public class Reporte {

    //Constructor vacío
    public Reporte() {

    }

    /**
     * Peliculas más vendidas Películas ordenadas por numero de ventas
     */
    public ArrayList<String> generarReportePeliculas(GestorPeliculas gesPel) {
        ArrayList<String> resultado = new ArrayList<>();
        ArrayList<Pelicula> peliculas = new ArrayList<>(gesPel.getPeliculas().values());
        Collections.sort(peliculas);
        for (Pelicula pelicula : peliculas) {
            resultado.add(pelicula.toString());
        }
        return resultado;
    }

    /**
     * Clientes con más compras Clientes ordenados por numero de compras
     */
    public ArrayList<String> generarReporteClientes(GestorClientes gesCli) {
        ArrayList<String> resultado = new ArrayList<>();
        ArrayList<Cliente> clientes = new ArrayList<>(gesCli.getClientes().values());
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
        ArrayList<Compra> compras = new ArrayList<>(gesCom.getCompras().values());
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

}
