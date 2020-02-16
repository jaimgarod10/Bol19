package com.mycompany.boletin19;

import java.util.Arrays;

/**
 *
 * @author jaimg
 */
public class Equipos {

    public int[][] crearMatriz(int[][] tabla) {
        for (int f = 0; f < tabla.length; f++) {
            for (int c = 0; c < tabla[f].length; c++) {
                tabla[f][c] = PedirDatos.pedirInt();
            }
            System.out.println("Se creó el array.");
        }
        return tabla;
    }

    public String[] crearJornadas(String[] jornadas) {
        for (int i = 0; i < jornadas.length; i++) {
            jornadas[i] = "x" + (i + 1);
        }
        return jornadas;
    }

    public void mostrar(int[][] tabla) {
        for (int f = 0; f < tabla.length; f++) {
            System.out.println("\n");
            for (int c = 0; c < tabla[f].length; c++) {
                System.out.print(tabla[f][c] + "  ");
            }
        }
    }

    public void mostrarTodo(int[][] tabla, String[] equipos, String[] jornadas) {
        System.out.print("\n  ");
        for (int i = 0; i < jornadas.length; i++) {
            if (i < 10) {
                System.out.print("   " + jornadas[i]);
            } else {
                System.out.print("  " + jornadas[i]);
            }
        }
        for (int f = 0; f < tabla.length; f++) {
            System.out.print("\n " + equipos[f]);
            for (int c = 0; c < tabla[f].length; c++) {
                System.out.print("  " + tabla[f][c] + "  ");
            }
        }

    }

    public void salir() {
        System.exit(0);
    }

    public void ordencrecenteArrays(int[][] tabla, String[] equiposOrdenados) {
        int[] totalGoles = new int[tabla.length];
        for (int f = 0; f < tabla.length; f++) {
            for (int c = 0; c < tabla[f].length; c++) {
                totalGoles[f] = totalGoles[f] + tabla[f][c];
            }
        }
        int aux;
        String auxEqu;
        for (int i = 0; i < totalGoles.length - 1; i++) {
            for (int j = i + 1; j < equiposOrdenados.length; j++) {
                if (totalGoles[i] > totalGoles[j]) {
                    aux = totalGoles[i];
                    totalGoles[i] = totalGoles[j];
                    totalGoles[j] = aux;
                    auxEqu = equiposOrdenados[i];
                    equiposOrdenados[i] = equiposOrdenados[j];
                    equiposOrdenados[j] = auxEqu;
                }
            }
        }
        System.out.println("\n\nTotal de goles marcados en orden ascendente:");
        for (int j = 0; j < equiposOrdenados.length; j++) {
            System.out.println(equiposOrdenados[j] + "  " + totalGoles[j]);
        }

    }

    public void ordenarGolesEquipos(String[] equipos) {
        Arrays.sort(equipos);
    }

    public void maximoGoleadorJornada(int[][] tabla, String[] jornadas, String[] equipos) {
        for (int i = 0; i < tabla.length; i++) {
            for (int f = i; i < tabla.length; f++) {

            }
        }
    }
}

