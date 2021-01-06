package cmdr.dave.mealplanner.model;

import lombok.*;

/**
 * @author dcass
 */
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class Ingredient extends BaseEntity {
    private String name;

    @Builder
    public Ingredient(Long id, String name){
        super(id);
        this.name = name;
    }
}
