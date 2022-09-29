public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        System.out.println("ИМТ: " + service.calculate(58.6f, 1.72f));

    }
}