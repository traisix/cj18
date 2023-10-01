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
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;
public class TryCatch {
    private static final Logger logger = Logger.getLogger(TryCatch.class.getName());

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        logger.setLevel(Level.INFO);

        try {
            FileHandler fileHandler = new FileHandler("logInfo.txt");
            logger.addHandler(fileHandler);
            SimpleFormatter formatter = new SimpleFormatter();
            fileHandler.setFormatter(formatter);

            int num1, num2, varTemporal;
            String varTexto;

            do {
                // 2023-10-01 - Limpiar pantalla ... aún sin operar
                //System.out.print("u001B[2J"); //033[H033[2J");
                //System.out.flush();
                //Runtime.getRuntime().exec("clear");
               // Tampoco  System.out.print("\033[H\033[2J");
               // System.out.flush();
                // tampoco clearConsole();


                System.out.print("Digite el primer número : ");
                num1 = scanner.nextInt();

                System.out.print("Digite el segundo número : ");
                num2 = scanner.nextInt();
                System.out.println("");

                try {
                    varTemporal = multiplica(num1, num2);

                    varTexto = "La multiplicacion de " + num1;
                    varTexto = varTexto + " por " + num2;
                    varTexto = varTexto + " es igual a " + varTemporal;

                    logger.log(Level.INFO, varTexto);

                    if (varTemporal <= 100) {
                        logger.log(Level.INFO, "La multiplicación no supera 100. Ingresa números nuevamente.");
                    }
                } catch (ArithmeticException e) {
                    logger.log(Level.SEVERE, "Error: División por cero", e);
                    varTemporal = 0;
                }
            } while (varTemporal <= 100);

            System.out.println("La multiplicación es mayor que 100. Programa terminado.");
        } catch (Exception e) {
            logger.log(Level.SEVERE, "Error ", e);
        } finally {
            scanner.close();
        }
    }

    public static int multiplica(int valor1, int valor2) {
        if (valor2 == 0) {
            throw new ArithmeticException("División por cero");
        }
        return valor1 * valor2;
    }

    /* public static double divide(int valor1, int valor2) {
        if (valor2 == 0) {
            throw new ArithmeticException("División por cero");
        }
        return valor1 / valor2;
    } */
    public final static void clearConsole()
    {
        try
        {
            final String os = System.getProperty("os.name");
            if (os.contains("Windows")) {
                Runtime.getRuntime().exec("cls");
            } else {
                Runtime.getRuntime().exec("clear");
            }
        }
        catch (final Exception e) {
            e.printStackTrace();
        }
    }
}


