package model;

import lombok.Data;

import java.util.List;
import java.util.Set;

/**
 * @author dcass
 */
@Data
public class Recipe {
    private String name;
    private String description;

    private Set<RecipeIngredient> ingredients;
    private List<String> instructions;
}
