package com.divatt.bbf.model;

import lombok.Data;


@Data
public class SubCategory {

	private Integer categoryId;
	private Integer subCategoryId;
	private String subCategoryName;
	private String subCategoryDescription;
	private Boolean status;
	private Integer mandatoryAttribute;
	private String attribute;
	private Integer preferedAttribute;
	private Integer indexingAttribute;
	private String subCategoryUrl;
	//private Category category;
	
	
}
