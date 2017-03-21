package com.model2.mvc.service.purchase.impl;

import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import com.model2.mvc.common.Search;
import com.model2.mvc.service.domain.Purchase;
import com.model2.mvc.service.purchase.PurchaseDao;

@Repository("purchaseDaoImpl")
public class PurchaseDaoImpl implements PurchaseDao {
	
	///Field
	@Autowired
	@Qualifier("sqlSessionTemplate")
	private SqlSession sqlSession;
	public void setSqlSession(SqlSession sqlSession) {
		this.sqlSession = sqlSession;
	}
	
	public PurchaseDaoImpl(){
		System.out.println(this.getClass());
	}

	
	public void addPurchase(Purchase purchase) throws SQLException{
//		product.setManuDate(product.getManuDate().replace("-",""));		
//		sqlSession.insert("ProductMapper.addProduct", product);
		
	}
	
	
	public Map<String,Object> getPurchaseList(Search search)throws Exception{
		
		
		Map<String,Object> map = new HashMap<String,Object>();
		
		return map;
	}
	
	public Map<String,Object> getSaleList(Search search)throws Exception{
		
		Map<String,Object> map = new HashMap<String,Object>();
		
		return map;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}// end of class
