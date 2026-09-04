import java.util.Scanner;

public class Edades {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        
        int edad = -1;
        while (edad < 1 || edad > 120){
            System.out.print(" Ingresa edad:");
            edad = sc.nextInt();
            if (edad < 1 || edad > 120){
                System.out.print(" La edad debe ser mayor a 1 y menor a 120, intente otra vez");
            }
            if (edad >= 1 && edad <= 12) {
            System.out.print( "Niñez");
        }
            else if (edad >= 13 && edad <= 17) {
            System.out.print(" Adolescencia");
        }
          else if (edad >= 18 && edad <= 25) {
            System.out.print( "Juventud");
        }
        else if (edad >= 26 && edad <= 59) {
            System.out.print( "Adultez");
        }
        else if (edad >= 60 && edad <= 120) {
            System.out.print( "Tercera edad");
        }
        }
    }
}
//=====================================================================
import java.util.Scanner;

public class Estadisticas {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        double[] notas = new double[10];

        for (int i = 0; i <= 9; i++) {
            System.out.print("Ingrese la nota " + (i + 1) + ": ");
            notas[i] = sc.nextDouble();
        }
        double suma = 0;
        double masAlta = notas[0];
        int posAlta = 0;
        double masBaja = notas[0];
        int posBaja = 0;
        int aprobados = 0;
        int reprobados = 0;

        for (int i = 0; i <= 9; i++) {

            suma = suma + notas[i];

            if (notas[i] > masAlta) {
                masAlta = notas[i];
                posAlta = i;
            }

            if (notas[i] < masBaja) {
                masBaja = notas[i];
                posBaja = i;
            }

            if (notas[i] >= 3.0) {
                aprobados = aprobados + 1;
            } else {
                reprobados = reprobados + 1;
            }
        }

        double promedio = suma / 10;

        System.out.println("\n--- RESULTADOS ---");
        System.out.println("Promedio: " + promedio);
        System.out.println("Nota más alta: " + masAlta);
        System.out.println("Posición de la nota más alta: " + posAlta);
        System.out.println("Nota más baja: " + masBaja);
        System.out.println("Posición de la nota más baja: " + posBaja);
        System.out.println("Aprobados: " + aprobados);
        System.out.println("Reprobados: " + reprobados);
    }
}
//====================================================================================
import java.util.Scanner;

public class Series {
     public static void main(String[] args) throws Exception{
        Scanner sc = new Scanner(System.in); 
        // Ejercicio 1
        System.out.print("Ingresa el valor de n: ");
        int n = sc.nextInt();
        int sumaNaturales = 0;
                for (int i = 1; i <= n; i++) {
            sumaNaturales = sumaNaturales + i;
        }

        int formulaNaturales = n * (n + 1) / 2;

        System.out.println("\n1. Suma de números naturales");
        System.out.println("Resultado con for: " + sumaNaturales);
        System.out.println("Fórmula cerrada: " + formulaNaturales);
        //Ejercicio 2.
        int suma = 0;

        for (int i = 1; i <= n; i++) {
            suma = suma + (2 * i);
        }

        int formula = n * (n + 1);

        System.out.println("\n2. Suma de números pares");
        System.out.println("Resultado con for: " + suma);
        System.out.println("Fórmula cerrada: " + formula);

        //Ejercicio 3.
        int sumaCuadrados = 0;

        for (int i = 1; i <= n; i++) {
            sumaCuadrados = sumaCuadrados + (i * i);
        }

        int formulaCuadrados = n * (n + 1) * (2 * n + 1) / 6;

        System.out.println("\n3. Suma de cuadrados perfectos");
        System.out.println("Resultado con for: " + sumaCuadrados);
        System.out.println("Fórmula cerrada: " + formulaCuadrados);



}

}
