public class CrescimentoPopulacional {
    public static void main(String[] args) {
        int populacaoA = 80000;
        int populacaoB = 200000;
        double taxaCrescimentoA = 0.03;
        double taxaCrescimentoB = 0.015;
        int anos = 0;

        while (populacaoA < populacaoB) {
            populacaoA += populacaoA * taxaCrescimentoA;
            populacaoB += populacaoB * taxaCrescimentoB;
            anos++;
        }

        System.out.println("Após " + anos + " anos, a população do país A ultrapassará ou igualará a população do país B.");
        System.out.println("População do país A: " + populacaoA);
        System.out.println("População do país B: " + populacaoB);
    }
}
