import java.util.Scanner;

public class Operadores {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double descuento = 0.15;
        double subTotal = 42500.0;
        double pedidos = 30000.0;

        if (subTotal > pedidos) {
            double valorDescuento = subTotal * descuento;
            double total = subTotal - valorDescuento;
            boolean tieneDerecho = true;
            System.out.printf("¿Tiene derecho al descuento?: %b%n", tieneDerecho);
            System.out.printf("Valor del descuento: $%.3f%n", valorDescuento);
            System.out.printf("Total a pagar: $%.3f%n", total);
        } else {
            System.out.printf("¿Tiene derecho al descuento?: %b%n", false);
            System.out.printf("Total a pagar: $%.3f%n", subTotal);
        }

    }
}

