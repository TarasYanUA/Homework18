import org.junit.jupiter.api.*;
import taras.LuckyTicket;

import static org.junit.jupiter.api.Assertions.assertEquals;

//проверяем, что выводит метод toString() класса LuckyTicket.
// Метод assertEquals проверяет, идентичны ли заданное значение и значение, полученное в результате работы метода.
public class LuckyTicketTestJunit {
    LuckyTicket arrayLuckyTicket = new LuckyTicket();

    @Test
    public void shouldCreateDefaultArrayTest() {
        System.out.println("TEST1");
        assertEquals(arrayLuckyTicket.toString(), "[3, 8, 3, 3, 3, 8]");
    }

    @Test
    void verifyArrayEqualIntegerValue() {
        System.out.println("TEST2");
        int[] array = {3, 8, 3, 3, 3, 8};
        int[] actualResult = LuckyTicket.resultArray(array);

        int[] expectedResult = {3, 8, 3, 3, 3, 8};
        Assertions.assertArrayEquals(expectedResult, actualResult);
    }

    @BeforeEach
    public void beforeTest() {
        System.out.println("This is text before each test");
    }

    @AfterEach
    public void afterTest(){
        System.out.println("This is text after each test");
    }

    @BeforeAll
    public static void beforeAll() {
        System.out.println("Before all tests …");
    }

    @AfterAll
    public static void afterAll(){
        System.out.println("After all tests …");
    }
}
