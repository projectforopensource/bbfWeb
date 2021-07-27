package com.divatt.bbf.model;

import java.util.List;

import lombok.Data;

/**
 * @author situpand
 *
 */

@Data
public class Category {
	
	private Integer categoryId;
	private String categoryName; 
	  private String categoryDescription; 
	  private Boolean status;
	  private String categoryUrl;
	  private String mobileImagePath;	  
	  private List<SubCategory> subCategory;
	
	
	
	
	 
}
