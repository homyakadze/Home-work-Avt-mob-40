import org.junit.Assert;
import org.junit.Test;

public class MainClassTest extends MainClass
{
    //Код теста 2 Старт
    @Test
    public void testGetClassNumber()
    {
        Assert.assertTrue("20 less than 45",getClass_number() > 45);
    }
    //Код теста 2 Конец


    //Код теста 1 Старт
    @Test
    public void testGetLocalNumber()
    {
        int actual = getLocalNumber();
        int expected = 14;
        Assert.assertEquals("Method getLocalNumber return not 14",expected, actual);
    }
    //Код теста 1 Конец
}
