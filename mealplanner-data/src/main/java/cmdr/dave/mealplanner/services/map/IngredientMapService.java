package cmdr.dave.mealplanner.services.map;

import cmdr.dave.mealplanner.model.Ingredient;
import org.springframework.stereotype.Service;
import cmdr.dave.mealplanner.services.IngredientService;

import java.util.Set;

/**
 * @author dcass
 */
@Service
public class IngredientMapService extends AbstractMapService<Ingredient, Long> implements IngredientService {

    @Override
    public Set<Ingredient> findAll() {
        return super.findAll();
    }

    @Override
    public Ingredient findById(Long id) {
        return super.findById(id);
    }

    @Override
    public Ingredient save(Ingredient object) {
        return super.save(object);
    }

    @Override
    public void delete(Ingredient object) {
        super.delete(object);
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }


    @Override
    public Ingredient findByName(String name) {
        return findAll().stream().filter(ingredient -> ingredient.getName().equals(name)).findFirst().orElse(null);
    }
}
