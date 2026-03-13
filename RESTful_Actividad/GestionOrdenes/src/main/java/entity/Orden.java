package entity;


import lombok.*;

import java.sql.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Orden {

    @Getter
    @Setter
    private int id;

    @Getter
    @Setter
    private Date fecha;

    @Getter
    @Setter
    private double total;
}
