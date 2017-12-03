package com.example.competences.DAO;

import com.example.competences.entities.Classe;
import com.example.competences.entities.Enseignant;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface IEnseignantRepository extends JpaRepository<Enseignant, Long>{
	@Query("select e from Enseignant e where e.nom like :x")
	public Page<Enseignant> ClasseParEns(@Param("x") String ens, Pageable e);
	@Query("select e from Enseignant e where e.nom like :x")
	public List<Enseignant> findByNomAndPrenom(@Param("x") String ens);
	public Page<Enseignant> findByNomAndPrenom(String ens, Pageable e);
}
	
