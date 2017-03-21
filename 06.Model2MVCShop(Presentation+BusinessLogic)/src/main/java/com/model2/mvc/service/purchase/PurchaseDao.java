package com.model2.mvc.service.purchase;

import java.sql.SQLException;
import java.util.Map;

import com.model2.mvc.common.Search;
import com.model2.mvc.service.domain.Purchase;

public interface PurchaseDao {

	public void addPurchase(Purchase purchase) throws SQLException;

	public Map<String, Object> getPurchaseList(Search search) throws Exception;

}
