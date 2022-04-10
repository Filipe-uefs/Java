public class ArrayPrimitivo {

    public static int calcularFibonacci(int numero) {
        return numero <= 1 ? numero : calcularFibonacci(numero - 1) + calcularFibonacci(numero - 2);
    }

    public static void main(String[] args) {
        int[] escalasFibonacci = new int[10];

        for(int i = 0; i < escalasFibonacci.length; ++i) {
            escalasFibonacci[i] = calcularFibonacci(i);
        }

        for (int escalaFibonacci : escalasFibonacci) {
            System.out.println(escalaFibonacci);
        }

    }
}
