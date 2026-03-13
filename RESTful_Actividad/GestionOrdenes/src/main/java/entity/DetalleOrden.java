package entity;
import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class DetalleOrden {

    @Getter
    @Setter
    private int id;

    @Getter
    @Setter
    private Orden orden;

    @Getter
    @Setter
    private double precio;

    @Getter
    @Setter
    private int cantidad;

    @Getter
    @Setter
    private Producto roducto;




}
