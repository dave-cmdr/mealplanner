package cmdr.dave.mealplanner.model;

import lombok.Data;

import java.util.List;
import java.util.Set;

/**
 * @author dcass
 */
@Data
public class Recipe extends BaseEntity{

    private String name;
    private String description;
    private Set<RecipeIngredient> ingredients;
    private List<String> instructions;

}
