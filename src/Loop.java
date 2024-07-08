import java.util.Scanner;

public class Loop {
    public static void main(String[] args) {
        System.out.println("teste de leitura da classe em java");
        System.out.println("ccc");

        Scanner leitura = new Scanner(System.in);
        double mediaAvaliacao = 0;

        double nota = 0;
        for (int i = 0; i < 3; i++) {
            System.out.println("Escreva uma avaliação para o filme mencionado: ");
            nota = leitura.nextDouble();
            mediaAvaliacao += nota;
        }
        System.out.println("Teste de variaveis usando o copilot");
        System.out.println("");
        // Example of creating various types of variables in Java

        // Integer variable
        int age = 30;

        // Double variable for decimal values
        double salary = 4550.50;

        // Boolean variable for true/false
        boolean isEmployed = true;


        // String variable for text
        String name = "John Doe";

        // Character variable for single characters
        char grade = 'A';

        System.out.println("Média de avaliações" + mediaAvaliacao/3);

    }
}
