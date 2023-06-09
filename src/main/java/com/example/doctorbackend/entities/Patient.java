package com.example.doctorbackend.entities;


import com.example.doctorbackend.user.User;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.TypeAlias;
import org.springframework.data.mongodb.core.mapping.Document;
@Document(collection = "people")
@Data
@AllArgsConstructor
//@NoArgsConstructor
@TypeAlias("patient")
public class Patient extends User {
//    @Id
//    @GeneratedValue(strategy = GenerationType.AUTO)
//    private String id;
//    @NotNull(message = "Patient name required")
//    private String name;
//    @Email(message = "Please enter a valid email")
//    @NotNull(message = "email required")
//    private String email;
//    private String phone;

}

