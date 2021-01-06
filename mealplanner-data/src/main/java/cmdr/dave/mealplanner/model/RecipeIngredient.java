package cmdr.dave.mealplanner.model;

import lombok.Data;

/**
 * @author dcass
 */
@Data
public class RecipeIngredient extends BaseEntity{
    private Ingredient ingredient;
    private MeasurementUnit unit;
    private float amount;
}
