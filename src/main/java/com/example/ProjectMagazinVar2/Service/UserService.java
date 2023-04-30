package com.example.ProjectMagazinVar2.Service;

import com.example.ProjectMagazinVar2.DTO.UserDTO;
import com.example.ProjectMagazinVar2.model.User;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public interface UserService {


    void deleteUser(Integer id);
    List<UserDTO> findAllUsers();


    Optional<User> findUserById2(Integer id);

    User addUser(UserDTO user1);

    boolean deleteUserById(Integer id);

    UserDTO updateUserEmail(UserDTO userDTO, String email);

    UserDTO findUserByEmail(User userDTO, String email);

    UserDTO logIn(String email, String password);

    UserDTO register(String prenume, String nume, String telefon, String adresa, String Email, String parola);
}
