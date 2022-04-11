public class UnitTestWithoutJunit {

    public static void main(String[] args) {

        Calculadora calculadora = new Calculadora();

        int resultadoSoma1 = calculadora.somar(5, 4);
        System.out.println(resultadoSoma1);

        int resultadoSoma2 = calculadora.somar(53, 42);
        System.out.println(resultadoSoma2);

        int resultadoSoma3 = calculadora.somar(52, 4);
        System.out.println(resultadoSoma3);

        int resultadoSoma4 = calculadora.somar(51, 44);
        System.out.println(resultadoSoma4);

    }
}
