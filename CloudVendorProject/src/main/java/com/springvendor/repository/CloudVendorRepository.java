package com.springvendor.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springvendor.mode.CloudVendor;

public interface CloudVendorRepository extends JpaRepository<CloudVendor, String> {

}
