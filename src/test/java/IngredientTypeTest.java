import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import praktikum.IngredientType;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class IngredientTypeTest {

    private final String ingredientName;
    private final IngredientType expectedType;

    public IngredientTypeTest(String ingredientName, IngredientType expectedType) {
        this.ingredientName = ingredientName;
        this.expectedType = expectedType;
    }

    @Parameterized.Parameters(name = "Тестовый случай: {0} -> {1}")
    public static Object[][] getTypeName() {
        return new Object[][]{
                {"SAUCE", IngredientType.SAUCE},
                {"FILLING", IngredientType.FILLING}
        };
    }

    @Test
    public void valueOfReturnsCorrectValue() {
        assertEquals(IngredientType.valueOf(ingredientName), expectedType);
    }
}
