package tn.rnu.isi.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import tn.rnu.isi.model.Categorie;



@Service
@Transactional
public class CategorieServiceImpl implements CategorieService{

	@Autowired
	private CategorieRepository categorieRepository;

  

	@Override
	public  Categorie getByIdCateg(Long idCateg) throws Exception {
        return  (Categorie) categorieRepository.findByIdCateg(idCateg);

	}
 
	@Override
	public Long save(Categorie categorie) throws Exception {
		
		categorie = categorieRepository.save(categorie);
		return categorie.getIdCateg();
	}


	@Override
	public int updateId(Long idCateg) {
		return categorieRepository.updateIdCategorie(idCateg);
	}


	@Override
	public int updateDesigCategorie(String codeCateg, String libelleCateg, Long idCateg) {
		return categorieRepository.updateDesigCategorie(codeCateg, libelleCateg, idCateg) ;

	}



	@Override
	public List<Categorie> getAll() {
 		return (List<Categorie>) categorieRepository.findAll() ;
	}


	@Override
	public void deleteCategorie(Long idCateg) {
		categorieRepository.delete(idCateg) ;
		
	}

	 public int nombreCategorie() {
		
		return (int) categorieRepository.count();
	}

   
}
