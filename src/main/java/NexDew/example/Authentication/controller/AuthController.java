package NexDew.example.Authentication.controller;

import NexDew.example.Authentication.dto.LoginRequestDto;
import NexDew.example.Authentication.dto.LoginResponseDto;
import NexDew.example.Authentication.dto.SignupRequestDto;
import NexDew.example.Authentication.dto.SignupResponseDto;
import NexDew.example.Authentication.service.AuthenticationService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api")
public class AuthController {

    private final AuthenticationService authenticationService;
    @PostMapping("/login")
    public ResponseEntity<LoginResponseDto> login(@RequestBody LoginRequestDto loginRequestDto) {
        return ResponseEntity.ok(authenticationService.login(loginRequestDto));

    }

    @PostMapping("/signup")
    public ResponseEntity<SignupResponseDto> signup(@RequestBody SignupRequestDto signupRequestDto){
      return ResponseEntity.ok(authenticationService.signup(signupRequestDto));
    }

    @PostMapping("/validate-token")
    public ResponseEntity<Boolean> validateToken(@RequestBody String token){
        Boolean isValid = authenticationService.validateToken(token);
        return ResponseEntity.ok(isValid);
    }
    @PostMapping("/refresh-token")
    public ResponseEntity<LoginResponseDto> refreshToken(@RequestBody String refreshToken){
        return ResponseEntity.ok(authenticationService.refreshToken(refreshToken)) ;

    }
    @PostMapping("/update-password")
    public ResponseEntity<Boolean> updatePassword(@RequestBody SignupRequestDto signupRequestDto){
        Boolean isUpdated = authenticationService.updatePassword(signupRequestDto);
        return ResponseEntity.ok(isUpdated);
    }
    }

