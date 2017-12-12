package com.example.competences;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;

import com.example.competences.DAO.IClasseRepository;
import com.example.competences.DAO.ICompetenceRepository;
import com.example.competences.DAO.IMatiereRepository;
import com.example.competences.entities.Classe;
import com.example.competences.entities.Competence;
import com.example.competences.entities.Matiere;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ImportResource;

import com.example.competences.DAO.IEtudiantRepository;
import com.example.competences.entities.Etudiant;
import org.springframework.data.domain.Pageable;

import javax.validation.constraints.Null;

@SpringBootApplication
@ComponentScan
@ImportResource("classpath:spring-config.xml")
@EnableAutoConfiguration

public class CompetencesApplication implements CommandLineRunner  {
	@Autowired
	IEtudiantRepository et;
	@Autowired
	IClasseRepository cl;
	@Autowired
	ICompetenceRepository co;
	@Autowired
	IMatiereRepository ma;
	//IEnseignantRepository en;

	public static void main(String[] args) {


		//ApplicationContext ctx =
		SpringApplication.run(CompetencesApplication.class, args);
		//IProduitRepository pr = ctx.getBean(IProduitRepository.class);


	}

	@Override
	public void run(String... strings) throws Exception {

        //et.deleteAllInBatch();
        //cl.deleteAllInBatch();
		/*Classe dsi31 = new Classe("dsi31");
	    Classe dsi32 = new Classe("dsi32");
		cl.save(dsi31);
		cl.save(dsi32);
		et.save(new Etudiant("majd","Bouhlel", dsi32));
		et.save(new Etudiant("bjeoui","feten",dsi32));
		et.save(new Etudiant("barakati","oumayma",dsi32));
        et.save(new Etudiant("xxxx","yyyy",dsi31));
		et.save(new Etudiant("sfsdfds","ggdfgdfg",dsi31));

		Matiere jee = new Matiere("jee");
		ma.save(jee);
		Matiere Android = new Matiere("Android");
		ma.save(Android);
		Matiere Gestion = new Matiere("Gestion de projet");
		ma.save(Gestion);
		Matiere Anglais = new Matiere("Anglais");
		ma.save(Anglais);
		co.save(new Competence("persistence","3",jee));
		co.save(new Competence("hibernate","3",jee));
		co.save(new Competence("SCRUM","3",Gestion));*/

		List<Etudiant> etudiants = et.findAll();

		//en.deleteAllInBatch();
		//en.save(new Enseignant("xxx","xxxxx","dsi32","android"));
//		en.save(new Enseignant("ccc","ccccc","dsi32","java"));
		//en.save(new Enseignant("eee","eeeee","dsi32","web"));
		//List<Enseignant> enseignant = en.findAll();
	}
}
