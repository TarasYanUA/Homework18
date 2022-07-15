import taras.LuckyTicket;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LuckyTicketTest {
    LuckyTicket arrayLuckyTicket = new LuckyTicket();

    @Test
    public void shouldCreateDefaultArrayTest() {
        Assert.assertEquals(arrayLuckyTicket.toString(), "[3, 8, 3, 3, 3, 8]");
        }

    }
