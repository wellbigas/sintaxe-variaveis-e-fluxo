package Alura_JDK.Atividades.ifelse;//2. Escreva	 um	 programa	 para	 ler	 o	 ano	 de	 nascimento	 de	 uma	 pessoa	 e
//escrever	 uma	 mensagem	 que	 diga	 se	 ela	 poderá	 ou	 não	 votar	 este	 ano
//(não	é	necessário	considerar	o	mês	em	que	ela	nasceu).

public class TesteComIF2 {
    public static void main(String[] args) {
        int anoDeNascimento = 2006;
        int anoAtual = 2021;
        int totalAnoNascimento = anoAtual - anoDeNascimento;

        if (totalAnoNascimento >= 18) {
            System.out.println("Você está pronto para votar na eleição este ano!!");
        } else{
            System.out.println("Ainda não atingiu a idade minima para votação!!");
        }

    }

}
