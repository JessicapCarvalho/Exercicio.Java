public class calcular {
    public static void soma(double n1, double n2) {
        double resultado = n1 +n2;

        System.out.println("A soma de " + n1 + " mais " + n2 + " é " + resultado);
    }

    public static void subtracao (double n1, double n2) {
        double resultado = n1 - n2;

        System.out.println ("A subtração de " + n1 + " menos " + n2 + " é " + resultado);
    }

    public static void multiplicacao (double n1 , double n2) {
        double resultado = n1 * n2;

        System.out.println ("A multiplicação de " + n1 + " multiplicado por " + n2 + " é " + resultado);
    }

    public static void divisao (double n1 , double n2) {
        double resultado = n1 / n2;

        System.out.println("A divisão de " + n1 + " dividido por " + n2 + " é " + resultado);
    }
}
