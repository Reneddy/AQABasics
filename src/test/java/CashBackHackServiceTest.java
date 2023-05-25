import org.testng.Assert;
import org.testng.annotations.Test;
import ru.netology.service.CashbackHackService;

public class CashBackHackServiceTest {

    @Test
    public void amount0() {
        CashbackHackService service = new CashbackHackService();
        Assert.assertEquals(service.remain(0), 1000);
    }
    @Test
    public void amount1() {
        CashbackHackService service = new CashbackHackService();
        Assert.assertEquals(service.remain(1), 999);
    }

    @Test
    public void amount500() {
        CashbackHackService service = new CashbackHackService();
        Assert.assertEquals(service.remain(500), 500);
    }

    @Test
    public void amount999() {
        CashbackHackService service = new CashbackHackService();
        Assert.assertEquals(service.remain(999), 1);
    }

    @Test
    public void amount1000() {
        CashbackHackService service = new CashbackHackService();
        Assert.assertEquals(service.remain(1000), 0);
    }

    @Test
    public void amount1001() {
        CashbackHackService service = new CashbackHackService();
        Assert.assertEquals(service.remain(1001), 0);
    }

}
