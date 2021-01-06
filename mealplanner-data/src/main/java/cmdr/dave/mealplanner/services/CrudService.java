package cmdr.dave.mealplanner.services;

import java.util.Set;

/**
 * @author dcass
 */
public interface CrudService <T, ID>{
    Set<T> findAll();
    T findById(ID id);
    T save(T object);
    void delete(T object);
    void deleteById(ID id);
}
