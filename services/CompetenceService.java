package com.example.competences.services;

import com.example.competences.DAO.ICompetenceRepository;
import com.example.competences.entities.Competence;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.jws.WebService;
import java.util.List;

@Component
@WebService
public class CompetenceService {
    @Autowired
    private ICompetenceRepository competenceRepository;

    public Competence findById(Long Code_Comp) {
        return competenceRepository.findOne(Code_Comp);
    }

   // public Competence findByNom_Comp(String Nom_Comp) {
        //return competenceRepository.findByNom_Comp(Nom_Comp);
    //}

    public void saveComp(Competence competence) {
        competenceRepository.save(competence);
    }

    public void updateComp(Competence competence){
        saveComp(competence);
    }

    public void deleteUserByCode_Comp(Long Code_Comp){
        competenceRepository.delete(Code_Comp);
    }

    public void deleteAllComp(){
        competenceRepository.deleteAll();
    }

    public List<Competence> findAllComp(){
        return competenceRepository.findAll();
    }

   // public boolean isCompExist(Competence competence) {
       // return findByNom_Comp(competence.getNom_Comp()) != null;
    //}
}
