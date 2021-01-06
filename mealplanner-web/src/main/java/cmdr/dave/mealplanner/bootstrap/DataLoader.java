package cmdr.dave.mealplanner.bootstrap;

import cmdr.dave.mealplanner.model.Ingredient;
import cmdr.dave.mealplanner.services.IngredientService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

/**
 * @author dcass
 */
@Component
@Slf4j
public class DataLoader implements CommandLineRunner {

    private IngredientService ingredientService;

    public DataLoader(IngredientService ingredientService) {
        this.ingredientService = ingredientService;
    }

    @Override
    public void run(String... args) throws Exception {
        log.info("Beginning Bootstrap Data process");
        ingredientService.save(Ingredient.builder().name("Chicken").build());
        ingredientService.save(Ingredient.builder().name("Rice").build());
        ingredientService.save(Ingredient.builder().name("Curry powder").build());
        ingredientService.save(Ingredient.builder().name("Beef").build());

        ingredientService.findAll().forEach(ingredient -> log.info(ingredient.getName()));
    }
}
