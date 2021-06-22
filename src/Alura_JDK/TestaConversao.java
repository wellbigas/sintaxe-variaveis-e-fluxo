package Alura_JDK;

public class TestaConversao{

    public static void main(String... args){

        float pontoFlutuante = 3.14f;
        System.out.println(pontoFlutuante);

        double salario = 1270.50;
        int valor = (int) salario;
        System.out.println(valor);

        double valor1 = 0.2;
        double valor2 = 0.1;
        double total = valor1 + valor2;

        System.out.println(total);

        //Foi possível entender um pouco de type casting e como podemos passar um valor de um tipo para uma variável de outro.
        // Para alguns casos nós não precisamos fazer nada,
        // pois o casting é implícito e em outros precisamos deixar claro para o compilador que sabemos o que estamos fazendo,
        // mostrando entre parênteses o tipo que queremos que seja usado.
    }
}