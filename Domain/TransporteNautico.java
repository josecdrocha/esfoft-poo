package Domain;

public class TransporteNautico extends Transportadora{
    private final double porcentagemFrete = 0.1;

    @Override
    public double calculaFrete(int altura, int largura) {
        return (altura + largura) * porcentagemFrete;
    }
}