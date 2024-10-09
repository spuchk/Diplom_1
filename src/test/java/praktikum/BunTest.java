package praktikum;

import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.assertEquals;

public class BunTest {
    private Bun bun;

    @Before
    public void createNewInstance() {
        bun = new Bun("bulochka", 150.0f);
    }

    @Test
    public void getName() {
        String expected = "bulochka";
        String actual = bun.getName();

        assertEquals("Некорректное значение названия булочки", expected, actual);
    }

    @Test
    public void getPrice() {
        float expected = 150.0f;
        float actual = bun.getPrice();

        assertEquals("Некорректное значение цены", expected, actual, 0);
    }
}