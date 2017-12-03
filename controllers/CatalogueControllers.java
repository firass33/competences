package com.example.competences.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.competences.DAO.IEtudiantRepository;
import com.example.competences.entities.Etudiant;

@RestController
public class CatalogueControllers {
    @Autowired
    private IEtudiantRepository etudiantRepository;

    @RequestMapping(value="/save",method = RequestMethod.POST)
//@RequestBody: recherche de l'objet dans le body de la httpRequest
    public Etudiant saveEtudiant(@RequestBody Etudiant p){
        etudiantRepository.save(p);
        return p;
    }
    @RequestMapping(value ="/all",method = RequestMethod.GET)
    public List<Etudiant> getEtudiants(){
        return etudiantRepository.findAll();
    }
    @RequestMapping(value="/get/{id}",method =RequestMethod.GET)
//@PathVariable: recherche de la valeur de l'id dans l'URL
    public Etudiant getEtudiants(@PathVariable ("id")Long id){
        return etudiantRepository.findOne(id);
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

    @RequestMapping(value="/delete/{id}",method=RequestMethod.DELETE)
    public boolean delete(@PathVariable Long id){
        etudiantRepository.delete(id);
        return true;
    }
    @RequestMapping(value="/update/{id}",method = RequestMethod.PUT)
    public Etudiant update(@RequestBody Etudiant p,@PathVariable Long id){
        p.setId(id);
        etudiantRepository.saveAndFlush(p);
        return p;
    } }