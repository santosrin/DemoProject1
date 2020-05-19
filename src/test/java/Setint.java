import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Setint {

    public static void main(String[] args) {

        Set<Integer> values = new TreeSet<>();
        values.add(51);
        values.add(61);
        values.add(92);
        values.add(62);

        for(int i : values) {
            System.out.println(i);
        }
    }
}
