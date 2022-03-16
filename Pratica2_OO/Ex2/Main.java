package Ex2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);
        double porcentRendimento=0.0;
        double investimento=0.0;
        int qtdMes=0;

        System.out.println("Escreva a porcentagem do rendimento: ");
        porcentRendimento = ler.nextDouble();

        System.out.println("Escreva quanto foi investido: ");
        investimento = ler.nextDouble();

        System.out.println("Escreva quantos meses o dinheiro ficara investido: ");
        qtdMes = ler.nextInt();

        Rendimento rendimento = new Rendimento(porcentRendimento,investimento, qtdMes);
        System.out.println(rendimento.rendimentoBruto(qtdMes));

        for (int i = 1; i <= qtdMes; i++) {
            rendimento.setQtdMes(i);
            System.out.println("Mes " +i+ "  Rendimento/mês = " +rendimento.rendimentoBruto(i));
            System.out.println(rendimento.rendimentoBruto(i));
        }

    }
}
