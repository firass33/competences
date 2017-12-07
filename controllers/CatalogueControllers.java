package com.example.competences.controllers;

import com.example.competences.DAO.IClasseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.web.bind.annotation.*;

import com.example.competences.DAO.IEtudiantRepository;
import com.example.competences.entities.Etudiant;

import java.util.List;

@RestController
public class CatalogueControllers {
    @Autowired
    private IEtudiantRepository etudiantRepository;
    @Autowired
    private IClasseRepository classeRepository;

    @RequestMapping(value="/save",method = RequestMethod.POST)
    public Etudiant saveEtudiant(@RequestBody Etudiant e){
        etudiantRepository.save(e);
        return e;
    }
    @RequestMapping(value ="/etudiants",method = RequestMethod.GET)
    public List<Etudiant> getEtudiants(){
        return etudiantRepository.findAll();
    }

    @RequestMapping(value="/etudiants/{Code_Etud}",method =RequestMethod.GET)
//@PathVariable: recherche de la valeur de l'id dans l'URL
    public Etudiant getEtudiants(@PathVariable("Code_Etud")Long Code_Etud){
        return etudiantRepository.findOne(Code_Etud);
    }

    @RequestMapping(value ="/etudiants/{page}",method = RequestMethod.GET)
    public Page<Etudiant> getEtudiants(@PathVariable int page){
        return etudiantRepository.findAll(new PageRequest(page, 5));
    }

    @RequestMapping(value= "/etudiantParClasse",method = RequestMethod.GET)
    public Page<Etudiant> getEtudiantClasse(
            //@RequestParam : à partir de l'url, dans ce cas exemple ?mc=HP&page=0
            @RequestParam (value ="cla",defaultValue = "0")String cla,
            @RequestParam (value ="page",defaultValue = "0") int page){
        return etudiantRepository.etudiantParClasse(cla, new PageRequest(page, 5));
    }


/*    @RequestMapping(value="/save",method = RequestMethod.POST)
//@RequestBody: recherche de l'objet dans le body de la httpRequest
    public Enseignant saveEnseignant(@RequestBody Enseignant e){
        enseignantRepository.save(e);
        return e;
    }
    @RequestMapping(value ="/all",method = RequestMethod.GET)
    public List<Enseignant> getEnseignants(){
        return enseignantRepository.findAll();
    }
    @RequestMapping(value="/get/{id}",method =RequestMethod.GET)
//@PathVariable: recherche de la valeur de l'id dans l'URL
    public Enseignant getEnseignant(@PathVariable ("id")Long id){
        return enseignantRepository.findOne(id);
    }
    @RequestMapping(value ="/enseignants/{page}",method = RequestMethod.GET)
    public Page<Enseignant> getEnseignants(@PathVariable int page){
        return enseignantRepository.findAll(new PageRequest(page, 5));
    }

    @RequestMapping(value= "/ClasseParEns",method = RequestMethod.GET)
    public Page<Enseignant> getEnsClasse(
            //@RequestParam : à partir de l'url, dans ce cas exemple ?mc=HP&page=0
            @RequestParam (value ="ens",defaultValue = "0")String ens,
            @RequestParam (value ="page",defaultValue = "0") int page){
        return enseignantRepository.ClasseParEns(ens, new PageRequest(page, 5));
    }

    @RequestMapping(value="/delete/{id}",method=RequestMethod.DELETE)
    public boolean delete(@PathVariable Long id){
        enseignantRepository.delete(id);
        return true;
    }
    @RequestMapping(value="/update/{id}",method = RequestMethod.PUT)
    public Enseignant update(@RequestBody Enseignant e,@PathVariable Long id){
        e.setId(id);
        enseignantRepository.saveAndFlush(e);
        return e;
    }*/
}