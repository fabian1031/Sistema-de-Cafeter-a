public class While {
    public static void main(String[] args) {
        int inventario = 50;
        int pedido = 3;
        int i = 1;
        while (inventario >= 10) {
            inventario -= pedido;
            System.out.printf("Pedido #%d: Inventario restante = %d%n", i, inventario);
            i++;
        }
        System.out.println("Cierre de inventario: Nivel crítico alcanzado.");
    }
}

