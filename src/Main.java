public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        double height = 1.8;
        double weight = 77;
        int bmi = (int) service.calculate(height, weight);
        System.out.println("BMI = " + bmi);
    }
}