package com.example.ProjectMagazinVar2.Service.ServiceImplementation;

import com.example.ProjectMagazinVar2.DTO.AdminDTO;
import com.example.ProjectMagazinVar2.Repository.AdminRepository;
import com.example.ProjectMagazinVar2.Service.AdminService;
import com.example.ProjectMagazinVar2.model.Admin;
import com.example.ProjectMagazinVar2.mapper.AdminMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import static java.lang.Integer.valueOf;

@Service
public class AdminServiceImplementation implements AdminService {

    @Autowired
    private AdminRepository adminRepository;


    public AdminServiceImplementation(AdminRepository adminRepository) {
        this.adminRepository = adminRepository;
    }

    //metode pentru admin




    @Override
    public List<AdminDTO> findAllAdmins()
    {
        List<Admin> adminList= adminRepository.findAll();

        List<AdminDTO> list=new ArrayList<>();
        for(Admin a:adminList)
        {
            //  System.out.println(a.getPrenume());
            list.add(AdminMapper.mapModelToDto(a));
        }
        return list;
    }
    @Override
    public void deleteAdminById(Integer id)
    {
        adminRepository.deleteById(id);
    }
    @Override
    public Optional<Admin> findAdminById(Integer id)
    {
        return adminRepository.findById(valueOf(id));
    }

    @Override
    public Admin verifiingAdmin(Admin admin)
    {
        Admin adminDeVerificat=adminRepository.findById(admin.getId()).orElse(null);
        return adminDeVerificat;
    }

//    @Override
//    public String logIn(Admin admin1, String parola, int codAdmin)
//    {
//        Admin adminToLogin=adminRepository.findById(admin1.getId()).orElse(null);
//        if(adminToLogin.getParola().equals(parola) && adminToLogin.getCodAdmin()==codAdmin)
//            return  "Logarea a avut loc cu succes";
//        else
//            return "Logarea nu a a putut avea loc! Mai incercati";
//    }

    @Override
    public AdminDTO findAdminByName(String nume) {
        return AdminMapper.mapModelToDto(adminRepository.findFirstByNameAdmin(nume));
    }


}