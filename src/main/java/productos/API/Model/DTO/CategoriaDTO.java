package productos.API.Model.DTO;

import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.io.Serializable;
@Data
@ToString
@Builder
public class CategoriaDTO implements Serializable {


    private Integer ID_Categoria;
    private String Categoria;

}
