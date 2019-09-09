import java.util.*;

public class lorentz {
    public static void main(String[] args) {
        double boost_x = boost(1, 0.99);
        System.out.println(boost_x);
    }

    public static double boost(int index, double beta) {
        List<Double> FourVector = Arrays.asList(-1.0, 1.0, 1.0, 1.0);
        if (index == 0) {
            System.out.println("You can't boost the time component, silly!");
            return FourVector.get(index);
        } else {
            double lambda = 1 / (Math.sqrt(1 - Math.pow(beta, 2)));
            FourVector.set(index, lambda * FourVector.get(1));
            return FourVector.get(index);
        }
    }

    public static List<Double> createFourVector(double t, double x, double y, double z) {
        List<Double> FourVector = Arrays.asList(t, x, y, z);
        return FourVector;
    }
}
