package model.dao;

import java.util.List;

import model.entities.Department;
import model.entities.Seller;

public interface SellerDao {
	 void insert (Seller entity);
	 void update (Seller entity);
	 void deleteById(Integer id);
	 List<Seller> findAll();
	 List<Seller> findByDepartment(Department department);
	 
	Seller findByID(Integer id);
}
