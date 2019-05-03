package com.osf.web.service.impl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.osf.web.dao.CustomerDAO;
import com.osf.web.service.CustomerService;
@Service
public class CustomerServiceImpl implements CustomerService {
@Autowired
private CustomerDAO cdao;
	@Override
	public int insertCustomer(Map<String, String> user) {
		return cdao.insertCustomer(user);
	}

	@Override
	public List<Map<String, String>> selectCustomerList() {
		return cdao.selectCustomerList();
	}

	@Override
	public List<Map<String, String>> selectCustomer(Map<String, String> user) {
		return cdao.selectCustomer(user);
	}

	@Override
	public int updateCustomer(Map<String, String> user) {
		return cdao.updateCustomer(user);
	}

	@Override
	public int deleteCustomer(Map<String, String> user) {
		return cdao.deleteCustomer(user);
	}

}
