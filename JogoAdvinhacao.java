import java.util.Random;
import java.util.Scanner;

//Crie um programa que simula um jogo de adivinhação, que deve gerar um
// número aleatório entre 0 e 100 e pedir para que o usuário tente adivinhar o
// número, em até 5 tentativas. A cada tentativa, o programa deve informar se o
// número digitado pelo usuário é maior ou menor do que o número gerado.

public class JogoAdvinhacao {
    public static void main(String[] args) {
        int numAle = new Random().nextInt(100);
        int contador = 5;
        System.out.print(numAle + "\n");
        Scanner scanner = new Scanner(System.in);

        while (contador > 0) {
            System.out.print("Digite um número para ver se é o sorteado: \n");
            int numero = scanner.nextInt();
            if (numero > numAle) {
                System.out.print("Valor digitado alto \n");
            } else if (numero < numAle) {
                System.out.print("Valor digitado baixo: \n");
            } else {
                System.out.print("Parabéns Você achou o número!!!\n");
                break;

            }

            contador--;

        }

        System.out.print("FIM DE JOGO");

    }
}
