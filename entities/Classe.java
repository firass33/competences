package com.example.competences.entities;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

@Entity
public class Classe {
    @Id
    @GeneratedValue
    private Long Code_Classe;
    private String Nom_Classe;

    @OneToMany
    @JoinColumn(name = "Code_Classe")
    private List<Etudiant> classeetudiants = new ArrayList<>();


    public Long getCode_Classe() {
        return Code_Classe;
    }

    public void setCode_Classe(Long code_Classe) {
        Code_Classe = code_Classe;
    }

    public String getNom_Classe() {
        return Nom_Classe;
    }

    public void setNom_Classe(String nom_Classe) {
        Nom_Classe = nom_Classe;
    }

    public List<Etudiant> getClasseetudiants() {
        return classeetudiants;
    }

    public void setClasseetudiants(List<Etudiant> classeetudiants) {
        this.classeetudiants = classeetudiants;
    }

    public Classe()
    {
        super();
    }

    public Classe(String nom_Classe) {
        Nom_Classe = nom_Classe;
    }
}