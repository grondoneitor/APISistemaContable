package productos.API.Model.DAO;

import org.springframework.data.repository.CrudRepository;
import productos.API.Model.Entity.Cliente;

public interface IClienteDAO extends CrudRepository<Cliente, Integer> {
}
