
package com.mycompany.ejercicio1_edad;

import java.util.Scanner;


public class Ejercicio1_edad {

    public static void main(String[] args) {
                Scanner scanner = new Scanner(System.in);

        // Definir arreglos para nombres y edades
        String[] nombres = new String[10];
        int[] edades = new int[10];

        // Leer nombres y edades
        for (int i = 0; i < 10; i++) {
            System.out.println("Ingrese el nombre #" + (i + 1) + ":");
            nombres[i] = scanner.nextLine();

            System.out.println("Ingrese la edad de " + nombres[i] + ":");
            edades[i] = scanner.nextInt();

            // Consumir el salto de línea después de leer la edad
            scanner.nextLine();
        }

        // Encontrar la edad mayor y menor
        int edadMayor = edades[0];
        int edadMenor = edades[0];
        String nombreMayor = nombres[0];
        String nombreMenor = nombres[0];

        for (int i = 1; i < 10; i++) {
            if (edades[i] > edadMayor) {
                edadMayor = edades[i];
                nombreMayor = nombres[i];
            }
            if (edades[i] < edadMenor) {
                edadMenor = edades[i];
                nombreMenor = nombres[i];
            }
        }

        // Mostrar los resultados
        System.out.println("La persona de mayor edad es " + nombreMayor + " con " + edadMayor + " años.");
        System.out.println("La persona de menor edad es " + nombreMenor + " con " + edadMenor + " años.");

        // Cerrar el scanner
        scanner.close();
    }
}
