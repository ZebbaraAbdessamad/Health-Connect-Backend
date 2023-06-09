package com.example.doctorbackend.auth;

import com.example.doctorbackend.user.Role;

import com.example.doctorbackend.user.User;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;


@RestController
@RequestMapping("/api/v1/auth")
@RequiredArgsConstructor
public class AuthenticationController {

  private final AuthenticationService service;



  //add by abdessamad
  //return User
  @GetMapping("/{email}")
  public ResponseEntity<User> getUserByEmail(@PathVariable String email) {
    User user = service.getUser(email);
    if (user != null) {
      return ResponseEntity.ok(user);
    } else {
      return ResponseEntity.notFound().build();
    }
  }

  @PostMapping("/register")
  public ResponseEntity<AuthenticationResponse> register(
      @ModelAttribute RegisterRequest request,
      @RequestParam("file") MultipartFile file
  ) throws IOException {
    // I won't let anyone have any  role
    request.setRole(Role.USER);// only users can be registered
    return ResponseEntity.ok(service.register(request,file));
  }
  @PostMapping("/authenticate")
  public ResponseEntity<AuthenticationResponse> authenticate(
      @RequestBody AuthenticationRequest request
  ) {
    return ResponseEntity.ok(service.authenticate(request));
  }

  @PostMapping("/refresh-token")
  public void refreshToken(
      HttpServletRequest request,
      HttpServletResponse response
  ) throws IOException {
    service.refreshToken(request, response);
  }


}
