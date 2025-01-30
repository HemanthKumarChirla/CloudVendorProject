package com.springvendor.mode;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="cloud_vendor_info")
public class CloudVendor {
	
	@Id
	private String vendorId;
	private String vendorName;
	private String vendorAddres;
	private String vendorPhnum;
	
	public CloudVendor() {
		
	}
	
	public CloudVendor(String vendorId, String vendorName, String vendorAddres, String vendorPhnum) {
		
		this.vendorId = vendorId;
		this.vendorName = vendorName;
		this.vendorAddres = vendorAddres;
		this.vendorPhnum = vendorPhnum;
	}
	public String getVendorId() {
		return vendorId;
	}
	public void setVendorId(String vendorId) {
		this.vendorId = vendorId;
	}
	public String getVendorName() {
		return vendorName;
	}
	public void setVendorName(String vendorName) {
		this.vendorName = vendorName;
	}
	public String getVendorAddres() {
		return vendorAddres;
	}
	public void setVendorAddres(String vendorAddres) {
		this.vendorAddres = vendorAddres;
	}
	public String getVendorPhnum() {
		return vendorPhnum;
	}
	public void setVendorPhnum(String vendorPhnum) {
		this.vendorPhnum = vendorPhnum;
	}
	

}
