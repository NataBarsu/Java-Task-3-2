public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        double weight = 85;
        double height = 1.82;
        double bodyMassIndex = service.calculate(weight,height);
        System.out.println(bodyMassIndex);
    }
}
