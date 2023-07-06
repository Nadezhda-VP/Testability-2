public class BmiService {
    public int calculate(double amountHeight, int weight) {
        double bmi;
        bmi = (int) (weight / amountHeight);
        return (int) bmi;

    }
}
