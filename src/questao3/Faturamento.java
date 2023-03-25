
package questao3;

/**
 *
 * @author @Gabbszzz
 */
import java.io.FileReader;
import java.util.ArrayList;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

public class Faturamento {
    public static void main(String[] args) {
        
        JSONParser parser = new JSONParser();
        ArrayList<Double> faturamentoDiario = new ArrayList<Double>();
        double somaFaturamento = 0;
        int numDias = 0;

        try {
            // Lê o arquivo JSON
            Object obj = parser.parse(new FileReader("dados.json"));
            JSONObject jsonObject = (JSONObject) obj;

            // Extrai o array com o faturamento diário
            JSONArray faturamentoArray = jsonObject.get("faturamentoDiario");

            // Preenche o ArrayList com os valores do array
            for (var faturamento : faturamentoArray) {
                faturamentoDiario.add(Double.parseDouble(faturamento.toString()));
                somaFaturamento += Double.parseDouble(faturamento.toString());
                numDias++;
            }

            // Calcula a média do faturamento diário
            double mediaFaturamento = somaFaturamento / numDias;

            // Encontra o menor e o maior valor do faturamento diário
            double menorFaturamento = faturamentoDiario.get(0);
            double maiorFaturamento = faturamentoDiario.get(0);
            for (double faturamento : faturamentoDiario) {
                if (faturamento < menorFaturamento) {
                    menorFaturamento = faturamento;
                }
                if (faturamento > maiorFaturamento) {
                    maiorFaturamento = faturamento;
                }
            }

            // Conta o número de dias em que o faturamento diário foi superior à média mensal
            int numDiasAcimaMedia = 0;
            for (double faturamento : faturamentoDiario) {
                if (faturamento > mediaFaturamento) {
                    numDiasAcimaMedia++;
                }
            }

            // Exibe os resultados
            System.out.println("Menor faturamento diário: R$" + menorFaturamento);
            System.out.println("Maior faturamento diário: R$" + maiorFaturamento);
            System.out.println("Número de dias com faturamento acima da média: " + numDiasAcimaMedia);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}






