package trabajoenclase;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class promedio_notas {
    public static void main(String[] arg) {
        double Notas[] = { 0.00, 0.00, 0.00,0.00, 01};

        for (int i=0; i < 5; i++) {
            System.out.println("Digite la nota del Estudiante" + i);
            Scanner scanner = new Scanner(System.in);
            Notas[i] = scanner.nextDouble();
        }
        double Suma = 0;
        for (int i = 0; i < 5; i++) {
            Suma  = Suma + Notas[i];
        }
        System.out.printf("El promedio de notas es %2.0f", (Suma / 5));
    }
}
