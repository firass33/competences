package com.example.competences.entities;

import javax.persistence.*;

@Entity
public class Classe {
    @javax.persistence.Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long Id;
    private String nom;
    private Long Ens_id;

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

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "Ens_id", nullable = false)
    public Long getEns_id() {
        return Ens_id;
    }

    public void setEns_id(Long ens_id) {
        Ens_id = ens_id;
    }

    public Classe() {
        super();
        // TODO Auto-generated constructor stub
    }

    public Classe(String nom, Long ens_id) {
        this.nom = nom;
        Ens_id = ens_id;
    }
}