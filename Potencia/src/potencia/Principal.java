package potencia;

import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        int X, op, Y;
        Scanner lec = new Scanner(System.in);

        do {
            System.out.println("Ingrese un numero");
            X = lec.nextInt();
            System.out.println("Selecciones por cuanto quiere potenciar el numero");

            System.out.println("Potenciar por 2");
            System.out.println("Potenciar por 3");
            System.out.println("Potenciar por 4");
            System.out.println("Elija una opcion");
            op = lec.nextInt();

            switch (op) {
                case 2:
                    System.out.println(X * X);
                    break;
                case 3:
                    System.out.println(X * X * X);
                    break;
                case 4:
                    System.out.println(X * X * X * X);
                    break;
                default:
                    System.out.println("Opcion invalida");
            }
            System.out.println("Desea continuar SI(1) o NO (Cualquier numero)");
            Y = lec.nextInt();

        } while (Y == 1);
    }
}
