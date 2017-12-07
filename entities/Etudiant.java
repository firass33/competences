package com.example.competences.entities;

import java.io.Serializable;

import javax.persistence.*;

@Entity
public class Etudiant implements Serializable {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long Code_Etud;

    private String Nom_Etud;
    private String Prenom_Etud;

    @ManyToOne
    private Classe classe;

    public Long getCode_Etud() {
        return Code_Etud;
    }

    public void setCode_Etud(Long code_Etud) {
        Code_Etud = code_Etud;
    }

    public String getNom_Etud() {
        return Nom_Etud;
    }

    public void setNom_Etud(String nom_Etud) {
        Nom_Etud = nom_Etud;
    }

    public String getPrenom_Etud() {
        return Prenom_Etud;
    }

    public void setPrenom_Etud(String prenom_Etud) {
        Prenom_Etud = prenom_Etud;
    }

    public Classe getClasse() {
        return classe;
    }

    public void setClasse(Classe classe) {
        this.classe = classe;
    }

    public Etudiant(){
        super();
    }

    public Etudiant(String nom_Etud, String prenom_Etud) {
        Nom_Etud = nom_Etud;
        Prenom_Etud = prenom_Etud;
    }
}