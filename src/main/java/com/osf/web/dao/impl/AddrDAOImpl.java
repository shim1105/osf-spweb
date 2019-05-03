package com.osf.web.dao.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.osf.web.dao.AddrDAO;

import lombok.extern.slf4j.Slf4j;
@Repository
@Slf4j
public class AddrDAOImpl implements AddrDAO {
	@Autowired
	private SqlSession ss;
	
	@Override
	public List<Map<String, String>> selectAddrList() {
		Map<String,String> param =new HashMap<String, String>();
		param.put("adNum","20");
		param.put("adSido", "부산광역시");
		return ss.selectList("addr.selectAddrList",param);
	}

}
