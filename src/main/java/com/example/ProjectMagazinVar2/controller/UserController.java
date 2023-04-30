package com.example.ProjectMagazinVar2.controller;

import com.example.ProjectMagazinVar2.DTO.UserDTO;
import com.example.ProjectMagazinVar2.Service.UserService;
import com.example.ProjectMagazinVar2.model.User;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import org.hibernate.mapping.Map;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/user")
public class UserController {

    private UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping({"/findByIdProduct"})
    public ResponseEntity<Optional<User>> getUserById(@RequestParam Integer id)  {
        return new ResponseEntity<>(userService.findUserById2(id), HttpStatus.OK);}


    @GetMapping("/allUsers")
    public ResponseEntity<List<UserDTO>> getAllEmployees () {
        List<UserDTO> employees = userService.findAllUsers();
        return new ResponseEntity<>(employees, HttpStatus.OK);
    }


    @PostMapping("/add")
    public ResponseEntity<UserDTO> addUsers (@RequestBody String name) {
        UserDTO userDTO= new UserDTO();
        userDTO.setNumeClient(name);
        userService.addUser(userDTO);
        return new ResponseEntity<>(userDTO, HttpStatus.CREATED);
    }

    @GetMapping("/loginUser")
    public ResponseEntity<UserDTO> logIn(@RequestParam(value = "email") String email, @RequestParam(value = "password") String password)
    {
        return new ResponseEntity<>(userService.logIn(email,password), HttpStatus.OK);
    }

    @PostMapping("/registerUser")
    public ResponseEntity<UserDTO> register(@RequestParam String prenume, @RequestParam String nume, @RequestParam String number, @RequestParam String Adress, @RequestParam String email, @RequestParam String password) {
        {

            return new ResponseEntity<>(userService.register(prenume, nume, number, Adress, email, password), HttpStatus.OK);
        }




    }
}