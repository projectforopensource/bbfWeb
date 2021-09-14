package com.divatt.bbf.controller;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.divatt.bbf.common.EnumValues;
import com.divatt.bbf.model.Category;
import com.divatt.bbf.model.CategoryResponse;
import com.divatt.bbf.model.DesignerResponse;
import com.divatt.bbf.model.Product;
import com.divatt.bbf.model.ProductResponse;
import com.divatt.bbf.model.SubCategory;
import com.divatt.bbf.model.UserRegistrationUiVo;

@RestController
@RequestMapping("/api")
public class DivattEndUserWebController {

	@Autowired
	private RestTemplate restTemplate;

	@Value("${connect_mongo_util}")
	public String CONNECT_MONGO_UTIL;
	
	@Value("${connect_Divatt_admin}")
	public String CONNECT_DIVATT_ADMIN;

	@GetMapping("/categories")
	public CategoryResponse getAllCategory() {

		Category[] categories = restTemplate.getForObject(CONNECT_MONGO_UTIL + "/category/allCatagory",
				Category[].class);
		List<Category> categoryList = Arrays.asList(categories);
		categoryList.forEach(c ->

		c.setSubCategory(Arrays.asList(restTemplate.getForObject(
				CONNECT_MONGO_UTIL + "/subCategory/getSubcategoryByCategoryId/" + c.getId(),
				SubCategory[].class)))

		);

		CategoryResponse res = new CategoryResponse();
		res.setData(categoryList);
		res.setStatus(EnumValues.DIVATT_HTTP_STATUS_OK);
		res.setMessage("Categoris retrived successfully");
		return res;

	}
	@GetMapping("/designers")
	public ResponseEntity<?> getDesigners()
	{
		UserRegistrationUiVo[] userRegistrationUiVos = restTemplate.getForObject(CONNECT_DIVATT_ADMIN + "/getAllDesigner",
				UserRegistrationUiVo[].class);
		List<UserRegistrationUiVo> designerList=Arrays.asList(userRegistrationUiVos);
		DesignerResponse designerResponse=new DesignerResponse();
		designerResponse.setStatus(EnumValues.DIVATT_HTTP_STATUS_OK);
		designerResponse.setMessage("Designer retrived successfully.");
		designerResponse.setData(designerList);
		
		return (ResponseEntity<?>) Optional.of(designerResponse).map(e -> new ResponseEntity<>(e, HttpStatus.OK))
				.orElseThrow(() -> new RuntimeException("Could not get designer"));
	}
	
	
	@GetMapping("/designers/{id}")
	public ResponseEntity<?> getDesignersById(@PathVariable String id)
	{
		UserRegistrationUiVo[] userRegistrationUiVos = restTemplate.getForObject(CONNECT_DIVATT_ADMIN + "/getAllDesigner",
				UserRegistrationUiVo[].class);
		List<UserRegistrationUiVo> designerList=Arrays.asList(userRegistrationUiVos);
		designerList=designerList.stream()
				.filter(d->d.getDesignerId().equals(id)).collect(Collectors.toList());
		DesignerResponse designerResponse=new DesignerResponse();
		designerResponse.setStatus(EnumValues.DIVATT_HTTP_STATUS_OK);
		designerResponse.setMessage("Designer retrived successfully.");
		designerResponse.setData(designerList);
		
		return (ResponseEntity<?>) Optional.of(designerResponse).map(e -> new ResponseEntity<>(e, HttpStatus.OK))
				.orElseThrow(() -> new RuntimeException("Could not get designer"));
	}
	

	@GetMapping("/getProductByCaregory/{categoryId}")
	public ResponseEntity<?> getProductsByCategory(@PathVariable("categoryId") Integer categoryId)
	{
		List<Product> completeProductList=new ArrayList();
		SubCategory[] subCats=restTemplate.getForObject(CONNECT_MONGO_UTIL + "/subCategory/getSubcategoryByCategoryId/"+categoryId,
				SubCategory[].class);
		List<SubCategory> subCatList=Arrays.asList(subCats);
		subCatList.forEach(sub->
		completeProductList.addAll(
				Arrays.asList(
		restTemplate.getForObject(CONNECT_MONGO_UTIL + "/findProductList/"+sub.getId(),
						Product[].class)))
				);
		
		
		ProductResponse response=new ProductResponse();
		response.setMessage("Product retrieved sucessfuly");
		response.setStatus(EnumValues.DIVATT_HTTP_STATUS_OK);
		response.setData(completeProductList);
		
		return (ResponseEntity<?>) Optional.of(response).map(e -> new ResponseEntity<>(e, HttpStatus.OK))
				.orElseThrow(() -> new RuntimeException("Could not get product"));
		
	}
	@GetMapping("/products/{id}")
	public ResponseEntity<?> getProductsByProductId(@PathVariable("id") Integer productId)
	{
		List<Product> completeProductList=new ArrayList();
		Product p=restTemplate.getForObject(CONNECT_MONGO_UTIL+"/findProduct/"+productId, Product.class);
		completeProductList.add(p);
		ProductResponse response=new ProductResponse();
		response.setMessage("Product retrieved sucessfuly");
		response.setStatus(EnumValues.DIVATT_HTTP_STATUS_OK);
		response.setData(completeProductList);
		return (ResponseEntity<?>) Optional.of(response).map(e -> new ResponseEntity<>(e, HttpStatus.OK))
				.orElseThrow(() -> new RuntimeException("Could not get product"));
	}
}
