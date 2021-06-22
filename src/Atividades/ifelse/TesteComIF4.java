package Atividades.ifelse;//As	maçãs	 custam	 R$	 0,30	 cada	 se	 forem	 compradas	menos	 do	 que	 uma
//dúzia,	 e	 R$	 0,25	 se	 forem	 compradas	 pelo	 menos	 doze.	 Escreva	 um
//programa	 que	 leia	 o	 número	 de	 maçãs	 compradas,	 calcule	 e	 escreva	 o
//valor	total	da	compra.

public class TesteComIF4 {
    public static void main(String[] args) {
        int unidade = 12;
        double maca = 0.30;
        double macaDuzia = 0.25;

        if (unidade < 12) {
            System.out.println("Comprando uma maçâ, o preço da unidade será 0,30 centavos");
            System.out.println("Total da compra = " + unidade * maca);
        } else {
            System.out.println("Comprando uma duzia de maçâs, o preço será 0,25 centavos a unidade");
            System.out.println("Total da compra = " + unidade * macaDuzia);
        }
    }
}
