package model.dao;

import java.util.List;

import model.entities.Seller;

public interface SellerDao {
	//insere no banco de dados o obj Department
	void insert(Seller obj);
	void update(Seller obj);
	void deleteById(Integer id);
	Seller findById(Integer id);
	List<Seller> findAll();
}