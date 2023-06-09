package com.example.doctorbackend;

import com.example.doctorbackend.auth.AuthenticationService;
import com.example.doctorbackend.auth.RegisterRequest;
import com.example.doctorbackend.entities.Category;
import com.example.doctorbackend.entities.Doctor;
import com.example.doctorbackend.entities.Patient;
import com.example.doctorbackend.repositories.CategoryRepository;


import com.example.doctorbackend.repositories.DoctorRepository;
import com.example.doctorbackend.user.Role;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.List;
import java.util.Optional;

import static com.example.doctorbackend.user.Role.ADMIN;

@SpringBootApplication
public class DoctorBackendApplication {
    public static void main(String[] args) {
        SpringApplication.run(DoctorBackendApplication.class, args);
    }

   @Bean
    CommandLineRunner runner(
            CategoryRepository categoryRepository,
            DoctorRepository dct, CategoryRepository cat,

            AuthenticationService service) {
        return args -> {
/*
            Category category1 = new Category();
            category1.setName("Cardiology");
            category1.setSrc("assets/images/diseases/Cardiology.png");
            Category category2 = new Category();
            category2.setName("Dermatology");
            category2.setSrc("assets/images/diseases/Dermatology.png");
            Category category3 = new Category();
            category3.setName("Endocrinology");
            category3.setSrc("assets/images/diseases/Endocrinology.png");
            Category category4 = new Category();
            category4.setName("Pediatrics");
            category4.setSrc("assets/images/diseases/Pediatrics.png");
            categoryRepository.saveAll(List.of(category1, category2, category3, category4));
*/
  /*          Optional<Category> category = cat.findById("646962d440c41236fc025360");
            if (category.isPresent()){
            Doctor doctor = new Doctor();
            doctor.setFirstname("abdessamad");
            doctor.setEmail("abdessamad@example.com");
            doctor.setPhone("0765456454");
            doctor.setSpeciality(category.get().getName());
            doctor.setRole(Role.DOCTOR);
            doctor.setImage("assets/images/doctor/doctor_1.png");

            doctor.setComment("A doctor can be found in several settings, including public health organization");

                category.get().getDoctors().add(doctor);
            }*/

/*
            dct.save(doctor);
            cat.save(category1);

            Doctor doctor2 = new Doctor();
            doctor2.setFirstname("ismail");
            doctor2.setEmail("ismail@example.com");
            doctor2.setPhone("0765456454");
            doctor2.setSpeciality(category2.getName());
            doctor2.setImage("assets/images/doctor/doctor_3.png");
            doctor2.setRole(Role.DOCTOR);
            doctor.setComment("A doctor can be found in several settings, including public health organization");
            category2.getDoctors().add(doctor2);
            dct.save(doctor2);
            cat.save(category2);

            Doctor doctor3 = new Doctor();
            doctor3.setFirstname("zebbara");
            doctor3.setEmail("zebbara@example.com");
            doctor3.setPhone("0765456454");
            doctor3.setImage("assets/images/doctor/doctor_5.png");
            doctor3.setSpeciality(category3.getName());
            doctor3.setRole(Role.DOCTOR);
            doctor.setComment("A doctor can be found in several settings, including public health organization");
            category3.getDoctors().add(doctor3);
            dct.save(doctor3);
            cat.save(category3);


            Doctor doctor4 = new Doctor();
            doctor4.setFirstname("Salma");
            doctor4.setEmail("Salma@example.com");
            doctor4.setPhone("0765456454");
            doctor4.setImage("assets/images/doctor/doctor_7.png");
            doctor4.setSpeciality(category4.getName());
            doctor4.setRole(Role.DOCTOR);
            doctor.setComment("A doctor can be found in several settings, including public health organization");
            category4.getDoctors().add(doctor4);
            dct.save(doctor4);
            cat.save(category4);

*/

/*            var admin = RegisterRequest.builder()
                    .firstname("Admin")
                    .lastname("Admin")
                    .email("admin@mail.com")
                    .password("password")
                    .role(ADMIN)
                    .build();

            service.register(admin);*/

        };
    }
}

