public class teste {
    public static void main(String[] args) {
        String primeiroNome = "Rafael";
        String segundoNome = "Narciso";

        String nomeCompleto = nomeCompleto(primeiroNome, segundoNome);
        System.out.println(nomeCompleto);
        System.out.println("\n");
        System.out.println(nomeCompleto(primeiroNome, segundoNome) + "\n");
        System.out.println("Soma de valores com metodos");
        int a = 5, b = 5;
        int soma = soma(a, b);
        System.out.println(soma);
    }

    public static String nomeCompleto(String primeiroNome, String segundoNome) {
        return primeiroNome.concat(" ").concat(segundoNome);
    }

    public static int soma(int a, int b) {
        return a + b;
    }

}
