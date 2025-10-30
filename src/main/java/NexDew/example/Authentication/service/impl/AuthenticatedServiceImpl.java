package NexDew.example.Authentication.service.impl;

import NexDew.example.Authentication.dto.LoginRequestDto;
import NexDew.example.Authentication.dto.LoginResponseDto;
import NexDew.example.Authentication.dto.SignupRequestDto;
import NexDew.example.Authentication.dto.SignupResponseDto;
import NexDew.example.Authentication.service.AuthenticationService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;


@Service
@RequiredArgsConstructor
public class AuthenticatedServiceImpl implements AuthenticationService {


    @Override
    public LoginResponseDto login(LoginRequestDto loginRequestDto) {
        return null;
    }

    @Override
    public SignupResponseDto signup(SignupRequestDto signupRequestDto) {
        return null;
    }

    @Override
    public Boolean validateToken(String token) {
        return null;
    }

    @Override
    public LoginResponseDto refreshToken(String refreshToken) {
        return null;
    }

    @Override
    public Boolean updatePassword(SignupRequestDto signupRequestDto) {
        return null;
    }
}
