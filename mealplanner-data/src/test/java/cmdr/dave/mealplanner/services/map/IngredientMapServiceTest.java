package cmdr.dave.mealplanner.services.map;

import cmdr.dave.mealplanner.model.Ingredient;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author dcass
 */
class IngredientMapServiceTest {

    private IngredientMapService service;

    @BeforeEach
    void setUp() {
        service = new IngredientMapService();
        service.save(Ingredient.builder().name("chicken").build());
        service.save(Ingredient.builder().name("beef").build());
    }

    @Test
    void findAll() {
        Set<Ingredient> ingredients = service.findAll();
        assertEquals(2, ingredients.size());
    }

    @Test
    void findById() {
        Ingredient ingredient = service.findById(1L);
        assertEquals(1L, ingredient.getId());
        assertEquals("chicken", ingredient.getName());
    }

    @Test
    void save() {
        Ingredient savedIngredient = service.save(Ingredient.builder().name("pork").id(3L).build());
        assertEquals(3L , savedIngredient.getId());
        assertEquals("pork" , savedIngredient.getName());

    }

    @Test
    void delete() {
        service.delete(service.findById(1L));
        assertEquals(1, service.findAll().size());
    }

    @Test
    void deleteById() {
        service.deleteById(1L);
        assertEquals(1, service.findAll().size());
    }

    @Test
    void findByName() {
        Ingredient ingredient = service.findByName("chicken");
        assertEquals(1L, ingredient.getId());
        assertEquals("chicken", ingredient.getName());
    }
}