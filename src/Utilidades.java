import java.util.Scanner;

public class Utilidades {


    public static int castearEntero (String mensaje, String dato) {
        int num = 0;
        boolean flag = true;
        Scanner entradaTeclado= new Scanner(System.in);

        do {
            System.out.print(mensaje);
            dato = entradaTeclado.nextLine();
            if(Excepciones.verificarEntero(dato)) {
                num = Integer.parseInt(dato);
                flag = true;
            } else {
                flag = false;
            }
        }while(flag == false);

        return num;
    }

    public static double castearDecimal (String mensaje, String dato) {
        double num = 0;
        boolean flag = true;
        Scanner entradaTeclado= new Scanner(System.in);

        do {
            System.out.print(mensaje);
            dato = entradaTeclado.nextLine();
            if(Excepciones.verificarEntero(dato)) {
                num = Double.parseDouble(dato);
                flag = true;
            } else {
                flag = false;
            }
        }while(flag == false);

        return num;
    }


}
