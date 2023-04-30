package com.example.ProjectMagazinVar2.mapper;


import com.example.ProjectMagazinVar2.DTO.UserDTO;
import com.example.ProjectMagazinVar2.model.User;
import org.springframework.stereotype.Component;

@Component
public class UserMapper {

    public static UserDTO mapUserToDTO(User user)
    {
        UserDTO userDTO=new UserDTO();

        userDTO.setId(user.getId());
        userDTO.setParola(user.getParola());
        userDTO.setAdresa(user.getAdresa());
        userDTO.setAdresaEmail(user.getAdresaEmail());
        userDTO.setPrenumeClient(user.getPrenumeClient());
        userDTO.setDataLogare(user.getDataLogare());
        userDTO.setNumeClient(user.getNumeClient());
        userDTO.setPlageri(user.getPlangeri());

        return userDTO;
    }


    public static User mapUserDTOToUser(UserDTO userDTO)
    {
        User user=new User();
        user.setNumeClient(userDTO.getNumeClient());

        user.setId(userDTO.getId());
        user.setAdresa(userDTO.getAdresa());
        user.setParola(userDTO.getParola());
        user.setAdresaEmail(userDTO.getAdresaEmail());
        user.setPrenumeClient(userDTO.getPrenumeClient());
        user.setDataLogare(userDTO.getDataLogare());
        user.setPrenumeClient(user.getPrenumeClient());
        user.setPlangeri(user.getPlangeri());
        return user;

    }

}
