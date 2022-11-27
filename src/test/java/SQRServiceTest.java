import org.example.SQRService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class SQRServiceTest {
    @Test
    public void counter3Test() {
        SQRService service = new SQRService();
        int actual = service.calcSqr(200,300);
        int expected = 3;
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void counter90Test() {
        SQRService service = new SQRService();
        int actual = service.calcSqr(0,10_000);
        int expected = 90;
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void counter1Test() {
        SQRService service = new SQRService();
        int actual = service.calcSqr(9700,9802);
        int expected = 1;
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void counter00Test() {
        SQRService service = new SQRService();
        int actual = service.calcSqr(1,99);
        int expected = 0;
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void counter0Test() {
        SQRService service = new SQRService();
        int actual = service.calcSqr(9802,10_000);
        int expected = 0;
        Assertions.assertEquals(expected, actual);
    }

}
