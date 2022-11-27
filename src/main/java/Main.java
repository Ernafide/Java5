import org.example.SQRService;

public class Main {
    public static void main (String[] args) {
        SQRService service = new SQRService();
        int counter = service.calcSqr(9700,9802);
        System.out.println(counter);
    }
}
