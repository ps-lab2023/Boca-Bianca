package com.example.ProjectMagazinVar2.Service;

import com.example.ProjectMagazinVar2.DTO.AdminDTO;
import com.example.ProjectMagazinVar2.model.Admin;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Component
public interface AdminService {

    List<AdminDTO> findAllAdmins();
    Optional<Admin> findAdminById(Integer id);
    //  void addAdmin(Admin Admin1);

    //void addAdminDTO(AdminDTO Admin1);

    // void deleteAdmin(Admin Admin1);

    //void deleteAdminDTO(AdminDTO Admin1);

    void deleteAdminById(Integer id);
    Admin verifiingAdmin(Admin admin);
//    String logIn(Admin admin1, String parola, int codAdmin);

    AdminDTO findAdminByName(String nume);
}

