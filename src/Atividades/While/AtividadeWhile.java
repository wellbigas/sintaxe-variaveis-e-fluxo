package Atividades.While;

//Determine qual é a idade que o usuário faz no ano atual.
//Para isso solicite o ano de nascimento do usuário e o ano atual.
public class AtividadeWhile {
    public static void main(String[] args) {
        int anoNascimento = 1994;
        int anoAtual = 2021;
        int contador = 0;

        while (anoNascimento < anoAtual) {
            anoNascimento = anoNascimento + 1;
            contador++;
        }
        System.out.println("Você irá fazer " + contador);

    }
}
