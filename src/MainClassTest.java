import org.junit.Assert;
import org.junit.Test;

public class MainClassTest extends MainClass
{
    @Test
    public void testGetLocalNumber()
    {
        Assert.assertEquals("Method getLocalNumber return not 14",14, getLocalNumber());
    }
}

// Тест проверяет, что функция getLocalNumber возвращает 14
