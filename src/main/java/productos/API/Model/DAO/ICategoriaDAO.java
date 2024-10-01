package productos.API.Model.DAO;

import org.springframework.data.repository.CrudRepository;
import productos.API.Model.Entity.Categoria;

public interface ICategoriaDAO extends CrudRepository<Categoria,Integer> {
}
