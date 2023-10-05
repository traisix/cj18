package b4;
// 2023-09-28       Juan Pablo Sandoval Rivera
//
// Escribe un programa en Java que solicite al usuario ingresar dos números enteros.
// Luego,  usa un bucle while para mostrar la multiplicación de los números ingresados hasta que el resultado
// sea mayor que 100.

// Utiliza un bucle do-while para pedir al usuario que ingrese nuevamente los números si la multiplicación no supera
// 100.
//
// Agrega manejo de excepciones con try-catch para evitar errores de división por cero si el segundo número
// es igual a cero.
// Registra todos los pasos importantes del programa en un archivo de registro (log) para
// un seguimiento detallado de su ejecución.

import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;


public class ciclos {
    public static void main(String[] arg) {
        double num1, num2;








        do {
            // Limpieza de pantalla
            // System.out.print("\033[H\033[2J");
            // System.out.flush();
            do {
                System.out.println("Digite el primer número");
                Scanner scanner = new Scanner(System.in);
                num1 = scanner.nextDouble();
                if (num1 == 0) {
                    System.out.println("Numero no deber ser cero");
                }
            } while (num1 == 0);

            do {
                System.out.println("Digite el segundo número");
                Scanner scanner = new Scanner(System.in);
                num2 = scanner.nextInt();
                //TryCatch();
                if (num2 == 0) {
                    System.out.println("Numero no deber ser cero");
                }
            } while (num2 == 0);

            System.out.printf("La multiplicacion de %.2f por %2.f es = %.2f", num1,num2,(num1*num2));
        } while ((num1 * num2)  < 100);
    }
}
