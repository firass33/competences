package com.example.competences.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import javax.xml.bind.annotation.XmlTransient;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

@Entity
public class Classe {
    @Id
    @GeneratedValue
    private Long Code_Classe;
    private String Nom_Classe;

    @OneToMany(mappedBy="classe",fetch=FetchType.LAZY)
    private List<Etudiant> etudiants;


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


    @JsonIgnore
    @XmlTransient
    public List<Etudiant> getEtudiants() {
        return etudiants;
    }

    public void setEtudiants(List<Etudiant> etudiants) {
        this.etudiants = etudiants;
    }

    public Classe()
    {
        super();
    }

    public Classe(String nom_Classe) {
        Nom_Classe = nom_Classe;
    }
}