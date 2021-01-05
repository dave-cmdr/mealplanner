package model;

import lombok.Data;

/**
 * @author dcass
 */
@Data
public class RecipeIngredient {
    private String name;
    private MeasurementUnit unit;
    private float amount;
}
