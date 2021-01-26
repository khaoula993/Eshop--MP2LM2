package tn.rnu.isi.service;
 

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.Repository;

import tn.rnu.isi.model.Categorie;
import tn.rnu.isi.model.Produit;




 

 
 
public interface CategorieRepository extends CrudRepository <Categorie, Long>{
	
 
	
	Categorie findByIdCateg(Long idCateg);
	
	 
	List<Categorie> findAll();
	
	Categorie save (Categorie categorie);
	 
	@Modifying
	@Query("update Categorie u set u.idCateg = ?1")
	int updateIdCategorie(Long idCateg);
	
	@Modifying
	@Query("update Categorie u set u.codeCateg = ?1, u.libelleCateg = ?2  where u.idCateg = ?3")
	int updateDesigCategorie(String codeCateg, String libelleCateg, Long idCateg);

 	@Transactional
 	@Modifying
	@Query("delete from Categorie u where u.idCateg = ?1")
	void delete(Long idCateg);
  
 	@Query("SELECT COUNT(*) FROM Categorie")
 	public int nombreCategorie();

}