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

        porcentRendimento = porcentRendimento/100;

        System.out.println("Escreva quanto foi investido: ");
        investimento = ler.nextDouble();

        System.out.println("Escreva quantos meses o dinheiro ficara investido: ");
        qtdMes = ler.nextInt();

        Rendimento rendimento = new Rendimento(porcentRendimento,investimento, qtdMes);
        rendimento.rendimentoBruto();

    }

}
