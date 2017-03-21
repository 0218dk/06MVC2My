package com.model2.mvc.web.purchase;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.model2.mvc.service.domain.Product;
import com.model2.mvc.service.domain.Purchase;
import com.model2.mvc.service.product.ProductService;
import com.model2.mvc.service.purchase.PurchaseService;


@Controller
public class PurchaseController {

	public PurchaseController() {
		System.out.println(this.getClass());
	}
	
		
	///Field
	@Autowired
	@Qualifier("productServiceImpl")
	private ProductService productService;
	@Qualifier("purchaseServiceImpl")
	private PurchaseService purchaseService;
	//setter Method ���� ����
		
	
	
	//==> classpath:config/common.properties  ,  classpath:config/commonservice.xml ���� �Ұ�
	//==> �Ʒ��� �ΰ��� �ּ��� Ǯ�� �ǹ̸� Ȯ�� �Ұ�
	@Value("#{commonProperties['pageUnit']}")
	//@Value("#{commonProperties['pageUnit'] ?: 3}")
	int pageUnit;
	
	@Value("#{commonProperties['pageSize']}")
	//@Value("#{commonProperties['pageSize'] ?: 2}")
	int pageSize;
	
	
	@RequestMapping("/addPurchaseView.do")
	public String addPurchaseView( @ModelAttribute("purchase") Purchase purchase,
							  	   /*@RequestParam("prodNo") int prodNo,*/
							        Model model ) 
									throws Exception {
		
		System.out.println("/addPurchaseView.do");
		//Business Logic
//		Product product = productService.getProduct(prodNo);
		// Model �� View ����
//		model.addAttribute("product", product);
		//purchaseService.addPurchase(purchase);
		
		//return "redirect:/product/addProductResult.jsp";
		return "forward:/purchase/addPurchaseView.jsp";
	}
	
	
	
	
}
