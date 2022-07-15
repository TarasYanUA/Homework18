import taras.LuckyTicket;
import org.testng.Assert;
import org.testng.annotations.Test;

//проверяем, что выводит метод toString() класса LuckyTicket.
// Метод Assert.assertEquals проверяет, идентичны ли заданное значение и значение, полученное в результате работы метода.
public class LuckyTicketTest {
    LuckyTicket arrayLuckyTicket = new LuckyTicket();

    @Test
    public void shouldCreateDefaultArrayTest() {
        Assert.assertEquals(arrayLuckyTicket.toString(), "[3, 8, 3, 3, 3, 8]");
        }
    }
