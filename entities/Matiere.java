package com.example.competences.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Matiere {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long Code_Mat;
    private String Nom_Mat;

    public Long getCode_Mat() {
        return Code_Mat;
    }

    public void setCode_Mat(Long code_Mat) {
        Code_Mat = code_Mat;
    }

    public String getNom_Mat() {
        return Nom_Mat;
    }

    public void setNom_Mat(String nom_Mat) {
        Nom_Mat = nom_Mat;
    }

    public Matiere()
    {
        super();
    }

    public Matiere(String nom_Mat) {
        Nom_Mat = nom_Mat;
    }
}
