package productos.API.Model.DAO;

import org.springframework.data.repository.CrudRepository;
import productos.API.Model.Entity.ProductoEntity;

public interface IProductoDAO extends CrudRepository<ProductoEntity, Integer> {
}
