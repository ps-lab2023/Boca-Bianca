package com.example.ProjectMagazinVar2.mapper;

import com.example.ProjectMagazinVar2.DTO.AdminDTO;
import com.example.ProjectMagazinVar2.model.Admin;
import org.springframework.stereotype.Component;

@Component
public class AdminMapper {

    public  static AdminDTO mapModelToDto(Admin user) {
        AdminDTO adminDTO = new AdminDTO();
        adminDTO.setId(user.getId());
        adminDTO.setNameAdmin(user.getNameAdmin());
        adminDTO.setParolaAdmin(user.getParolaAdmin());
        adminDTO.setPrenumeAdmin(user.getPrenumeAdmin());
        adminDTO.setEmailAdmin(user.getEmailAdmin());
        return adminDTO;
    }

    public  static Admin mapDTOToModel(AdminDTO user) {
        Admin adminDTO = new Admin();
        adminDTO.setId(user.getId());
        adminDTO.setNameAdmin(user.getNameAdmin());
        adminDTO.setParolaAdmin(user.getParolaAdmin());
        adminDTO.setPrenumeAdmin(user.getPrenumeAdmin());
        adminDTO.setEmailAdmin(user.getEmailAdmin());
        return adminDTO;
    }

}