package com.spring_boot_mybatis.project.service;

import java.util.ArrayList;
import java.util.HashMap;

import com.spring_boot_mybatis.project.model.ProductVO;

public interface IProductService {
	ArrayList<ProductVO> listAllProduct();		// 전체 상품 정보 조회
	void insertProduct(ProductVO prd);			// 상품 정보 등록
	void updateProduct(ProductVO prd);			// 상품 정보 수정
	void deleteProduct(String prdNo);			// 상품 정보 삭제
	void duplicateProduct(String prdNo);
	ProductVO detailViewProduct(String prdNo);	// 상세 상품 정보 조회
	String prdNoCheck(String prdNo); // 상품번호 중복 체크
	ArrayList<ProductVO> productSearch(HashMap<String, Object> map); // 상품 검색
}
