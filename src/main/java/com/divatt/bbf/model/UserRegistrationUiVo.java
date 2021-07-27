package com.divatt.bbf.model;

public class UserRegistrationUiVo {

	private String designerId;
	private String firstName;
	private String email;
	private String professionCategory;
	private String operatingCity;
	private String displayName;
	private String firmName;
	private Boolean profileStatus;
	private Boolean isActiveProfile;
	private Boolean isDeletedProfile;
	
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getProfessionCategory() {
		return professionCategory;
	}
	public void setProfessionCategory(String professionCategory) {
		this.professionCategory = professionCategory;
	}
	public String getOperatingCity() {
		return operatingCity;
	}
	public void setOperatingCity(String operatingCity) {
		this.operatingCity = operatingCity;
	}
	public String getDisplayName() {
		return displayName;
	}
	public void setDisplayName(String displayName) {
		this.displayName = displayName;
	}
	public String getFirmName() {
		return firmName;
	}
	public void setFirmName(String firmName) {
		this.firmName = firmName;
	}
	public String getDesignerId() {
		return designerId;
	}
	public void setDesignerId(String designerId) {
		this.designerId = designerId;
	}
	public Boolean getProfileStatus() {
		return profileStatus;
	}
	public void setProfileStatus(Boolean profileStatus) {
		this.profileStatus = profileStatus;
	}
	public Boolean getIsActiveProfile() {
		return isActiveProfile;
	}
	public void setIsActiveProfile(Boolean isActiveProfile) {
		this.isActiveProfile = isActiveProfile;
	}
	public Boolean getIsDeletedProfile() {
		return isDeletedProfile;
	}
	public void setIsDeletedProfile(Boolean isDeletedProfile) {
		this.isDeletedProfile = isDeletedProfile;
	}
	
	
}
