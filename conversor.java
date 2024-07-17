import java.util.Scanner;

public class ConversorDeMoeda {

    public static double converterEURparaUSD(double valorEmEUR, double taxaDeCambio) {
        return valorEmEUR * taxaDeCambio;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe a taxa de câmbio de EUR para USD: ");
        double taxaDeCambio = scanner.nextDouble();

        System.out.print("Informe o valor em EUR: ");
        double valorEmEUR = scanner.nextDouble();

        double valorEmUSD = converterEURparaUSD(valorEmEUR, taxaDeCambio);

        System.out.printf("O valor %.2f EUR equivale a %.2f USD.\n", valorEmEUR, valorEmUSD);

        scanner.close();
    }
}
