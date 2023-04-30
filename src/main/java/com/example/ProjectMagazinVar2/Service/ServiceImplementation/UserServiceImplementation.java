package com.example.ProjectMagazinVar2.Service.ServiceImplementation;

import com.example.ProjectMagazinVar2.DTO.UserDTO;
import com.example.ProjectMagazinVar2.Repository.UserRepository;
import com.example.ProjectMagazinVar2.Service.UserService;
import com.example.ProjectMagazinVar2.mapper.UserMapper;
import com.example.ProjectMagazinVar2.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class UserServiceImplementation implements UserService {
    private UserRepository userRepository;
    //  private List<User> usersList;

    @Autowired
    public UserServiceImplementation(UserRepository userRepository) {

        this.userRepository = userRepository;
    }

    @Override
    public void deleteUser(Integer id)
    {
        userRepository.deleteUserById(id);
    }

    @Override
    public List<UserDTO> findAllUsers()
    {
        List<User> userList= (List<User>) userRepository.findAll();
        List<UserDTO> userDTO=new ArrayList<>();
        for(User user:userList)
        {
            userDTO.add(UserMapper.mapUserToDTO(user));

        }
        return userDTO;
    }


    @Override
    public Optional<User> findUserById2(Integer id)
    {
        return userRepository.findById(id);
    }

    @Override
    public User addUser(UserDTO user1)
    {
        User userDTO=UserMapper.mapUserDTOToUser(user1);
        return userRepository.save(userDTO);
    }



    @Override
    public boolean deleteUserById(Integer id)
    {
        userRepository.deleteById(id);
        return false;
    }


    @Override
    public UserDTO updateUserEmail(UserDTO userDTO, String email) {
        User updateUser = userRepository.findById(userDTO.getId()).get();
        updateUser.setAdresaEmail(email);
        userRepository.save(updateUser);

        return UserMapper.mapUserToDTO(updateUser);
    }

    @Override
    public UserDTO findUserByEmail(User userDTO, String email)
    {
        User user=userRepository.findUserByAdresaEmail(email);
        return UserMapper.mapUserToDTO(user);
    }



    @Override
    public UserDTO logIn(String email, String password) {
        User user = userRepository.findUserByAdresaEmail(email);
        if (user != null && user.getParola().equals(password)) {
            System.out.println("User "+user.getAdresaEmail() + user.getParola());

            return UserMapper.mapUserToDTO(user);
        } else {
            return null;
        }
    }




    @Override
    public UserDTO register(String prenume, String nume, String telefon, String adresa, String email, String parola) {
        User user = new User();
        user.setPrenumeClient(prenume);
        user.setNumeClient(nume);
        user.setTelefon(telefon);
        user.setAdresaEmail(email);
        user.setParola(parola);
        userRepository.save(user);
        return UserMapper.mapUserToDTO(user);
    }


}
