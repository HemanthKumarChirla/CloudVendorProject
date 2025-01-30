package com.springvendor.controller;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springvendor.mode.CloudVendor;
import com.springvendor.service.CloudVendorService;

@RestController
@RequestMapping("/cloudvendor")
public class CloudVendorController {
	
	
    CloudVendorService cloudVendorService;
	
	
	public CloudVendorController(CloudVendorService cloudVendorService) {
		this.cloudVendorService = cloudVendorService;
	}

	@GetMapping("{vendorId}")
	public CloudVendor getDetails(@PathVariable("vendorId") String vendorId) {
		return cloudVendorService.getCloudVendor(vendorId);
	}
	
	@GetMapping()
	public List<CloudVendor> getAlldetails(){
		return cloudVendorService.getAllCloudVendor();
	}
	
	@PostMapping
	public String postDetails(@RequestBody CloudVendor cloudvendor) {
		cloudVendorService.createCloudVendor(cloudvendor);
		return "posted sucessfully";
	}
	
	@PutMapping
	public String puttDetails(@RequestBody CloudVendor cloudvendor) {
		cloudVendorService.updateCloudVendor(cloudvendor);
		return "updated sucessfully";
	}
	
	@DeleteMapping("{vendorId}")
	public String deleteDetails(@PathVariable("vendorId") String vendorId) {
		cloudVendorService.deleteCloudVendor(vendorId);
		return "deleted sucesfully";
	}

}
