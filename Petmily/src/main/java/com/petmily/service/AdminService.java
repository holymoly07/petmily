package com.petmily.service;

import java.util.List;

import com.petmily.dto.Admin;
import com.petmily.dto.PageInfo;
import com.petmily.dto.Product;

public interface AdminService {

	public List<Admin> membershipList(int page, PageInfo pageInfo,String mem_text) throws Exception;

	public List<Product> productList(int page, PageInfo pageInfo, String search_prod)throws Exception;

	public void productwrite(Product product) throws Exception;

}
	