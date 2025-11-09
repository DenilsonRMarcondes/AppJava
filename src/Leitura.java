import java.sql.SQLOutput;
import java.util.Scanner;

public class Leitura {
    public static void main(String[] args) {
        System.out.println("teste de leitura");
        System.out.println("ccc");



        Scanner leitura = new Scanner(System.in);

        System.out.println("Digite o nome de um filme para pesquisar: ");

        String filme = leitura.nextLine();
        System.out.println("Qual ano de lançamento do filme? ");
        int anoDeLancamento = leitura.nextInt();
        System.out.println("Escreva uma avaliação para o filme mencionadooo: ");
        double avaliacao = leitura.nextDouble();

        System.out.println("-------------------------------------------------");
        System.out.println("");
        System.out.println("Confira os resultados da sua escolha: ");
        System.out.println("");
        System.out.println();

        System.out.println(filme);
        System.out.println(anoDeLancamento);
        System.out.println(avaliacao);

        //Commit da nova branch

        //Fiz o teste do PULL REQUEST E DEU CERTO, DEPOIS SUBIR ESSA ALTERAÇÃO PARA A MAIN
        

    }
}
