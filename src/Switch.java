public class Switch {
    public static void main(String[] args) {
        char categoria = 'C';
        int iva = 0;
        String descripcion = "";

        switch (categoria) {
            case 'B':
                iva = 0;
                descripcion = "bebidas Calientes";
                break;
            case 'F':
                descripcion = "bebida fria";
                iva = 5;
                break;
            case 'C':
                descripcion = "comida";
                iva = 8;
                break;
            case 'P':
                iva = 8;
                descripcion = "postre";
                break;
            default:
                descripcion = "Categoría no reconocida";
                iva = 0;
                break;
        }
        System.out.println(descripcion);
        System.out.println(iva);
    }
}

