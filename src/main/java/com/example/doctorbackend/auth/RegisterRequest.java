package com.example.doctorbackend.auth;

import com.example.doctorbackend.user.Role;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class RegisterRequest {

  private String firstname;
  private String lastname;
  private String email;
  private String password;
  private String phone;
  private String comment;
  private String image;
  private Role role;// if I want to remove this I should use map this object
}
