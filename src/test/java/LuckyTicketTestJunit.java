import org.junit.jupiter.api.Test;
import taras.LuckyTicket;

import static org.junit.jupiter.api.Assertions.assertEquals;

//проверяем, что выводит метод toString() класса LuckyTicket.
// Метод assertEquals проверяет, идентичны ли заданное значение и значение, полученное в результате работы метода.
public class LuckyTicketTestJunit {
    LuckyTicket arrayLuckyTicket = new LuckyTicket();

    @Test
    public void shouldCreateDefaultArrayTest() {
        assertEquals(arrayLuckyTicket.toString(), "[3, 8, 3, 3, 3, 8]");
    }
}
