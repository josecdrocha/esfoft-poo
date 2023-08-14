import Domain.TransporteNautico;
import Domain.TransporteTerrestre;

public class Main {
    public static void main(String[] args) {
        TransporteTerrestre terrestre = new TransporteTerrestre();
        TransporteNautico nautico = new TransporteNautico();
        System.out.println("Frete terrestre: " + terrestre.calculaFrete(20, 50));
        System.out.println("Frete náutico: " + nautico.calculaFrete(20, 50));
    }
}