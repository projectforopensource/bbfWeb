package com.divatt.bbf.model;
import java.util.List;

/**
 * @author Naidu
 *
 */


public class Product {
	
    public int rowIndex;
	
	public String prdName;
	
	public String brand;
	
	public int modelNumber;
	
	public String frdURL;
	
	public String skuCode;
	
	public String prdDesc;
	
	public String occasion;
	
	public String tags;
	
	public String gender;
	
	public boolean kids;
	
	public int minAge;
	
	public int maxAge;
	
	public boolean selfInvMgt;
	
	public boolean itemReturn;
	
	public boolean itemCancel;
	
	public int qty;
	
	public int qtyForOOSS;
	
	public int minQtyForCart;
	
	public int maxQtyForCart;
	
	public int notifyQty;
	
	public String shipping;
	
	public String shpTerms;
	
	public int shpCharges;
	
	public String priceType;
	
	public float mrp;
	
	public float listPrice;
	
	public String currencyType;
	
	public String taxType;
	
	public float taxPercentage;
	
	public boolean taxInclusive;
	
	public boolean giftWrapAvl;
	
	public float giftWrapAmt;
	
	public boolean codAvl;
	
	public boolean active;
	
	public List<String> size;
	
	public int length;
	
	public String color;
	
	public String img1;
	
	public String img2;
	
	public String img3;
	
	public String img4;
	
	public String img5;
	
	public int prodRefId;
	
	public String uploadBy;
	
	public String designerName;
	
	public String designerId;
	
	public boolean isApproved=false;
	
	public String approvedBy;
	
	public String subCategoryId;
	
	public Boolean isCustomizationPossible;
	
	public Boolean ifUpperBodyCustomization;
	
	public Boolean ifLowerCustomization;
	
	public String adminComment;
	
	
	
	 public int getRowIndex() {
		return rowIndex;
	}

	public void setRowIndex(int rowIndex) {
		this.rowIndex = rowIndex;
	}

	public String getPrdName() {
		return prdName;
	}

	public void setPrdName(String prdName) {
		this.prdName = prdName;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public int getModelNumber() {
		return modelNumber;
	}

	public void setModelNumber(int modelNumber) {
		this.modelNumber = modelNumber;
	}

	public String getFrdURL() {
		return frdURL;
	}

	public void setFrdURL(String frdURL) {
		this.frdURL = frdURL;
	}

	public String getSkuCode() {
		return skuCode;
	}

	public void setSkuCode(String skuCode) {
		this.skuCode = skuCode;
	}

	public String getPrdDesc() {
		return prdDesc;
	}

	public void setPrdDesc(String prdDesc) {
		this.prdDesc = prdDesc;
	}

	public String getOccasion() {
		return occasion;
	}

	public void setOccasion(String occasion) {
		this.occasion = occasion;
	}

	public String getTags() {
		return tags;
	}

	public void setTags(String tags) {
		this.tags = tags;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public boolean isKids() {
		return kids;
	}

	public void setKids(boolean kids) {
		this.kids = kids;
	}

	public int getMinAge() {
		return minAge;
	}

	public void setMinAge(int minAge) {
		this.minAge = minAge;
	}

	public int getMaxAge() {
		return maxAge;
	}

	public void setMaxAge(int maxAge) {
		this.maxAge = maxAge;
	}

	public boolean isSelfInvMgt() {
		return selfInvMgt;
	}

	public void setSelfInvMgt(boolean selfInvMgt) {
		this.selfInvMgt = selfInvMgt;
	}

	public boolean isItemReturn() {
		return itemReturn;
	}

	public void setItemReturn(boolean itemReturn) {
		this.itemReturn = itemReturn;
	}

	public boolean isItemCancel() {
		return itemCancel;
	}

	public void setItemCancel(boolean itemCancel) {
		this.itemCancel = itemCancel;
	}

	public int getQty() {
		return qty;
	}

	public void setQty(int qty) {
		this.qty = qty;
	}

	public int getQtyForOOSS() {
		return qtyForOOSS;
	}

	public void setQtyForOOSS(int qtyForOOSS) {
		this.qtyForOOSS = qtyForOOSS;
	}

	public int getMinQtyForCart() {
		return minQtyForCart;
	}

	public void setMinQtyForCart(int minQtyForCart) {
		this.minQtyForCart = minQtyForCart;
	}

	public int getMaxQtyForCart() {
		return maxQtyForCart;
	}

	public void setMaxQtyForCart(int maxQtyForCart) {
		this.maxQtyForCart = maxQtyForCart;
	}

	public int getNotifyQty() {
		return notifyQty;
	}

	public void setNotifyQty(int notifyQty) {
		this.notifyQty = notifyQty;
	}

	public String getShipping() {
		return shipping;
	}

	public void setShipping(String shipping) {
		this.shipping = shipping;
	}

	public String getShpTerms() {
		return shpTerms;
	}

	public void setShpTerms(String shpTerms) {
		this.shpTerms = shpTerms;
	}

	public int getShpCharges() {
		return shpCharges;
	}

	public void setShpCharges(int shpCharges) {
		this.shpCharges = shpCharges;
	}

	public String getPriceType() {
		return priceType;
	}

	public void setPriceType(String priceType) {
		this.priceType = priceType;
	}

	public float getMrp() {
		return mrp;
	}

	public void setMrp(float mrp) {
		this.mrp = mrp;
	}

	public float getListPrice() {
		return listPrice;
	}

	public void setListPrice(float listPrice) {
		this.listPrice = listPrice;
	}

	public String getCurrencyType() {
		return currencyType;
	}

	public void setCurrencyType(String currencyType) {
		this.currencyType = currencyType;
	}

	public String getTaxType() {
		return taxType;
	}

	public void setTaxType(String taxType) {
		this.taxType = taxType;
	}

	public float getTaxPercentage() {
		return taxPercentage;
	}

	public void setTaxPercentage(float taxPercentage) {
		this.taxPercentage = taxPercentage;
	}

	public boolean isTaxInclusive() {
		return taxInclusive;
	}

	public void setTaxInclusive(boolean taxInclusive) {
		this.taxInclusive = taxInclusive;
	}

	public boolean isGiftWrapAvl() {
		return giftWrapAvl;
	}

	public void setGiftWrapAvl(boolean giftWrapAvl) {
		this.giftWrapAvl = giftWrapAvl;
	}

	public float getGiftWrapAmt() {
		return giftWrapAmt;
	}

	public void setGiftWrapAmt(float giftWrapAmt) {
		this.giftWrapAmt = giftWrapAmt;
	}

	public boolean isCodAvl() {
		return codAvl;
	}

	public void setCodAvl(boolean codAvl) {
		this.codAvl = codAvl;
	}

	public boolean isActive() {
		return active;
	}

	public void setActive(boolean active) {
		this.active = active;
	}

	public List<String> getSize() {
		return size;
	}

	public void setSize(List<String> size) {
		this.size = size;
	}

	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getImg1() {
		return img1;
	}

	public void setImg1(String img1) {
		this.img1 = img1;
	}

	public String getImg2() {
		return img2;
	}

	public void setImg2(String img2) {
		this.img2 = img2;
	}

	public String getImg3() {
		return img3;
	}

	public void setImg3(String img3) {
		this.img3 = img3;
	}

	public String getImg4() {
		return img4;
	}

	public void setImg4(String img4) {
		this.img4 = img4;
	}

	public String getImg5() {
		return img5;
	}

	public void setImg5(String img5) {
		this.img5 = img5;
	}

	public int getProdRefId() {
		return prodRefId;
	}

	public void setProdRefId(int prodRefId) {
		this.prodRefId = prodRefId;
	}

	public String getUploadBy() {
		return uploadBy;
	}

	public void setUploadBy(String uploadBy) {
		this.uploadBy = uploadBy;
	}

	public String getDesignerName() {
		return designerName;
	}

	public void setDesignerName(String designerName) {
		this.designerName = designerName;
	}

	public String getDesignerId() {
		return designerId;
	}

	public void setDesignerId(String designerId) {
		this.designerId = designerId;
	}

	public boolean isApproved() {
		return isApproved;
	}

	public String getSubCategoryId() {
		return subCategoryId;
	}

	public void setSubCategoryId(String subCategoryId) {
		this.subCategoryId = subCategoryId;
	}

	public void setApproved(boolean isApproved) {
		this.isApproved = isApproved;
	}

	public String getApprovedBy() {
		return approvedBy;
	}

	public void setApprovedBy(String approvedBy) {
		this.approvedBy = approvedBy;
	}

	public Boolean getIsCustomizationPossible() {
		return isCustomizationPossible;
	}

	public void setIsCustomizationPossible(Boolean isCustomizationPossible) {
		this.isCustomizationPossible = isCustomizationPossible;
	}

	public Boolean getIfUpperBodyCustomization() {
		return ifUpperBodyCustomization;
	}

	public void setIfUpperBodyCustomization(Boolean ifUpperBodyCustomization) {
		this.ifUpperBodyCustomization = ifUpperBodyCustomization;
	}

	public Boolean getIfLowerCustomization() {
		return ifLowerCustomization;
	}

	public void setIfLowerCustomization(Boolean ifLowerCustomization) {
		this.ifLowerCustomization = ifLowerCustomization;
	}

	
	public String getAdminComment() {
		return adminComment;
	}

	public void setAdminComment(String adminComment) {
		this.adminComment = adminComment;
	}

	@Override
	    public String toString() {
	        return "Product{" +
	                "rowIndex=" + rowIndex +
	                ", prdName=" + prdName +
	                ", brand='" + brand + '\'' +
	                ", modelNumber='" + modelNumber + '\'' +
	                ", frdURL=" + frdURL +
	                ", skuCode=" + skuCode +
	                ", prdDesc=" + prdDesc +
	                ", occasion=" + occasion +
	                ", tags=" + tags +
	                ", kids=" + kids +
	                ", minAge=" + minAge +
	                ", maxAge=" + maxAge +
	                ", selfInvMgt=" + selfInvMgt +
	                ", itemReturn=" + itemReturn +
	                ", itemCancel=" + itemCancel +
	                ", qty=" + qty +
	                ", qtyForOOSS=" + qtyForOOSS +
	                ", minQtyForCart=" + minQtyForCart +
	                ", maxQtyForCart=" + maxQtyForCart +
	                ", notifyQty=" + notifyQty +
	                ", shipping=" + shipping +
	                ", shpTerms=" + shpTerms +
	                ", shpCharges=" + shpCharges +
	                ", priceType=" + priceType +
	                ", mrp=" + mrp +
	                ", listPrice=" + listPrice +
	                ", currencyType=" + currencyType +
	                ", taxType=" + taxType +
	                ", taxPercentage=" + taxPercentage +
	                ", taxInclusive=" + taxInclusive +
	                ", giftWrapAvl=" + giftWrapAvl +
	                ", giftWrapAmt=" + giftWrapAmt +
	                ", codAvl=" + codAvl +
	                ", active=" + active +
	                ", size=" + size +
	                ", img1=" + img1 +
	                ", img2=" + img2 +
	                ", img3=" + img3 +
	                ", img4=" + img4 +
	                ", prodRefId=" + prodRefId + '\''+
	                '}';
	    }
			
}
