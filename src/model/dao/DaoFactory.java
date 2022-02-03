package model.dao;

import db.DB;

import model.dao.impl.SellerDaoJDBC;
import model.entities.SellerDao;

public class DaoFactory {

	public static SellerDao createSellerDao() {
		return new SellerDaoJDBC(DB.getConnection());
	}

	public static DepartmentDao createDepartmentDao() {
		// TODO Auto-generated method stub
		return null;
	}
	
	public static DepartmentDao createDepartmentDao() {
		return new DepartmentDaoJDBC(DB.getConnection());
	}
}
	
	}
