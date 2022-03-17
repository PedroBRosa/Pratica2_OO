package Ex2;

public class Rendimento {
    private double rendimento;
    private double investimento;
    private int qtdMes;

    public Rendimento( double rendimento, double investimento, int qtdMes) {
        this.rendimento = rendimento;
        this.investimento = investimento;
        this.qtdMes = qtdMes;
    }

    public void setQtdMes(int qtdMes) {
        this.qtdMes = qtdMes;
    }
    public double getRendimento(double rendimento){
        this.rendimento = rendimento;
        return rendimento;
    }

    public void rendimentoBruto() {
        double retorno;
        for (int i = 1; i <= qtdMes; i++) {
            retorno = investimento * rendimento;
            investimento = investimento + retorno;
            System.out.printf("Mes %d   |   Rendimento/Mes  %.2f",i,investimento);
            System.out.println(" ");
        }
    }
}
