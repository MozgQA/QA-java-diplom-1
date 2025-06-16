import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import praktikum.Ingredient;
import praktikum.IngredientType;

@RunWith(Parameterized.class)
public class IngredientTest {

    private final IngredientType type;
    private final String name;
    private final float price;

    public IngredientTest(IngredientType type, String name, float price) {
        this.type = type;
        this.name = name;
        this.price = price;
    }

    @Parameterized.Parameters(name = "Тип: {0}, Название: {1}, Цена: {2}")
    public static Object[][] getData() {
        return new Object[][] {
                {IngredientType.SAUCE, "Соус томатный", 1.8F},
                {IngredientType.FILLING, "Сыр моцарелла", 2.6F},
                {IngredientType.SAUCE, "Соус чесночный", 2.0F}
        };
    }

    @Test
    public void testGetType() {
        Ingredient ingredient = new Ingredient(type, name, price);
        IngredientType actualResult = ingredient.getType();
        Assert.assertEquals(type, actualResult);
    }

    @Test
    public void testGetName() {
        Ingredient ingredient = new Ingredient(type, name, price);
        String actualResult = ingredient.getName();
        Assert.assertEquals(name, actualResult);
    }

    @Test
    public void testGetPrice() {
        Ingredient ingredient = new Ingredient(type, name, price);
        float actualResult = ingredient.getPrice();
        Assert.assertEquals(price, actualResult, 0.05);
    }
}
