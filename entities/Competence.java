package com.example.competences.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Competence {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long Code_Comp;
    private String Nom_Comp;
    private String niveau;

    public Long getCode_Comp() {
        return Code_Comp;
    }

    public void setCode_Comp(Long code_Comp) {
        Code_Comp = code_Comp;
    }

    public String getNom_Comp() {
        return Nom_Comp;
    }

    public void setNom_Comp(String nom_Comp) {
        Nom_Comp = nom_Comp;
    }

    public String getNiveau() {
        return niveau;
    }

    public void setNiveau(String niveau) {
        this.niveau = niveau;
    }

    public Competence()
    {
        super();
    }


    public Competence(String nom_Comp, String niveau) {
        Nom_Comp = nom_Comp;
        this.niveau = niveau;
    }
}
