public class TestaEscopo {

    public static void main(String[] args) {
        System.out.println("Testando Condicionais");
        int idade = 16;
        int quantidadePessoas = 3;

        // boolean acompanhado = quantidadePessoas >= 2; // expressão booleana é uma condição true
        boolean acompanhado;

        if (quantidadePessoas >= 2) {  //quebrado em duas linhas, para entender com funcionada boelano utilizando como true ou false
            acompanhado = true;
        } else {
            acompanhado = false;
        }

        System.out.println("valor de acompanhado = " + acompanhado);

        if (idade >= 18 && acompanhado) {
            System.out.println("seja bem vindo");
        } else {
            System.out.println("Infelizmente você não pode entrar");
        }
    }
}
