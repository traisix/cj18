package trabajoenclase;

import java.util.Scanner;
public class trmHoy {
    public static void main(String[]  arg) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite la cantidad de pesos a convertir a Dolares");
        int Pesos = scanner.nextInt();
        Convertir(Pesos);
    }

    public static Float DOLLAR= 3940.70F;
    public static void Convertir(int Pesos) {
        System.out.println("Los pesos convertidos son ="+ (DOLLAR * Pesos));
    }
}
