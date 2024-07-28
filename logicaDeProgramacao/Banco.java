import java.util.Scanner;

public class Banco {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double saldo = 0;
        boolean continuar = true;
        double valor;

        while (continuar) {


            int opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    // TODO: Ler o valor a ser depositado e atualizar/imprimir o saldo.
                    System.out.println("valor a ser depositado:");
                    valor = scanner.nextDouble();
                    saldo+=valor;
                    System.out.println("saldo final: "+saldo);
                    break;
                case 2:
                    // TODO: Ler o valor a ser sacado e verificar/imprimir se há saldo suficiente.
                    System.out.println("Valor a sacar:");
                    valor = scanner.nextDouble();
                    if(saldo>=0){
                        saldo-=valor;
                    }
                    else{
                        System.out.println("Nao foi possivel sacar");
                    }
                    System.out.println("saldo final: "+saldo);
                    break;
                case 3:
                    // TODO: Exibir o saldo atual da conta.
                    System.out.println("Saldo atual: "+saldo);
                    break;
                case 0:
                    System.out.println("Programa encerrado.");
                    continuar = false;  // Atualiza a variável de controle para encerrar o loop
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }
        scanner.close();
    }
}
