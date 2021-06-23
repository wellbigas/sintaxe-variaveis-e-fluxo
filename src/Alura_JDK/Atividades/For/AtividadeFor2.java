//Utilize um laço do tipo for para imprimir todos os múltiplos de 3, entre 1 e 100.
//Dica: Existem duas maneiras tradicionais de resolver este problema. Uma delas consiste em fazer o for,
// e utilizar numero % 3 para descobrir o resto da divisão de um número por 3 (o operador % se chama de módulo).
// Se o resto for zero, ele é divisível por 3. Como em:
//Outra abordagem é fazer um laço um pouco diferente, que pula já direto pelos múltiplos de três. Existem outras abordagens,
// escolha a sua e faça a implementação em uma nova classe!

package Alura_JDK.Atividades.For;

public class AtividadeFor2 {
    public static void main(String[] args) {
        for (int numero = 5; numero < 100; numero++) {
            if(numero % 3 == 0) {
                System.out.println(numero);

            }
        }
    }

}
