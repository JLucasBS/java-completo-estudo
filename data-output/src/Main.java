import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        System.out.println("Bom dia!");

        int y = 32;
        System.out.println(y);

        double x = 3.14159;
        System.out.println(x);

        System.out.printf("%.2f%n", x);
        System.out.printf("%.4f%n", x);

        Locale.setDefault(Locale.US);
        System.out.printf("%.4f%n", x);

        System.out.println("RESULTADO = " + x + " METROS");
        System.out.printf("RESULTADO = %.2f METROS%n", x);

        String nome = "Maria";
        int idade = 25;
        double renda = 1000.0;
        System.out.printf("%s tem %d anos e ganha R$ %.2f reais%n", nome, idade, renda);
    }
}