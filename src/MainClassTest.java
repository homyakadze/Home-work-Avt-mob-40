import com.sun.deploy.util.StringUtils;
import org.junit.Assert;
import org.junit.Test;

import java.util.Locale;

public class MainClassTest extends MainClass
{
    //Код Теста 3 Старт
    @Test
    public void testGetClassString()
    {
        Assert.assertTrue("The string doesnt contain either Hello or hello",getClassString().toLowerCase().contains("hello"));
    }
    //Код Теста 3 Конец


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
