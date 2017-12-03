package com.example.competences.entities;

import java.io.Serializable;

import javax.persistence.*;

@Entity
public class Enseignant implements Serializable {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long Id;
    private String nom;
    private String prenom;
    private String classe;
    private String matiere;

    @OneToOne(mappedBy = "Ens_id")
    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        Id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getClasse() {
        return classe;
    }

    public void setClasse(String classe) {
        this.classe = classe;
    }

    public String getMatiere() {
        return matiere;
    }

    public void setMatiere(String matiere) {
        this.matiere = matiere;
    }
    public Enseignant() {
        super();
        // TODO Auto-generated constructor stub
    }


    public Enseignant(String nom, String prenom, String classe, String matiere) {
        this.nom = nom;
        this.prenom = prenom;
        this.classe = classe;
        this.matiere = matiere;
    }
}