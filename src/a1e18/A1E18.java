import java.util.Scanner;

public class A1E18 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //definir variables
        int Numero = 0;
        int d1;
        int d2;
        int d3;
        int d4;
        int Suma;
        String numeroCadena;
        
        System.out.print("Ingrese un numero de 4 digitos: ");
        Numero = scanner.nextInt();

        numeroCadena = Integer.toString(Numero);

        d1 = Integer.parseInt(numeroCadena.substring(0, 1));
        d2 = Integer.parseInt(numeroCadena.substring(1, 2));
        d3 = Integer.parseInt(numeroCadena.substring(2, 3));
        d4 = Integer.parseInt(numeroCadena.substring(3, 4));
        Suma = d1 + d2 + d3 + d4;

        System.out.println("d1=" + d1 + " d2=" + d2 + " d3=" + d3 + " d4=" + d4 + " Suma: " + Suma);
    }

}
