package productos.API.Model.Payload;

import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.io.Serializable;

@Data
@ToString
@Builder
public class Response implements Serializable {

    private String mensaje;
    private Object object;
}
