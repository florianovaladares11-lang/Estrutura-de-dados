

public class Exemplo {
    public static void main(String[] args) {

        // ---- TIPOS PRIMITIVOS ----
        int numero1 = 10;
        int numero2 = 25;
        double preco = 19.99;
        float nota = 8.5f;
        char inicial = 'G';
        boolean aprovado = true;
        long populacao = 8000000000L;
        byte idade = 17;
        short ano = 2026;

     
        int soma = numero1 + numero2;
        System.out.println("Soma: " + soma);

        double total = preco * 3;
        System.out.println("Total de 3 produtos: " + total);

     
        System.out.println("Nota: " + nota);
        System.out.println("Inicial: " + inicial);
        System.out.println("Aprovado? " + aprovado);
        System.out.println("Populacao: " + populacao);
        System.out.println("Idade: " + idade);
        System.out.println("Ano: " + ano);

     
        int[] numeros = {1, 3, 5, 7, 9, 10};

        int somaArray = 0;
        for (int n : numeros) {
            somaArray = somaArray + n;
        }
        System.out.println("Soma do array: " + somaArray);
        System.out.println("Media do array: " + (somaArray / numeros.length));

       
        int[][] matriz = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        System.out.println("Elemento da linha 1, coluna 0: " + matriz[1][0]);

        System.out.println("Matriz completa:");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }
}
