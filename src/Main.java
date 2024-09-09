public class Main {
    static int indice = 13;
    static int soma = 0;
    static int k = 0;

    public static void main(String[] args) {

        while (k < indice) {
            k += 1;
            soma += k;
            System.out.println(soma);
        }

        System.out.println("O valor da variável SOMA é " + soma);

    }
}