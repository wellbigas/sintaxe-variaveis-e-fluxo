package Alura_JDK.Atividades.While;//2. Programa em Java que mostra os números pares
//Escreva um aplicativo em Java mostra todos os números pares de 1 até 100.

public class AtividadeWhile2 {
    public static void main(String[] args) {
        int contador = 1;

        while (contador <= 100) {
            contador = contador + 1;
            System.out.println(contador);
            contador++;
        }
    }
}
