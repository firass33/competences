package com.example.competences.DAO;

import com.example.competences.entities.Etudiant;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface IEtudiantRepository extends JpaRepository<Etudiant, Long>{
	@Query("select p from Etudiant p where p.classe like :x")
	public Page<Etudiant> etudiantParClasse(@Param("x") String cla, Pageable p);
	@Query("select p from Etudiant p where p.nom like :x")
	public List<Etudiant> findByNomAndPrenom(@Param("x") String cla);
	public Page<Etudiant> findByNomAndPrenom(String cla, Pageable p);
	}
	
