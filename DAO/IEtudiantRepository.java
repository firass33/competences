package com.example.competences.DAO;

import com.example.competences.entities.Classe;
import com.example.competences.entities.Etudiant;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface IEtudiantRepository extends JpaRepository<Etudiant, Long>{

	//@Query("select e from Etudiant e where e.classe like :x")
	//public List<Etudiant> findByClasse (@Param("x")String Nom_Classe);

	//@Query("insert into Etudiant (id,name,age) select :id,:name,:age from Dual")
	//public int modifyingQueryInsertPerson(@Param("id")Long id, @Param("name")String name, @Param("age")Integer age);

	public Page<Etudiant> findByClasse(Classe classe, Pageable pageable);
}
	
