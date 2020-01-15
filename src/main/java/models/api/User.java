
package models.api;

import lombok.*;

import java.util.List;
import java.util.UUID;

@Data
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class User {
    private String email;
    private String password;
    private String firstName;
    private String lastName;
    private Boolean rememberMe;
    private UUID id;
    private Boolean active;
    private String anonymous;
    private List<String> authorities;

}
