package com.spring_boot_mybatis.project.service;

import java.util.ArrayList;
import java.util.HashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.spring_boot_mybatis.project.dao.IProductDAO;
import com.spring_boot_mybatis.project.model.ProductVO;

@Service
public class ProductService implements IProductService {
	
	@Autowired
	@Qualifier("IProductDAO")
	IProductDAO dao;

	@Override
	public ArrayList<ProductVO> listAllProduct() {
		return dao.listAllProduct();
	}

	@Override
	public void insertProduct(ProductVO prd) {
		dao.insertProduct(prd);

	}

	@Override
	public void duplicateProduct(String prdNo) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void updateProduct(ProductVO prd) {
		dao.updateProduct(prd);
	}

	@Override
	public void deleteProduct(String prdNo) {
		dao.deleteProduct(prdNo);
	}

	@Override
	public ProductVO detailViewProduct(String prdNo) {
		return dao.detailViewProduct(prdNo);
	}

	@Override
	public String prdNoCheck(String prdNo) {		
		return dao.prdNoCheck(prdNo);
	}

	@Override
	public ArrayList<ProductVO> productSearch(HashMap<String, Object> map) {		
		return dao.productSearch(map);
	}

}
