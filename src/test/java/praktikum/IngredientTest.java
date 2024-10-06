package praktikum;

import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.assertEquals;

public class IngredientTest {
    private Ingredient ingredient;

    @Before
    public void createNewInstance() {
        ingredient = new Ingredient(IngredientType.SAUCE, "bbq", 7.6f);
    }

    @Test
    public void getName() {
        String expected = "bbq";
        String actual = ingredient.getName();

        assertEquals("Некорректное имя ингридиента", expected, actual);
    }

    @Test
    public void getPrice() {
        float expected = 7.6f;
        float actual = ingredient.getPrice();

        assertEquals("Некорректное значение цены ингридиента", expected, actual, 0);
    }
}
