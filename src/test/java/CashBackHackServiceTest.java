
import org.junit.Assert;
import org.junit.Test;
import ru.netology.service.CashbackHackService;

public class CashBackHackServiceTest {

    @Test
    public void amount0() {
        CashbackHackService service = new CashbackHackService();
        Assert.assertEquals(1000,service.remain(0));
    }
    @Test
    public void amount1() {
        CashbackHackService service = new CashbackHackService();
        Assert.assertEquals(999, service.remain(1));
    }

    @Test
    public void amount500() {
        CashbackHackService service = new CashbackHackService();
        Assert.assertEquals(service.remain(500), 500);
    }

    @Test
    public void amount999() {
        CashbackHackService service = new CashbackHackService();
        Assert.assertEquals(1, service.remain(999));
    }

    @Test
    public void amount1000() {
        CashbackHackService service = new CashbackHackService();
        Assert.assertEquals(0, service.remain(1000));
    }

    @Test
    public void amount1001() {
        CashbackHackService service = new CashbackHackService();
        Assert.assertEquals(0, service.remain(1001));
    }

}
