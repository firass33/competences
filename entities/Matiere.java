package com.example.competences.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import javax.xml.bind.annotation.XmlTransient;
import java.util.List;

@Entity
public class Matiere {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long Code_Mat;
    private String Nom_Mat;

    @OneToMany(mappedBy="matiere",fetch=FetchType.LAZY)
    private List<Competence> competences;

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

    @JsonIgnore
    @XmlTransient
    public List<Competence> getCompetences() {
        return competences;
    }

    public void setCompetences(List<Competence> competences) {
        this.competences = competences;
    }

    public Matiere()
    {
        super();
    }

    public Matiere(String nom_Mat) {
        Nom_Mat = nom_Mat;
    }
}
