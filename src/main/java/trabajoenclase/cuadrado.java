package trabajoenclase;

import java.util.Scanner;

public class cuadrado {
    public static double calcularArea(double lado) {
        double area = lado * lado;
        return area;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite una medida del cuadrado para hallar su área : ");
        double lado = (float)scanner.nextInt();
        double areaCuadrado = calcularArea(lado);
        System.out.println("El área del cuadrado es: " + areaCuadrado);
    }
}

