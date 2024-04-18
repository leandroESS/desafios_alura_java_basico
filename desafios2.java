public class desafios2 {
    public static void main(String[] args) {
        //1 - Crie um programa que realize a média de duas notas decimais e exiba o resultado.
        double nota1 = 5.76;
        double nota2 = 7.09;
        System.out.print((nota1+nota2)/2);
        System.out.print("\n");


        // 2 - Declare uma variável do tipo double e uma variável do tipo int.
        //Faça o casting da variável double para int e imprima o resultado.

        double var1 = 6.7;
        int var2 = (int) var1;

        System.out.print(var2);
        System.out.print("\n");

        //3 - Declare uma variável do tipo char (letra) e uma variável do tipo String (palavra).
        // Atribua valores a essas variáveis e concatene-as em uma mensagem.

        char var3 = 'L';
        String var4 = "eandro";
        System.out.print(Character.toString(var3) + var4);
        System.out.print("\n");

        // 4 - Declare uma variável do tipo double precoProduto e uma variável do tipo int (quantidade).
        // Calcule o valor total multiplicando o preço do produto pela quantidade e apresente o resultado em uma mensagem.
        double precoProduto = 4.74;
        int quantidade = 9;
        System.out.print(precoProduto*quantidade);
        System.out.print("\n");

        //5 - Declare uma variável do tipo double valorEmDolares. Atribua um valor em dólares a essa variável.
        // Considere que o valor de 1 dólar é equivalente a 4.94 reais.
        // Realize a conversão do valor em dólares para reais e imprima o resultado formatado.

        double valorEmDolares = 13.25;
        System.out.print(valorEmDolares*4.94 + " $");
        System.out.print("\n");

        //6 - Declare uma variável do tipo double precoOriginal. Atribua um valor em reais a essa variável,
        // representando o preço original de um produto. Em seguida, declare uma variável do tipo
        // double percentualDesconto e atribua um valor percentual de desconto ao produto
        // (por exemplo, 10 para 10%). Calcule o valor do desconto em reais, aplique-o ao preço original e
        // imprima o novo preço com desconto.

        double precoOriginal = 3.19;
        double percentualDesconto = 20;

        System.out.print((precoOriginal*20)/100);
        System.out.print("\n");






    }
}
