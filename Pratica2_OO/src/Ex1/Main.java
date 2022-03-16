package Ex1;

public class Main {
    public static void main(String[] args) {
        Estoque estoque = new Estoque("Parafuso", 10,3);
        System.out.println(estoque.getQtdAtual());
        estoque.darBaixa(4);
        System.out.println(estoque.getQtdAtual());
        System.out.println(estoque.mostrar());
        System.out.println(estoque.precisaRepor());
    }
}
