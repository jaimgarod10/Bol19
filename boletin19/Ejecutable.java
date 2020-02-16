package com.mycompany.boletin19;

import javax.swing.JOptionPane;

/**
 *
 * @author jaimg
 */
public class Ejecutable {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        int[][] goles = new int[20][36];
        
        Equipos obj = new Equipos();
        String[] equipos = {"VCF", "ATM", "MLL", "ALV", "BAR", "GTF", "VIL", "LUD", "GRA", "VLL", "SFC", "ESP", "LEG", "RBB","EIB", "RSO", "ATH", "OSA", "RMA", "CEL"};
        obj.ordenarGolesEquipos(equipos);
        
        String[] equiposOrdenados = {"VCF", "ATM", "MLL", "ALV", "BAR", "GTF", "VIL", "LUD", "GRA", "VLL", "SFC", "ESP", "LEG", "RBB","EIB", "RSO", "ATH", "OSA", "RMA", "CEL"};
        String[] jornadas = new String[36];
        jornadas = obj.crearJornadas(jornadas);
        int opcion;
        do {
            opcion = Integer.parseInt(JOptionPane.showInputDialog("MENU: \n1--> crear matriz: " + "\n2--> mostrar \n3--> mostrar todo\n4-->orden creciente \n5--> Máximo goleador de la jornada \n6--> Salir"));
            switch (opcion) {
                case 1:
                    goles = obj.crearMatriz(goles);
                    break;
                case 2:
                    obj.mostrar(goles);
                    break;
                case 3:
                    obj.mostrarTodo(goles, equipos, jornadas);
                    break;
                case 4:
                    obj.ordencrecenteArrays(goles, equiposOrdenados);
                    break;
                case 5:
                    obj.maximoGoleadorJornada(goles, jornadas, equipos);
                    break;
                case 6:
                    obj.salir();
            }
        } while (opcion < 6);

    }

}





