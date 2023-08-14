package Domain;

public class TransporteTerrestre extends Transportadora{
    private final double porcentagemFrete = 0.2;
    @Override
    public double calculaFrete(int altura, int largura) {
        return (altura + largura) * porcentagemFrete;
    }
}