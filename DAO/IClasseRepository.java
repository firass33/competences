package com.example.competences.DAO;

import com.example.competences.entities.Classe;
import com.example.competences.entities.Etudiant;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface IClasseRepository extends JpaRepository<Classe, Long>{


	}
	
