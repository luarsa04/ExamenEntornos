import java.util.Scanner;

/**
 *
 * @author Lucia
 *
 */
public class Calculadora_Refactorizacion {

    public static void main(String[] args) {
        Calculadora calc = new Calculadora();
        Scanner scanner = new Scanner(System.in);
        String nombre = "Lucia";

        System.out.println(" Bienvenido a la Calculadora de " + nombre);
        System.out.print("Introduce la operación (sumar, restar, multiplicar, dividir): ");
        String operador = scanner.nextLine();

        System.out.print("Introduce el primer número y segundo número: ");
        int a = scanner.nextInt();

        System.out.print("Introduce el segundo número: ");
        int b = scanner.nextInt();

        try {
            int resultado = calc.operar(operador, a, b);
            System.out.println(" Resultado: " + resultado);
        } catch (Exception e) {
            System.out.println("️ Error: " + e.getMessage());
        }
    }



    public int operar(String operador, int a, int b) {

        /**
         *
         * Parametros utilizados para calcular las operciones
         * @param SUMAR
         * @param RESTAR
         * @param MULTIPLICAR
         * @param DIVIDIR
         *
         */

        int SUMAR = a + b;
        int RESTAR = a - b;
        int MULTIPLICAR = a * b;
        int DIVIDIR = a / b;


        /**
         *
         * Apartir del operador indicado en este caso sumaremos
         * @param sumar
         * */
        if (operador.equals("sumar"))
        {
            System.out.println(" Iniciando operación: SUMAR");
            int resultado = SUMAR;
            return resultado;

            /**
             *
             * Apartir del operador indicado en este caso restaremos
             * @param restar
             * */
        } else if (operador.equals("restar")) {
            System.out.println(" Iniciando operación: RESTAR");
            int resultado = RESTAR;
            return resultado;

            /**
             *
             * Apartir del operador indicado en este caso multiplicaremos
             * @param multiplicar
             * */
        } else if (operador.equals("multiplicar")) {
            System.out.println(" Iniciando operación: MULTIPLICAR");
            int resultado = MULTIPLICAR;
            return resultado;


            /**
             *
             * Apartir del operador indicado en este caso dividiremos
             * @param dividir
             * Primero mirara si algun parametro es cero
             * Si es cero mostrara el printl de "️ Error: División por cero"
             * Si no es Cero continuara haciendo la operion corresponiente
             * */
        } else if (operador.equals("dividir")) {
            System.out.println(" Iniciando operación: DIVIDIR");


            if (b == 0) {
                System.out.println("️ Error: División por cero");
                throw new ArithmeticException("División por cero");
            }
            int resultado = DIVIDIR;
            return resultado;

        } else {
            System.out.println("⚠️Error: Operación no válida");
            return 0;
        }
    }


}
