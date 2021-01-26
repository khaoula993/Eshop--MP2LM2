package tn.rnu.isi.service;

import java.util.List;

import tn.rnu.isi.model.Categorie;
import tn.rnu.isi.model.Produit;

 


public interface CategorieService {

	public Long save (Categorie categorie) throws Exception ;
	
	List<Categorie> getAll();
 
	Categorie getByIdCateg(Long idCateg) throws Exception;
	
	int updateId (Long idCateg);
	
  	int updateDesigCategorie (String codeCateg, String libelleCateg, Long idCateg); 
  	
  	void deleteCategorie(Long idCateg);
  	
   int nombreCategorie();
}
