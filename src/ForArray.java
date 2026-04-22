public class ForArray {
    public static void main(String[] args) {
        String[] productos = {"Café americano", "Capuchino", "Jugo de naranja", "Tostada",
                "Brownie"};
        double[] precios = {3500, 5000, 4000, 4500, 6000};

        double total = 0;

        for (int i = 0; i < productos.length; i++) {
            System.out.println((i + 1) + ". " + productos[i] + " - $" + precios[i]);
            total += precios[i];
        }

        System.out.println("Precio promedio: $" + (total / precios.length));
    }

}
