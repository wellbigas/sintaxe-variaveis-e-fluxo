public class TestaPontoFlutuante{

    public static void main(String[] args){

        double salario = 1250.70;
        System.out.println(salario);

        double teste = 125.50;        // compila
        System.out.println(teste);

        double idade = 26;

        double divisao = 3.14 / 2;
        System.out.println(divisao);

        double outraDivisao = 5 / 2; //arredonda//
        System.out.println(outraDivisao);

        double novaTentativa = 5.0 / 2; //Se a variável divisao fosse do tipo double, teríamos o mesmo problema, a única diferença seria que nossa saída teria casa decimal: 2.//
        System.out.println(novaTentativa);

    }
}