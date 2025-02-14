import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Document(collection = "roles")
@Data
@AllArgsConstructor
@NoArgsConstructor

public class Role {

    @Id
    private String id;
    private String name;
    private List<String> authorities;

}
