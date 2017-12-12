package com.example.competences.entities;

import javax.persistence.*;

@Entity
public class Competence {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long Code_Comp;
    private String Nom_Comp;
    private String niveau;

    @ManyToOne
    @JoinColumn(name="Code_Mat")
    private Matiere matiere;

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

    public Matiere getMatiere() {
        return matiere;
    }

    public void setMatiere(Matiere matiere) {
        this.matiere = matiere;
    }

    public Competence()
    {
        super();
    }


    public Competence(String nom_Comp, String niveau, Matiere matiere) {
        Nom_Comp = nom_Comp;
        this.niveau = niveau;
        this.matiere = matiere;
    }

    /*public String toString(){
        String info = "";

        JSONObject jsonInfo = new JSONObject();
        jsonInfo.put("name",this.name);

        JSONObject companyObj = new JSONObject();
        companyObj.put("name", this.company.getName());
        jsonInfo.put("company", companyObj);

        info = jsonInfo.toString();
        return info;
    }*/
}
