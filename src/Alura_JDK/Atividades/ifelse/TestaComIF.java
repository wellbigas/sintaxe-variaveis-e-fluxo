package Alura_JDK.Atividades.ifelse;

// 1. Escreva	 um	 programa	 para	 ler	 2	 valores	 (considere	 que	 	 não	 serão
// informados	valores	iguais)	e	escrever	o	maior	deles
public class TestaComIF {
    public static void main(String[] args) {
        int numeroMenor = 10;
        int numeroMaior = 20;

        if (numeroMenor < numeroMaior) {
            System.out.println("O numero maior é " + numeroMaior);
        } else {
            System.out.println("Não existente!!");
        }

    }
}
