public class Wrappes {

    public static void main(String[] args) {

        Integer value = Integer.valueOf(25);
        String valueString = "344";
        int valuePrimitivo = value.intValue();
        int valueInt = Integer.parseInt(valueString);

        double valueDouble = value.doubleValue();
        String valueinString = value.toString();
        System.out.println("Valor " + valuePrimitivo);
    }
}
