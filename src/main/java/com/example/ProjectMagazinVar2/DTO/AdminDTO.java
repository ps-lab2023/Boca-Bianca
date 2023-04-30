package com.example.ProjectMagazinVar2.DTO;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class AdminDTO {
    private int id;
    private String nameAdmin;
    private String prenumeAdmin;
    private String parolaAdmin;
    private String emailAdmin;

}
