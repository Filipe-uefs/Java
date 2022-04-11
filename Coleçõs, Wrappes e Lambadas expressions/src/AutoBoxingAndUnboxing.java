import java.util.ArrayList;
import java.util.List;

public class AutoBoxingAndUnboxing {

    public static void main(String[] args) {

        int idade = 21;
        List<Integer> idades = new ArrayList<>();
        idades.add(idade); // Autoboxing

        int refIdade = idades.get(0); //Unboxing
        System.out.println(idades.get(0));
    }
}
