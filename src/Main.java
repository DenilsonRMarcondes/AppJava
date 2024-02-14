public class Main {
    public static void main(String[] args) {

        System.out.println("Bem vindo ao sistema em java apenas para estudos");
        System.out.println("Sistema para aprender a linguagem Java");

        int anoDeLancamento = 2022;
        System.out.println("Ano de Lançamento: " + anoDeLancamento);
        //abaixo tem outro exemplo de variavel desenvolvida em Java
        System.out.println(anoDeLancamento);
        boolean incluidoNoPlano = true;
        //foi a nota que cada pessoa escolheu para o filme de sua preferencia em nosso sistema de cadastro que foi desenvolvido em java para testar um backend
        double botaDoFilme = 8.1;
        //System.out.println(botaDoFilme);
        System.out.println(1+2);

        //AQUI VAI UM EXEMPLO DE MATEMATICA USANDO JAVA
        int a = 10 + 5;
        int b = 10 - 5;
        int c = 10 * 5;

        //Imprime a soma da letra a que está usando o int
        System.out.println(a);

        //Imprime a subtração conta de menos da letra b que questá usando um int
        System.out.println(b);
        //Pula a linha no terminar quando for executar o codigo
        System.out.println("----");

        //Media da nota que foi apresentado no vídeo
        double media = (9.8 + 6.3 + 8.0) / 3;
        System.out.println(media);
        //String sinopse;
        //sinopse = "Filme de aventura com um ator que viveu em 1980";
        //System.out.println(sinopse);
        String sinopse;
        sinopse = """
                Filme top gun que está no nosso sistema com o ator que viveu nos anos 1980
                """ + anoDeLancamento;
        System.out.println(sinopse);

        //ABAIXO SE ENCONTRA UM EXEMPLO PARA FORMATAR UM TEXTO QUE ESTÁ SENDO CRIADO
        String nome = "Deni";
        int idade = 30;
        double valor = 10.00;
        System.out.println(String.format("Meu nome é %s, eu tenho %d anos e hoje gastei %.3f reais", nome, idade, valor));

        //CONVERTENDO VALORES NA LINGUAGEM JAVA COMFORME O VÍDEO DO CURSO
        int classificacao;
        classificacao = (int) (media/2);
        //Classificação mostra quantas estrelas vai imprimir
        System.out.println(classificacao);



    }
}