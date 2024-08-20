import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        digitarNumeros();
    }


    static void digitarNumeros() {
        System.out.println("Pequena calculadora!");

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        int numero = Integer.parseInt(scanner.nextLine());

        System.out.print("Digite o segundo número: ");
        int segundoNumero = Integer.parseInt(scanner.nextLine());

        System.out.print("Você quer somar ou subtrair?\n1 para somar\n2 para subtrair\n");
        int question = Integer.parseInt(scanner.nextLine());

        int soma = numero + segundoNumero;
        int subtracao = numero - segundoNumero;

        if (question == 1) {
            System.out.println("Seu resultado é: " + soma);
        } else {
            if (question == 2) {
                System.out.println("Seu resultado é: " + subtracao);
            } else {
                System.out.println("Opção inválida, tente novamente.\n");
                digitarNumeros();
            }
        }
    }
}