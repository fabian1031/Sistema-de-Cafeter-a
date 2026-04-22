package sistemaTurnoCafeteria;

public class Main {
    public static void main(String[] args) {
        String[] nombres = {"Café americano", "Capuchino", "Jugo naranja", "Tostada",
                "Brownie"};
        double[] precios = {3500, 5000, 4000, 4500, 6000};
        char[] categorias = {'B', 'B', 'F', 'C', 'P'};
        int[] pedidoProducto = {0, 2, 1, 4, 0, 3};
        int[] pedidoCantidad = {2, 1, 3, 1, 1, 2};

        double total = 0;
        String descripcion = "";
        double descuento = 0.10;
        int inventarioBrownie = 10;


        for (int i = 0; i < nombres.length; i++) {
            total += precios[i];

            switch (categorias[i]) {
                case 'B':
                    descripcion = "bebidas Calientes";
                    break;
                case 'F':
                    descripcion = "bebida fria";
                    break;
                case 'C':
                    descripcion = "comida";
                    break;
                case 'P':
                    descripcion = "postre";
                    break;
                default:
                    descripcion = "Categoría no reconocida";
                    break;
            } // fin switch
            System.out.println((i + 1) + ". " + nombres[i] + " [Cat: " + categorias[i] + "] - $" + precios[i] + " | Cantidad: " + pedidoCantidad[i] + " | Acumulado: $" + total);

            if (total > 12000) {
                double valorDescuento = total * descuento;
                double resultado = total - valorDescuento;
                boolean tieneDerecho = true;
                System.out.printf("¿Tiene derecho al descuento?: %b%n", tieneDerecho);
                System.out.printf("Valor del descuento: $%.3f%n", valorDescuento);
                System.out.printf("Total a pagar: $%.3f%n", resultado);
            } else {
                System.out.printf("¿Tiene derecho al descuento?: %b%n", false);
                System.out.printf("Total a pagar: $%.3f%n", total);
            }
            while (inventarioBrownie >= 10) {
                inventarioBrownie -= pedidoCantidad[4];
                System.out.printf("Pedido #%d: Inventario restante = %d%n", i, inventarioBrownie);
                i++;
            }
            System.out.println("Cierre de inventario: Nivel crítico alcanzado.");
        }

        int montoApertura=13;
        int montoInicial=0;

        do {
            System.out.print("ingrese monto de apertura ");
            if (montoApertura > montoInicial)
                System.out.println("valor correcto");
            else {
                System.out.println("intente de nuevo");
            }
        } while (montoApertura <= 0);
    }// fin for


}


