package Ex2;

public class Rendimento {
    private double rendimento;
    private double investimento;
    private int qtdMes;

    public Rendimento(double rendimento, double investimento, int qtdMes) {
        this.rendimento = rendimento;
        this.investimento = investimento;
        this.qtdMes = qtdMes;
    }

    public void setQtdMes(int qtdMes) {
        this.qtdMes = qtdMes;
    }

    public double rendimentoBruto(int qtdMes) {

        rendimento = rendimento / 100;
        double retorno;
        for (int i = 1; i <= qtdMes; i++) {
            retorno = investimento * rendimento;
            investimento = investimento + retorno;
        }
        return investimento;
    }
}
