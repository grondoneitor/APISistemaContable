package productos.API.Service;

import productos.API.Model.DTO.ProductoDTO;
import productos.API.Model.Entity.ProductoEntity;

import java.util.ArrayList;

public interface IProductoService {

    ProductoEntity save(ProductoDTO productoDTO);
    ProductoEntity findProById(Integer id);
    void delete(ProductoEntity productoEntity);
    ArrayList<ProductoEntity> findProByName(String producto);
    boolean existProById(Integer id);
    Iterable<ProductoEntity> findProAll();

}
