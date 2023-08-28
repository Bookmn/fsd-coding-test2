import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.DBRef;
import java.util.List;

@Document(collection = "users")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name ="USER_TBL")
@Document(collection = "users")
public class User {

    @Id
    private String id;
    private String username;
    private String password;

    @DBRef
    private List<Role> roles;

}
