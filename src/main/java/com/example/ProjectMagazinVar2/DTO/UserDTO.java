package com.example.ProjectMagazinVar2.DTO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserDTO {
    private int id;
    private String numeClient;
    private String adresaEmail;
    private String prenumeClient;
    private String dataLogare;
    private String parola;
    private String telefon;
    private String adresa;
    private String plageri;
}
