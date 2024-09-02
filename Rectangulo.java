import java.util.Scanner;

public class Rectangulo {
    public static void main(String[] args) {
        // Crear un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // Solicitar la base del rectángulo
        System.out.print("Ingrese la base del rectángulo: ");
        double base = scanner.nextDouble();

        // Solicitar la altura del rectángulo
        System.out.print("Ingrese la altura del rectángulo: ");
        double altura = scanner.nextDouble();

        // Calcular el área y el perímetro
        double area = base * altura;
        double perimetro = 2 * (base + altura);

        // Mostrar los resultados
        System.out.println("El área del rectángulo es: " + area);
        System.out.println("El perímetro del rectángulo es: " + perimetro);

        // Cerrar el scanner
        scanner.close();
    }
}
