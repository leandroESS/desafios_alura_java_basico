import java.util.Scanner;

public class desafio3 {
    public static void main(String[] args) {
        //1- Crie um programa que solicite ao usuário digitar um número.
        // Se o número for positivo, exiba "Número positivo", caso contrário, exiba "Número negativo".
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número para ver se é o sorteado: \n");
        int numero = scanner.nextInt();

        if (numero > 0) {
            System.out.print("Número positivo\n");
        } else {
            System.out.print("Número negativo \n");
        }

        //2 - Peça ao usuário para inserir dois números inteiros.
        // Compare os números e imprima uma mensagem indicando se são iguais,
        // diferentes, o primeiro é maior ou o segundo é maior.
        System.out.print("Digite dois números inteiros\n");
        int numero2 = scanner.nextInt();
        int numero3 = scanner.nextInt();

        if (numero2 != numero3) {
            System.out.println("Números são diferentes\n");
            if (numero2 > numero3) {
                System.out.printf("O número %d é maior que %d", numero2, numero3);
            } else {
                System.out.printf("O número %d é maior que %d", numero3, numero2);
            }


        } else {
            System.out.println("Os números são iguais\n");
        }

        //3 - Crie um menu que oferece duas opções ao usuário: "1.
        // Calcular área do quadrado" e "2. Calcular área do círculo".
        // Solicite a escolha do usuário e realize o cálculo da área com base na opção selecionada.
        System.out.println("Por favor, selecione uma opção\n");
        System.out.println("1 - Calcular área do quadrado\n2 - Calcular área do círculo\n");
        int valor = scanner.nextInt();

        switch (valor) {
            case 1:
                System.out.print("Digite o lado do quadrado \n");
                double numero4 = scanner.nextDouble();
                double area = Math.pow(numero4, 4);
                System.out.printf("O valor da área do quadrado é %.1f\n", area);
                break;

            case 2:
                System.out.print("Digite o raio do círculo \n");
                double raio = scanner.nextDouble();
                double area2 = Math.PI * raio * raio;
                System.out.printf("O valor da área do círculo é %.1f\n", area2);
                break;
            default:
                System.out.printf("Opção inválida");
                break;


        }

        //4 - Crie um programa que solicite ao usuário um número e exiba a tabuada desse número de 1 a 10.
        System.out.println("Digite um número que podemos calcular a sua tabuada de 1 a 10\n");
        int numero5 = scanner.nextInt();
        int resultado = 0;
        for (int i = 1; i <= 10; i++) {
            resultado = i * numero5;
            System.out.printf("%d x %d = %d\n", numero5, i, resultado);
        }

        //5 - Crie um programa que solicite ao usuário a entrada de um número inteiro.
        // Verifique se o número é par ou ímpar e exiba uma mensagem correspondente.

        System.out.println("Digite um número inteiro para sabermos se é par ou impar\n");
        int numero6 = scanner.nextInt();

        if (numero6 % 2 == 0) {
            System.out.println("É par\n");
        } else {
            System.out.println("É impar\n");
        }

        //6- Crie um programa que solicite ao usuário um número e calcule o fatorial desse número.
        System.out.println("Digite um número pra calcular seu fatorial\n");
        int numero7 = scanner.nextInt();
        int j = 0;
        int final2 = numero7;

        if (numero7 == 0) { //caso base
            final2 = 1;
        } else {

            while (j <= numero7) {
                final2 = final2 * (numero7 - 1);
                numero7--;
                j++;
            }
        }

        System.out.printf("%d", final2);


    }
}
