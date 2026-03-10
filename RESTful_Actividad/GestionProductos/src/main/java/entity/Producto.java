package entity;
import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Producto {
    @Getter
    @Setter
    private int id;

    @Getter
    @Setter
    private String nombre;

    @Getter
    @Setter
    private double precio;

    @Getter
    @Setter
    private int stock;
}
