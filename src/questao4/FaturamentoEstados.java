
package questao4;

/**
 *
 * @author @Gabbszzz
 */
public class FaturamentoEstados {
    public static void main(String[] args) {
        double faturamentoTotal = 67836.43 + 36678.66 + 29229.88 + 27165.48 + 19849.53;

        double percentualSP = 100 * (67836.43 / faturamentoTotal);
        double percentualRJ = 100 * (36678.66 / faturamentoTotal);
        double percentualMG = 100 * (29229.88 / faturamentoTotal);
        double percentualES = 100 * (27165.48 / faturamentoTotal);
        double percentualOutros = 100 * (19849.53 / faturamentoTotal);

        System.out.println("Percentual de representação por estado no faturamento mensal:");
        System.out.println("SP: " + String.format("%.2f", percentualSP) + "%");
        System.out.println("RJ: " + String.format("%.2f", percentualRJ) + "%");
        System.out.println("MG: " + String.format("%.2f", percentualMG) + "%");
        System.out.println("ES: " + String.format("%.2f", percentualES) + "%");
        System.out.println("Outros: " + String.format("%.2f", percentualOutros) + "%");
    }
}
