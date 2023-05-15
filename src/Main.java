public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        int bimindex = service.calculate(1.87, 98);
        System.out.println(bimindex);
    }
}