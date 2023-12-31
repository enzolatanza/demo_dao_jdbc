package model.dao;

import db.DB;
import model.dao.impl.DepartmentDaoJDBC;
import model.dao.impl.SellerDaoJDBC;

public class DaoFactory {
	//Fábrica de DAO
	//Classe auxiliar responsavel por instanciar os DAOs
	
	/*
	 * A classe expõe um metodo que retorna o tipo
	 * da interface mas internamente ela
	 * instancia uma implementação
	 * */
	public static SellerDao createSellerDao(){
		return new SellerDaoJDBC(DB.getConnection());
	}
	public static DepartmentDao createDepartmentDao(){
		return new DepartmentDaoJDBC(DB.getConnection());
	}
}
