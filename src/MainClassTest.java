import org.junit.Assert;
import org.junit.Test;

public class MainClassTest extends MainClass
{
    @Test
    public void testGetClassNumber()
    {
       Assert.assertTrue("20 less than 45",getClassNumber() > 45);
    }
}

//Тест проверяет больше ли 45 значение, возвращаемое методом getClassNumber
