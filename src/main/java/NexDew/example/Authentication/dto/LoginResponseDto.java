package NexDew.example.Authentication.dto;


import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;

@Data
@RequiredArgsConstructor
@NoArgsConstructor
public class LoginResponseDto {
    private String Jwt;
    private Long auth_id;



}
