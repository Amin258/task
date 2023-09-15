package com.amin.restdemo.controller;

import com.amin.restdemo.entity.CloudVendorEntity;
import com.amin.restdemo.repository.CloudVendorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/cloudvendor")
public class CloudVendorAPIService {

    @Autowired
    private CloudVendorRepository cloudVendorRepository;

    @GetMapping("{vendorId}")
    public CloudVendorEntity getCloudVendorDetails(@PathVariable int vendorId){
        return cloudVendorRepository.findByVendorId(vendorId);
    }

    @PostMapping
    public String createCloudVendorDetails(@RequestBody CloudVendorEntity cloudVendorEntity){
        cloudVendorRepository.save(cloudVendorEntity);
        return "Cloud Vendor created Successfully";
    }

    @PutMapping
    public String updateCloudVendorDetails(@RequestBody CloudVendorEntity cloudVendorEntity){
        cloudVendorRepository.save(cloudVendorEntity);
        return "Cloud Vendor updated Successfully";
    }

    @DeleteMapping("{vendorId}")
    public int deleteCloudVendorDetails(@PathVariable int vendorId){
        cloudVendorRepository.deleteByVendorId(vendorId); //
        return vendorId;
    }

}
