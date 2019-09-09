import java.util.*;

public class lists {

    public static void main(String[] args) {
        List<Integer> N = new ArrayList<Integer>(4);
        Collections.addAll(N, 5, 10, 15, 20);
        System.out.println(N.get(0));
    }
}