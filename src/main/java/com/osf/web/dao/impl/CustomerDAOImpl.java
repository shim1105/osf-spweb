package com.osf.web.dao.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.osf.web.dao.CustomerDAO;
@Repository
public class CustomerDAOImpl implements CustomerDAO {
	@Autowired
	private SqlSession ss;
	@Override
	public int insertCustomer(Map<String,String> user) {
//		String str1 = user.get("ciPwd");
//		byte[] strByte= str1.getBytes();
//		String str2 = "abcd";
//		byte[] strByte2= str2.getBytes();
//		byte[] sumByte= new byte[strByte.length+strByte2.length];
//		System.arraycopy(strByte, 0, sumByte, 0, strByte.length);
//		System.arraycopy(strByte2, 0, sumByte, strByte.length, sumByte.length);
//		try {
//			MessageDigest mDigest= MessageDigest.getInstance("SHA-256");
//			sumByte = mDigest.digest(sumByte);
//			StringBuffer sb= new StringBuffer();
//			for(int i=0;i<sumByte.length;i++) {
//				String s = Integer.toString((sumByte[i] & 0xFF)+0x100,16).substring(1);
//				sb.append(s);
//			}
//			user.put("ciPwd", sb.toString());
//		} catch (NoSuchAlgorithmException e) {
//			e.printStackTrace();
//		}
//		
		return ss.insert("customer.insertCustomer", user);
	}
	@Override
	public List<Map<String, String>> selectCustomerList() {
		return ss.selectList("customer.selectCustomerList");
	}
	@Override
	public List<Map<String, String>> selectCustomer(Map<String, String> user) {		
		return ss.selectList("customer.selectCustomer", user);
	}
	@Override
	public int updateCustomer(Map<String, String> user) {
		return ss.update("customer.updateCustomer", user);
	}
	@Override
	public int deleteCustomer(Map<String, String> user) {
		return ss.delete("customer.deleteCustomer", user);
	}
	public static void main(String[] args) {
		
	}
	
}
