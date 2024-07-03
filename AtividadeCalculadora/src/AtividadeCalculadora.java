import java.util.Scanner;

public class AtividadeCalculadora {

    public static void main(String[] args){
        calculadora();
    }
    public static void calculadora(){
        Scanner ler = new Scanner(System.in);
        int operacao;
        int x, y;
        System.out.println("Qual operação você deseja fazer? \n1 - Soma\n2 - Subtração\n3 - Multiplicacao\n4 - Divisão\n5 - Sair");
        operacao = ler.nextInt();
        while (operacao != 5){
            if (operacao == 1) {
                System.out.println("Me informe o valor de X:");
                x = ler.nextInt();
                System.out.println("Me informe o valor de Y:");
                y = ler.nextInt();
                int soma = x + y;
                System.out.println("A soma final é de = " + soma);
            } else if (operacao == 2) {
                System.out.println("Me informe o valor de X:");
                x = ler.nextInt();
                System.out.println("Me informe o valor de Y:");
                y = ler.nextInt();
                int subtracao = x - y;
                System.out.println("A subtração final é de = " + subtracao);
            } else if (operacao == 3) {
                System.out.println("Me informe o valor de X:");
                x = ler.nextInt();
                System.out.println("Me informe o valor de Y:");
                y = ler.nextInt();
                int multiplicacao = x * y;
                System.out.println("A multiplicação final é de = " + multiplicacao);
            } else if (operacao == 4) {
                System.out.println("Me informe o valor de X:");
                x = ler.nextInt();
                System.out.println("Me informe o valor de Y:");
                y = ler.nextInt();
                double divisao = (double) x / y;
                System.out.printf("A divisão final é de = %.2f%n", divisao);
            }
            System.out.println("Qual operação você deseja fazer? \n1 - Soma\n2 - Subtração\n3 - Multiplicacao\n4 - Divisão\n5 - Sair");
            operacao = ler.nextInt();
        }
        System.out.println("Obrigado por usar nosso serviço!");
    }
}
