import java.util.Scanner;

public class CrescimentoPop { 
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int populacaoA, populacaoB, anos;
        double taxaCrescimentoA, taxaCrescimentoB;
        String repetir;

        do {
            System.out.print("Informe a população inicial do país A: ");
            while (!scanner.hasNextInt()) {
                System.out.print("Por favor, insira um número inteiro válido para a população do país A: ");
                scanner.next();
            }
            populacaoA = scanner.nextInt();

            System.out.print("Informe a população inicial do país B: ");
            while (!scanner.hasNextInt()) {
                System.out.print("Por favor, insira um número inteiro válido para a população do país B: ");
                scanner.next();
            }
            populacaoB = scanner.nextInt();

            System.out.print("Informe a taxa de crescimento anual do país A (em %): ");
            while (!scanner.hasNextDouble()) {
                System.out.print("Por favor, insira um número válido para a taxa de crescimento de A: ");
                scanner.next();
            }
            taxaCrescimentoA = scanner.nextDouble() / 100;

            System.out.print("Informe a taxa de crescimento anual do país B (em %): ");
            while (!scanner.hasNextDouble()) {
                System.out.print("Por favor, insira um número válido para a taxa de crescimento de B: ");
                scanner.next();
            }
            taxaCrescimentoB = scanner.nextDouble() / 100;

            if (populacaoA <= 0 || populacaoB <= 0 || taxaCrescimentoA < 0 || taxaCrescimentoB < 0) {
                System.out.println("Por favor, insira valores válidos para as populações e taxas de crescimento.");
                continue;
            }

            anos = 0;
            while (populacaoA < populacaoB) {
                populacaoA += populacaoA * taxaCrescimentoA;
                populacaoB += populacaoB * taxaCrescimentoB;
                anos++;
            }

            System.out.println("Após " + anos + " anos, a população do país A ultrapassará ou igualará a população do país B.");
            System.out.println("População do país A: " + populacaoA);
            System.out.println("População do país B: " + populacaoB);

            System.out.print("Deseja realizar outra operação? (s/n): ");
            repetir = scanner.next();
        } while (repetir.equalsIgnoreCase("s"));

        scanner.close();
    }
}
