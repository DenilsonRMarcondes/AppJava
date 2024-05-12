public class Condicoes {
    public static void main(String[] args) {
        //Variaveis para usar
        System.out.println("Teste da condição que vai ser desenvolvida em Java");
        System.out.println("");
        System.out.println("Aqui começa a linhagg qued vai ser feitas as condições");
        System.out.println("");
        System.out.println("Continuar aqui o codigo em java para estudar mais sobre a linguagem de programação java");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");


        int anoDeLancamento = 2022;
        boolean incluidoNoPlano = true;
        double notaDoFilme = 8.1;
        String tipoPlano = "plus";

        //esse sout vai pular a linha e garantir um espaçamento entre o codigo
        System.out.println("");

        if (anoDeLancamento > 2022){
            System.out.println("Lançamento que os clientes estão gostando");
        }else{
            System.out.println("Filme antigo que vale a pena assistir nos dias de hoje");
        }

        if (incluidoNoPlano == true && tipoPlano.equals("plus")){
            System.out.println("Filme liberado para ser assistido");
        } else {
            System.out.println("Deve realizar o pagamento da locação");
        }
    }
}
