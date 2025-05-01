import java.util.Scanner;

public class ValidacaoInformacoes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String nome, sexo, estadoCivil;
        int idade;
        double salario;

        while (true) {
            System.out.print("Digite o nome (maior que 3 caracteres): ");
            nome = scanner.nextLine();
            if (nome.length() > 3) {
                break;
            } else {
                System.out.println("Nome inválido! O nome deve ter mais de 3 caracteres.");
            }
        }

        while (true) {
            System.out.print("Digite a idade (entre 0 e 150): ");
            idade = scanner.nextInt();
            if (idade >= 0 && idade <= 150) {
                break;
            } else {
                System.out.println("Idade inválida! A idade deve estar entre 0 e 150.");
            }
        }

        while (true) {
            System.out.print("Digite o salário (maior que 0): ");
            salario = scanner.nextDouble();
            if (salario > 0) {
                break;
            } else {
                System.out.println("Salário inválido! O salário deve ser maior que zero.");
            }
        }

        while (true) {
            System.out.print("Digite o sexo ('f' para feminino ou 'm' para masculino): ");
            sexo = scanner.next().toLowerCase();
            if (sexo.equals("f") || sexo.equals("m")) {
                break;
            } else {
                System.out.println("Sexo inválido! Digite 'f' para feminino ou 'm' para masculino.");
            }
        }

        while (true) {
            System.out.print("Digite o estado civil ('s' para solteiro, 'c' para casado, 'v' para viúvo, 'd' para divorciado): ");
            estadoCivil = scanner.next().toLowerCase();
            if (estadoCivil.equals("s") || estadoCivil.equals("c") || estadoCivil.equals("v") || estadoCivil.equals("d")) {
                break;
            } else {
                System.out.println("Estado civil inválido! Digite 's', 'c', 'v' ou 'd'.");
            }
        }

        System.out.println("\nInformações validadas:");
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Salário:
