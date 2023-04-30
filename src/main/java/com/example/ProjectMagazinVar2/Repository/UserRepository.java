package com.example.ProjectMagazinVar2.Repository;

import com.example.ProjectMagazinVar2.DTO.UserDTO;
import com.example.ProjectMagazinVar2.model.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends CrudRepository<User,Integer> {

    void deleteUserById(Integer id);
    User findUserByAdresaEmail(String adresaEmail);
    UserDTO findUserByParola(String parola);
    UserDTO findUserByAdresaEmailAndParola(String email,  String parola);

}
