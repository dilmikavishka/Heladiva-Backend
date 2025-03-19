package lk.ijse.heladivaproject.dto;

import jakarta.persistence.Column;
import jakarta.persistence.Id;
import lombok.*;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class UserDTO {
    private String userId;
    private String name;
    private String email;
    private String phone;
    private String password;
    private String address;
    private String role;
    private String imageUrl;
}
