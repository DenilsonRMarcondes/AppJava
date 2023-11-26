public class Condicoes {
    public static void main(String[] args) {
        //Variaveis para usar
        System.out.println("Teste da condição que vai ser desenvolvida em Java");
        System.out.println("");
        System.out.println("Aqui começa a linha que vai ser feitas as condições");

        int estoque = //valor recuperado do sistema

        if (estoque >= 100) {
            System.out.println(“Produto com quantidade suficiente.”);
        } else if (estoque < 100 && estoque > 50) {
            System.out.println(“Alerta: Avaliar possibilidade de novo pedido.”);
        } else {
            System.out.println(“ATENÇÃO! Faça um novo pedido.”);
        }

    }
}
