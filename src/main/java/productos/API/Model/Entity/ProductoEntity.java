package productos.API.Model.Entity;


import jakarta.persistence.*;
import lombok.*;

import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Builder
@Entity
@Table(name = "productos")
public class ProductoEntity implements Serializable {

    @Id
    @Column(name = "ID_Productos")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer Id;

    @Column(name = "Productos")
    private String Producto;


    @Column(name = "Stock")
    private Integer Stock;

    @Column(name = "Stock_Min")
    private Integer Stock_Min;

    @Column(name = "Estado")
    private boolean Estado;

    @Column(name = "Precio")
    private Integer Precio;

    @Column(name = "Descripcion")
    private String Descripcion;

    @ManyToOne
    @JoinColumn(name = "ID_Categoria", nullable = true)
    private Categoria Categoria;
}
