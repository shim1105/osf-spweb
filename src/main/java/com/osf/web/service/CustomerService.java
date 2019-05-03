package com.osf.web.service;

import java.util.List;
import java.util.Map;

public interface CustomerService {
	public int insertCustomer(Map<String,String> user);
	public List<Map<String,String>> selectCustomerList();
	public List<Map<String,String>> selectCustomer(Map<String,String> user);
	public int updateCustomer(Map<String,String> user);
	public int deleteCustomer(Map<String,String> user);
}
