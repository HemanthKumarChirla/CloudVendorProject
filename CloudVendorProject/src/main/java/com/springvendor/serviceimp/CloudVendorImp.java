package com.springvendor.serviceimp;

import java.util.List;

import org.springframework.stereotype.Service;

import com.springvendor.mode.CloudVendor;
import com.springvendor.repository.CloudVendorRepository;
import com.springvendor.service.CloudVendorService;

@Service
public class CloudVendorImp implements CloudVendorService {
	
	CloudVendorRepository cloudVendorRepository;

	public CloudVendorImp(CloudVendorRepository cloudVendorRepository) {
		this.cloudVendorRepository = cloudVendorRepository;
	}

	@Override
	public String createCloudVendor(CloudVendor cloudVendor) {
		cloudVendorRepository.save(cloudVendor);
		return "created sucessfull";
	}

	@Override
	public String updateCloudVendor(CloudVendor cloudVendor) {
		cloudVendorRepository.save(cloudVendor);
		return "updatedsuccessfull";
	}

	@Override
	public String deleteCloudVendor(String cloudVendorId) {
		cloudVendorRepository.deleteById(cloudVendorId);
		return "successfully deletedbyid";
	}

	@Override
	public CloudVendor getCloudVendor(String cloudVendorId) {
		
		return cloudVendorRepository.findById(cloudVendorId).get();
	}

	@Override
	public List<CloudVendor> getAllCloudVendor() {
		
		return cloudVendorRepository.findAll();
	}

	

}
