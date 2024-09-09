public class Main {
    static int indice = 13;
    static int soma = 0;

    public static void main(String[] args) {
        for (int k = 0; k < indice; k++){
            soma += k;
            System.out.println(soma);
        }
        System.out.println("O valor da variável SOMA é " + soma);
    }
}