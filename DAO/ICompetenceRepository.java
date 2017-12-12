package com.example.competences.DAO;

import com.example.competences.entities.Classe;
import com.example.competences.entities.Competence;
import com.example.competences.entities.Matiere;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface ICompetenceRepository extends JpaRepository<Competence, Long>{

	public Page<Competence> findByMatiere (Matiere matiere, Pageable pageable);

	//public Competence findBy(String Nom_Comp);
}
	
