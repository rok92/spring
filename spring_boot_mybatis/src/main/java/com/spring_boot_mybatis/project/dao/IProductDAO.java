package com.spring_boot_mybatis.project.dao;

import java.util.ArrayList;
import java.util.HashMap;

import com.spring_boot_mybatis.project.model.ProductVO;


public interface IProductDAO {
	public ArrayList<ProductVO> listAllProduct();				// 전체 상품 정보 조회
	public void insertProduct(ProductVO prd);					// 상품 정보 등록
	public void updateProduct(ProductVO prd);					// 상품 정보 수정
	public void deleteProduct(String prdNo);					// 상품 정보 삭제
	String prdNoCheck(String prdNo);
	public ProductVO detailViewProduct(String prdNo);			// 상세 상품 정보 조회
	ArrayList<ProductVO> productSearch(HashMap<String, Object> map);
}
