import java.util.Scanner;

public class Leitura {
    public static void main(String[] args) {
        System.out.println("teste de leitura");

        Scanner leitura = new Scanner(System.in);

        System.out.println("Digite o nome de um filme para pesquisar: ");
        String filme = leitura.nextLine();
        System.out.println("Qual ano de lançamento do filme? ");
        int anoDeLancamento = leitura.nextInt();
        System.out.println("Escreva uma avaliação para o filme mencionado no codigo: ");
        double avaliacao = leitura.nextDouble();

        System.out.println("-------------------------------------------------");
        System.out.println("");
        System.out.println("Confira os resultados da sua escolha: ");
        System.out.println("");

        System.out.println(filme);
        System.out.println(anoDeLancamento);
        System.out.println(avaliacao);

    }
}
