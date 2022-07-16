import org.testng.annotations.*;
import taras.LuckyTicket;
import org.testng.Assert;

//проверяем, что выводит метод toString() класса LuckyTicket.
// Метод Assert.assertEquals проверяет, идентичны ли заданное значение и значение, полученное в результате работы метода.
public class LuckyTicketTestNg {
    LuckyTicket arrayLuckyTicket = new LuckyTicket();

    @Test
    public void shouldCreateDefaultArrayTest() {
        System.out.println("TEST1");
        Assert.assertEquals(arrayLuckyTicket.toString(), "[3, 8, 3, 3, 3, 8]");
        }

    @Test
    void verifyArrayEqualIntegerValue() {
        System.out.println("TEST2");
        int[] array = {3, 8, 3, 3, 3, 8};
        int[] actualResult = LuckyTicket.resultArray(array);

        int[] expectedResult = {3, 8, 3, 3, 3, 8};
        Assert.assertEquals(expectedResult, actualResult);
    }

    @BeforeMethod
    public void beforeTest() {
        System.out.println("This is text before each test");
    }

    @AfterMethod
    public void afterTest(){
        System.out.println("This is text after each test");
    }

    @BeforeSuite
    public void beforeAllTests() {
        System.out.println("Before all tests …");
    }

    @AfterSuite
    public void afterAllTests() {
        System.out.println("After all tests …");
    }
}
