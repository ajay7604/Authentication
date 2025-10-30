package NexDew.example.Authentication.service;

import NexDew.example.Authentication.dto.LoginRequestDto;
import NexDew.example.Authentication.dto.LoginResponseDto;
import NexDew.example.Authentication.dto.SignupRequestDto;
import NexDew.example.Authentication.dto.SignupResponseDto;

public interface AuthenticationService {
    LoginResponseDto login(LoginRequestDto loginRequestDto);

    SignupResponseDto signup(SignupRequestDto signupRequestDto);

    Boolean validateToken(String token);

    LoginResponseDto refreshToken(String refreshToken);

    Boolean updatePassword(SignupRequestDto signupRequestDto);
}
