import java.util.Scanner;

public class Circ {

    private static Scanner scan;

	public static void main(String[] args) {

        scan = new Scanner(System.in);

        double raio, area;

        System.out.println("Escreva o valor do raio:");
        raio = scan.nextDouble();

        area = 3.1416 * (Math.pow(raio, 2));

        System.out.printf("O valor da area é %,.2f \n", area);
         
        }
}