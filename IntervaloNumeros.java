import java.util.Scanner;

public class IntervaloNumeros {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        int numero1 = scanner.nextInt();

        System.out.print("Digite o segundo número: ");
        int numero2 = scanner.nextInt();

        int inicio = Math.min(numero1, numero2);
        int fim = Math.max(numero1, numero2);

        System.out.println("Os números no intervalo entre " + numero1 + " e " + numero2 + " são:");

        for (int i = inicio + 1; i < fim; i++) {
            System.out.println(i);
        }

        scanner.close();
    }
}
