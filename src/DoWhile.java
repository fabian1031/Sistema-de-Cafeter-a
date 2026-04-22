import java.util.Scanner;

public class DoWhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int montoApertura;

        do {
            System.out.print("ingrese monto de apertura ");
            montoApertura = sc.nextInt();
            if (montoApertura > 0)
                System.out.println("valor correcto");
            else {
                System.out.println("intente de nuevo");
            }
        } while (montoApertura <= 0);

        sc.close();
    }
}
