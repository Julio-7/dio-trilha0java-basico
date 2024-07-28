import java.util.Scanner;

public class Logica {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float salarioBruto;
        float beneficios;


        System.out.println("Digite seu salario bruto");
        salarioBruto = sc.nextInt();

        System.out.println("Digite seus beneficios adicionais");
        beneficios = sc.nextInt();

        float valorImposto = 0;
        if(salarioBruto == 1100 && salarioBruto >=0) {
        valorImposto = salarioBruto * 0.05f;
        }
        else if(salarioBruto >= 1100.01 && salarioBruto <= 2500.00) {
            valorImposto = salarioBruto * 0.10f;
        }
        else if(salarioBruto>2500.00){
            valorImposto = salarioBruto * 0.15f;
        }
        float saida = salarioBruto - valorImposto + beneficios;
        System.out.println(saida)   ;
    }
}
