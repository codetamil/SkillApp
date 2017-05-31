package com.revature.skillapp.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="category")
public class Category {
	
	@Override
	public String toString() {
		return "Category [cId=" + cId + ", categoryName=" + categoryName + ", isActive=" + isActive + "]";
	}
	@Id
	@GeneratedValue
	@Column(name = "id")
	private Long cId;
	
	public Long getcId() {
		return cId;
	}
	public void setcId(Long cId) {
		this.cId = cId;
	}
	public String getCategoryName() {
		return categoryName;
	}
	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}
	public Integer getIsActive() {
		return isActive;
	}
	public void setIsActive(Integer isActive) {
		this.isActive = isActive;
	}
	@Column(name="Category_name")
	private String categoryName;
	@Column(name="is_active")
	private Integer isActive;	

}
