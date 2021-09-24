/**
11) Chico tem 1.10, Juca tem 1.20. Sabendo que a cada ano que passa chico cresce 2
cm e Juca cresce 1 cm, quando anos são necessários para chico ser mais alto
que JUCA
 */
public class Alturas {
    public static void main(String[] args) {
        double alturaChico = 1.10;
        double alturaJuca = 1.20;
        int contadorAnos = 0;

        while (alturaChico < alturaJuca) {
            alturaChico += 0.02;
            alturaJuca += 0.01;
            contadorAnos += 1;
        }
        System.out.println(contadorAnos);
    }
}
