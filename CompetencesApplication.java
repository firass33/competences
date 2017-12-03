package com.example.competences;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ImportResource;

import com.example.competences.DAO.IEtudiantRepository;
import com.example.competences.entities.Etudiant;
@SpringBootApplication
@ComponentScan
@ImportResource("classpath:spring-config.xml")
@EnableAutoConfiguration

public class CompetencesApplication implements CommandLineRunner  {
	@Autowired
	IEtudiantRepository et;
	public static void main(String[] args) {
		//ApplicationContext ctx =
		SpringApplication.run(CompetencesApplication.class, args);
		//IProduitRepository pr = ctx.getBean(IProduitRepository.class);


	}

	@Override
	public void run(String... strings) throws Exception {
		et.save(new Etudiant("belhadj","firas","dsi32"));
		et.save(new Etudiant("bouhlel","majd","dsi32"));
		et.save(new Etudiant("bjeoui","feten","dsi32"));
		et.save(new Etudiant("barakati","oumayma","dsi31"));
		List<Etudiant> etudiants = et.findAll();
	}
}
