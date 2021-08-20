package model.dao;

import db.DB;
import model.dao.impl.DepartamentDaoJBDC;
import model.dao.impl.SellerDaoJDBC;

public class DaoFactory {
	
	public static SellerDao createSellerDao() {
		return new SellerDaoJDBC(DB.getConnection());
	}
	public static DepartamentDao createDepartamentDao() {
		return new DepartamentDaoJBDC(DB.getConnection());
	}
}
