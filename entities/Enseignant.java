package com.example.competences.entities;

import java.io.Serializable;

import javax.persistence.*;

@Entity
public class Enseignant implements Serializable {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long Code_Ens;
    private String Nom_Ens;
    private String Prenom_Ens;

    public Long getCode_Ens() {
        return Code_Ens;
    }

    public void setCode_Ens(Long code_Ens) {
        Code_Ens = code_Ens;
    }

    public String getNom_Ens() {
        return Nom_Ens;
    }

    public void setNom_Ens(String nom_Ens) {
        Nom_Ens = nom_Ens;
    }

    public String getPrenom_Ens() {
        return Prenom_Ens;
    }

    public void setPrenom_Ens(String prenom_Ens) {
        Prenom_Ens = prenom_Ens;
    }

    public Enseignant(String nom_Ens, String prenom_Ens) {
        Nom_Ens = nom_Ens;
        Prenom_Ens = prenom_Ens;
    }
}