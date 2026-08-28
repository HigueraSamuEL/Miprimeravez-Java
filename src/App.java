import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        int a = 10, b = 3;
        System.out.println( a + b );
        System.out.println( a - b);
        System.out.println( a * b);
        System.out.println(a / b );
        System.out.println( a % b );
        System.out.println(10.0 / 3);
        boolean mayorDeEdad = true;
        boolean tieneCarnet = false;
        System.out.println(mayorDeEdad && tieneCarnet);
        System.out.println(mayorDeEdad || tieneCarnet);
        System.out.println(!mayorDeEdad);
        Scanner sc = new Scanner(System.in);
        System.out.print("¿Cómo te llamas? ");
        String nombre = sc.nextLine();
        System.out.print("¿Cuántos años tienes? ");
        int edad = sc.nextInt();
        System.out.println("Hola, " + nombre +", Tienes " + edad +" + años");

        System.out.print( "Inserte base ");
        double base = sc.nextDouble();
        System.out.print( "Inserte altura ");
        double altura = sc.nextDouble();
        double area = base * altura;
        System.out.println( "El area del rectangulo es " + area);

        System.out.print("Nota1: ");
        double nota1 = sc.nextDouble();
        System.out.print("Nota2: ");
        double nota2 = sc.nextDouble();
        System.out.print("Nota3: ");
        double nota3 = sc.nextDouble();
        double promedio = (nota1 + nota2 + nota3) /3;
        System.out.print( "el promedio es de " + promedio); 
        
        if (promedio >= 90) {
            System.out.print( "Excelente");
        } else if (promedio >= 70) {
            System.out.print( "Bueno");
        } else if (promedio >= 60) {
            System.out.print( "Aprobado");
        } else {
            System.out.print( "Reprobado");
        }
                System.out.print("Ingrese la longitud del lado: ");
        double lado = sc.nextDouble();
        double areaCuadrado = lado * lado;
        System.out.println("El área del cuadrado es: " + areaCuadrado);

        System.out.print("Ingrese la base del radio: ");
        double radio = sc.nextDouble();
        double areaCirculo = Math.PI * radio * radio;
        System.out.println("El área del círculo es: " + areaCirculo);

        System.out.print("Ingrese la edad de la persona: ");
        int edadPersona = sc.nextInt();
        if (edadPersona >= 18) {
            System.out.println("La persona es mayor de edad.");
        } else {
            System.out.println("La persona es menor de edad.");
        }





    }
--------------------------------------------------------------------------------------------------
            for (int i = 1; i <= 10; i++) {
            if (i == 5) break; // paa cuando i llega a 5
            System.out.println(i); // imprime 1, 2, 3, 4
        }
        // continue - salta a la siguiente iteración.
        for (int i = 1; i <= 10; i++) {
            if (i % 2 == 0) continue; //salta los pares
            System.out.println(i); // imprime 1,3,5,7,9
        }
        int[] notas = new int[5];

        notas[0] = 85;
        notas[1] = 90;
        notas[2] = 78;
        notas[3] = 92;
        notas[4] = 88;

        int[] edades = {18, 20, 22, 19, 21};
        System.out.println(notas[0]); //85 por la lista
        for (int i = 0; i < notas.length; i++) {
            System.out.println("Nota " + (i+1) + " + notas[i]");
        for (int nota : notas) {
            System.out.println(nota);
        }
        }
               System.out.print("Cuantos estudiantes hay? ");
        int n = sc.nextInt();
        double[] notas = new double[n];
        double suma = 0;
        for (int i = 0; i < n; i++) { 
            System.out.print("Nota del estudiante " + (i + 1) + ": ");
            notas[i] = sc.nextDouble();
            suma += notas[i];
        }
        double promedio = suma / n;
        System.out.println("promedio del grupo: " + promedio); 

}
