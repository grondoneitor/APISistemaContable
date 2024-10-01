package productos.API.Service;

import productos.API.Model.DTO.CategoriaDTO;
import productos.API.Model.Entity.Categoria;
import productos.API.Model.Entity.Cliente;
import productos.API.Model.Entity.ClienteDTO;

import java.util.ArrayList;

public interface ICategoriaService {
    Categoria save(CategoriaDTO categoria);
    Categoria findById(Integer id);
    void delete(Categoria categoria);
    boolean existsById(Integer id);
    Iterable<Categoria>  findAll();
    ArrayList<Categoria> findByName(String categoria);

}
