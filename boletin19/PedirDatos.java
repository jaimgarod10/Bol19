package com.mycompany.boletin19;

import java.util.Scanner;

/**
 *
 * @author jaimg
 */
public class PedirDatos {

    /**
     *
     * @return
     */
    public static int pedirInt() {
        Scanner sc = new Scanner(System.in);
        int a;
        System.out.println("Introduce un numero");
        a = sc.nextInt();
        return a;
    }

    /**
     *
     * @return
     */
    public static float pedirFloat() {
        Scanner sc = new Scanner(System.in);
        float b;
        System.out.println("Introduce un numero");
        b = sc.nextFloat();
        return b;
    }

    /**
     *
     * @return
     */
    public static String pedirString() {
        Scanner sc = new Scanner(System.in);
        String c;
        System.out.println("Introduce un String");
        c = sc.next();
        return c;
    }

}


