package com.example.ProjectMagazinVar2.Repository;

import com.example.ProjectMagazinVar2.model.Admin;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AdminRepository extends JpaRepository<Admin,Integer> {
    Admin findFirstByNameAdmin(String nume);
    Admin findAdminByEmailAdmin(String email);
}