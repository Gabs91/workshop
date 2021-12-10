package model.services;

import java.util.List;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Seller;



public class SellerServive {
	
	private SellerDao dao = DaoFactory.createSellerDao();
	
	public List<Seller> findAll() {
		return dao.findAll();
	}
	public void saveOrUpdate(Seller entity) {
		if (entity.getId() == null) {
			dao.insert(entity);
		}
		else {
			dao.update(entity);
		}
	}
	public void remove(Seller obj) {
		dao.deleteById(obj.getId());
		
	}

}
