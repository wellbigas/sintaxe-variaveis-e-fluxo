public class TestaCondicional2 {
    public static void main(String[] args) {
        System.out.println("Testando Condicionais");
        int idade = 16;
        int quantidadePessoas = 3;
        boolean acompanhado = quantidadePessoas >= 2; // expressão booleana é uma condição true

        System.out.println("valor de acompanhado = " + acompanhado);

        if (idade >= 18 && acompanhado) {
            System.out.println("seja bem vindo");
        } else {
                System.out.println("Infelizmente você não pode entrar");
            }
        }
    }
