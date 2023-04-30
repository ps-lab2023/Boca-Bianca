package com.example.ProjectMagazinVar2.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.RequiredArgsConstructor;

import java.util.List;

@Builder
@Data
@AllArgsConstructor
@RequiredArgsConstructor
@Entity
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String numeClient;
    private String adresaEmail;
    private String prenumeClient;
    private String adresa;
    private String dataLogare;
    private String parola;
    private String telefon;

    private String plangeri;




    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER, mappedBy = "id")
    private List<Product> listaProduse;

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER, mappedBy = "id")
    private List<Orderer> listaOrders;

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + numeClient + '\'' +
                ", prenume='" + prenumeClient + '\'' +
                ", email='" + adresaEmail + '\'' +
                ", adresa='" + adresa + '\'' +
                ", datalogare='" + dataLogare + '\'' +
                '}'+"\n";
    }
}