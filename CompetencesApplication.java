package com.example.competences;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;

import com.example.competences.DAO.IClasseRepository;
import com.example.competences.entities.Classe;
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

@SpringBootApplication
@ComponentScan
@ImportResource("classpath:spring-config.xml")
@EnableAutoConfiguration

public class CompetencesApplication implements CommandLineRunner  {
	@Autowired
	IEtudiantRepository et;
	@Autowired
	IClasseRepository cl;
	//IEnseignantRepository en;

	public static void main(String[] args) {


		//ApplicationContext ctx =
		SpringApplication.run(CompetencesApplication.class, args);
		//IProduitRepository pr = ctx.getBean(IProduitRepository.class);


	}

	@Override
	public void run(String... strings) throws Exception {

        et.deleteAllInBatch();
        cl.deleteAllInBatch();
	    //Classe dsi32 = new Classe();
	    //dsi32.setNom_Classe("dsi32");

       // Classe dsi31 = new Classe();
        //dsi31.setNom_Classe("dsi31");

        //List<Etudiant> etud_dsi31 =et.findByClasse("dsi31");
        //List<Etudiant> etud_dsi32 =et.findByClasse("dsi32");

		et.save(new Etudiant("majd","Bouhlel"));
		et.save(new Etudiant("bjeoui","feten"));
		et.save(new Etudiant("barakati","oumayma"));
        et.save(new Etudiant("xxxx","yyyy"));
        cl.save(new Classe("dsi31"));
        cl.save(new Classe("dsi32"));

		List<Etudiant> etudiants = et.findAll();

		//en.deleteAllInBatch();
		//en.save(new Enseignant("xxx","xxxxx","dsi32","android"));
//		en.save(new Enseignant("ccc","ccccc","dsi32","java"));
		//en.save(new Enseignant("eee","eeeee","dsi32","web"));
		//List<Enseignant> enseignant = en.findAll();
	}
}
