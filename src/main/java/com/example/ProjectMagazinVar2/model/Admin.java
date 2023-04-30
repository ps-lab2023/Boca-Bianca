package com.example.ProjectMagazinVar2.model;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.*;

import java.net.PasswordAuthentication;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Admin {
    @Id
    private int id;
    private String nameAdmin;
    private String prenumeAdmin;
    private String parolaAdmin;
    private String emailAdmin;

    @Override
    public String toString() {
        return "Admin{" +
                "id=" + id +
                ", name='" + nameAdmin + '\'' +
                ", prenume='" + prenumeAdmin + '\'' +

                ", parola='" + parolaAdmin + '\'' +
                '}'+"\n";
    }
}
