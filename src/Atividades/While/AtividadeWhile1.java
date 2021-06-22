package Atividades.While;//1. Programa em Java que mostra os números ímpares
//Escreva um aplicativo em Java mostra todos os números ímpares de 1 até 100.

public class AtividadeWhile1 {
    public static void main(String[] args) {
        int contador = 0;

        while (contador < 100) {
            contador = contador +1;
            System.out.println(contador);
            contador++;
        }
    }
}
