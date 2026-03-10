package Entity;
import lombok.*;

@Data
@AllArgsConstructor //constructor todos los campos
@NoArgsConstructor //constructor sin param
public class Message {
    private int id;
    private String content;


}
