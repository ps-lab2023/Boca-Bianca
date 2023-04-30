package com.example.ProjectMagazinVar2.controller;

import com.example.ProjectMagazinVar2.DTO.AdminDTO;
import com.example.ProjectMagazinVar2.Service.AdminService;
import com.example.ProjectMagazinVar2.model.Admin;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/admin")
public class AdminController {

    @Autowired
    private AdminService adminService ;
    public AdminController(AdminService adminService)
    {
        this.adminService= adminService;
    }

    @GetMapping("/all")
    public List<AdminDTO> getAdmins () {
        List<AdminDTO> admins = adminService.findAllAdmins();
        // return new ResponseEntity<>(admins, HttpStatus.OK);
        return admins;
    }

    @PostMapping("/add")
    public ResponseEntity<AdminDTO> addAdmin (@RequestBody AdminDTO admin2) {
        return new ResponseEntity<>(admin2, HttpStatus.CREATED);
    }

    @RequestMapping(value = "/find", method = RequestMethod.GET)
    public AdminDTO findByNameReqParam(@RequestParam String nume)
    {
        return adminService.findAdminByName(nume);
    }

   @DeleteMapping("/delete/admin")
    public ResponseEntity<?> deleteAdmin(@RequestParam Integer admin) {
        adminService.deleteAdminById(admin);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @GetMapping({"/id"})
    public ResponseEntity<Optional<Admin>> getUserById(@RequestParam int id)  {
        return new ResponseEntity<>(adminService.findAdminById(id), HttpStatus.OK);}
}